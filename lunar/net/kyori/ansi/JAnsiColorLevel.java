package net.kyori.ansi;

import org.fusesource.jansi.AnsiColors;
import org.fusesource.jansi.AnsiConsole;

final class JAnsiColorLevel {
   private static final Throwable UNAVAILABILITY_CAUSE;

   private JAnsiColorLevel() {
   }

   static boolean isAvailable() {
      return UNAVAILABILITY_CAUSE == null;
   }

   static ColorLevel computeFromJAnsi() {
      AnsiColors var0 = AnsiConsole.out().getColors();
      if (var0 == null) {
         return ColorLevel.NONE;
      }

      switch (var0) {
         case Colors16:
            return ColorLevel.INDEXED_16;
         case Colors256:
            return ColorLevel.INDEXED_256;
         case TrueColor:
            return ColorLevel.TRUE_COLOR;
         default:
            return ColorLevel.NONE;
      }
   }

   static {
      ClassNotFoundException var0 = null;

      try {
         Class.forName("org.fusesource.jansi.AnsiConsole");
         Class.forName("org.fusesource.jansi.AnsiColors");
      } catch (ClassNotFoundException var2) {
         var0 = var2;
      }

      UNAVAILABILITY_CAUSE = var0;
   }
}
