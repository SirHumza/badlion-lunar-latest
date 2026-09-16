package org.jgrapht.util;

public class ArrayUtil {
   private ArrayUtil() {
   }

   public static final <V> void reverse(V[] var0, int var1, int var2) {
      int var3 = var1;

      for (int var4 = var2; var3 < var4; var4--) {
         swap(var0, var3, var4);
         var3++;
      }
   }

   public static final void reverse(int[] var0, int var1, int var2) {
      int var3 = var1;

      for (int var4 = var2; var3 < var4; var4--) {
         int var5 = var0[var4];
         var0[var4] = var0[var3];
         var0[var3] = var5;
         var3++;
      }
   }

   public static final <V> void swap(V[] var0, int var1, int var2) {
      Object var3 = var0[var2];
      var0[var2] = var0[var1];
      var0[var1] = var3;
   }
}
