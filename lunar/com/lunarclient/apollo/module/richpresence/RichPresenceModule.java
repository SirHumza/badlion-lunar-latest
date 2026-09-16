package com.lunarclient.apollo.module.richpresence;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "rich_presence", name = "RichPresence")
@ApiStatus.NonExtendable
public abstract class RichPresenceModule extends ApolloModule {
   public abstract void overrideServerRichPresence(Recipients var1, ServerRichPresence var2);

   public abstract void resetServerRichPresence(Recipients var1);
}
