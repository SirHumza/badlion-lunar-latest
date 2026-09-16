package org.spongepowered.include.com.google.common.base;

import java.util.Arrays;
import javax.annotation.Nullable;

public final class Objects extends ExtraObjectsMethodsForWeb {
   public static boolean equal(@Nullable Object var0, @Nullable Object var1) {
      return var0 == var1 || var0 != null && var0.equals(var1);
   }

   public static int hashCode(@Nullable Object... var0) {
      return Arrays.hashCode(var0);
   }
}
