package com.lunarclient.apollo.world;

import java.util.Collection;
import java.util.Optional;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public interface ApolloWorldManager {
   Optional<ApolloWorld> getWorld(String var1);

   Collection<ApolloWorld> getWorlds();
}
