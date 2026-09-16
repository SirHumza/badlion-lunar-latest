package com.lunarclient.apollo;

import com.lunarclient.apollo.module.ApolloModuleManager;
import com.lunarclient.apollo.player.ApolloPlayerManager;
import com.lunarclient.apollo.world.ApolloWorldManager;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public final class Apollo {
   private static ApolloPlatform platform = null;
   private static ApolloModuleManager moduleManager = null;
   private static ApolloWorldManager worldManager = null;
   private static ApolloPlayerManager playerManager = null;

   public static ApolloPlatform getPlatform() {
      return checkEnabled(platform);
   }

   public static ApolloModuleManager getModuleManager() {
      return checkEnabled(moduleManager);
   }

   public static ApolloWorldManager getWorldManager() {
      return checkEnabled(worldManager);
   }

   public static ApolloPlayerManager getPlayerManager() {
      return checkEnabled(playerManager);
   }

   static void initialize(@NonNull ApolloPlatform var0, @NonNull ApolloModuleManager var1, @NonNull ApolloWorldManager var2, @NonNull ApolloPlayerManager var3) {
      if (var0 == null) {
         throw new NullPointerException("platform is marked non-null but is null");
      }

      if (var1 == null) {
         throw new NullPointerException("moduleManager is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("worldManager is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("playerManager is marked non-null but is null");
      }

      platform = var0;
      moduleManager = var1;
      worldManager = var2;
      playerManager = var3;
   }

   private static <T> T checkEnabled(@Nullable T var0) {
      if (var0 == null) {
         throw new UnsupportedOperationException("Apollo has not started yet!");
      } else {
         return (T)var0;
      }
   }

   private Apollo() {
   }
}
