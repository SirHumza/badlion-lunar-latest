package io.sentry;

import io.sentry.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DuplicateEventDetectionEventProcessor implements EventProcessor {
   @NotNull
   private final Map<Throwable, Object> capturedObjects = Collections.synchronizedMap(new WeakHashMap<>());
   @NotNull
   private final SentryOptions options;

   public DuplicateEventDetectionEventProcessor(@NotNull SentryOptions var1) {
      this.options = Objects.requireNonNull(var1, "options are required");
   }

   @Nullable
   @Override
   public SentryEvent process(@NotNull SentryEvent var1, @NotNull Hint var2) {
      if (this.options.isEnableDeduplication()) {
         Throwable var3 = var1.getThrowable();
         if (var3 != null) {
            if (this.capturedObjects.containsKey(var3) || containsAnyKey(this.capturedObjects, allCauses(var3))) {
               this.options.getLogger().log(SentryLevel.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", var1.getEventId());
               return null;
            }

            this.capturedObjects.put(var3, null);
         }
      } else {
         this.options.getLogger().log(SentryLevel.DEBUG, "Event deduplication is disabled.");
      }

      return var1;
   }

   private static <T> boolean containsAnyKey(@NotNull Map<T, Object> var0, @NotNull List<T> var1) {
      for (Object var3 : var1) {
         if (var0.containsKey(var3)) {
            return true;
         }
      }

      return false;
   }

   @NotNull
   private static List<Throwable> allCauses(@NotNull Throwable var0) {
      ArrayList var1 = new ArrayList();

      for (Throwable var2 = var0; var2.getCause() != null; var2 = var2.getCause()) {
         var1.add(var2.getCause());
      }

      return var1;
   }
}
