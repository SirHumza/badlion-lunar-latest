package com.lunarclient.apollo.module.transfer;

import com.lunarclient.apollo.roundtrip.ApolloRequest;
import java.util.List;
import lombok.Generated;

public final class PingRequest extends ApolloRequest<PingResponse> {
   List<String> serverIps;

   @Override
   public long getTimeoutMillis() {
      return 10000L;
   }

   @Generated
   PingRequest(List<String> var1) {
      this.serverIps = var1;
   }

   @Generated
   public static PingRequest.PingRequestBuilder builder() {
      return new PingRequest.PingRequestBuilder();
   }

   @Generated
   public List<String> getServerIps() {
      return this.serverIps;
   }

   @Generated
   public static class PingRequestBuilder {
      @Generated
      private List<String> serverIps;

      @Generated
      PingRequestBuilder() {
      }

      @Generated
      public PingRequest.PingRequestBuilder serverIps(List<String> var1) {
         this.serverIps = var1;
         return this;
      }

      @Generated
      public PingRequest build() {
         return new PingRequest(this.serverIps);
      }

      @Generated
      @Override
      public String toString() {
         return "PingRequest.PingRequestBuilder(serverIps=" + this.serverIps + ")";
      }
   }
}
