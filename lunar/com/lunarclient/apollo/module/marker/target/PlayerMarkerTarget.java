package com.lunarclient.apollo.module.marker.target;

import java.util.UUID;
import lombok.Generated;

public class PlayerMarkerTarget extends MarkerTarget {
   UUID playerId;
   String playerName;

   @Generated
   PlayerMarkerTarget(UUID var1, String var2) {
      this.playerId = var1;
      this.playerName = var2;
   }

   @Generated
   public static PlayerMarkerTarget.PlayerMarkerTargetBuilder builder() {
      return new PlayerMarkerTarget.PlayerMarkerTargetBuilder();
   }

   @Generated
   public UUID getPlayerId() {
      return this.playerId;
   }

   @Generated
   public String getPlayerName() {
      return this.playerName;
   }

   @Generated
   public static class PlayerMarkerTargetBuilder {
      @Generated
      private UUID playerId;
      @Generated
      private String playerName;

      @Generated
      PlayerMarkerTargetBuilder() {
      }

      @Generated
      public PlayerMarkerTarget.PlayerMarkerTargetBuilder playerId(UUID var1) {
         this.playerId = var1;
         return this;
      }

      @Generated
      public PlayerMarkerTarget.PlayerMarkerTargetBuilder playerName(String var1) {
         this.playerName = var1;
         return this;
      }

      @Generated
      public PlayerMarkerTarget build() {
         return new PlayerMarkerTarget(this.playerId, this.playerName);
      }

      @Generated
      @Override
      public String toString() {
         return "PlayerMarkerTarget.PlayerMarkerTargetBuilder(playerId=" + this.playerId + ", playerName=" + this.playerName + ")";
      }
   }
}
