package io.sentry.util;

import io.sentry.SentryIntegrationPackageStorage;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class IntegrationUtils {
   public static void addIntegrationToSdkVersion(@NotNull String var0) {
      SentryIntegrationPackageStorage.getInstance().addIntegration(var0);
   }
}
