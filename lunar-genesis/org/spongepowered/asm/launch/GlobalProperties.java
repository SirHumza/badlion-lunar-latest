package org.spongepowered.asm.launch;

import java.util.HashMap;
import java.util.Map;
import org.spongepowered.asm.service.IGlobalPropertyService;
import org.spongepowered.asm.service.IPropertyKey;
import org.spongepowered.asm.service.MixinService;

public final class GlobalProperties {
   private static IGlobalPropertyService service;

   private GlobalProperties() {
   }

   private static IGlobalPropertyService getService() {
      if (service == null) {
         service = MixinService.getGlobalPropertyService();
      }

      return service;
   }

   public static <T> T get(GlobalProperties.Keys var0) {
      IGlobalPropertyService var1 = getService();
      return var1.getProperty(var0.resolve(var1));
   }

   public static void put(GlobalProperties.Keys var0, Object var1) {
      IGlobalPropertyService var2 = getService();
      var2.setProperty(var0.resolve(var2), var1);
   }

   public static <T> T get(GlobalProperties.Keys var0, T var1) {
      IGlobalPropertyService var2 = getService();
      return var2.getProperty(var0.resolve(var2), (T)var1);
   }

   public static String getString(GlobalProperties.Keys var0, String var1) {
      IGlobalPropertyService var2 = getService();
      return var2.getPropertyString(var0.resolve(var2), var1);
   }

   public static final class Keys {
      public static final GlobalProperties.Keys INIT = of("mixin.initialised");
      public static final GlobalProperties.Keys AGENTS = of("mixin.agents");
      public static final GlobalProperties.Keys CONFIGS = of("mixin.configs");
      public static final GlobalProperties.Keys PLATFORM_MANAGER = of("mixin.platform");
      public static final GlobalProperties.Keys FML_LOAD_CORE_MOD = of("mixin.launch.fml.loadcoremodmethod");
      public static final GlobalProperties.Keys FML_GET_REPARSEABLE_COREMODS = of("mixin.launch.fml.reparseablecoremodsmethod");
      public static final GlobalProperties.Keys FML_CORE_MOD_MANAGER = of("mixin.launch.fml.coremodmanagerclass");
      public static final GlobalProperties.Keys FML_GET_IGNORED_MODS = of("mixin.launch.fml.ignoredmodsmethod");
      private static Map<String, GlobalProperties.Keys> keys;
      private final String name;
      private IPropertyKey key;

      private Keys(String var1) {
         this.name = var1;
      }

      IPropertyKey resolve(IGlobalPropertyService var1) {
         if (this.key != null) {
            return this.key;
         } else {
            return var1 == null ? null : (this.key = var1.resolveKey(this.name));
         }
      }

      @Override
      public String toString() {
         return this.name;
      }

      public static GlobalProperties.Keys of(String var0) {
         if (keys == null) {
            keys = new HashMap<>();
         }

         GlobalProperties.Keys var1 = keys.get(var0);
         if (var1 == null) {
            var1 = new GlobalProperties.Keys(var0);
            keys.put(var0, var1);
         }

         return var1;
      }
   }
}
