package org.apache.commons.compress.archivers.sevenz;

import java.io.InputStream;
import java.io.RandomAccessFile;

class BoundedRandomAccessFileInputStream extends InputStream {
   private final RandomAccessFile file;
   private long bytesRemaining;

   public BoundedRandomAccessFileInputStream(RandomAccessFile var1, long var2) {
      this.file = var1;
      this.bytesRemaining = var2;
   }

   @Override
   public int read() {
      if (this.bytesRemaining > 0L) {
         this.bytesRemaining--;
         return this.file.read();
      } else {
         return -1;
      }
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      if (this.bytesRemaining == 0L) {
         return -1;
      }

      int var4 = var3;
      if (var4 > this.bytesRemaining) {
         var4 = (int)this.bytesRemaining;
      }

      int var5 = this.file.read(var1, var2, var4);
      if (var5 >= 0) {
         this.bytesRemaining -= var5;
      }

      return var5;
   }

   @Override
   public void close() {
   }
}
