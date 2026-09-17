package com.lunarclient.apollo.roundtrip.pagination;

import com.lunarclient.apollo.roundtrip.ApolloRoundtripManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class ApolloPaginationManager {
   private final Map<UUID, List<Object>> pagination = new ConcurrentHashMap<>();
   private final ApolloRoundtripManager roundtripManager;

   public ApolloPaginationManager(ApolloRoundtripManager var1) {
      this.roundtripManager = var1;
   }

   public <T> void handlePage(ApolloPaginatedResponse<T> var1) {
      UUID var2 = var1.getPacketId();
      List var3 = this.pagination.computeIfAbsent(var2, var0 -> new ArrayList<>());
      if (var1.getElements() != null) {
         var3.addAll(var1.getElements());
      }

      if (var1.isLastPage()) {
         this.pagination.remove(var2);
         ApolloPaginatedResponse var4 = var1.combine(var2, var3);
         this.roundtripManager.completeFuture(var4);
      }
   }

   public void handleTimeout(UUID var1) {
      this.pagination.remove(var1);
   }
}
