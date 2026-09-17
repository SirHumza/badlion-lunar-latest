package com.lunarclient.apollo.world;

import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.Collection;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.NonExtendable
public interface ApolloWorld extends Recipients {
   String getName();

   Collection<ApolloPlayer> getPlayers();
}
