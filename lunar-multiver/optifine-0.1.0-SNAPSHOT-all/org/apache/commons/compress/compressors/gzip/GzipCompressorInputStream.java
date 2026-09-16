package org.apache.commons.compress.compressors.gzip;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.compress.compressors.CompressorInputStream;

public class GzipCompressorInputStream extends CompressorInputStream {
   private static final int FHCRC = 2;
   private static final int FEXTRA = 4;
   private static final int FNAME = 8;
   private static final int FCOMMENT = 16;
   private static final int FRESERVED = 224;
   private final InputStream in;
   private final boolean decompressConcatenated;
   private final byte[] buf = new byte[8192];
   private int bufUsed = 0;
   private Inflater inf = new Inflater(true);
   private final CRC32 crc = new CRC32();
   private boolean endReached = false;
   private final byte[] oneByte = new byte[1];
   private final GzipParameters parameters = new GzipParameters();

   public GzipCompressorInputStream(InputStream var1) {
      this(var1, false);
   }

   public GzipCompressorInputStream(InputStream var1, boolean var2) {
      if (var1.markSupported()) {
         this.in = var1;
      } else {
         this.in = new BufferedInputStream(var1);
      }

      this.decompressConcatenated = var2;
      this.init(true);
   }

   public GzipParameters getMetaData() {
      return this.parameters;
   }

   private boolean init(boolean var1) {
      assert var1 || this.decompressConcatenated;
      int var2 = this.in.read();
      int var3 = this.in.read();
      if (var2 == -1 && !var1) {
         return false;
      }

      if (var2 == 31 && var3 == 139) {
         DataInputStream var4 = new DataInputStream(this.in);
         int var5 = var4.readUnsignedByte();
         if (var5 != 8) {
            throw new IOException("Unsupported compression method " + var5 + " in the .gz header");
         }

         int var6 = var4.readUnsignedByte();
         if ((var6 & 224) != 0) {
            throw new IOException("Reserved flags are set in the .gz header");
         }

         this.parameters.setModificationTime(this.readLittleEndianInt(var4) * 1000L);
         switch (var4.readUnsignedByte()) {
            case 2:
               this.parameters.setCompressionLevel(9);
               break;
            case 4:
               this.parameters.setCompressionLevel(1);
         }

         this.parameters.setOperatingSystem(var4.readUnsignedByte());
         if ((var6 & 4) != 0) {
            int var7 = var4.readUnsignedByte();
            var7 |= var4.readUnsignedByte() << 8;

            while (var7-- > 0) {
               var4.readUnsignedByte();
            }
         }

         if ((var6 & 8) != 0) {
            this.parameters.setFilename(new String(this.readToNull(var4), "ISO-8859-1"));
         }

         if ((var6 & 16) != 0) {
            this.parameters.setComment(new String(this.readToNull(var4), "ISO-8859-1"));
         }

         if ((var6 & 2) != 0) {
            var4.readShort();
         }

         this.inf.reset();
         this.crc.reset();
         return true;
      } else {
         throw new IOException(var1 ? "Input is not in the .gz format" : "Garbage after a valid .gz stream");
      }
   }

   private byte[] readToNull(DataInputStream var1) {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream();
      int var3 = 0;

      while ((var3 = var1.readUnsignedByte()) != 0) {
         var2.write(var3);
      }

      return var2.toByteArray();
   }

   private long readLittleEndianInt(DataInputStream var1) {
      return var1.readUnsignedByte() | var1.readUnsignedByte() << 8 | var1.readUnsignedByte() << 16 | (long)var1.readUnsignedByte() << 24;
   }

   @Override
   public int read() {
      return this.read(this.oneByte, 0, 1) == -1 ? -1 : this.oneByte[0] & 0xFF;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      if (this.endReached) {
         return -1;
      }

      int var4 = 0;

      while (var3 > 0) {
         if (this.inf.needsInput()) {
            this.in.mark(this.buf.length);
            this.bufUsed = this.in.read(this.buf);
            if (this.bufUsed == -1) {
               throw new EOFException();
            }

            this.inf.setInput(this.buf, 0, this.bufUsed);
         }

         int var5;
         try {
            var5 = this.inf.inflate(var1, var2, var3);
         } catch (DataFormatException var12) {
            throw new IOException("Gzip-compressed data is corrupt");
         }

         this.crc.update(var1, var2, var5);
         var2 += var5;
         var3 -= var5;
         var4 += var5;
         this.count(var5);
         if (this.inf.finished()) {
            this.in.reset();
            int var6 = this.bufUsed - this.inf.getRemaining();
            if (this.in.skip(var6) != var6) {
               throw new IOException();
            }

            this.bufUsed = 0;
            DataInputStream var7 = new DataInputStream(this.in);
            long var8 = this.readLittleEndianInt(var7);
            if (var8 != this.crc.getValue()) {
               throw new IOException("Gzip-compressed data is corrupt (CRC32 error)");
            }

            long var10 = this.readLittleEndianInt(var7);
            if (var10 != (this.inf.getBytesWritten() & 4294967295L)) {
               throw new IOException("Gzip-compressed data is corrupt(uncompressed size mismatch)");
            }

            if (!this.decompressConcatenated || !this.init(false)) {
               this.inf.end();
               this.inf = null;
               this.endReached = true;
               return var4 == 0 ? -1 : var4;
            }
         }
      }

      return var4;
   }

   public static boolean matches(byte[] var0, int var1) {
      if (var1 < 2) {
         return false;
      } else {
         return var0[0] != 31 ? false : var0[1] == -117;
      }
   }

   @Override
   public void close() {
      if (this.inf != null) {
         this.inf.end();
         this.inf = null;
      }

      if (this.in != System.in) {
         this.in.close();
      }
   }
}
