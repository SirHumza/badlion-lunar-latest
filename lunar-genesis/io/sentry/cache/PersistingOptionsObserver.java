package io.sentry.cache;

import io.sentry.IOptionsObserver;
import io.sentry.JsonDeserializer;
import io.sentry.SentryOptions;
import io.sentry.protocol.SdkVersion;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PersistingOptionsObserver implements IOptionsObserver {
   public static final String OPTIONS_CACHE = ".options-cache";
   public static final String RELEASE_FILENAME = "release.json";
   public static final String PROGUARD_UUID_FILENAME = "proguard-uuid.json";
   public static final String SDK_VERSION_FILENAME = "sdk-version.json";
   public static final String ENVIRONMENT_FILENAME = "environment.json";
   public static final String DIST_FILENAME = "dist.json";
   public static final String TAGS_FILENAME = "tags.json";
   public static final String REPLAY_ERROR_SAMPLE_RATE_FILENAME = "replay-error-sample-rate.json";
   @NotNull
   private final SentryOptions options;

   public PersistingOptionsObserver(@NotNull SentryOptions var1) {
      this.options = var1;
   }

   @Override
   public void setRelease(@Nullable String var1) {
      if (var1 == null) {
         this.delete("release.json");
      } else {
         this.store(var1, "release.json");
      }
   }

   @Override
   public void setProguardUuid(@Nullable String var1) {
      if (var1 == null) {
         this.delete("proguard-uuid.json");
      } else {
         this.store(var1, "proguard-uuid.json");
      }
   }

   @Override
   public void setSdkVersion(@Nullable SdkVersion var1) {
      if (var1 == null) {
         this.delete("sdk-version.json");
      } else {
         this.store(var1, "sdk-version.json");
      }
   }

   @Override
   public void setDist(@Nullable String var1) {
      if (var1 == null) {
         this.delete("dist.json");
      } else {
         this.store(var1, "dist.json");
      }
   }

   @Override
   public void setEnvironment(@Nullable String var1) {
      if (var1 == null) {
         this.delete("environment.json");
      } else {
         this.store(var1, "environment.json");
      }
   }

   @Override
   public void setTags(@NotNull Map<String, String> var1) {
      this.store(var1, "tags.json");
   }

   @Override
   public void setReplayErrorSampleRate(@Nullable Double var1) {
      if (var1 == null) {
         this.delete("replay-error-sample-rate.json");
      } else {
         this.store(var1.toString(), "replay-error-sample-rate.json");
      }
   }

   private <T> void store(@NotNull T var1, @NotNull String var2) {
      CacheUtils.store(this.options, var1, ".options-cache", var2);
   }

   private void delete(@NotNull String var1) {
      CacheUtils.delete(this.options, ".options-cache", var1);
   }

   @Nullable
   public static <T> T read(@NotNull SentryOptions var0, @NotNull String var1, @NotNull Class<T> var2) {
      return read(var0, var1, var2, null);
   }

   @Nullable
   public static <T, R> T read(@NotNull SentryOptions var0, @NotNull String var1, @NotNull Class<T> var2, @Nullable JsonDeserializer<R> var3) {
      return CacheUtils.read(var0, ".options-cache", var1, var2, var3);
   }
}
