package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import sun.misc.Unsafe;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class RICRIRRCOHRCOCRRHHCRHRROOIOHHR {
   public static final byte OIRRROIIHCCOCORIIOCIRHIHROIHHI = -128;
   public static final byte IRIROIICOHRHIIHCHOHOIHICRHHRRI = -1;
   private static final int CIHHRROCIORHICHCOOHIRCCCCHHCRR = 255;

   private RICRIRRCOHRCOCRRHHCRHRROOIOHHR() {
   }

   public static int toInt(byte var0) {
      return var0 & 0xFF;
   }

   @CanIgnoreReturnValue
   public static byte checkedCast(long var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0 >> 8 == 0L, "out of range: %s", var0);
      return (byte)var0;
   }

   public static byte saturatedCast(long var0) {
      if (var0 > toInt((byte)-1)) {
         return -1;
      } else {
         return var0 < 0L ? 0 : (byte)var0;
      }
   }

   public static int compare(byte var0, byte var1) {
      return toInt(var0) - toInt(var1);
   }

   public static byte min(byte... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      int var1 = toInt(var0[0]);

      for (int var2 = 1; var2 < var0.length; var2++) {
         int var3 = toInt(var0[var2]);
         if (var3 < var1) {
            var1 = var3;
         }
      }

      return (byte)var1;
   }

   public static byte max(byte... var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var0.length > 0);
      int var1 = toInt(var0[0]);

      for (int var2 = 1; var2 < var0.length; var2++) {
         int var3 = toInt(var0[var2]);
         if (var3 > var1) {
            var1 = var3;
         }
      }

      return (byte)var1;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static String toString(byte var0) {
      return toString(var0, 10);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public static String toString(byte var0, int var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 >= 2 && var1 <= 36, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", var1);
      return Integer.toString(toInt(var0), var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   public static byte parseUnsignedByte(String var0) {
      return parseUnsignedByte(var0, 10);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   public static byte parseUnsignedByte(String var0, int var1) {
      int var2 = Integer.parseInt(IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0), var1);
      if (var2 >> 8 == 0) {
         return (byte)var2;
      } else {
         throw new NumberFormatException("out of range: " + var2);
      }
   }

   public static String join(String var0, byte... var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      if (var1.length == 0) {
         return "";
      }

      StringBuilder var2 = new StringBuilder(var1.length * (3 + var0.length()));
      var2.append(toInt(var1[0]));

      for (int var3 = 1; var3 < var1.length; var3++) {
         var2.append(var0).append(toString(var1[var3]));
      }

      return var2.toString();
   }

   public static Comparator<byte[]> lexicographicalComparator() {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ICRCHRHIRCHIOHCORRROIICCRHCIRO;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static Comparator<byte[]> lexicographicalComparatorJavaImpl() {
      return RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.INSTANCE;
   }

   private static byte flip(byte var0) {
      return (byte)(var0 ^ 128);
   }

   public static void sort(byte[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      sort(var0, 0, var0.length);
   }

   public static void sort(byte[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);

      for (int var3 = var1; var3 < var2; var3++) {
         var0[var3] = flip(var0[var3]);
      }

      Arrays.sort(var0, var1, var2);

      for (int var4 = var1; var4 < var2; var4++) {
         var0[var4] = flip(var0[var4]);
      }
   }

   public static void sortDescending(byte[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      sortDescending(var0, 0, var0.length);
   }

   public static void sortDescending(byte[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);

      for (int var3 = var1; var3 < var2; var3++) {
         var0[var3] = (byte)(var0[var3] ^ 127);
      }

      Arrays.sort(var0, var1, var2);

      for (int var4 = var1; var4 < var2; var4++) {
         var0[var4] = (byte)(var0[var4] ^ 127);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      static final String CRCHHHHOIIOIHCCCOOHOROCCCIRCII = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getName() + "$UnsafeComparator";
      static final Comparator<byte[]> ICRCHRHIRCHIOHCORRROIICCRHCIRO = getBestComparator();

      static Comparator<byte[]> getBestComparator() {
         try {
            Class var0 = Class.forName(CRCHHHHOIIOIHCCCOOHOROCCCIRCII);
            return (Comparator<byte[]>)var0.getEnumConstants()[0];
         } catch (Throwable var2) {
            return RICRIRRCOHRCOCRRHHCRHRROOIOHHR.lexicographicalComparatorJavaImpl();
         }
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
      enum IRCIIHHICIHRCOCRROCOICRIHHCCHH implements Comparator<byte[]> {
         INSTANCE;

         static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
         static final Unsafe theUnsafe = getUnsafe();
         static final int BYTE_ARRAY_BASE_OFFSET = theUnsafe.arrayBaseOffset(byte[].class);

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

         public int compare(byte[] var1, byte[] var2) {
            byte var3 = 8;
            int var4 = Math.min(var1.length, var2.length);
            int var5 = var4 & -8;

            int var6;
            for (var6 = 0; var6 < var5; var6 += 8) {
               long var7 = theUnsafe.getLong(var1, (long)BYTE_ARRAY_BASE_OFFSET + var6);
               long var9 = theUnsafe.getLong(var2, (long)BYTE_ARRAY_BASE_OFFSET + var6);
               if (var7 != var9) {
                  if (BIG_ENDIAN) {
                     return IOIICIRIICICIIOORHCIIIIRRIHRHI.compare(var7, var9);
                  }

                  int var11 = Long.numberOfTrailingZeros(var7 ^ var9) & -8;
                  return (int)(var7 >>> var11 & 255L) - (int)(var9 >>> var11 & 255L);
               }
            }

            while (var6 < var4) {
               int var12 = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.compare(var1[var6], var2[var6]);
               if (var12 != 0) {
                  return var12;
               }

               var6++;
            }

            return var1.length - var2.length;
         }

         @Override
         public String toString() {
            return "UnsignedBytes.lexicographicalComparator() (sun.misc.Unsafe version)";
         }

         static {
            if (!"64".equals(System.getProperty("sun.arch.data.model")) || BYTE_ARRAY_BASE_OFFSET % 8 != 0 || theUnsafe.arrayIndexScale(byte[].class) != 1) {
               throw new Error();
            }
         }
      }

      enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Comparator<byte[]> {
         INSTANCE;

         public int compare(byte[] var1, byte[] var2) {
            int var3 = Math.min(var1.length, var2.length);

            for (int var4 = 0; var4 < var3; var4++) {
               int var5 = RICRIRRCOHRCOCRRHHCRHRROOIOHHR.compare(var1[var4], var2[var4]);
               if (var5 != 0) {
                  return var5;
               }
            }

            return var1.length - var2.length;
         }

         @Override
         public String toString() {
            return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
         }
      }
   }
}
