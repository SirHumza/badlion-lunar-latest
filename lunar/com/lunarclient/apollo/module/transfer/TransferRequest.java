package com.lunarclient.apollo.module.transfer;

import com.lunarclient.apollo.roundtrip.ApolloRequest;
import lombok.Generated;

public final class TransferRequest extends ApolloRequest<TransferResponse> {
   String serverIp;

   @Generated
   TransferRequest(String var1) {
      this.serverIp = var1;
   }

   @Generated
   public static TransferRequest.TransferRequestBuilder builder() {
      return new TransferRequest.TransferRequestBuilder();
   }

   @Generated
   public String getServerIp() {
      return this.serverIp;
   }

   @Generated
   public static class TransferRequestBuilder {
      @Generated
      private String serverIp;

      @Generated
      TransferRequestBuilder() {
      }

      @Generated
      public TransferRequest.TransferRequestBuilder serverIp(String var1) {
         this.serverIp = var1;
         return this;
      }

      @Generated
      public TransferRequest build() {
         return new TransferRequest(this.serverIp);
      }

      @Generated
      @Override
      public String toString() {
         return "TransferRequest.TransferRequestBuilder(serverIp=" + this.serverIp + ")";
      }
   }
}
