package com.lunarclient.apollo.api.response;

import com.lunarclient.apollo.api.ApiResponse;
import lombok.Generated;

public final class VersionResponse implements ApiResponse {
   String version;
   VersionResponse.Assets assets;

   @Generated
   public String getVersion() {
      return this.version;
   }

   @Generated
   public VersionResponse.Assets getAssets() {
      return this.assets;
   }

   public static final class Assets {
      String bukkit;
      String bungee;
      String velocity;
      String folia;
      String minestom;

      @Generated
      public String getBukkit() {
         return this.bukkit;
      }

      @Generated
      public String getBungee() {
         return this.bungee;
      }

      @Generated
      public String getVelocity() {
         return this.velocity;
      }

      @Generated
      public String getFolia() {
         return this.folia;
      }

      @Generated
      public String getMinestom() {
         return this.minestom;
      }
   }
}
