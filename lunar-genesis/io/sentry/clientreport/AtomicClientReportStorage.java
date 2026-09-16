package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.util.LazyEvaluator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
final class AtomicClientReportStorage implements IClientReportStorage {
   @NotNull
   private final LazyEvaluator<Map<ClientReportKey, AtomicLong>> lostEventCounts = new LazyEvaluator<>(() -> {
      ConcurrentHashMap var0 = new ConcurrentHashMap();

      for (DiscardReason var4 : DiscardReason.values()) {
         for (DataCategory var8 : DataCategory.values()) {
            var0.put(new ClientReportKey(var4.getReason(), var8.getCategory()), new AtomicLong(0L));
         }
      }

      return Collections.unmodifiableMap(var0);
   });

   public AtomicClientReportStorage() {
   }

   @Override
   public void addCount(ClientReportKey var1, Long var2) {
      AtomicLong var3 = this.lostEventCounts.getValue().get(var1);
      if (var3 != null) {
         var3.addAndGet(var2);
      }
   }

   @Override
   public List<DiscardedEvent> resetCountsAndGet() {
      ArrayList var1 = new ArrayList();

      for (Entry var4 : this.lostEventCounts.getValue().entrySet()) {
         Long var5 = ((AtomicLong)var4.getValue()).getAndSet(0L);
         if (var5 > 0L) {
            var1.add(new DiscardedEvent(((ClientReportKey)var4.getKey()).getReason(), ((ClientReportKey)var4.getKey()).getCategory(), var5));
         }
      }

      return var1;
   }
}
