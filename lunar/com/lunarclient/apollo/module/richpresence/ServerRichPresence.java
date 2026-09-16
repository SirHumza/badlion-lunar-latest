package com.lunarclient.apollo.module.richpresence;

import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class ServerRichPresence {
   @Nullable
   String gameName;
   @Nullable
   String gameVariantName;
   @Nullable
   String gameState;
   @Nullable
   String playerState;
   @Nullable
   String mapName;
   @Nullable
   String subServerName;
   int teamCurrentSize;
   int teamMaxSize;

   @Generated
   ServerRichPresence(
      @Nullable String var1,
      @Nullable String var2,
      @Nullable String var3,
      @Nullable String var4,
      @Nullable String var5,
      @Nullable String var6,
      int var7,
      int var8
   ) {
      this.gameName = var1;
      this.gameVariantName = var2;
      this.gameState = var3;
      this.playerState = var4;
      this.mapName = var5;
      this.subServerName = var6;
      this.teamCurrentSize = var7;
      this.teamMaxSize = var8;
   }

   @Generated
   public static ServerRichPresence.ServerRichPresenceBuilder builder() {
      return new ServerRichPresence.ServerRichPresenceBuilder();
   }

   @Nullable
   @Generated
   public String getGameName() {
      return this.gameName;
   }

   @Nullable
   @Generated
   public String getGameVariantName() {
      return this.gameVariantName;
   }

   @Nullable
   @Generated
   public String getGameState() {
      return this.gameState;
   }

   @Nullable
   @Generated
   public String getPlayerState() {
      return this.playerState;
   }

   @Nullable
   @Generated
   public String getMapName() {
      return this.mapName;
   }

   @Nullable
   @Generated
   public String getSubServerName() {
      return this.subServerName;
   }

   @Generated
   public int getTeamCurrentSize() {
      return this.teamCurrentSize;
   }

   @Generated
   public int getTeamMaxSize() {
      return this.teamMaxSize;
   }

   @Generated
   public static class ServerRichPresenceBuilder {
      @Generated
      private String gameName;
      @Generated
      private String gameVariantName;
      @Generated
      private String gameState;
      @Generated
      private String playerState;
      @Generated
      private String mapName;
      @Generated
      private String subServerName;
      @Generated
      private int teamCurrentSize;
      @Generated
      private int teamMaxSize;

      @Generated
      ServerRichPresenceBuilder() {
      }

      @Generated
      public ServerRichPresence.ServerRichPresenceBuilder gameName(@Nullable String var1) {
         this.gameName = var1;
         return this;
      }

      @Generated
      public ServerRichPresence.ServerRichPresenceBuilder gameVariantName(@Nullable String var1) {
         this.gameVariantName = var1;
         return this;
      }

      @Generated
      public ServerRichPresence.ServerRichPresenceBuilder gameState(@Nullable String var1) {
         this.gameState = var1;
         return this;
      }

      @Generated
      public ServerRichPresence.ServerRichPresenceBuilder playerState(@Nullable String var1) {
         this.playerState = var1;
         return this;
      }

      @Generated
      public ServerRichPresence.ServerRichPresenceBuilder mapName(@Nullable String var1) {
         this.mapName = var1;
         return this;
      }

      @Generated
      public ServerRichPresence.ServerRichPresenceBuilder subServerName(@Nullable String var1) {
         this.subServerName = var1;
         return this;
      }

      @Generated
      public ServerRichPresence.ServerRichPresenceBuilder teamCurrentSize(int var1) {
         this.teamCurrentSize = var1;
         return this;
      }

      @Generated
      public ServerRichPresence.ServerRichPresenceBuilder teamMaxSize(int var1) {
         this.teamMaxSize = var1;
         return this;
      }

      @Generated
      public ServerRichPresence build() {
         return new ServerRichPresence(
            this.gameName, this.gameVariantName, this.gameState, this.playerState, this.mapName, this.subServerName, this.teamCurrentSize, this.teamMaxSize
         );
      }

      @Generated
      @Override
      public String toString() {
         return "ServerRichPresence.ServerRichPresenceBuilder(gameName="
            + this.gameName
            + ", gameVariantName="
            + this.gameVariantName
            + ", gameState="
            + this.gameState
            + ", playerState="
            + this.playerState
            + ", mapName="
            + this.mapName
            + ", subServerName="
            + this.subServerName
            + ", teamCurrentSize="
            + this.teamCurrentSize
            + ", teamMaxSize="
            + this.teamMaxSize
            + ")";
      }
   }
}
