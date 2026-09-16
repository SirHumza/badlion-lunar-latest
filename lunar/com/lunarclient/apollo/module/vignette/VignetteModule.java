package com.lunarclient.apollo.module.vignette;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "vignette", name = "Vignette")
@ApiStatus.NonExtendable
public abstract class VignetteModule extends ApolloModule {
   public abstract void displayVignette(Recipients var1, Vignette var2);

   public abstract void resetVignette(Recipients var1);
}
