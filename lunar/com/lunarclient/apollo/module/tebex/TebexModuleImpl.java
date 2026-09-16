package com.lunarclient.apollo.module.tebex;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.tebex.v1.OpenTebexEmbeddedCheckoutMessage;
import lombok.NonNull;

public final class TebexModuleImpl extends TebexModule {
   @Override
   public void displayTebexEmbeddedCheckout(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("basketIdent is marked non-null but is null");
      }

      this.displayTebexEmbeddedCheckout(var1, var2, null);
   }

   @Override
   public void displayTebexEmbeddedCheckout(@NonNull Recipients var1, @NonNull String var2, String var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("basketIdent is marked non-null but is null");
      }

      OpenTebexEmbeddedCheckoutMessage.Builder var4 = OpenTebexEmbeddedCheckoutMessage.newBuilder().setBasketIdent(var2);
      if (var3 != null) {
         var4.setLocale(var3);
      }

      OpenTebexEmbeddedCheckoutMessage var5 = var4.build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }
}
