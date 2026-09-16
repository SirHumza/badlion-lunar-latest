package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;

final class Util {
   private Util() {
   }

   static <T> List<T> add(List<T> var0, T var1) {
      List var2 = var0 == null ? new ArrayList(1) : var0;
      var2.add(var1);
      return var2;
   }

   static <T> List<T> asArrayList(int var0) {
      ArrayList var1 = new ArrayList(var0);

      for (int var2 = 0; var2 < var0; var2++) {
         var1.add(null);
      }

      return var1;
   }

   static <T> List<T> asArrayList(T[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      }

      ArrayList var1 = new ArrayList(var0.length);

      for (Object var5 : var0) {
         var1.add(var5);
      }

      return var1;
   }

   static List<Byte> asArrayList(byte[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      }

      ArrayList var1 = new ArrayList(var0.length);

      for (byte var5 : var0) {
         var1.add(var5);
      }

      return var1;
   }

   static List<Boolean> asArrayList(boolean[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      }

      ArrayList var1 = new ArrayList(var0.length);

      for (boolean var5 : var0) {
         var1.add(var5);
      }

      return var1;
   }

   static List<Short> asArrayList(short[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      }

      ArrayList var1 = new ArrayList(var0.length);

      for (short var5 : var0) {
         var1.add(var5);
      }

      return var1;
   }

   static List<Character> asArrayList(char[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      }

      ArrayList var1 = new ArrayList(var0.length);

      for (char var5 : var0) {
         var1.add(var5);
      }

      return var1;
   }

   static List<Integer> asArrayList(int[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      }

      ArrayList var1 = new ArrayList(var0.length);

      for (int var5 : var0) {
         var1.add(var5);
      }

      return var1;
   }

   static List<Float> asArrayList(float[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      }

      ArrayList var1 = new ArrayList(var0.length);

      for (float var5 : var0) {
         var1.add(var5);
      }

      return var1;
   }

   static List<Long> asArrayList(long[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      }

      ArrayList var1 = new ArrayList(var0.length);

      for (long var5 : var0) {
         var1.add(var5);
      }

      return var1;
   }

   static List<Double> asArrayList(double[] var0) {
      if (var0 == null) {
         return new ArrayList<>();
      }

      ArrayList var1 = new ArrayList(var0.length);

      for (double var5 : var0) {
         var1.add(var5);
      }

      return var1;
   }

   static <T> List<T> asArrayList(int var0, T[] var1) {
      ArrayList var2 = new ArrayList(var0);

      for (int var3 = 0; var3 < var0; var3++) {
         var2.add(var1[var3]);
      }

      return var2;
   }
}
