package org.apache.commons.compress.utils;

import java.io.FilterInputStream;
import java.io.InputStream;

public class CountingInputStream extends FilterInputStream {
   private long bytesRead;

   public CountingInputStream(InputStream var1) {
      super(var1);
   }

   @Override
   public int read() {
      int var1 = this.in.read();
      if (var1 >= 0) {
         this.count(1L);
      }

      return var1;
   }

   @Override
   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      int var4 = this.in.read(var1, var2, var3);
      if (var4 >= 0) {
         this.count(var4);
      }

      return var4;
   }

   protected final void count(long var1) {
      if (var1 != -1L) {
         this.bytesRead += var1;
      }
   }

   public long getBytesRead() {
      return this.bytesRead;
   }
}
