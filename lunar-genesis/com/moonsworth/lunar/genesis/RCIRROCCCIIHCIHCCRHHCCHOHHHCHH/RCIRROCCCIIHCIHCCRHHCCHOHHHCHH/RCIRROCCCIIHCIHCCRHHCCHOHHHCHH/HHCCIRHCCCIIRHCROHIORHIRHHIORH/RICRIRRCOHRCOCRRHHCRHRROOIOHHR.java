package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.Nullable;
import sun.misc.Unsafe;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
abstract class RICRIRRCOHRCOCRRHHCRHRROOIOHHR extends Number {
   static final ThreadLocal<int[]> CRCOCCIORHCOOIRIRRCOIOROCIRRCI = new ThreadLocal<>();
   static final Random CRIHCICIRRROCHHOROHOCOCHHRROCI = new Random();
   static final int HOHIRRCROHHIIRHOIRCIOOOIRROICI = Runtime.getRuntime().availableProcessors();
   transient volatile RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH @Nullable [] CIIRCHHCOCHRRHRRCOHOIIOROIHRIH;
   transient volatile long base;
   transient volatile int busy;
   private static final Unsafe COICIRRORRICCRCCCRHOIHICIOOOCO;
   private static final long OCHORHHCOOHICHOIROCOHOCOORORRI;
   private static final long HCRIICHCORCOCRCRRIHOCORHIROCRH;

   final boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(long var1, long var3) {
      return COICIRRORRICCRCCCRHOIHICIOOOCO.compareAndSwapLong(this, OCHORHHCOOHICHOIROCOHOCOORORRI, var1, var3);
   }

   final boolean IOHIRCIRORICOOOROCCROCCIIHRIRI() {
      return COICIRRORRICCRCCCRHOIHICIOOOCO.compareAndSwapInt(this, HCRIICHCORCOCRCRRIHOCORHIROCRH, 0, 1);
   }

   abstract long fn(long var1, long var3);

   final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var1, int[] var3, boolean var4) {
      int var5;
      if (var3 == null) {
         CRCOCCIORHCOOIRIRRCOIOROCIRRCI.set(var3 = new int[1]);
         int var6 = CRIHCICIRRROCHHOROHOCOCHHRROCI.nextInt();
         var5 = var3[0] = var6 == 0 ? 1 : var6;
      } else {
         var5 = var3[0];
      }

      boolean var34 = false;

      while (true) {
         RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var7 = this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH;
         int var9;
         if (this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH != null && (var9 = var7.length) > 0) {
            RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8;
            if ((var8 = var7[var9 - 1 & var5]) == null) {
               if (this.busy == 0) {
                  RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var36 = new RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
                  if (this.busy == 0 && this.IOHIRCIRORICOOOROCCROCCIIHRIRI()) {
                     boolean var38 = false;

                     try {
                        RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var14 = this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH;
                        int var15;
                        int var16;
                        if (this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH != null && (var15 = var14.length) > 0 && var14[var16 = var15 - 1 & var5] == null) {
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
               if (var8.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var35 = var8.value, this.fn(var35, var1))) {
                  break;
               }

               if (var9 >= HOHIRRCROHHIIRHOIRCIOOOIRROICI || this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH != var7) {
                  var34 = false;
               } else if (!var34) {
                  var34 = true;
               } else if (this.busy == 0 && this.IOHIRCIRORICOOOROCCROCCIIHRIRI()) {
                  try {
                     if (this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH == var7) {
                        RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var37 = new RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[var9
                           << 1];

                        for (int var39 = 0; var39 < var9; var39++) {
                           var37[var39] = var7[var39];
                        }

                        this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH = var37;
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
         } else if (this.busy == 0 && this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH == var7 && this.IOHIRCIRORICOOOROCCROCCIIHRIRI()) {
            boolean var12 = false;

            try {
               if (this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH == var7) {
                  RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var13 = new RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[2];
                  var13[var5 & 1] = new RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
                  this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH = var13;
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
            if (this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var10 = this.base, this.fn(var10, var1))) {
               break;
            }
         }
      }
   }

   final void OCCORIIORHORROHHROHHOORHIHRIOO(long var1) {
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var3 = this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH;
      this.base = var1;
      if (var3 != null) {
         for (RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var3) {
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
         COICIRRORRICCRCCCRHOIHICIOOOCO = getUnsafe();
         Class<RICRIRRCOHRCOCRRHHCRHRROOIOHHR> var0 = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class;
         OCHORHHCOOHICHOIROCOHOCOORORRI = COICIRRORRICCRCCCRHOIHICIOOOCO.objectFieldOffset(var0.getDeclaredField("base"));
         HCRIICHCORCOCRCRRIHOCORHIROCRH = COICIRRORRICCRCCCRHOIHICIOOOCO.objectFieldOffset(var0.getDeclaredField("busy"));
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
      private static final Unsafe CRROORIOICOIOHRHCCICHCCICHHCOC;
      private static final long HHOOCRICICHRROHOORHHIRRRCHRCOI;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var1) {
         this.value = var1;
      }

      final boolean HICHRCOHCCRHOHCICOOCHOIHCCHIRI(long var1, long var3) {
         return CRROORIOICOIOHRHCCICHCCICHHCOC.compareAndSwapLong(this, HHOOCRICICHRROHOORHHIRRRCHRCOI, var1, var3);
      }

      static {
         try {
            CRROORIOICOIOHRHCCICHCCICHHCOC = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.getUnsafe();
            Class<RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var0 = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class;
            HHOOCRICICHRROHOORHHIRRRCHRCOI = CRROORIOICOIOHRHCCICHCCICHHCOC.objectFieldOffset(var0.getDeclaredField("value"));
         } catch (Exception var1) {
            throw new Error(var1);
         }
      }
   }
}
