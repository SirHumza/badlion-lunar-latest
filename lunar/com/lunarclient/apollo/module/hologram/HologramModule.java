package com.lunarclient.apollo.module.hologram;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "hologram", name = "Hologram")
@ApiStatus.NonExtendable
public abstract class HologramModule extends ApolloModule {
   public abstract void displayHologram(Recipients var1, Hologram var2);

   public abstract void removeHologram(Recipients var1, String var2);

   public abstract void removeHologram(Recipients var1, Hologram var2);

   public abstract void resetHolograms(Recipients var1);
}
