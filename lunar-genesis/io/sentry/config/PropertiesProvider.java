package io.sentry.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface PropertiesProvider {
   @Nullable
   String getProperty(@NotNull String var1);

   @NotNull
   Map<String, String> getMap(@NotNull String var1);

   @NotNull
   default List<String> getList(@NotNull String var1) {
      String var2 = this.getProperty(var1);
      return var2 != null ? Arrays.asList(var2.split(",")) : Collections.emptyList();
   }

   @NotNull
   default String getProperty(@NotNull String var1, @NotNull String var2) {
      String var3 = this.getProperty(var1);
      return var3 != null ? var3 : var2;
   }

   @Nullable
   default Boolean getBooleanProperty(@NotNull String var1) {
      String var2 = this.getProperty(var1);
      return var2 != null ? Boolean.valueOf(var2) : null;
   }

   @Nullable
   default Double getDoubleProperty(@NotNull String var1) {
      String var2 = this.getProperty(var1);
      Double var3 = null;
      if (var2 != null) {
         try {
            var3 = Double.valueOf(var2);
         } catch (NumberFormatException var5) {
         }
      }

      return var3;
   }

   @Nullable
   default Long getLongProperty(@NotNull String var1) {
      String var2 = this.getProperty(var1);
      Long var3 = null;
      if (var2 != null) {
         try {
            var3 = Long.valueOf(var2);
         } catch (NumberFormatException var5) {
         }
      }

      return var3;
   }
}
