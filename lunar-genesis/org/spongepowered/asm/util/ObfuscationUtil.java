package org.spongepowered.asm.util;

import java.util.Optional;

public abstract class ObfuscationUtil {
   private ObfuscationUtil() {
   }

   public static String mapDescriptor(String var0, ObfuscationUtil.IClassRemapper var1) {
      return remapDescriptor(var0, var1, false);
   }

   public static String unmapDescriptor(String var0, ObfuscationUtil.IClassRemapper var1) {
      return remapDescriptor(var0, var1, true);
   }

   private static String remapDescriptor(String var0, ObfuscationUtil.IClassRemapper var1, boolean var2) {
      StringBuilder var3 = new StringBuilder();
      StringBuilder var4 = null;
      boolean var5 = false;

      for (int var6 = 0; var6 < var0.length(); var6++) {
         char var7 = var0.charAt(var6);
         if (var4 != null) {
            if (var7 == ';') {
               String var8 = var4.toString();
               Optional var9 = remap(var8, var1, var2);
               if (var9.isPresent()) {
                  var5 = true;
               }

               var3.append('L').append(var9.orElse(var8)).append(';');
               var4 = null;
            } else {
               var4.append(var7);
            }
         } else if (var7 == 'L') {
            var4 = new StringBuilder();
         } else {
            var3.append(var7);
         }
      }

      if (var4 != null) {
         throw new IllegalArgumentException("Invalid descriptor '" + var0 + "', missing ';'");
      } else {
         return var5 ? var3.toString() : null;
      }
   }

   private static Optional<String> remap(String var0, ObfuscationUtil.IClassRemapper var1, boolean var2) {
      String var3 = var2 ? var1.unmap(var0) : var1.map(var0);
      return Optional.ofNullable(var3);
   }

   public interface IClassRemapper {
      String map(String var1);

      String unmap(String var1);
   }
}
