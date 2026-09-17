package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class HICRRICCHCCROOHHCHOCOCCHOIHHOC {
   private static final HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIRCCIOCIRCCIHCCIOROOHOORRIIIC;

   static long load64(byte[] var0, int var1) {
      assert var0.length >= var1 + 8;
      return RIRCCIOCIRCCIHCCIOROOHOORRIIIC.getLongLittleEndian(var0, var1);
   }

   static long load64Safely(byte[] var0, int var1, int var2) {
      long var3 = 0L;
      int var5 = Math.min(var2, 8);

      for (int var6 = 0; var6 < var5; var6++) {
         var3 |= (var0[var1 + var6] & 255L) << var6 * 8;
      }

      return var3;
   }

   static void store64(byte[] var0, int var1, long var2) {
      assert var1 >= 0 && var1 + 8 <= var0.length;
      RIRCCIOCIRCCIHCCIOROOHOORRIIIC.putLongLittleEndian(var0, var1, var2);
   }

   static int load32(byte[] var0, int var1) {
      return var0[var1] & 0xFF | (var0[var1 + 1] & 0xFF) << 8 | (var0[var1 + 2] & 0xFF) << 16 | (var0[var1 + 3] & 0xFF) << 24;
   }

   static boolean usingUnsafe() {
      return RIRCCIOCIRCCIHCCIOROOHOORRIIIC instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
   }

   private HICRRICCHCCROOHHCHOCOCCHOIHHOC() {
   }

   static {
      Enum var0 = HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INSTANCE;

      try {
         String var1 = System.getProperty("os.arch");
         if ("amd64".equals(var1)) {
            var0 = ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)
               ? HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.UNSAFE_LITTLE_ENDIAN
               : HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.UNSAFE_BIG_ENDIAN;
         }
      } catch (Throwable var2) {
      }

      RIRCCIOCIRCCIHCCIOROOHOORRIIIC = var0;
   }

   private enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      UNSAFE_LITTLE_ENDIAN {
         @Override
         public long getLongLittleEndian(byte[] var1, int var2) {
            return HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.theUnsafe
               .getLong(var1, (long)var2 + HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.BYTE_ARRAY_BASE_OFFSET);
         }

         @Override
         public void putLongLittleEndian(byte[] var1, int var2, long var3) {
            HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.theUnsafe
               .putLong(var1, (long)var2 + HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.BYTE_ARRAY_BASE_OFFSET, var3);
         }
      },
      UNSAFE_BIG_ENDIAN {
         @Override
         public long getLongLittleEndian(byte[] var1, int var2) {
            long var3 = HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.theUnsafe
               .getLong(var1, (long)var2 + HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.BYTE_ARRAY_BASE_OFFSET);
            return Long.reverseBytes(var3);
         }

         @Override
         public void putLongLittleEndian(byte[] var1, int var2, long var3) {
            long var5 = Long.reverseBytes(var3);
            HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.theUnsafe
               .putLong(var1, (long)var2 + HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.BYTE_ARRAY_BASE_OFFSET, var5);
         }
      };

      private static final Unsafe theUnsafe = getUnsafe();
      private static final int BYTE_ARRAY_BASE_OFFSET = theUnsafe.arrayBaseOffset(byte[].class);

      HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
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
         if (theUnsafe.arrayIndexScale(byte[].class) != 1) {
            throw new AssertionError();
         }
      }
   }

   private interface IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      long getLongLittleEndian(byte[] var1, int var2);

      void putLongLittleEndian(byte[] var1, int var2, long var3);
   }

   private enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      INSTANCE {
         @Override
         public long getLongLittleEndian(byte[] var1, int var2) {
            return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.OCOHORHCROHICRRIHCIHHRRCIHICRI.fromBytes(
               var1[var2 + 7], var1[var2 + 6], var1[var2 + 5], var1[var2 + 4], var1[var2 + 3], var1[var2 + 2], var1[var2 + 1], var1[var2]
            );
         }

         @Override
         public void putLongLittleEndian(byte[] var1, int var2, long var3) {
            long var5 = 255L;

            for (int var7 = 0; var7 < 8; var7++) {
               var1[var2 + var7] = (byte)((var3 & var5) >> var7 * 8);
               var5 <<= 8;
            }
         }
      };

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }
   }
}
