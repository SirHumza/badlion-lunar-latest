package org.apache.commons.compress.compressors.snappy;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.utils.IOUtils;

public class SnappyCompressorInputStream extends CompressorInputStream {
   private static final int TAG_MASK = 3;
   public static final int DEFAULT_BLOCK_SIZE = 32768;
   private final byte[] decompressBuf;
   private int writeIndex;
   private int readIndex;
   private final int blockSize;
   private final InputStream in;
   private final int size;
   private int uncompressedBytesRemaining;
   private final byte[] oneByte = new byte[1];
   private boolean endReached = false;

   public SnappyCompressorInputStream(InputStream var1) {
      this(var1, 32768);
   }

   public SnappyCompressorInputStream(InputStream var1, int var2) {
      this.in = var1;
      this.blockSize = var2;
      this.decompressBuf = new byte[var2 * 3];
      this.writeIndex = this.readIndex = 0;
      this.uncompressedBytesRemaining = this.size = (int)this.readSize();
   }

   @Override
   public int read() {
      return this.read(this.oneByte, 0, 1) == -1 ? -1 : this.oneByte[0] & 0xFF;
   }

   @Override
   public void close() {
      this.in.close();
   }

   @Override
   public int available() {
      return this.writeIndex - this.readIndex;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      if (this.endReached) {
         return -1;
      }

      int var4 = this.available();
      if (var3 > var4) {
         this.fill(var3 - var4);
      }

      int var5 = Math.min(var3, this.available());
      System.arraycopy(this.decompressBuf, this.readIndex, var1, var2, var5);
      this.readIndex += var5;
      if (this.readIndex > this.blockSize) {
         this.slideBuffer();
      }

      return var5;
   }

   private void fill(int var1) {
      if (this.uncompressedBytesRemaining == 0) {
         this.endReached = true;
      }

      int var2 = Math.min(var1, this.uncompressedBytesRemaining);

      while (var2 > 0) {
         int var3 = this.readOneByte();
         int var4 = 0;
         long var5 = 0L;
         switch (var3 & 3) {
            case 0:
               var4 = this.readLiteralLength(var3);
               if (this.expandLiteral(var4)) {
                  return;
               }
               break;
            case 1:
               var4 = 4 + (var3 >> 2 & 7);
               var5 = (var3 & 224) << 3;
               var5 |= this.readOneByte();
               if (this.expandCopy(var5, var4)) {
                  return;
               }
               break;
            case 2:
               var4 = (var3 >> 2) + 1;
               var5 = this.readOneByte();
               var5 |= this.readOneByte() << 8;
               if (this.expandCopy(var5, var4)) {
                  return;
               }
               break;
            case 3:
               var4 = (var3 >> 2) + 1;
               var5 = this.readOneByte();
               var5 |= this.readOneByte() << 8;
               var5 |= this.readOneByte() << 16;
               var5 |= (long)this.readOneByte() << 24;
               if (this.expandCopy(var5, var4)) {
                  return;
               }
         }

         var2 -= var4;
         this.uncompressedBytesRemaining -= var4;
      }
   }

   private void slideBuffer() {
      System.arraycopy(this.decompressBuf, this.blockSize, this.decompressBuf, 0, this.blockSize * 2);
      this.writeIndex = this.writeIndex - this.blockSize;
      this.readIndex = this.readIndex - this.blockSize;
   }

   private int readLiteralLength(int var1) {
      int var2;
      switch (var1 >> 2) {
         case 60:
            var2 = this.readOneByte();
            break;
         case 61:
            var2 = this.readOneByte();
            var2 |= this.readOneByte() << 8;
            break;
         case 62:
            var2 = this.readOneByte();
            var2 |= this.readOneByte() << 8;
            var2 |= this.readOneByte() << 16;
            break;
         case 63:
            var2 = this.readOneByte();
            var2 |= this.readOneByte() << 8;
            var2 |= this.readOneByte() << 16;
            var2 = (int)(var2 | (long)this.readOneByte() << 24);
            break;
         default:
            var2 = var1 >> 2;
      }

      return var2 + 1;
   }

   private boolean expandLiteral(int var1) {
      int var2 = IOUtils.readFully(this.in, this.decompressBuf, this.writeIndex, var1);
      this.count(var2);
      if (var1 != var2) {
         throw new IOException("Premature end of stream");
      }

      this.writeIndex += var1;
      return this.writeIndex >= 2 * this.blockSize;
   }

   private boolean expandCopy(long var1, int var3) {
      if (var1 > this.blockSize) {
         throw new IOException("Offset is larger than block size");
      }

      int var4 = (int)var1;
      if (var4 == 1) {
         byte var5 = this.decompressBuf[this.writeIndex - 1];

         for (int var6 = 0; var6 < var3; var6++) {
            this.decompressBuf[this.writeIndex++] = var5;
         }
      } else if (var3 < var4) {
         System.arraycopy(this.decompressBuf, this.writeIndex - var4, this.decompressBuf, this.writeIndex, var3);
         this.writeIndex += var3;
      } else {
         int var7 = var3 / var4;
         int var8 = var3 - var4 * var7;

         while (var7-- != 0) {
            System.arraycopy(this.decompressBuf, this.writeIndex - var4, this.decompressBuf, this.writeIndex, var4);
            this.writeIndex += var4;
         }

         if (var8 > 0) {
            System.arraycopy(this.decompressBuf, this.writeIndex - var4, this.decompressBuf, this.writeIndex, var8);
            this.writeIndex += var8;
         }
      }

      return this.writeIndex >= 2 * this.blockSize;
   }

   private int readOneByte() {
      int var1 = this.in.read();
      if (var1 == -1) {
         throw new IOException("Premature end of stream");
      }

      this.count(1);
      return var1 & 0xFF;
   }

   private long readSize() {
      int var1 = 0;
      long var2 = 0L;
      int var4 = 0;

      do {
         var4 = this.readOneByte();
         var2 |= (var4 & 127) << var1++ * 7;
      } while (0 != (var4 & 128));

      return var2;
   }

   public int getSize() {
      return this.size;
   }
}
