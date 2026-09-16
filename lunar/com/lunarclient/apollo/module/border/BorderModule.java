package com.lunarclient.apollo.module.border;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "border", name = "Border")
@ApiStatus.NonExtendable
public abstract class BorderModule extends ApolloModule {
   public abstract void displayBorder(Recipients var1, Border var2);

   public abstract void removeBorder(Recipients var1, String var2);

   public abstract void removeBorder(Recipients var1, Border var2);

   public abstract void resetBorders(Recipients var1);
}
