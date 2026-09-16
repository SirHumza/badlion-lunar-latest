package com.lunarclient.apollo.module.tebex;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "tebex", name = "Tebex")
@ApiStatus.NonExtendable
public abstract class TebexModule extends ApolloModule {
   public abstract void displayTebexEmbeddedCheckout(Recipients var1, String var2);

   public abstract void displayTebexEmbeddedCheckout(Recipients var1, String var2, String var3);
}
