package com.lunarclient.apollo.api.request;

import com.lunarclient.apollo.api.ApiRequest;
import com.lunarclient.apollo.api.ApiRequestType;
import com.lunarclient.apollo.api.ApiServiceType;
import com.lunarclient.apollo.api.response.VersionResponse;
import lombok.Generated;

public final class VersionRequest implements ApiRequest<VersionResponse> {
   @Override
   public ApiServiceType getService() {
      return ApiServiceType.API;
   }

   @Override
   public ApiRequestType getType() {
      return ApiRequestType.GET;
   }

   @Override
   public String getRoute() {
      return "updates";
   }

   @Generated
   VersionRequest() {
   }

   @Generated
   public static VersionRequest.VersionRequestBuilder builder() {
      return new VersionRequest.VersionRequestBuilder();
   }

   @Generated
   @Override
   public String toString() {
      return "VersionRequest()";
   }

   @Generated
   public static class VersionRequestBuilder {
      @Generated
      VersionRequestBuilder() {
      }

      @Generated
      public VersionRequest build() {
         return new VersionRequest();
      }

      @Generated
      @Override
      public String toString() {
         return "VersionRequest.VersionRequestBuilder()";
      }
   }
}
