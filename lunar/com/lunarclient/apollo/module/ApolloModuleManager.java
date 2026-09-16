package com.lunarclient.apollo.module;

import java.util.Collection;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public interface ApolloModuleManager {
   boolean isEnabled(Class<? extends ApolloModule> var1);

   <T extends ApolloModule> T getModule(Class<T> var1);

   Collection<ApolloModule> getModules();
}
