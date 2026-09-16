package com.lunarclient.apollo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lunarclient.apollo.api.ApolloHttpManager;
import com.lunarclient.apollo.mods.ApolloModsManager;
import com.lunarclient.apollo.module.ApolloModuleManagerImpl;
import com.lunarclient.apollo.network.ApolloNetworkManager;
import com.lunarclient.apollo.option.ConfigOptions;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.option.config.CommonSerializers;
import com.lunarclient.apollo.player.ApolloPlayerManagerImpl;
import com.lunarclient.apollo.roundtrip.ApolloRoundtripManager;
import com.lunarclient.apollo.stats.ApolloStatsManager;
import com.lunarclient.apollo.stats.metadata.ApolloMetadataManager;
import com.lunarclient.apollo.util.ConfigTarget;
import com.lunarclient.apollo.version.ApolloVersionManager;
import com.lunarclient.apollo.world.ApolloWorldManagerImpl;
import java.nio.file.Path;
import java.util.Collection;
import lombok.Generated;

public final class ApolloManager {
   public static final String PLUGIN_MESSAGE_CHANNEL = "lunar:apollo";
   public static final String PLUGIN_ROOT_MODULE = "apollo";
   public static final Gson GSON = new GsonBuilder().create();
   private static ApolloPlatform platform;
   private static ApolloRoundtripManager roundtripManager;
   private static ApolloHttpManager httpManager;
   private static ApolloNetworkManager networkManager;
   private static ApolloVersionManager versionManager;
   private static ApolloStatsManager statsManager;
   private static ApolloModsManager modsManager;
   private static ApolloMetadataManager metadataManager;
   private static Path configPath;
   private static boolean bootstrapped = false;

   public static void bootstrap(ApolloPlatform var0) {
      if (bootstrapped) {
         throw new IllegalStateException("Cannot bootstrap Apollo more than once!");
      }

      try {
         Apollo.initialize(var0, new ApolloModuleManagerImpl(), new ApolloWorldManagerImpl(), new ApolloPlayerManagerImpl());
         roundtripManager = new ApolloRoundtripManager();
         httpManager = new ApolloHttpManager();
         networkManager = new ApolloNetworkManager();
         versionManager = new ApolloVersionManager();
         statsManager = new ApolloStatsManager();
         modsManager = new ApolloModsManager();
         new CommonSerializers();
         platform = var0;
      } catch (Throwable var2) {
         throw new RuntimeException("Unable to bootstrap Apollo!", var2);
      }

      bootstrapped = true;
   }

   public static void registerOptions(Option<?, ?, ?>... var0) {
      Options var1 = Apollo.getPlatform().getOptions();

      for (Option var5 : var0) {
         var1.register(var5);
      }
   }

   public static void setConfigPath(Path var0) {
      configPath = var0;
   }

   public static void loadConfiguration() {
      for (ApolloConfig var1 : ApolloConfig.configs()) {
         var1.reset();
      }

      Collection var2 = Apollo.getPlatform().getOptions().getRegistry().values();
      ApolloConfig var3 = ApolloConfig.compute(configPath, ConfigTarget.GENERAL_SETTINGS);
      ConfigOptions.loadOptions(platform.getOptions(), var3.node(), var2);
   }

   public static void saveConfiguration() {
      Collection var0 = Apollo.getPlatform().getOptions().getRegistry().values();
      ApolloConfig var1 = ApolloConfig.compute(configPath, ConfigTarget.GENERAL_SETTINGS);
      ConfigOptions.saveOptions(platform.getOptions(), var1.node(), var0);
      ((ApolloModuleManagerImpl)Apollo.getModuleManager()).saveConfiguration();

      for (ApolloConfig var3 : ApolloConfig.configs()) {
         var3.save();
      }
   }

   private ApolloManager() {
   }

   @Generated
   public static ApolloRoundtripManager getRoundtripManager() {
      return roundtripManager;
   }

   @Generated
   public static ApolloHttpManager getHttpManager() {
      return httpManager;
   }

   @Generated
   public static ApolloNetworkManager getNetworkManager() {
      return networkManager;
   }

   @Generated
   public static ApolloVersionManager getVersionManager() {
      return versionManager;
   }

   @Generated
   public static ApolloStatsManager getStatsManager() {
      return statsManager;
   }

   @Generated
   public static ApolloModsManager getModsManager() {
      return modsManager;
   }

   @Generated
   public static ApolloMetadataManager getMetadataManager() {
      return metadataManager;
   }

   @Generated
   public static void setMetadataManager(ApolloMetadataManager var0) {
      metadataManager = var0;
   }

   @Generated
   public static Path getConfigPath() {
      return configPath;
   }
}
