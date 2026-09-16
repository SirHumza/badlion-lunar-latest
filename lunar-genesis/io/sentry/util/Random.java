package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class Random implements Serializable {
   private static final long serialVersionUID = 3905348978240129619L;
   private final AtomicLong seed;
   private static final long multiplier = 25214903917L;
   private static final long addend = 11L;
   private static final long mask = 281474976710655L;
   private static final double DOUBLE_UNIT = 1.110223E-16F;
   static final String BadBound = "bound must be positive";
   private static final AtomicLong seedUniquifier = new AtomicLong(8682522807148012L);

   public Random() {
      this(seedUniquifier() ^ System.nanoTime());
   }

   private static long seedUniquifier() {
      long var0;
      long var2;
      do {
         var0 = seedUniquifier.get();
         var2 = var0 * 1181783497276652981L;
      } while (!seedUniquifier.compareAndSet(var0, var2));

      return var2;
   }

   public Random(long var1) {
      if (this.getClass() == Random.class) {
         this.seed = new AtomicLong(initialScramble(var1));
      } else {
         this.seed = new AtomicLong();
         this.setSeed(var1);
      }
   }

   private static long initialScramble(long var0) {
      return (var0 ^ 25214903917L) & 281474976710655L;
   }

   public synchronized void setSeed(long var1) {
      this.seed.set(initialScramble(var1));
   }

   private int next(int var1) {
      AtomicLong var6 = this.seed;

      long var2;
      long var4;
      do {
         var2 = var6.get();
         var4 = var2 * 25214903917L + 11L & 281474976710655L;
      } while (!var6.compareAndSet(var2, var4));

      return (int)(var4 >>> 48 - var1);
   }

   public void nextBytes(byte[] var1) {
      int var2 = 0;
      int var3 = var1.length;

      while (var2 < var3) {
         int var4 = this.nextInt();

         for (int var5 = Math.min(var3 - var2, 4); var5-- > 0; var4 >>= 8) {
            var1[var2++] = (byte)var4;
         }
      }
   }

   final long internalNextLong(long var1, long var3) {
      long var5 = this.nextLong();
      if (var1 < var3) {
         long var7 = var3 - var1;
         long var9 = var7 - 1L;
         if ((var7 & var9) == 0L) {
            var5 = (var5 & var9) + var1;
         } else if (var7 > 0L) {
            long var11 = var5 >>> 1;

            while (var11 + var9 - (var5 = var11 % var7) < 0L) {
               var11 = this.nextLong() >>> 1;
            }

            var5 += var1;
         } else {
            while (var5 < var1 || var5 >= var3) {
               var5 = this.nextLong();
            }
         }
      }

      return var5;
   }

   final int internalNextInt(int var1, int var2) {
      if (var1 >= var2) {
         return this.nextInt();
      }

      int var3 = var2 - var1;
      if (var3 > 0) {
         return this.nextInt(var3) + var1;
      }

      int var4;
      do {
         var4 = this.nextInt();
      } while (var4 < var1 || var4 >= var2);

      return var4;
   }

   final double internalNextDouble(double var1, double var3) {
      double var5 = this.nextDouble();
      if (var1 < var3) {
         var5 = var5 * (var3 - var1) + var1;
         if (var5 >= var3) {
            var5 = Double.longBitsToDouble(Double.doubleToLongBits(var3) - 1L);
         }
      }

      return var5;
   }

   public int nextInt() {
      return this.next(32);
   }

   public int nextInt(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("bound must be positive");
      }

      int var2 = this.next(31);
      int var3 = var1 - 1;
      if ((var1 & var3) == 0) {
         var2 = (int)((long)var1 * var2 >> 31);
      } else {
         int var4 = var2;

         while (var4 - (var2 = var4 % var1) + var3 < 0) {
            var4 = this.next(31);
         }
      }

      return var2;
   }

   public long nextLong() {
      return ((long)this.next(32) << 32) + this.next(32);
   }

   public boolean nextBoolean() {
      return this.next(1) != 0;
   }

   public float nextFloat() {
      return this.next(24) / 1.6777216E7F;
   }

   public double nextDouble() {
      return (((long)this.next(26) << 27) + this.next(27)) * 1.110223E-16F;
   }
}
