package org.apache.commons.compress.utils;

import java.io.InputStream;

public class BoundedInputStream extends InputStream {
   private final InputStream in;
   private long bytesRemaining;

   public BoundedInputStream(InputStream var1, long var2) {
      this.in = var1;
      this.bytesRemaining = var2;
   }

   @Override
   public int read() {
      if (this.bytesRemaining > 0L) {
         this.bytesRemaining--;
         return this.in.read();
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

      int var5 = this.in.read(var1, var2, var4);
      if (var5 >= 0) {
         this.bytesRemaining -= var5;
      }

      return var5;
   }

   @Override
   public void close() {
   }
}
