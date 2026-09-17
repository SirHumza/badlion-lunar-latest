package com.lunarclient.apollo.stats;

import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.ApolloPlatform;
import com.lunarclient.apollo.api.ApolloHttpManager;
import com.lunarclient.apollo.api.request.heartbeat.ServerHeartbeatRequest;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.stats.metadata.ApolloMetadataManager;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class ApolloStatsThread extends Thread {
   private static final long MB_BYTES = 1048576L;
   private static final OperatingSystemMXBean MX_BEAN = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
   private static final long HEARTBEAT_INTERVAL = TimeUnit.MINUTES.toMillis(15L);

   public ApolloStatsThread() {
      this.setName("Apollo Stats Thread");
      this.setDaemon(true);
      this.start();
   }

   @Override
   public void run() {
      while (true) {
         ServerHeartbeatRequest var1 = null;

         try {
            label45: {
               ApolloPlatform var2 = Apollo.getPlatform();
               Options var3 = var2.getOptions();
               ApolloStats var4 = var2.getStats();
               Runtime var5 = Runtime.getRuntime();
               if (var3.<Boolean, SimpleOption<Boolean>>get(ApolloStatsManager.SEND_STATS)) {
                  boolean var6 = var3.<Boolean, SimpleOption<Boolean>>get(ApolloStatsManager.HEARTBEAT_PERFORMANCE);
                  boolean var7 = var3.<Boolean, SimpleOption<Boolean>>get(ApolloStatsManager.HEARTBEAT_COUNTS);
                  boolean var8 = var3.<Boolean, SimpleOption<Boolean>>get(ApolloStatsManager.HEARTBEAT_USER_METADATA);
                  if (var6 || var7 || var8) {
                     ServerHeartbeatRequest.ServerHeartbeatRequestBuilder var9 = ServerHeartbeatRequest.builder()
                        .serverInstallationId(var3.<UUID, SimpleOption<UUID>>get(ApolloStatsManager.INSTALLATION_ID).toString())
                        .serverSessionId(ApolloStatsManager.SESSION_ID);
                     if (var6) {
                        var9.cpuUsage(MX_BEAN.getSystemLoadAverage())
                           .ramMax((int)(var5.maxMemory() / 1048576L))
                           .ramUsed((int)((var5.maxMemory() - var5.freeMemory()) / 1048576L));
                     }

                     if (var7) {
                        var9.totalPlayers(var4.getTotalPlayers());
                     }

                     if (var8) {
                        ApolloMetadataManager var10 = ApolloManager.getMetadataManager();
                        var9.metadata(var10.extract());
                        var10.clear();
                     }

                     ServerHeartbeatRequest var13 = var1 = var9.build();
                     ApolloManager.getHttpManager().request(var1).onFailure(var1x -> ApolloHttpManager.handleError("Failed to send heartbeat!", var1x, var13));
                     break label45;
                  }
               }

               return;
            }
         } catch (Throwable var12) {
            ApolloHttpManager.handleError("Failed to create heartbeat!", var12, var1);
         }

         try {
            Thread.sleep(HEARTBEAT_INTERVAL);
         } catch (InterruptedException var11) {
            ApolloHttpManager.handleError("Failed to sleep stats thread!", var11, null);
         }
      }
   }
}
