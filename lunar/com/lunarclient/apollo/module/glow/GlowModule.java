package com.lunarclient.apollo.module.glow;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import java.awt.Color;
import java.util.UUID;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "glow", name = "Glow")
@ApiStatus.NonExtendable
public abstract class GlowModule extends ApolloModule {
   @Override
   public boolean isClientNotify() {
      return true;
   }

   public abstract void overrideGlow(Recipients var1, UUID var2);

   public abstract void overrideGlow(Recipients var1, UUID var2, Color var3);

   public abstract void resetGlow(Recipients var1, UUID var2);

   public abstract void resetGlow(Recipients var1);
}
