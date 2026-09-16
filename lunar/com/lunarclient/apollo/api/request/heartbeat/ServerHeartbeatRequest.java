package com.lunarclient.apollo.api.request.heartbeat;

import com.lunarclient.apollo.api.ApiRequest;
import com.lunarclient.apollo.api.ApiRequestType;
import com.lunarclient.apollo.api.ApiServiceType;
import com.lunarclient.apollo.api.response.ServerHeartbeatResponse;
import com.lunarclient.apollo.stats.metadata.PlatformMetadata;
import lombok.Generated;

public final class ServerHeartbeatRequest implements ApiRequest<ServerHeartbeatResponse> {
   private final String serverInstallationId;
   private final String serverSessionId;
   private final double cpuUsage;
   private final int ramMax;
   private final int ramUsed;
   private final int totalPlayers;
   private final PlatformMetadata metadata;

   @Override
   public ApiServiceType getService() {
      return ApiServiceType.ANALYTICS;
   }

   @Override
   public ApiRequestType getType() {
      return ApiRequestType.POST;
   }

   @Override
   public String getRoute() {
      return "event/server.heartbeat";
   }

   @Generated
   ServerHeartbeatRequest(String var1, String var2, double var3, int var5, int var6, int var7, PlatformMetadata var8) {
      this.serverInstallationId = var1;
      this.serverSessionId = var2;
      this.cpuUsage = var3;
      this.ramMax = var5;
      this.ramUsed = var6;
      this.totalPlayers = var7;
      this.metadata = var8;
   }

   @Generated
   public static ServerHeartbeatRequest.ServerHeartbeatRequestBuilder builder() {
      return new ServerHeartbeatRequest.ServerHeartbeatRequestBuilder();
   }

   @Generated
   public ServerHeartbeatRequest.ServerHeartbeatRequestBuilder toBuilder() {
      return new ServerHeartbeatRequest.ServerHeartbeatRequestBuilder()
         .serverInstallationId(this.serverInstallationId)
         .serverSessionId(this.serverSessionId)
         .cpuUsage(this.cpuUsage)
         .ramMax(this.ramMax)
         .ramUsed(this.ramUsed)
         .totalPlayers(this.totalPlayers)
         .metadata(this.metadata);
   }

   @Generated
   @Override
   public String toString() {
      return "ServerHeartbeatRequest(serverInstallationId="
         + this.serverInstallationId
         + ", serverSessionId="
         + this.serverSessionId
         + ", cpuUsage="
         + this.cpuUsage
         + ", ramMax="
         + this.ramMax
         + ", ramUsed="
         + this.ramUsed
         + ", totalPlayers="
         + this.totalPlayers
         + ", metadata="
         + this.metadata
         + ")";
   }

   @Generated
   public static class ServerHeartbeatRequestBuilder {
      @Generated
      private String serverInstallationId;
      @Generated
      private String serverSessionId;
      @Generated
      private double cpuUsage;
      @Generated
      private int ramMax;
      @Generated
      private int ramUsed;
      @Generated
      private int totalPlayers;
      @Generated
      private PlatformMetadata metadata;

      @Generated
      ServerHeartbeatRequestBuilder() {
      }

      @Generated
      public ServerHeartbeatRequest.ServerHeartbeatRequestBuilder serverInstallationId(String var1) {
         this.serverInstallationId = var1;
         return this;
      }

      @Generated
      public ServerHeartbeatRequest.ServerHeartbeatRequestBuilder serverSessionId(String var1) {
         this.serverSessionId = var1;
         return this;
      }

      @Generated
      public ServerHeartbeatRequest.ServerHeartbeatRequestBuilder cpuUsage(double var1) {
         this.cpuUsage = var1;
         return this;
      }

      @Generated
      public ServerHeartbeatRequest.ServerHeartbeatRequestBuilder ramMax(int var1) {
         this.ramMax = var1;
         return this;
      }

      @Generated
      public ServerHeartbeatRequest.ServerHeartbeatRequestBuilder ramUsed(int var1) {
         this.ramUsed = var1;
         return this;
      }

      @Generated
      public ServerHeartbeatRequest.ServerHeartbeatRequestBuilder totalPlayers(int var1) {
         this.totalPlayers = var1;
         return this;
      }

      @Generated
      public ServerHeartbeatRequest.ServerHeartbeatRequestBuilder metadata(PlatformMetadata var1) {
         this.metadata = var1;
         return this;
      }

      @Generated
      public ServerHeartbeatRequest build() {
         return new ServerHeartbeatRequest(
            this.serverInstallationId, this.serverSessionId, this.cpuUsage, this.ramMax, this.ramUsed, this.totalPlayers, this.metadata
         );
      }

      @Generated
      @Override
      public String toString() {
         return "ServerHeartbeatRequest.ServerHeartbeatRequestBuilder(serverInstallationId="
            + this.serverInstallationId
            + ", serverSessionId="
            + this.serverSessionId
            + ", cpuUsage="
            + this.cpuUsage
            + ", ramMax="
            + this.ramMax
            + ", ramUsed="
            + this.ramUsed
            + ", totalPlayers="
            + this.totalPlayers
            + ", metadata="
            + this.metadata
            + ")";
      }
   }
}
