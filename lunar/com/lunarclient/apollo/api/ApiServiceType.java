package com.lunarclient.apollo.api;

import lombok.Generated;

public enum ApiServiceType {
   API("api.lunarclientprod.com/apollo/"),
   ANALYTICS("analytics.lunarclientprod.com/apollo/");

   private final String url;

   @Generated
   public String getUrl() {
      return this.url;
   }

   @Generated
   ApiServiceType(String var3) {
      this.url = var3;
   }
}
