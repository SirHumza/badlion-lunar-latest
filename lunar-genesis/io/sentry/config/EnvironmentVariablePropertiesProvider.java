package io.sentry.config;

import io.sentry.util.StringUtils;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class EnvironmentVariablePropertiesProvider implements PropertiesProvider {
   private static final String PREFIX = "SENTRY";

   @Nullable
   @Override
   public String getProperty(@NotNull String var1) {
      return StringUtils.removeSurrounding(System.getenv(this.propertyToEnvironmentVariableName(var1)), "\"");
   }

   @NotNull
   @Override
   public Map<String, String> getMap(@NotNull String var1) {
      String var2 = this.propertyToEnvironmentVariableName(var1) + "_";
      ConcurrentHashMap var3 = new ConcurrentHashMap();

      for (Entry var5 : System.getenv().entrySet()) {
         String var6 = (String)var5.getKey();
         if (var6.startsWith(var2)) {
            String var7 = StringUtils.removeSurrounding((String)var5.getValue(), "\"");
            if (var7 != null) {
               var3.put(var6.substring(var2.length()).toLowerCase(Locale.ROOT), var7);
            }
         }
      }

      return var3;
   }

   @NotNull
   private String propertyToEnvironmentVariableName(@NotNull String var1) {
      return "SENTRY_" + var1.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
   }
}
