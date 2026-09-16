package com.lunarclient.apollo.module.nametag;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.UUID;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "nametag", name = "Nametag")
@ApiStatus.NonExtendable
public abstract class NametagModule extends ApolloModule {
   public abstract void overrideNametag(Recipients var1, UUID var2, Nametag var3);

   public abstract void resetNametag(Recipients var1, UUID var2);

   public abstract void resetNametags(Recipients var1);
}
