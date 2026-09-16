package io.sentry.config;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class CompositePropertiesProvider implements PropertiesProvider {
   @NotNull
   private final List<PropertiesProvider> providers;

   public CompositePropertiesProvider(@NotNull List<PropertiesProvider> var1) {
      this.providers = var1;
   }

   @Nullable
   @Override
   public String getProperty(@NotNull String var1) {
      for (PropertiesProvider var3 : this.providers) {
         String var4 = var3.getProperty(var1);
         if (var4 != null) {
            return var4;
         }
      }

      return null;
   }

   @NotNull
   @Override
   public Map<String, String> getMap(@NotNull String var1) {
      ConcurrentHashMap var2 = new ConcurrentHashMap();

      for (PropertiesProvider var4 : this.providers) {
         var2.putAll(var4.getMap(var1));
      }

      return var2;
   }
}
