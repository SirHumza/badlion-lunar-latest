package com.lunarclient.apollo.module.paynow;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "pay_now", name = "PayNow")
@ApiStatus.NonExtendable
public abstract class PayNowModule extends ApolloModule {
   public abstract void displayPayNowEmbeddedCheckout(Recipients var1, String var2);
}
