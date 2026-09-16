package com.lunarclient.apollo.roundtrip;

import com.lunarclient.apollo.async.future.UncertainFuture;
import com.lunarclient.apollo.roundtrip.pagination.ApolloPaginatedResponse;
import com.lunarclient.apollo.roundtrip.pagination.ApolloPaginationManager;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ApolloRoundtripManager {
   private final Map<UUID, UncertainFuture<ApolloResponse>> listeners = new ConcurrentHashMap<>();
   private final ScheduledThreadPoolExecutor timeoutExecutor = new ScheduledThreadPoolExecutor(1);
   private final ApolloPaginationManager paginationManager = new ApolloPaginationManager(this);

   public void handleResponse(ApolloResponse var1) {
      if (var1 instanceof ApolloPaginatedResponse) {
         this.paginationManager.handlePage((ApolloPaginatedResponse)var1);
      } else {
         this.completeFuture(var1);
      }
   }

   public void completeFuture(ApolloResponse var1) {
      UncertainFuture var2 = this.listeners.remove(var1.getPacketId());
      if (var2 != null) {
         var2.handleSuccess(var1);
      }
   }

   public <T extends ApolloResponse> void registerListener(ApolloRequest<T> var1, UncertainFuture<T> var2) {
      UUID var3 = var1.getRequestId();
      this.timeoutExecutor
         .schedule(
            () -> {
               try {
                  UncertainFuture var4 = this.listeners.remove(var3);
                  this.paginationManager.handleTimeout(var3);
                  if (var4 != null) {
                     Throwable var5 = new Throwable(
                        "Timeout exceeded! No " + var1.getClass().getSimpleName() + " response received within " + var1.getTimeoutMillis() + "ms"
                     );
                     var2.handleFailure(var5);
                  }
               } catch (Exception var6) {
                  var6.printStackTrace();
               }
            },
            var1.getTimeoutMillis(),
            TimeUnit.MILLISECONDS
         );
      this.listeners.put(var3, var2);
   }
}
