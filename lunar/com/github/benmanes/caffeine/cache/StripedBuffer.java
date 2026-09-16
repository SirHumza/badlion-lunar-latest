package com.github.benmanes.caffeine.cache;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.function.Consumer;
import org.checkerframework.checker.nullness.qual.Nullable;

abstract class StripedBuffer<E> implements Buffer<E> {
   static final VarHandle TABLE_BUSY;
   static final int NCPU = Runtime.getRuntime().availableProcessors();
   static final int MAXIMUM_TABLE_SIZE = 4 * Caffeine.ceilingPowerOfTwo(NCPU);
   static final int ATTEMPTS = 3;
   volatile Buffer<E> @Nullable [] table;
   volatile int tableBusy;

   final boolean casTableBusy() {
      return TABLE_BUSY.compareAndSet((StripedBuffer)this, (int)0, (int)1);
   }

   protected abstract Buffer<E> create(E var1);

   @Override
   public int offer(E var1) {
      long var2 = mix64(Thread.currentThread().getId());
      int var4 = (int)(var2 >>> 32) | 1;
      int var5 = (int)var2;
      boolean var9 = true;
      Buffer[] var10 = this.table;
      int var6;
      int var7;
      Buffer var8;
      return var10 != null && (var6 = var10.length - 1) >= 0 && (var8 = var10[var5 & var6]) != null && (var9 = (var7 = var8.offer(var1)) != -1)
         ? var7
         : this.expandOrRetry((E)var1, var5, var4, var9);
   }

   final int expandOrRetry(E var1, int var2, int var3, boolean var4) {
      int var5 = -1;
      boolean var6 = false;

      for (int var7 = 0; var7 < 3; var7++) {
         Buffer[] var8 = this.table;
         int var10;
         if (this.table != null && (var10 = var8.length) > 0) {
            Buffer var9;
            if ((var9 = var8[var10 - 1 & var2]) == null) {
               if (this.tableBusy == 0 && this.casTableBusy()) {
                  boolean var30 = false;

                  try {
                     Buffer[] var31 = this.table;
                     int var13;
                     int var14;
                     if (this.table != null && (var13 = var31.length) > 0 && var31[var14 = var13 - 1 & var2] == null) {
                        var31[var14] = this.create((E)var1);
                        var30 = true;
                     }
                  } finally {
                     this.tableBusy = 0;
                  }

                  if (var30) {
                     var5 = 0;
                     break;
                  }
                  continue;
               }

               var6 = false;
            } else if (!var4) {
               var4 = true;
            } else {
               if ((var5 = var9.offer(var1)) != -1) {
                  break;
               }

               if (var10 >= MAXIMUM_TABLE_SIZE || this.table != var8) {
                  var6 = false;
               } else if (!var6) {
                  var6 = true;
               } else if (this.tableBusy == 0 && this.casTableBusy()) {
                  try {
                     if (this.table == var8) {
                        this.table = Arrays.copyOf(var8, var10 << 1);
                     }
                  } finally {
                     this.tableBusy = 0;
                  }

                  var6 = false;
                  continue;
               }
            }

            var2 += var3;
         } else if (this.tableBusy == 0 && this.table == var8 && this.casTableBusy()) {
            boolean var11 = false;

            try {
               if (this.table == var8) {
                  Buffer[] var12 = new Buffer[]{this.create((E)var1)};
                  this.table = var12;
                  var11 = true;
               }
            } finally {
               this.tableBusy = 0;
            }

            if (var11) {
               var5 = 0;
               break;
            }
         }
      }

      return var5;
   }

   @Override
   public void drainTo(Consumer<E> var1) {
      Buffer[] var2 = this.table;
      if (var2 != null) {
         for (Buffer var6 : var2) {
            if (var6 != null) {
               var6.drainTo(var1);
            }
         }
      }
   }

   @Override
   public long reads() {
      Buffer[] var1 = this.table;
      if (var1 == null) {
         return 0L;
      }

      long var2 = 0L;

      for (Buffer var7 : var1) {
         if (var7 != null) {
            var2 += var7.reads();
         }
      }

      return var2;
   }

   @Override
   public long writes() {
      Buffer[] var1 = this.table;
      if (var1 == null) {
         return 0L;
      }

      long var2 = 0L;

      for (Buffer var7 : var1) {
         if (var7 != null) {
            var2 += var7.writes();
         }
      }

      return var2;
   }

   static long mix64(long var0) {
      var0 = (var0 ^ var0 >>> 30) * -4658895280553007687L;
      var0 = (var0 ^ var0 >>> 27) * -7723592293110705685L;
      return var0 ^ var0 >>> 31;
   }

   static {
      try {
         TABLE_BUSY = MethodHandles.lookup().findVarHandle(StripedBuffer.class, "tableBusy", int.class);
      } catch (ReflectiveOperationException var1) {
         throw new ExceptionInInitializerError(var1);
      }
   }
}
