package com.nothome.delta;

import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class RandomAccessFileSeekableSource implements SeekableSource {
   private RandomAccessFile raf;

   public RandomAccessFileSeekableSource(RandomAccessFile var1) {
      if (var1 == null) {
         throw new NullPointerException("raf");
      }

      this.raf = var1;
   }

   @Override
   public void seek(long var1) {
      this.raf.seek(var1);
   }

   public int read(byte[] var1, int var2, int var3) {
      return this.raf.read(var1, var2, var3);
   }

   public long length() {
      return this.raf.length();
   }

   @Override
   public void close() {
      this.raf.close();
   }

   @Override
   public int read(ByteBuffer var1) {
      int var2 = this.raf.read(var1.array(), var1.position(), var1.remaining());
      if (var2 == -1) {
         return -1;
      }

      ((Buffer)var1).position(var1.position() + var2);
      return var2;
   }
}
