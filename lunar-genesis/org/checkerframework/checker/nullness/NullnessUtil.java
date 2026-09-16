package org.checkerframework.checker.nullness;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.NonNull;

public final class NullnessUtil {
   private NullnessUtil() {
      throw new AssertionError("shouldn't be instantiated");
   }

   @EnsuresNonNull("#1")
   public static <T> T castNonNull(T var0) {
      assert var0 != null : "Misuse of castNonNull: called with a null argument";
      return (T)var0;
   }

   @EnsuresNonNull("#1")
   public static <T> T[] castNonNullDeep(T[] var0) {
      return (T[])castNonNullArray(var0);
   }

   @EnsuresNonNull("#1")
   public static <T> T[][] castNonNullDeep(T[][] var0) {
      return (T[][])castNonNullArray(var0);
   }

   @EnsuresNonNull("#1")
   public static <T> T[][][] castNonNullDeep(T[][][] var0) {
      return (T[][][])castNonNullArray(var0);
   }

   @EnsuresNonNull("#1")
   public static <T> T[][][][] castNonNullDeep(T[][][][] var0) {
      return (T[][][][])castNonNullArray(var0);
   }

   @EnsuresNonNull("#1")
   public static <T> T[][][][][] castNonNullDeep(T[][][][][] var0) {
      return (T[][][][][])castNonNullArray(var0);
   }

   private static <T> T[] castNonNullArray(T[] var0) {
      assert var0 != null : "Misuse of castNonNullArray: called with a null array argument";

      for (int var1 = 0; var1 < var0.length; var1++) {
         assert var0[var1] != null : "Misuse of castNonNull: called with a null array element";
         checkIfArray(var0[var1]);
      }

      return (T[])var0;
   }

   private static void checkIfArray(@NonNull Object var0) {
      assert var0 != null : "Misuse of checkIfArray: called with a null argument";
      Class var1 = var0.getClass().getComponentType();
      if (var1 != null && !var1.isPrimitive()) {
         castNonNullArray((Object[])var0);
      }
   }
}
