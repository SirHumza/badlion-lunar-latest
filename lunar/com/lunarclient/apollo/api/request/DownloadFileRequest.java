package com.lunarclient.apollo.api.request;

import com.lunarclient.apollo.api.ApiRequest;
import com.lunarclient.apollo.api.ApiRequestType;
import com.lunarclient.apollo.api.ApiServiceType;
import com.lunarclient.apollo.api.response.DownloadFileResponse;
import java.nio.file.Path;
import lombok.Generated;

public final class DownloadFileRequest implements ApiRequest<DownloadFileResponse> {
   private final String url;
   private final Path target;

   @Override
   public ApiServiceType getService() {
      return null;
   }

   @Override
   public ApiRequestType getType() {
      return null;
   }

   @Override
   public String getRoute() {
      return null;
   }

   @Generated
   DownloadFileRequest(String var1, Path var2) {
      this.url = var1;
      this.target = var2;
   }

   @Generated
   public static DownloadFileRequest.DownloadFileRequestBuilder builder() {
      return new DownloadFileRequest.DownloadFileRequestBuilder();
   }

   @Generated
   public DownloadFileRequest.DownloadFileRequestBuilder toBuilder() {
      return new DownloadFileRequest.DownloadFileRequestBuilder().url(this.url).target(this.target);
   }

   @Generated
   @Override
   public String toString() {
      return "DownloadFileRequest(url=" + this.getUrl() + ", target=" + this.getTarget() + ")";
   }

   @Generated
   public String getUrl() {
      return this.url;
   }

   @Generated
   public Path getTarget() {
      return this.target;
   }

   @Generated
   public static class DownloadFileRequestBuilder {
      @Generated
      private String url;
      @Generated
      private Path target;

      @Generated
      DownloadFileRequestBuilder() {
      }

      @Generated
      public DownloadFileRequest.DownloadFileRequestBuilder url(String var1) {
         this.url = var1;
         return this;
      }

      @Generated
      public DownloadFileRequest.DownloadFileRequestBuilder target(Path var1) {
         this.target = var1;
         return this;
      }

      @Generated
      public DownloadFileRequest build() {
         return new DownloadFileRequest(this.url, this.target);
      }

      @Generated
      @Override
      public String toString() {
         return "DownloadFileRequest.DownloadFileRequestBuilder(url=" + this.url + ", target=" + this.target + ")";
      }
   }
}
