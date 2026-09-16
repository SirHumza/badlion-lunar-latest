package io.sentry;

import io.sentry.protocol.SentryPackage;
import io.sentry.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@ApiStatus.Internal
public final class SentryIntegrationPackageStorage {
   @Nullable
   private static volatile SentryIntegrationPackageStorage INSTANCE;
   private final Set<String> integrations = new CopyOnWriteArraySet<>();
   private final Set<SentryPackage> packages = new CopyOnWriteArraySet<>();

   @NotNull
   public static SentryIntegrationPackageStorage getInstance() {
      if (INSTANCE == null) {
         synchronized (SentryIntegrationPackageStorage.class) {
            if (INSTANCE == null) {
               INSTANCE = new SentryIntegrationPackageStorage();
            }
         }
      }

      return INSTANCE;
   }

   private SentryIntegrationPackageStorage() {
   }

   public void addIntegration(@NotNull String var1) {
      Objects.requireNonNull(var1, "integration is required.");
      this.integrations.add(var1);
   }

   @NotNull
   public Set<String> getIntegrations() {
      return this.integrations;
   }

   public void addPackage(@NotNull String var1, @NotNull String var2) {
      Objects.requireNonNull(var1, "name is required.");
      Objects.requireNonNull(var2, "version is required.");
      SentryPackage var3 = new SentryPackage(var1, var2);
      this.packages.add(var3);
   }

   @NotNull
   public Set<SentryPackage> getPackages() {
      return this.packages;
   }

   @TestOnly
   public void clearStorage() {
      this.integrations.clear();
      this.packages.clear();
   }
}
