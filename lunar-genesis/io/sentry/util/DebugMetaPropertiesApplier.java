package io.sentry.util;

import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DebugMetaPropertiesApplier {
   @NotNull
   public static String DEBUG_META_PROPERTIES_FILENAME = "sentry-debug-meta.properties";

   public static void applyToOptions(@NotNull SentryOptions var0, @Nullable List<Properties> var1) {
      if (var1 != null) {
         applyBundleIds(var0, var1);
         applyProguardUuid(var0, var1);
      }
   }

   private static void applyBundleIds(@NotNull SentryOptions var0, @NotNull List<Properties> var1) {
      if (var0.getBundleIds().isEmpty()) {
         for (Properties var3 : var1) {
            String var4 = var3.getProperty("io.sentry.bundle-ids");
            var0.getLogger().log(SentryLevel.DEBUG, "Bundle IDs found: %s", var4);
            if (var4 != null) {
               String[] var5 = var4.split(",", -1);

               for (String var9 : var5) {
                  var0.addBundleId(var9);
               }
            }
         }
      }
   }

   private static void applyProguardUuid(@NotNull SentryOptions var0, @NotNull List<Properties> var1) {
      if (var0.getProguardUuid() == null) {
         for (Properties var3 : var1) {
            String var4 = getProguardUuid(var3);
            if (var4 != null) {
               var0.getLogger().log(SentryLevel.DEBUG, "Proguard UUID found: %s", var4);
               var0.setProguardUuid(var4);
               break;
            }
         }
      }
   }

   @Nullable
   public static String getProguardUuid(@NotNull Properties var0) {
      return var0.getProperty("io.sentry.ProguardUuids");
   }
}
