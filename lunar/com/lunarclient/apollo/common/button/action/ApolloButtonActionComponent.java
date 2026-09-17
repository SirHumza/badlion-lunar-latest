package com.lunarclient.apollo.common.button.action;

import lombok.Generated;

public final class OpenUrlAction extends ApolloButtonAction {
   private final String url;

   @Generated
   public String getUrl() {
      return this.url;
   }

   @Generated
   OpenUrlAction(String var1) {
      this.url = var1;
   }
}
