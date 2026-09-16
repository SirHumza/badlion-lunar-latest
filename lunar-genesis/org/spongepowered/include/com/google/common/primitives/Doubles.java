package org.spongepowered.include.com.google.common.primitives;

import java.util.regex.Pattern;
import javax.annotation.CheckForNull;
import javax.annotation.Nullable;

public final class Doubles {
   static final Pattern FLOATING_POINT_PATTERN = fpPattern();

   private static Pattern fpPattern() {
      String var0 = "(?:\\d++(?:\\.\\d*+)?|\\.\\d++)";
      String var1 = var0 + "(?:[eE][+-]?\\d++)?[fFdD]?";
      String var2 = "(?:\\p{XDigit}++(?:\\.\\p{XDigit}*+)?|\\.\\p{XDigit}++)";
      String var3 = "0[xX]" + var2 + "[pP][+-]?\\d++[fFdD]?";
      String var4 = "[+-]?(?:NaN|Infinity|" + var1 + "|" + var3 + ")";
      return Pattern.compile(var4);
   }

   @Nullable
   @CheckForNull
   public static Double tryParse(String var0) {
      if (FLOATING_POINT_PATTERN.matcher(var0).matches()) {
         try {
            return Double.parseDouble(var0);
         } catch (NumberFormatException var2) {
         }
      }

      return null;
   }
}
