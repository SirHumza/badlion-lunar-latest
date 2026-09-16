package com.lunarclient.apollo.common.button.action;

import lombok.Generated;

public final class ClientAction extends ApolloButtonAction {
   private final ApolloButtonClientAction action;

   @Generated
   public ApolloButtonClientAction getAction() {
      return this.action;
   }

   @Generated
   ClientAction(ApolloButtonClientAction var1) {
      this.action = var1;
   }
}
