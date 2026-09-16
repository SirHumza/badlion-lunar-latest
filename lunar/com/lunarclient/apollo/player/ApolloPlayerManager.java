package com.lunarclient.apollo.player;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;
import lombok.NonNull;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public interface ApolloPlayerManager {
   default boolean hasSupport(@NonNull UUID var1) {
      if (var1 == null) {
         throw new NullPointerException("playerIdentifier is marked non-null but is null");
      } else {
         return this.getPlayer(var1).isPresent();
      }
   }

   Optional<ApolloPlayer> getPlayer(UUID var1);

   Collection<ApolloPlayer> getPlayers();
}
