package org.spongepowered.include.com.google.common.collect;

import java.lang.reflect.Array;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public final class ObjectArrays {
   static final Object[] EMPTY_ARRAY = new Object[0];

   public static <T> T[] newArray(Class<T> var0, int var1) {
      return (T[])((Object[])Array.newInstance(var0, var1));
   }

   public static <T> T[] newArray(T[] var0, int var1) {
      return (T[])Platform.newArray(var0, var1);
   }

   public static <T> T[] concat(T[] var0, T[] var1, Class<T> var2) {
      Object[] var3 = newArray(var2, var0.length + var1.length);
      System.arraycopy(var0, 0, var3, 0, var0.length);
      System.arraycopy(var1, 0, var3, var0.length, var1.length);
      return (T[])var3;
   }

   public static <T> T[] concat(@Nullable T var0, T[] var1) {
      Object[] var2 = newArray(var1, var1.length + 1);
      var2[0] = var0;
      System.arraycopy(var1, 0, var2, 1, var1.length);
      return (T[])var2;
   }

   public static <T> T[] concat(T[] var0, @Nullable T var1) {
      Object[] var2 = Arrays.copyOf(var0, var0.length + 1);
      var2[var0.length] = var1;
      return (T[])var2;
   }

   @CanIgnoreReturnValue
   static Object[] checkElementsNotNull(Object... var0) {
      return checkElementsNotNull(var0, var0.length);
   }

   @CanIgnoreReturnValue
   static Object[] checkElementsNotNull(Object[] var0, int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         checkElementNotNull(var0[var2], var2);
      }

      return var0;
   }

   @CanIgnoreReturnValue
   static Object checkElementNotNull(Object var0, int var1) {
      if (var0 == null) {
         throw new NullPointerException("at index " + var1);
      } else {
         return var0;
      }
   }
}
