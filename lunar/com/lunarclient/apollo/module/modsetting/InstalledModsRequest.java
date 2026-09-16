package com.lunarclient.apollo.module.modsetting;

import com.lunarclient.apollo.roundtrip.ApolloRequest;
import lombok.Generated;

public final class InstalledModsRequest extends ApolloRequest<InstalledModsResponse> {
   @Generated
   InstalledModsRequest() {
   }

   @Generated
   public static InstalledModsRequest.InstalledModsRequestBuilder builder() {
      return new InstalledModsRequest.InstalledModsRequestBuilder();
   }

   @Generated
   public static class InstalledModsRequestBuilder {
      @Generated
      InstalledModsRequestBuilder() {
      }

      @Generated
      public InstalledModsRequest build() {
         return new InstalledModsRequest();
      }

      @Generated
      @Override
      public String toString() {
         return "InstalledModsRequest.InstalledModsRequestBuilder()";
      }
   }
}
