package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.Nullable;
import sun.misc.Unsafe;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
abstract class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH extends Number {
   static final ThreadLocal<int[]> RRCIIOHHOIIIHRRCOIHHCOHHHRCRRR = new ThreadLocal<>();
   static final Random HHCOHOORIRRHHOIHHRIIOIHCCRCRRH = new Random();
   static final int CHRCRCIHROOIOHRIHOCOOIHRIOROCO = Runtime.getRuntime().availableProcessors();
   transient volatile RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH @Nullable [] IRICCCRHHCCCCOOCRHCHOHRIRCHOIH;
   transient volatile long base;
   transient volatile int busy;
   private static final Unsafe IHHHCCRRHIORCCRHICIHCCOIOHOROH;
   private static final long OOROHOCOOIIHHHRRCOIORORRICHHRH;
   private static final long COOHRRHIHCOOCOCOROHHIRHIICOCIO;

   final boolean IIRHCHHOICHRICOOCRORCCIOOIHOIR(long var1, long var3) {
      return IHHHCCRRHIORCCRHICIHCCOIOHOROH.compareAndSwapLong(this, OOROHOCOOIIHHHRRCOIORORRICHHRH, var1, var3);
   }

   final boolean OHHHRRIROOHIHIHIHICCICHHCCHHCR() {
      return IHHHCCRRHIORCCRHICIHCCOIOHOROH.compareAndSwapInt(this, COOHRRHIHCOOCOCOROHHIRHIICOCIO, 0, 1);
   }

   abstract long fn(long var1, long var3);

   final void IRCIIHHICIHRCOCRROCOICRIHHCCHH(long var1, int @Nullable [] var3, boolean var4) {
      int var5;
      if (var3 == null) {
         RRCIIOHHOIIIHRRCOIHHCOHHHRCRRR.set(var3 = new int[1]);
         int var6 = HHCOHOORIRRHHOIHHRIIOIHCCRCRRH.nextInt();
         var5 = var3[0] = var6 == 0 ? 1 : var6;
      } else {
         var5 = var3[0];
      }

      boolean var34 = false;

      while (true) {
         RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var7 = this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH;
         int var9;
         if (this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH != null && (var9 = var7.length) > 0) {
            RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8;
            if ((var8 = var7[var9 - 1 & var5]) == null) {
               if (this.busy == 0) {
                  RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var36 = new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
                  if (this.busy == 0 && this.OHHHRRIROOHIHIHIHICCICHHCCHHCR()) {
                     boolean var38 = false;

                     try {
                        RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var14 = this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH;
                        int var15;
                        int var16;
                        if (this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH != null && (var15 = var14.length) > 0 && var14[var16 = var15 - 1 & var5] == null) {
                           var14[var16] = var36;
                           var38 = true;
                        }
                     } finally {
                        this.busy = 0;
                     }

                     if (var38) {
                        break;
                     }
                     continue;
                  }
               }

               var34 = false;
            } else if (!var4) {
               var4 = true;
            } else {
               long var35;
               if (var8.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var35 = var8.value, this.fn(var35, var1))) {
                  break;
               }

               if (var9 >= CHRCRCIHROOIOHRIHOCOOIHRIOROCO || this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH != var7) {
                  var34 = false;
               } else if (!var34) {
                  var34 = true;
               } else if (this.busy == 0 && this.OHHHRRIROOHIHIHIHICCICHHCCHHCR()) {
                  try {
                     if (this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH == var7) {
                        RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var37 = new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[var9
                           << 1];

                        for (int var39 = 0; var39 < var9; var39++) {
                           var37[var39] = var7[var39];
                        }

                        this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH = var37;
                     }
                  } finally {
                     this.busy = 0;
                  }

                  var34 = false;
                  continue;
               }
            }

            int var32 = var5 ^ var5 << 13;
            int var33 = var32 ^ var32 >>> 17;
            var5 = var33 ^ var33 << 5;
            var3[0] = var5;
         } else if (this.busy == 0 && this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH == var7 && this.OHHHRRIROOHIHIHIHICCICHHCCHHCR()) {
            boolean var12 = false;

            try {
               if (this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH == var7) {
                  RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var13 = new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[2];
                  var13[var5 & 1] = new RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
                  this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH = var13;
                  var12 = true;
               }
            } finally {
               this.busy = 0;
            }

            if (var12) {
               break;
            }
         } else {
            long var10;
            if (this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var10 = this.base, this.fn(var10, var1))) {
               break;
            }
         }
      }
   }

   final void RCOHCCHCRHIIIICRIHCOICIHHCCOOC(long var1) {
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var3 = this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH;
      this.base = var1;
      if (var3 != null) {
         for (RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var3) {
            if (var6 != null) {
               var6.value = var1;
            }
         }
      }
   }

   private static Unsafe getUnsafe() {
      try {
         return Unsafe.getUnsafe();
      } catch (SecurityException var2) {
         try {
            return AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() {
               public Unsafe run() {
                  Class<Unsafe> var1 = Unsafe.class;

                  for (Field var5 : var1.getDeclaredFields()) {
                     var5.setAccessible(true);
                     Object var6 = var5.get(null);
                     if (var1.isInstance(var6)) {
                        return var1.cast(var6);
                     }
                  }

                  throw new NoSuchFieldError("the Unsafe");
               }
            });
         } catch (PrivilegedActionException var1) {
            throw new RuntimeException("Could not initialize intrinsics", var1.getCause());
         }
      }
   }

   static {
      try {
         IHHHCCRRHIORCCRHICIHCCOIOHOROH = getUnsafe();
         Class<RIRHOCHIORCCIIOIIRHOCCCRHHCHHH> var0 = RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.class;
         OOROHOCOOIIHHHRRCOIORORRICHHRH = IHHHCCRRHIORCCRHICIHCCOIOHOROH.objectFieldOffset(var0.getDeclaredField("base"));
         COOHRRHIHCOOCOCOROHHIRHIICOCIO = IHHHCCRRHIORCCRHICIHCCOIOHOROH.objectFieldOffset(var0.getDeclaredField("busy"));
      } catch (Exception var1) {
         throw new Error(var1);
      }
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      volatile long p0;
      volatile long p1;
      volatile long p2;
      volatile long p3;
      volatile long p4;
      volatile long p5;
      volatile long p6;
      volatile long value;
      volatile long q0;
      volatile long q1;
      volatile long q2;
      volatile long q3;
      volatile long q4;
      volatile long q5;
      volatile long q6;
      private static final Unsafe RHRHCIRRIHIIRRCRIIIRRIIRCCIHIR;
      private static final long HCOHHHICCROOHRHRIRRIICRCICIIHO;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var1) {
         this.value = var1;
      }

      final boolean OHHRIOHROOIHOROCIRHCHORIHRRRRI(long var1, long var3) {
         return RHRHCIRRIHIIRRCRIIIRRIIRCCIHIR.compareAndSwapLong(this, HCOHHHICCROOHRHRIRRIICRCICIIHO, var1, var3);
      }

      static {
         try {
            RHRHCIRRIHIIRRCRIIIRRIIRCCIHIR = RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.getUnsafe();
            Class<RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var0 = RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class;
            HCOHHHICCROOHRHRIRRIICRCICIIHO = RHRHCIRRIHIIRRCRIIIRRIIRCCIHIR.objectFieldOffset(var0.getDeclaredField("value"));
         } catch (Exception var1) {
            throw new Error(var1);
         }
      }
   }
}
