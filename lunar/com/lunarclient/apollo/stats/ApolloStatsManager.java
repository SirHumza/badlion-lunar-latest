package com.lunarclient.apollo.stats;

import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.ApolloPlatform;
import com.lunarclient.apollo.api.ApolloHttpManager;
import com.lunarclient.apollo.api.request.ServerStartRequest;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public final class ApolloStatsManager {
   public static final String SESSION_ID = UUID.randomUUID().toString();
   private static final String CONFIG_PREFIX = "mcstats";
   public static final SimpleOption<Boolean> SEND_STATS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment("Set to 'true' to send statistics to MCStats, otherwise 'false'."))
               .node("mcstats", "send-stats"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(true))
      .build();
   public static final SimpleOption<UUID> INSTALLATION_ID = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment("Your server's installation id used for stats."))
               .node("mcstats", "installation-id"))
            .type(TypeToken.get(UUID.class)))
         .defaultValue(UUID.randomUUID()))
      .build();
   public static final SimpleOption<Boolean> SERVER_STATISTICS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment("Set to 'true' to send your minecraft server statistics to MCStats, otherwise 'false'."))
               .node("mcstats", "server-statistics"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(true))
      .build();
   public static final SimpleOption<Boolean> SOFTWARE_INFORMATION = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment("Set to 'true' to send your server software information to MCStats, otherwise 'false'."))
               .node("mcstats", "software-information"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(true))
      .build();
   public static final SimpleOption<Boolean> HARDWARE_INFORMATION = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment("Set to 'true' to send your server hardware information to MCStats, otherwise 'false'."))
               .node("mcstats", "hardware-information"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(true))
      .build();
   public static final SimpleOption<Boolean> HEARTBEAT_PERFORMANCE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment("Set to 'true' to send your server cpu and ram usage to MCStats, otherwise 'false'."))
               .node("mcstats", "performance"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(true))
      .build();
   public static final SimpleOption<Boolean> HEARTBEAT_COUNTS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment("Set to 'true' to send your server player count to MCStats, otherwise 'false'."))
               .node("mcstats", "counts"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(true))
      .build();
   public static final SimpleOption<Boolean> HEARTBEAT_USER_METADATA = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment("Set to 'true' to send players user metadata to MCStats, otherwise 'false'."))
               .node("mcstats", "user-metadata"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(true))
      .build();

   public ApolloStatsManager() {
      ApolloManager.registerOptions(
         SEND_STATS,
         INSTALLATION_ID,
         SERVER_STATISTICS,
         HARDWARE_INFORMATION,
         SOFTWARE_INFORMATION,
         HEARTBEAT_PERFORMANCE,
         HEARTBEAT_COUNTS,
         HEARTBEAT_USER_METADATA
      );
   }

   public void enable() {
      this.handleServerStartStats();
      new ApolloStatsThread();
   }

   private void handleServerStartStats() {
      ServerStartRequest var1 = null;

      try {
         ApolloPlatform var2 = Apollo.getPlatform();
         Options var3 = var2.getOptions();
         if (!var3.<Boolean, SimpleOption<Boolean>>get(SEND_STATS)) {
            return;
         }

         boolean var4 = var3.<Boolean, SimpleOption<Boolean>>get(SERVER_STATISTICS);
         boolean var5 = var3.<Boolean, SimpleOption<Boolean>>get(SOFTWARE_INFORMATION);
         boolean var6 = var3.<Boolean, SimpleOption<Boolean>>get(HARDWARE_INFORMATION);
         if (!var4 && !var5 && !var6) {
            return;
         }

         ApolloStats var7 = var2.getStats();
         Runtime var8 = Runtime.getRuntime();
         List var9 = Apollo.getModuleManager().getModules().stream().filter(ApolloModule::isEnabled).map(ApolloModule::getId).collect(Collectors.toList());
         ServerStartRequest.ServerStartRequestBuilder var10 = ServerStartRequest.builder()
            .serverInstallationId(var3.<UUID, SimpleOption<UUID>>get(INSTALLATION_ID).toString())
            .serverSessionId(SESSION_ID);
         if (var4) {
            var10.plugins(var7.getPlugins())
               .onlineMode(var7.isOnlineMode())
               .platformType(var2.getKind().name())
               .platformSubtype(var7.getPlatformSubtype())
               .platformVersion(var7.getPlatformVersion())
               .modules(var9)
               .apolloVersion(var2.getApolloVersion());
         }

         if (var5) {
            var10.javaVersion(System.getProperty("java.version"))
               .operatingSystem(System.getProperty("os.name"))
               .operatingSystemRelease(System.getProperty("os.version"));
         }

         if (var6) {
            var10.cpuArch(System.getProperty("os.arch")).cpuCoreCount(var8.availableProcessors());
         }

         ServerStartRequest var11 = var1 = var10.build();
         ApolloManager.getHttpManager()
            .request(var10.build())
            .onFailure(var1x -> ApolloHttpManager.handleError("Failed to send server start request!", var1x, var11));
      } catch (Throwable var12) {
         ApolloHttpManager.handleError("Failed to create server start request!", var12, var1);
      }
   }
}
