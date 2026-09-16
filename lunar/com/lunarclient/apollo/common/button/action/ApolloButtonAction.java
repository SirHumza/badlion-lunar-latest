package com.lunarclient.apollo.common.button.action;

import lombok.Generated;
import lombok.NonNull;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public abstract class ApolloButtonAction {
   public static RunCommandAction runCommand(@NonNull String var0) {
      if (var0 == null) {
         throw new NullPointerException("command is marked non-null but is null");
      } else {
         return new RunCommandAction(var0);
      }
   }

   public static OpenUrlAction openUrl(@NonNull String var0) {
      if (var0 == null) {
         throw new NullPointerException("url is marked non-null but is null");
      } else {
         return new OpenUrlAction(var0);
      }
   }

   public static ClientAction clientAction(@NonNull ApolloButtonClientAction var0) {
      if (var0 == null) {
         throw new NullPointerException("action is marked non-null but is null");
      } else {
         return new ClientAction(var0);
      }
   }

   @Generated
   ApolloButtonAction() {
   }
}
