package org.apache.commons.compress.archivers.dump;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.commons.compress.utils.IOUtils;

class TapeInputStream extends FilterInputStream {
   private byte[] blockBuffer = new byte[1024];
   private int currBlkIdx = -1;
   private int blockSize = 1024;
   private static final int recordSize = 1024;
   private int readOffset = 1024;
   private boolean isCompressed = false;
   private long bytesRead = 0L;

   public TapeInputStream(InputStream var1) {
      super(var1);
   }

   public void resetBlockSize(int var1, boolean var2) {
      this.isCompressed = var2;
      this.blockSize = 1024 * var1;
      byte[] var3 = this.blockBuffer;
      this.blockBuffer = new byte[this.blockSize];
      System.arraycopy(var3, 0, this.blockBuffer, 0, 1024);
      this.readFully(this.blockBuffer, 1024, this.blockSize - 1024);
      this.currBlkIdx = 0;
      this.readOffset = 1024;
   }

   @Override
   public int available() {
      return this.readOffset < this.blockSize ? this.blockSize - this.readOffset : this.in.available();
   }

   @Override
   public int read() {
      throw new IllegalArgumentException("all reads must be multiple of record size (1024 bytes.");
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      if (var3 % 1024 != 0) {
         throw new IllegalArgumentException("all reads must be multiple of record size (1024 bytes.");
      }

      int var4 = 0;

      while (var4 < var3) {
         if (this.readOffset == this.blockSize && !this.readBlock(true)) {
            return -1;
         }

         int var5 = 0;
         if (this.readOffset + (var3 - var4) <= this.blockSize) {
            var5 = var3 - var4;
         } else {
            var5 = this.blockSize - this.readOffset;
         }

         System.arraycopy(this.blockBuffer, this.readOffset, var1, var2, var5);
         this.readOffset += var5;
         var4 += var5;
         var2 += var5;
      }

      return var4;
   }

   @Override
   public long skip(long var1) {
      if (var1 % 1024L != 0L) {
         throw new IllegalArgumentException("all reads must be multiple of record size (1024 bytes.");
      }

      long var3 = 0L;

      while (var3 < var1) {
         if (this.readOffset == this.blockSize && !this.readBlock(var1 - var3 < this.blockSize)) {
            return -1L;
         }

         long var5 = 0L;
         if (this.readOffset + (var1 - var3) <= this.blockSize) {
            var5 = var1 - var3;
         } else {
            var5 = this.blockSize - this.readOffset;
         }

         this.readOffset = (int)(this.readOffset + var5);
         var3 += var5;
      }

      return var3;
   }

   @Override
   public void close() {
      if (this.in != null && this.in != System.in) {
         this.in.close();
      }
   }

   public byte[] peek() {
      if (this.readOffset == this.blockSize && !this.readBlock(true)) {
         return null;
      }

      byte[] var1 = new byte[1024];
      System.arraycopy(this.blockBuffer, this.readOffset, var1, 0, var1.length);
      return var1;
   }

   public byte[] readRecord() {
      byte[] var1 = new byte[1024];
      if (-1 == this.read(var1, 0, var1.length)) {
         throw new ShortFileException();
      } else {
         return var1;
      }
   }

   private boolean readBlock(boolean var1) {
      boolean var2 = true;
      if (this.in == null) {
         throw new IOException("input buffer is closed");
      }

      if (this.isCompressed && this.currBlkIdx != -1) {
         if (!this.readFully(this.blockBuffer, 0, 4)) {
            return false;
         }

         this.bytesRead += 4L;
         int var3 = DumpArchiveUtil.convert32(this.blockBuffer, 0);
         boolean var4 = (var3 & 1) == 1;
         if (!var4) {
            var2 = this.readFully(this.blockBuffer, 0, this.blockSize);
            this.bytesRead = this.bytesRead + this.blockSize;
         } else {
            int var5 = var3 >> 1 & 7;
            int var6 = var3 >> 4 & 268435455;
            byte[] var7 = new byte[var6];
            var2 = this.readFully(var7, 0, var6);
            this.bytesRead += var6;
            if (!var1) {
               Arrays.fill(this.blockBuffer, (byte)0);
            } else {
               switch (DumpArchiveConstants.COMPRESSION_TYPE.find(var5 & 3)) {
                  case ZLIB:
                     try {
                        Inflater var8 = new Inflater();
                        var8.setInput(var7, 0, var7.length);
                        var6 = var8.inflate(this.blockBuffer);
                        if (var6 != this.blockSize) {
                           throw new ShortFileException();
                        }

                        var8.end();
                        break;
                     } catch (DataFormatException var9) {
                        throw new DumpArchiveException("bad data", var9);
                     }
                  case BZLIB:
                     throw new UnsupportedCompressionAlgorithmException("BZLIB2");
                  case LZO:
                     throw new UnsupportedCompressionAlgorithmException("LZO");
                  default:
                     throw new UnsupportedCompressionAlgorithmException();
               }
            }
         }
      } else {
         var2 = this.readFully(this.blockBuffer, 0, this.blockSize);
         this.bytesRead = this.bytesRead + this.blockSize;
      }

      this.currBlkIdx++;
      this.readOffset = 0;
      return var2;
   }

   private boolean readFully(byte[] var1, int var2, int var3) {
      int var4 = IOUtils.readFully(this.in, var1, var2, var3);
      if (var4 < var3) {
         throw new ShortFileException();
      } else {
         return true;
      }
   }

   public long getBytesRead() {
      return this.bytesRead;
   }
}
