package org.spongepowered.tools.obfuscation.ext;

import java.util.HashSet;
import java.util.Set;

public final class SpecialPackages {
   private static final Set<String> suppressWarningsForPackages = new HashSet<>();

   private SpecialPackages() {
   }

   public static final void addExcludedPackage(String var0) {
      String var1 = var0.replace('.', '/');
      if (!var1.endsWith("/")) {
         var1 = var1 + "/";
      }

      suppressWarningsForPackages.add(var1);
   }

   public static boolean isExcludedPackage(String var0) {
      for (String var2 : suppressWarningsForPackages) {
         if (var0.startsWith(var2)) {
            return true;
         }
      }

      return false;
   }

   static {
      addExcludedPackage("java.");
      addExcludedPackage("javax.");
      addExcludedPackage("sun.");
      addExcludedPackage("com.sun.");
   }
}
