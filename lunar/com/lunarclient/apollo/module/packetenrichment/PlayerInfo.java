package com.lunarclient.apollo.module.packetenrichment;

import com.lunarclient.apollo.common.location.ApolloPlayerLocation;
import java.util.UUID;
import lombok.Generated;

public class PlayerInfo {
   UUID playerUuid;
   ApolloPlayerLocation location;
   boolean sneaking;
   boolean sprinting;
   boolean jumping;
   float forwardSpeed;
   float strafeSpeed;

   @Generated
   PlayerInfo(UUID var1, ApolloPlayerLocation var2, boolean var3, boolean var4, boolean var5, float var6, float var7) {
      this.playerUuid = var1;
      this.location = var2;
      this.sneaking = var3;
      this.sprinting = var4;
      this.jumping = var5;
      this.forwardSpeed = var6;
      this.strafeSpeed = var7;
   }

   @Generated
   public static PlayerInfo.PlayerInfoBuilder builder() {
      return new PlayerInfo.PlayerInfoBuilder();
   }

   @Generated
   public UUID getPlayerUuid() {
      return this.playerUuid;
   }

   @Generated
   public ApolloPlayerLocation getLocation() {
      return this.location;
   }

   @Generated
   public boolean isSneaking() {
      return this.sneaking;
   }

   @Generated
   public boolean isSprinting() {
      return this.sprinting;
   }

   @Generated
   public boolean isJumping() {
      return this.jumping;
   }

   @Generated
   public float getForwardSpeed() {
      return this.forwardSpeed;
   }

   @Generated
   public float getStrafeSpeed() {
      return this.strafeSpeed;
   }

   @Generated
   public static class PlayerInfoBuilder {
      @Generated
      private UUID playerUuid;
      @Generated
      private ApolloPlayerLocation location;
      @Generated
      private boolean sneaking;
      @Generated
      private boolean sprinting;
      @Generated
      private boolean jumping;
      @Generated
      private float forwardSpeed;
      @Generated
      private float strafeSpeed;

      @Generated
      PlayerInfoBuilder() {
      }

      @Generated
      public PlayerInfo.PlayerInfoBuilder playerUuid(UUID var1) {
         this.playerUuid = var1;
         return this;
      }

      @Generated
      public PlayerInfo.PlayerInfoBuilder location(ApolloPlayerLocation var1) {
         this.location = var1;
         return this;
      }

      @Generated
      public PlayerInfo.PlayerInfoBuilder sneaking(boolean var1) {
         this.sneaking = var1;
         return this;
      }

      @Generated
      public PlayerInfo.PlayerInfoBuilder sprinting(boolean var1) {
         this.sprinting = var1;
         return this;
      }

      @Generated
      public PlayerInfo.PlayerInfoBuilder jumping(boolean var1) {
         this.jumping = var1;
         return this;
      }

      @Generated
      public PlayerInfo.PlayerInfoBuilder forwardSpeed(float var1) {
         this.forwardSpeed = var1;
         return this;
      }

      @Generated
      public PlayerInfo.PlayerInfoBuilder strafeSpeed(float var1) {
         this.strafeSpeed = var1;
         return this;
      }

      @Generated
      public PlayerInfo build() {
         return new PlayerInfo(this.playerUuid, this.location, this.sneaking, this.sprinting, this.jumping, this.forwardSpeed, this.strafeSpeed);
      }

      @Generated
      @Override
      public String toString() {
         return "PlayerInfo.PlayerInfoBuilder(playerUuid="
            + this.playerUuid
            + ", location="
            + this.location
            + ", sneaking="
            + this.sneaking
            + ", sprinting="
            + this.sprinting
            + ", jumping="
            + this.jumping
            + ", forwardSpeed="
            + this.forwardSpeed
            + ", strafeSpeed="
            + this.strafeSpeed
            + ")";
      }
   }
}
