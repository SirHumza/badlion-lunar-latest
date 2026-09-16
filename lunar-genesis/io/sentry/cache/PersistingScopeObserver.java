package io.sentry.cache;

import io.sentry.Breadcrumb;
import io.sentry.IScope;
import io.sentry.JsonDeserializer;
import io.sentry.ScopeObserverAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SpanContext;
import io.sentry.protocol.Contexts;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.User;
import java.util.Collection;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PersistingScopeObserver extends ScopeObserverAdapter {
   public static final String SCOPE_CACHE = ".scope-cache";
   public static final String USER_FILENAME = "user.json";
   public static final String BREADCRUMBS_FILENAME = "breadcrumbs.json";
   public static final String TAGS_FILENAME = "tags.json";
   public static final String EXTRAS_FILENAME = "extras.json";
   public static final String CONTEXTS_FILENAME = "contexts.json";
   public static final String REQUEST_FILENAME = "request.json";
   public static final String LEVEL_FILENAME = "level.json";
   public static final String FINGERPRINT_FILENAME = "fingerprint.json";
   public static final String TRANSACTION_FILENAME = "transaction.json";
   public static final String TRACE_FILENAME = "trace.json";
   public static final String REPLAY_FILENAME = "replay.json";
   @NotNull
   private final SentryOptions options;

   public PersistingScopeObserver(@NotNull SentryOptions var1) {
      this.options = var1;
   }

   @Override
   public void setUser(@Nullable User var1) {
      this.serializeToDisk(() -> {
         if (var1 == null) {
            this.delete("user.json");
         } else {
            this.store(var1, "user.json");
         }
      });
   }

   @Override
   public void setBreadcrumbs(@NotNull Collection<Breadcrumb> var1) {
      this.serializeToDisk(() -> this.store(var1, "breadcrumbs.json"));
   }

   @Override
   public void setTags(@NotNull Map<String, String> var1) {
      this.serializeToDisk(() -> this.store(var1, "tags.json"));
   }

   @Override
   public void setExtras(@NotNull Map<String, Object> var1) {
      this.serializeToDisk(() -> this.store(var1, "extras.json"));
   }

   @Override
   public void setRequest(@Nullable Request var1) {
      this.serializeToDisk(() -> {
         if (var1 == null) {
            this.delete("request.json");
         } else {
            this.store(var1, "request.json");
         }
      });
   }

   @Override
   public void setFingerprint(@NotNull Collection<String> var1) {
      this.serializeToDisk(() -> this.store(var1, "fingerprint.json"));
   }

   @Override
   public void setLevel(@Nullable SentryLevel var1) {
      this.serializeToDisk(() -> {
         if (var1 == null) {
            this.delete("level.json");
         } else {
            this.store(var1, "level.json");
         }
      });
   }

   @Override
   public void setTransaction(@Nullable String var1) {
      this.serializeToDisk(() -> {
         if (var1 == null) {
            this.delete("transaction.json");
         } else {
            this.store(var1, "transaction.json");
         }
      });
   }

   @Override
   public void setTrace(@Nullable SpanContext var1, @NotNull IScope var2) {
      this.serializeToDisk(() -> {
         if (var1 == null) {
            this.store(var2.getPropagationContext().toSpanContext(), "trace.json");
         } else {
            this.store(var1, "trace.json");
         }
      });
   }

   @Override
   public void setContexts(@NotNull Contexts var1) {
      this.serializeToDisk(() -> this.store(var1, "contexts.json"));
   }

   @Override
   public void setReplayId(@NotNull SentryId var1) {
      this.serializeToDisk(() -> this.store(var1, "replay.json"));
   }

   private void serializeToDisk(@NotNull Runnable var1) {
      if (Thread.currentThread().getName().contains("SentryExecutor")) {
         var1.run();
      } else {
         try {
            this.options.getExecutorService().submit(() -> {
               try {
                  var1.run();
               } catch (Throwable var3x) {
                  this.options.getLogger().log(SentryLevel.ERROR, "Serialization task failed", var3x);
               }
            });
         } catch (Throwable var3) {
            this.options.getLogger().log(SentryLevel.ERROR, "Serialization task could not be scheduled", var3);
         }
      }
   }

   private <T> void store(@NotNull T var1, @NotNull String var2) {
      store(this.options, var1, var2);
   }

   private void delete(@NotNull String var1) {
      CacheUtils.delete(this.options, ".scope-cache", var1);
   }

   public static <T> void store(@NotNull SentryOptions var0, @NotNull T var1, @NotNull String var2) {
      CacheUtils.store(var0, var1, ".scope-cache", var2);
   }

   @Nullable
   public static <T> T read(@NotNull SentryOptions var0, @NotNull String var1, @NotNull Class<T> var2) {
      return read(var0, var1, var2, null);
   }

   @Nullable
   public static <T, R> T read(@NotNull SentryOptions var0, @NotNull String var1, @NotNull Class<T> var2, @Nullable JsonDeserializer<R> var3) {
      return CacheUtils.read(var0, ".scope-cache", var1, var2, var3);
   }
}
