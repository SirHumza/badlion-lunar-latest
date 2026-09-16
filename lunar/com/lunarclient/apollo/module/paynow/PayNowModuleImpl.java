package com.lunarclient.apollo.module.paynow;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.paynow.v1.OpenPayNowEmbeddedCheckoutMessage;
import com.lunarclient.apollo.recipients.Recipients;
import lombok.NonNull;

public final class PayNowModuleImpl extends PayNowModule {
   @Override
   public void displayPayNowEmbeddedCheckout(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("checkoutToken is marked non-null but is null");
      }

      OpenPayNowEmbeddedCheckoutMessage var3 = OpenPayNowEmbeddedCheckoutMessage.newBuilder().setCheckoutToken(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }
}
