package io.sentry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SentrySpanStorage {
   @Nullable
   private static volatile SentrySpanStorage INSTANCE;
   @NotNull
   private final Map<String, ISpan> spans = new ConcurrentHashMap<>();

   @NotNull
   public static SentrySpanStorage getInstance() {
      if (INSTANCE == null) {
         synchronized (SentrySpanStorage.class) {
            if (INSTANCE == null) {
               INSTANCE = new SentrySpanStorage();
            }
         }
      }

      return INSTANCE;
   }

   private SentrySpanStorage() {
   }

   public void store(@NotNull String var1, @NotNull ISpan var2) {
      this.spans.put(var1, var2);
   }

   @Nullable
   public ISpan get(@Nullable String var1) {
      return this.spans.get(var1);
   }

   @Nullable
   public ISpan removeAndGet(@Nullable String var1) {
      return this.spans.remove(var1);
   }
}
