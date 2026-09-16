package io.sentry;

import io.sentry.hints.EventDropReason;
import io.sentry.protocol.SentryException;
import io.sentry.util.HintUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DeduplicateMultithreadedEventProcessor implements EventProcessor {
   @NotNull
   private final Map<String, Long> processedEvents = Collections.synchronizedMap(new HashMap<>());
   @NotNull
   private final SentryOptions options;

   public DeduplicateMultithreadedEventProcessor(@NotNull SentryOptions var1) {
      this.options = var1;
   }

   @Nullable
   @Override
   public SentryEvent process(@NotNull SentryEvent var1, @NotNull Hint var2) {
      if (!HintUtils.hasType(var2, UncaughtExceptionHandlerIntegration.UncaughtExceptionHint.class)) {
         return var1;
      } else {
         SentryException var3 = var1.getUnhandledException();
         if (var3 == null) {
            return var1;
         } else {
            String var4 = var3.getType();
            if (var4 == null) {
               return var1;
            } else {
               Long var5 = var3.getThreadId();
               if (var5 == null) {
                  return var1;
               } else {
                  Long var6 = this.processedEvents.get(var4);
                  if (var6 != null && !var6.equals(var5)) {
                     this.options.getLogger().log(SentryLevel.INFO, "Event %s has been dropped due to multi-threaded deduplication", var1.getEventId());
                     HintUtils.setEventDropReason(var2, EventDropReason.MULTITHREADED_DEDUPLICATION);
                     return null;
                  } else {
                     this.processedEvents.put(var4, var5);
                     return var1;
                  }
               }
            }
         }
      }
   }
}
