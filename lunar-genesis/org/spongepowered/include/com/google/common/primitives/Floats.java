package org.spongepowered.include.com.google.common.primitives;

import javax.annotation.CheckForNull;
import javax.annotation.Nullable;

public final class Floats {
   @Nullable
   @CheckForNull
   public static Float tryParse(String var0) {
      if (Doubles.FLOATING_POINT_PATTERN.matcher(var0).matches()) {
         try {
            return Float.parseFloat(var0);
         } catch (NumberFormatException var2) {
         }
      }

      return null;
   }
}
