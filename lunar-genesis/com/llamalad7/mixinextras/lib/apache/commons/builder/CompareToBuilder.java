package com.llamalad7.mixinextras.lib.apache.commons.builder;

import java.util.Comparator;

public class CompareToBuilder {
   private int comparison = 0;

   public CompareToBuilder append(Object var1, Object var2) {
      return this.append(var1, var2, null);
   }

   public CompareToBuilder append(Object var1, Object var2, Comparator<?> var3) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (var1 == null) {
         this.comparison = -1;
         return this;
      }

      if (var2 == null) {
         this.comparison = 1;
         return this;
      }

      if (var1.getClass().isArray()) {
         if (var1 instanceof long[]) {
            this.append((long[])var1, (long[])var2);
         } else if (var1 instanceof int[]) {
            this.append((int[])var1, (int[])var2);
         } else if (var1 instanceof short[]) {
            this.append((short[])var1, (short[])var2);
         } else if (var1 instanceof char[]) {
            this.append((char[])var1, (char[])var2);
         } else if (var1 instanceof byte[]) {
            this.append((byte[])var1, (byte[])var2);
         } else if (var1 instanceof double[]) {
            this.append((double[])var1, (double[])var2);
         } else if (var1 instanceof float[]) {
            this.append((float[])var1, (float[])var2);
         } else if (var1 instanceof boolean[]) {
            this.append((boolean[])var1, (boolean[])var2);
         } else {
            this.append((Object[])var1, (Object[])var2, var3);
         }
      } else if (var3 == null) {
         Comparable var4 = (Comparable)var1;
         this.comparison = var4.compareTo(var2);
      } else {
         Comparator var5 = var3;
         this.comparison = var5.compare(var1, var2);
      }

      return this;
   }

   public CompareToBuilder append(long var1, long var3) {
      if (this.comparison != 0) {
         return this;
      }

      this.comparison = var1 < var3 ? -1 : (var1 > var3 ? 1 : 0);
      return this;
   }

   public CompareToBuilder append(int var1, int var2) {
      if (this.comparison != 0) {
         return this;
      }

      this.comparison = var1 < var2 ? -1 : (var1 > var2 ? 1 : 0);
      return this;
   }

   public CompareToBuilder append(short var1, short var2) {
      if (this.comparison != 0) {
         return this;
      }

      this.comparison = var1 < var2 ? -1 : (var1 > var2 ? 1 : 0);
      return this;
   }

   public CompareToBuilder append(char var1, char var2) {
      if (this.comparison != 0) {
         return this;
      }

      this.comparison = var1 < var2 ? -1 : (var1 > var2 ? 1 : 0);
      return this;
   }

   public CompareToBuilder append(byte var1, byte var2) {
      if (this.comparison != 0) {
         return this;
      }

      this.comparison = var1 < var2 ? -1 : (var1 > var2 ? 1 : 0);
      return this;
   }

   public CompareToBuilder append(double var1, double var3) {
      if (this.comparison != 0) {
         return this;
      }

      this.comparison = Double.compare(var1, var3);
      return this;
   }

   public CompareToBuilder append(float var1, float var2) {
      if (this.comparison != 0) {
         return this;
      }

      this.comparison = Float.compare(var1, var2);
      return this;
   }

   public CompareToBuilder append(boolean var1, boolean var2) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (!var1) {
         this.comparison = -1;
      } else {
         this.comparison = 1;
      }

      return this;
   }

   public CompareToBuilder append(Object[] var1, Object[] var2, Comparator<?> var3) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (var1 == null) {
         this.comparison = -1;
         return this;
      }

      if (var2 == null) {
         this.comparison = 1;
         return this;
      }

      if (var1.length != var2.length) {
         this.comparison = var1.length < var2.length ? -1 : 1;
         return this;
      }

      for (int var4 = 0; var4 < var1.length && this.comparison == 0; var4++) {
         this.append(var1[var4], var2[var4], var3);
      }

      return this;
   }

   public CompareToBuilder append(long[] var1, long[] var2) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (var1 == null) {
         this.comparison = -1;
         return this;
      }

      if (var2 == null) {
         this.comparison = 1;
         return this;
      }

      if (var1.length != var2.length) {
         this.comparison = var1.length < var2.length ? -1 : 1;
         return this;
      }

      for (int var3 = 0; var3 < var1.length && this.comparison == 0; var3++) {
         this.append(var1[var3], var2[var3]);
      }

      return this;
   }

   public CompareToBuilder append(int[] var1, int[] var2) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (var1 == null) {
         this.comparison = -1;
         return this;
      }

      if (var2 == null) {
         this.comparison = 1;
         return this;
      }

      if (var1.length != var2.length) {
         this.comparison = var1.length < var2.length ? -1 : 1;
         return this;
      }

      for (int var3 = 0; var3 < var1.length && this.comparison == 0; var3++) {
         this.append(var1[var3], var2[var3]);
      }

      return this;
   }

   public CompareToBuilder append(short[] var1, short[] var2) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (var1 == null) {
         this.comparison = -1;
         return this;
      }

      if (var2 == null) {
         this.comparison = 1;
         return this;
      }

      if (var1.length != var2.length) {
         this.comparison = var1.length < var2.length ? -1 : 1;
         return this;
      }

      for (int var3 = 0; var3 < var1.length && this.comparison == 0; var3++) {
         this.append(var1[var3], var2[var3]);
      }

      return this;
   }

   public CompareToBuilder append(char[] var1, char[] var2) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (var1 == null) {
         this.comparison = -1;
         return this;
      }

      if (var2 == null) {
         this.comparison = 1;
         return this;
      }

      if (var1.length != var2.length) {
         this.comparison = var1.length < var2.length ? -1 : 1;
         return this;
      }

      for (int var3 = 0; var3 < var1.length && this.comparison == 0; var3++) {
         this.append(var1[var3], var2[var3]);
      }

      return this;
   }

   public CompareToBuilder append(byte[] var1, byte[] var2) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (var1 == null) {
         this.comparison = -1;
         return this;
      }

      if (var2 == null) {
         this.comparison = 1;
         return this;
      }

      if (var1.length != var2.length) {
         this.comparison = var1.length < var2.length ? -1 : 1;
         return this;
      }

      for (int var3 = 0; var3 < var1.length && this.comparison == 0; var3++) {
         this.append(var1[var3], var2[var3]);
      }

      return this;
   }

   public CompareToBuilder append(double[] var1, double[] var2) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (var1 == null) {
         this.comparison = -1;
         return this;
      }

      if (var2 == null) {
         this.comparison = 1;
         return this;
      }

      if (var1.length != var2.length) {
         this.comparison = var1.length < var2.length ? -1 : 1;
         return this;
      }

      for (int var3 = 0; var3 < var1.length && this.comparison == 0; var3++) {
         this.append(var1[var3], var2[var3]);
      }

      return this;
   }

   public CompareToBuilder append(float[] var1, float[] var2) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (var1 == null) {
         this.comparison = -1;
         return this;
      }

      if (var2 == null) {
         this.comparison = 1;
         return this;
      }

      if (var1.length != var2.length) {
         this.comparison = var1.length < var2.length ? -1 : 1;
         return this;
      }

      for (int var3 = 0; var3 < var1.length && this.comparison == 0; var3++) {
         this.append(var1[var3], var2[var3]);
      }

      return this;
   }

   public CompareToBuilder append(boolean[] var1, boolean[] var2) {
      if (this.comparison != 0) {
         return this;
      }

      if (var1 == var2) {
         return this;
      }

      if (var1 == null) {
         this.comparison = -1;
         return this;
      }

      if (var2 == null) {
         this.comparison = 1;
         return this;
      }

      if (var1.length != var2.length) {
         this.comparison = var1.length < var2.length ? -1 : 1;
         return this;
      }

      for (int var3 = 0; var3 < var1.length && this.comparison == 0; var3++) {
         this.append(var1[var3], var2[var3]);
      }

      return this;
   }

   public int toComparison() {
      return this.comparison;
   }
}
