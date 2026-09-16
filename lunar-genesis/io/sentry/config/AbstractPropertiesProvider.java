package io.sentry.config;

import io.sentry.util.Objects;
import io.sentry.util.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class AbstractPropertiesProvider implements PropertiesProvider {
   @NotNull
   private final String prefix;
   @NotNull
   private final Properties properties;

   protected AbstractPropertiesProvider(@NotNull String var1, @NotNull Properties var2) {
      this.prefix = Objects.requireNonNull(var1, "prefix is required");
      this.properties = Objects.requireNonNull(var2, "properties are required");
   }

   protected AbstractPropertiesProvider(@NotNull Properties var1) {
      this("", var1);
   }

   @Nullable
   @Override
   public String getProperty(@NotNull String var1) {
      return StringUtils.removeSurrounding(this.properties.getProperty(this.prefix + var1), "\"");
   }

   @NotNull
   @Override
   public Map<String, String> getMap(@NotNull String var1) {
      String var2 = this.prefix + var1 + ".";
      HashMap var3 = new HashMap();

      for (Entry var5 : this.properties.entrySet()) {
         if (var5.getKey() instanceof String && var5.getValue() instanceof String) {
            String var6 = (String)var5.getKey();
            if (var6.startsWith(var2)) {
               String var7 = StringUtils.removeSurrounding((String)var5.getValue(), "\"");
               var3.put(var6.substring(var2.length()), var7);
            }
         }
      }

      return var3;
   }
}
