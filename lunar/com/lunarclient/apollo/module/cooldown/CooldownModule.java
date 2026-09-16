package com.lunarclient.apollo.module.cooldown;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "cooldown", name = "Cooldown")
@ApiStatus.NonExtendable
public abstract class CooldownModule extends ApolloModule {
   public abstract void displayCooldown(Recipients var1, Cooldown var2);

   public abstract void removeCooldown(Recipients var1, String var2);

   public abstract void removeCooldown(Recipients var1, Cooldown var2);

   public abstract void resetCooldowns(Recipients var1);
}
