package com.lunarclient.apollo.module.glint;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "glint", name = "Glint")
@ApiStatus.NonExtendable
public class GlintModule extends ApolloModule {
   @Override
   public boolean isClientNotify() {
      return true;
   }
}
