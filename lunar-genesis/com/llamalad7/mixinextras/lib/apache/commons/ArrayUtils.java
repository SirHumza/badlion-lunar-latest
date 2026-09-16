package com.llamalad7.mixinextras.lib.apache.commons;

import java.lang.reflect.Array;

public class ArrayUtils {
   public static final Object[] EMPTY_OBJECT_ARRAY = new Object[0];
   public static final Class<?>[] EMPTY_CLASS_ARRAY = new Class[0];
   public static final String[] EMPTY_STRING_ARRAY = new String[0];
   public static final long[] EMPTY_LONG_ARRAY = new long[0];
   public static final Long[] EMPTY_LONG_OBJECT_ARRAY = new Long[0];
   public static final int[] EMPTY_INT_ARRAY = new int[0];
   public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];
   public static final short[] EMPTY_SHORT_ARRAY = new short[0];
   public static final Short[] EMPTY_SHORT_OBJECT_ARRAY = new Short[0];
   public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
   public static final Byte[] EMPTY_BYTE_OBJECT_ARRAY = new Byte[0];
   public static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
   public static final Double[] EMPTY_DOUBLE_OBJECT_ARRAY = new Double[0];
   public static final float[] EMPTY_FLOAT_ARRAY = new float[0];
   public static final Float[] EMPTY_FLOAT_OBJECT_ARRAY = new Float[0];
   public static final boolean[] EMPTY_BOOLEAN_ARRAY = new boolean[0];
   public static final Boolean[] EMPTY_BOOLEAN_OBJECT_ARRAY = new Boolean[0];
   public static final char[] EMPTY_CHAR_ARRAY = new char[0];
   public static final Character[] EMPTY_CHARACTER_OBJECT_ARRAY = new Character[0];

   public static <T> T[] clone(T[] var0) {
      return (T[])(var0 == null ? null : (Object[])var0.clone());
   }

   public static int[] clone(int[] var0) {
      return var0 == null ? null : (int[])var0.clone();
   }

   public static <T> T[] subarray(T[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > var0.length) {
         var2 = var0.length;
      }

      int var3 = var2 - var1;
      Class var4 = var0.getClass().getComponentType();
      if (var3 <= 0) {
         return (T[])((Object[])Array.newInstance(var4, 0));
      }

      Object[] var5 = (Object[])Array.newInstance(var4, var3);
      System.arraycopy(var0, var1, var5, 0, var3);
      return (T[])var5;
   }

   public static int[] subarray(int[] var0, int var1, int var2) {
      if (var0 == null) {
         return null;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      if (var2 > var0.length) {
         var2 = var0.length;
      }

      int var3 = var2 - var1;
      if (var3 <= 0) {
         return EMPTY_INT_ARRAY;
      }

      int[] var4 = new int[var3];
      System.arraycopy(var0, var1, var4, 0, var3);
      return var4;
   }

   public static int getLength(Object var0) {
      return var0 == null ? 0 : Array.getLength(var0);
   }

   public static <T> T[] addAll(T[] var0, T... var1) {
      if (var0 == null) {
         return (T[])clone(var1);
      }

      if (var1 == null) {
         return (T[])clone(var0);
      }

      Class var2 = var0.getClass().getComponentType();
      Object[] var3 = (Object[])Array.newInstance(var2, var0.length + var1.length);
      System.arraycopy(var0, 0, var3, 0, var0.length);

      try {
         System.arraycopy(var1, 0, var3, var0.length, var1.length);
         return (T[])var3;
      } catch (ArrayStoreException var6) {
         Class var5 = var1.getClass().getComponentType();
         if (!var2.isAssignableFrom(var5)) {
            throw new IllegalArgumentException("Cannot store " + var5.getName() + " in an array of " + var2.getName(), var6);
         } else {
            throw var6;
         }
      }
   }

   public static int[] addAll(int[] var0, int... var1) {
      if (var0 == null) {
         return clone(var1);
      }

      if (var1 == null) {
         return clone(var0);
      }

      int[] var2 = new int[var0.length + var1.length];
      System.arraycopy(var0, 0, var2, 0, var0.length);
      System.arraycopy(var1, 0, var2, var0.length, var1.length);
      return var2;
   }

   public static <T> T[] add(T[] var0, T var1) {
      Class var2;
      if (var0 != null) {
         var2 = var0.getClass();
      } else {
         if (var1 == null) {
            throw new IllegalArgumentException("Arguments cannot both be null");
         }

         var2 = var1.getClass();
      }

      Object[] var3 = (Object[])copyArrayGrow1(var0, var2);
      var3[var3.length - 1] = var1;
      return (T[])var3;
   }

   private static Object copyArrayGrow1(Object var0, Class<?> var1) {
      if (var0 != null) {
         int var2 = Array.getLength(var0);
         Object var3 = Array.newInstance(var0.getClass().getComponentType(), var2 + 1);
         System.arraycopy(var0, 0, var3, 0, var2);
         return var3;
      } else {
         return Array.newInstance(var1, 1);
      }
   }

   public static <T> T[] add(T[] var0, int var1, T var2) {
      Class var3 = null;
      if (var0 != null) {
         var3 = var0.getClass().getComponentType();
      } else {
         if (var2 == null) {
            throw new IllegalArgumentException("Array and element cannot both be null");
         }

         var3 = var2.getClass();
      }

      return (T[])((Object[])add(var0, var1, var2, var3));
   }

   private static Object add(Object var0, int var1, Object var2, Class<?> var3) {
      if (var0 == null) {
         if (var1 != 0) {
            throw new IndexOutOfBoundsException("Index: " + var1 + ", Length: 0");
         }

         Object var6 = Array.newInstance(var3, 1);
         Array.set(var6, 0, var2);
         return var6;
      } else {
         int var4 = Array.getLength(var0);
         if (var1 <= var4 && var1 >= 0) {
            Object var5 = Array.newInstance(var3, var4 + 1);
            System.arraycopy(var0, 0, var5, 0, var1);
            Array.set(var5, var1, var2);
            if (var1 < var4) {
               System.arraycopy(var0, var1, var5, var1 + 1, var4 - var1);
            }

            return var5;
         } else {
            throw new IndexOutOfBoundsException("Index: " + var1 + ", Length: " + var4);
         }
      }
   }

   public static <T> T[] remove(T[] var0, int var1) {
      return (T[])((Object[])remove(var0, var1));
   }

   public static int[] remove(int[] var0, int var1) {
      return (int[])remove(var0, var1);
   }

   private static Object remove(Object var0, int var1) {
      int var2 = getLength(var0);
      if (var1 >= 0 && var1 < var2) {
         Object var3 = Array.newInstance(var0.getClass().getComponentType(), var2 - 1);
         System.arraycopy(var0, 0, var3, 0, var1);
         if (var1 < var2 - 1) {
            System.arraycopy(var0, var1 + 1, var3, var1, var2 - var1 - 1);
         }

         return var3;
      } else {
         throw new IndexOutOfBoundsException("Index: " + var1 + ", Length: " + var2);
      }
   }
}
