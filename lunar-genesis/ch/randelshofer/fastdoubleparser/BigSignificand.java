package ch.randelshofer.fastdoubleparser;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

class BigSignificand {
   private static final long LONG_MASK = 4294967295L;
   private final int numInts;
   private final int[] x;
   private int firstNonZeroInt;

   public BigSignificand(long var1) {
      if (var1 > 0L && var1 < 2147483647L) {
         int var3 = (int)(var1 + 63L >>> 6) + 1;
         this.numInts = var3 << 1;
         this.x = new int[this.numInts];
         this.firstNonZeroInt = this.numInts;
      } else {
         throw new IllegalArgumentException("numBits=" + var1);
      }
   }

   public void add(int var1) {
      if (var1 != 0) {
         long var2 = var1 & 4294967295L;

         int var4;
         for (var4 = this.numInts - 1; var2 != 0L; var4--) {
            long var5 = (this.x(var4) & 4294967295L) + var2;
            this.x(var4, (int)var5);
            var2 = var5 >>> 32;
         }

         this.firstNonZeroInt = Math.min(this.firstNonZeroInt, var4 + 1);
      }
   }

   public void fma(int var1, int var2) {
      long var3 = var1 & 4294967295L;
      long var5 = var2;

      int var7;
      for (var7 = this.numInts - 1; var7 >= this.firstNonZeroInt; var7--) {
         long var8 = var3 * (this.x(var7) & 4294967295L) + var5;
         this.x(var7, (int)var8);
         var5 = var8 >>> 32;
      }

      if (var5 != 0L) {
         this.x(var7, (int)var5);
         this.firstNonZeroInt = var7;
      }
   }

   public BigInteger toBigInteger() {
      byte[] var1 = new byte[this.x.length << 2];
      IntBuffer var2 = ByteBuffer.wrap(var1).asIntBuffer();

      for (int var3 = 0; var3 < this.x.length; var3++) {
         var2.put(var3, this.x[var3]);
      }

      return new BigInteger(var1);
   }

   private void x(int var1, int var2) {
      this.x[var1] = var2;
   }

   private int x(int var1) {
      return this.x[var1];
   }
}
