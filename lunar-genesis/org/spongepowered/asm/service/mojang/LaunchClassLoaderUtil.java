package org.spongepowered.asm.service.mojang;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import net.minecraft.launchwrapper.LaunchClassLoader;
import org.spongepowered.asm.service.IClassTracker;

final class LaunchClassLoaderUtil implements IClassTracker {
   private final LaunchClassLoader classLoader;
   private final Map<String, Class<?>> cachedClasses;
   private final Set<String> invalidClasses;
   private final Set<String> classLoaderExceptions;
   private final Set<String> transformerExceptions;

   LaunchClassLoaderUtil(LaunchClassLoader var1) {
      this.classLoader = var1;
      this.cachedClasses = getField(var1, "cachedClasses");
      this.invalidClasses = getField(var1, "invalidClasses");
      this.classLoaderExceptions = getField(var1, "classLoaderExceptions");
      this.transformerExceptions = getField(var1, "transformerExceptions");
   }

   @Override
   public boolean isClassLoaded(String var1) {
      return this.cachedClasses.containsKey(var1);
   }

   @Override
   public String getClassRestrictions(String var1) {
      String var2 = "";
      if (this.isClassClassLoaderExcluded(var1, null)) {
         var2 = "PACKAGE_CLASSLOADER_EXCLUSION";
      }

      if (this.isClassTransformerExcluded(var1, null)) {
         var2 = (var2.length() > 0 ? var2 + "," : "") + "PACKAGE_TRANSFORMER_EXCLUSION";
      }

      return var2;
   }

   boolean isClassExcluded(String var1, String var2) {
      return this.isClassClassLoaderExcluded(var1, var2) || this.isClassTransformerExcluded(var1, var2);
   }

   boolean isClassClassLoaderExcluded(String var1, String var2) {
      for (String var4 : this.getClassLoaderExceptions()) {
         if (var2 != null && var2.startsWith(var4) || var1.startsWith(var4)) {
            return true;
         }
      }

      return false;
   }

   boolean isClassTransformerExcluded(String var1, String var2) {
      for (String var4 : this.getTransformerExceptions()) {
         if (var2 != null && var2.startsWith(var4) || var1.startsWith(var4)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void registerInvalidClass(String var1) {
      if (this.invalidClasses != null) {
         this.invalidClasses.add(var1);
      }
   }

   Set<String> getClassLoaderExceptions() {
      return this.classLoaderExceptions != null ? this.classLoaderExceptions : Collections.emptySet();
   }

   Set<String> getTransformerExceptions() {
      return this.transformerExceptions != null ? this.transformerExceptions : Collections.emptySet();
   }

   private static <T> T getField(LaunchClassLoader var0, String var1) {
      try {
         Field var2 = LaunchClassLoader.class.getDeclaredField(var1);
         var2.setAccessible(true);
         return (T)var2.get(var0);
      } catch (Exception var3) {
         return null;
      }
   }
}
