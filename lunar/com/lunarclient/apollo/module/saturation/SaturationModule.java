package com.lunarclient.apollo.module.saturation;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "saturation", name = "Saturation")
@ApiStatus.NonExtendable
public class SaturationModule extends ApolloModule {
   @Override
   public boolean isClientNotify() {
      return true;
   }
}
