package org.jctools.util;

public final class UnsafeLongArrayAccess {
   public static final long LONG_ARRAY_BASE;
   public static final int LONG_ELEMENT_SHIFT;

   public static void spLongElement(long[] var0, long var1, long var3) {
      UnsafeAccess.UNSAFE.putLong(var0, var1, var3);
   }

   public static void soLongElement(long[] var0, long var1, long var3) {
      UnsafeAccess.UNSAFE.putOrderedLong(var0, var1, var3);
   }

   public static long lpLongElement(long[] var0, long var1) {
      return UnsafeAccess.UNSAFE.getLong(var0, var1);
   }

   public static long lvLongElement(long[] var0, long var1) {
      return UnsafeAccess.UNSAFE.getLongVolatile(var0, var1);
   }

   public static long calcLongElementOffset(long var0) {
      return LONG_ARRAY_BASE + (var0 << LONG_ELEMENT_SHIFT);
   }

   public static long calcCircularLongElementOffset(long var0, long var2) {
      return LONG_ARRAY_BASE + ((var0 & var2) << LONG_ELEMENT_SHIFT);
   }

   public static long[] allocateLongArray(int var0) {
      return new long[var0];
   }

   static {
      int var0 = UnsafeAccess.UNSAFE.arrayIndexScale(long[].class);
      if (8 == var0) {
         LONG_ELEMENT_SHIFT = 3;
         LONG_ARRAY_BASE = UnsafeAccess.UNSAFE.arrayBaseOffset(long[].class);
      } else {
         throw new IllegalStateException("Unknown pointer size: " + var0);
      }
   }
}
