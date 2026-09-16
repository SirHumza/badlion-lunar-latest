package com.lunarclient.apollo.api.request;

import com.lunarclient.apollo.api.ApiRequest;
import com.lunarclient.apollo.api.ApiRequestType;
import com.lunarclient.apollo.api.ApiServiceType;
import com.lunarclient.apollo.api.response.ServerStartResponse;
import com.lunarclient.apollo.stats.ApolloPluginDescription;
import java.util.List;
import lombok.Generated;

public final class ServerStartRequest implements ApiRequest<ServerStartResponse> {
   private final String serverInstallationId;
   private final String serverSessionId;
   private final List<ApolloPluginDescription> plugins;
   private final boolean onlineMode;
   private final String platformType;
   private final String platformSubtype;
   private final String platformVersion;
   private final String javaVersion;
   private final String cpuArch;
   private final int cpuCoreCount;
   private final String operatingSystem;
   private final String operatingSystemRelease;
   private final List<String> modules;
   private final String apolloVersion;

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
      return "event/server.start";
   }

   @Generated
   ServerStartRequest(
      String var1,
      String var2,
      List<ApolloPluginDescription> var3,
      boolean var4,
      String var5,
      String var6,
      String var7,
      String var8,
      String var9,
      int var10,
      String var11,
      String var12,
      List<String> var13,
      String var14
   ) {
      this.serverInstallationId = var1;
      this.serverSessionId = var2;
      this.plugins = var3;
      this.onlineMode = var4;
      this.platformType = var5;
      this.platformSubtype = var6;
      this.platformVersion = var7;
      this.javaVersion = var8;
      this.cpuArch = var9;
      this.cpuCoreCount = var10;
      this.operatingSystem = var11;
      this.operatingSystemRelease = var12;
      this.modules = var13;
      this.apolloVersion = var14;
   }

   @Generated
   public static ServerStartRequest.ServerStartRequestBuilder builder() {
      return new ServerStartRequest.ServerStartRequestBuilder();
   }

   @Generated
   public ServerStartRequest.ServerStartRequestBuilder toBuilder() {
      return new ServerStartRequest.ServerStartRequestBuilder()
         .serverInstallationId(this.serverInstallationId)
         .serverSessionId(this.serverSessionId)
         .plugins(this.plugins)
         .onlineMode(this.onlineMode)
         .platformType(this.platformType)
         .platformSubtype(this.platformSubtype)
         .platformVersion(this.platformVersion)
         .javaVersion(this.javaVersion)
         .cpuArch(this.cpuArch)
         .cpuCoreCount(this.cpuCoreCount)
         .operatingSystem(this.operatingSystem)
         .operatingSystemRelease(this.operatingSystemRelease)
         .modules(this.modules)
         .apolloVersion(this.apolloVersion);
   }

   @Generated
   @Override
   public String toString() {
      return "ServerStartRequest(serverInstallationId="
         + this.serverInstallationId
         + ", serverSessionId="
         + this.serverSessionId
         + ", plugins="
         + this.plugins
         + ", onlineMode="
         + this.onlineMode
         + ", platformType="
         + this.platformType
         + ", platformSubtype="
         + this.platformSubtype
         + ", platformVersion="
         + this.platformVersion
         + ", javaVersion="
         + this.javaVersion
         + ", cpuArch="
         + this.cpuArch
         + ", cpuCoreCount="
         + this.cpuCoreCount
         + ", operatingSystem="
         + this.operatingSystem
         + ", operatingSystemRelease="
         + this.operatingSystemRelease
         + ", modules="
         + this.modules
         + ", apolloVersion="
         + this.apolloVersion
         + ")";
   }

   @Generated
   public static class ServerStartRequestBuilder {
      @Generated
      private String serverInstallationId;
      @Generated
      private String serverSessionId;
      @Generated
      private List<ApolloPluginDescription> plugins;
      @Generated
      private boolean onlineMode;
      @Generated
      private String platformType;
      @Generated
      private String platformSubtype;
      @Generated
      private String platformVersion;
      @Generated
      private String javaVersion;
      @Generated
      private String cpuArch;
      @Generated
      private int cpuCoreCount;
      @Generated
      private String operatingSystem;
      @Generated
      private String operatingSystemRelease;
      @Generated
      private List<String> modules;
      @Generated
      private String apolloVersion;

      @Generated
      ServerStartRequestBuilder() {
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder serverInstallationId(String var1) {
         this.serverInstallationId = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder serverSessionId(String var1) {
         this.serverSessionId = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder plugins(List<ApolloPluginDescription> var1) {
         this.plugins = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder onlineMode(boolean var1) {
         this.onlineMode = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder platformType(String var1) {
         this.platformType = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder platformSubtype(String var1) {
         this.platformSubtype = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder platformVersion(String var1) {
         this.platformVersion = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder javaVersion(String var1) {
         this.javaVersion = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder cpuArch(String var1) {
         this.cpuArch = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder cpuCoreCount(int var1) {
         this.cpuCoreCount = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder operatingSystem(String var1) {
         this.operatingSystem = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder operatingSystemRelease(String var1) {
         this.operatingSystemRelease = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder modules(List<String> var1) {
         this.modules = var1;
         return this;
      }

      @Generated
      public ServerStartRequest.ServerStartRequestBuilder apolloVersion(String var1) {
         this.apolloVersion = var1;
         return this;
      }

      @Generated
      public ServerStartRequest build() {
         return new ServerStartRequest(
            this.serverInstallationId,
            this.serverSessionId,
            this.plugins,
            this.onlineMode,
            this.platformType,
            this.platformSubtype,
            this.platformVersion,
            this.javaVersion,
            this.cpuArch,
            this.cpuCoreCount,
            this.operatingSystem,
            this.operatingSystemRelease,
            this.modules,
            this.apolloVersion
         );
      }

      @Generated
      @Override
      public String toString() {
         return "ServerStartRequest.ServerStartRequestBuilder(serverInstallationId="
            + this.serverInstallationId
            + ", serverSessionId="
            + this.serverSessionId
            + ", plugins="
            + this.plugins
            + ", onlineMode="
            + this.onlineMode
            + ", platformType="
            + this.platformType
            + ", platformSubtype="
            + this.platformSubtype
            + ", platformVersion="
            + this.platformVersion
            + ", javaVersion="
            + this.javaVersion
            + ", cpuArch="
            + this.cpuArch
            + ", cpuCoreCount="
            + this.cpuCoreCount
            + ", operatingSystem="
            + this.operatingSystem
            + ", operatingSystemRelease="
            + this.operatingSystemRelease
            + ", modules="
            + this.modules
            + ", apolloVersion="
            + this.apolloVersion
            + ")";
      }
   }
}
