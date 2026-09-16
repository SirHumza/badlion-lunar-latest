package com.lunarclient.apollo.module.beam;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "beam", name = "Beam")
@ApiStatus.NonExtendable
public abstract class BeamModule extends ApolloModule {
   public abstract void displayBeam(Recipients var1, Beam var2);

   public abstract void removeBeam(Recipients var1, String var2);

   public abstract void removeBeam(Recipients var1, Beam var2);

   public abstract void resetBeams(Recipients var1);
}
