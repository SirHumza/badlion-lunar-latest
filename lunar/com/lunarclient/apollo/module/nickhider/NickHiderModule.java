package com.lunarclient.apollo.module.nickhider;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "nick_hider", name = "NickHider")
@ApiStatus.NonExtendable
public abstract class NickHiderModule extends ApolloModule {
   public abstract void overrideNick(Recipients var1, String var2);

   public abstract void resetNick(Recipients var1);
}
