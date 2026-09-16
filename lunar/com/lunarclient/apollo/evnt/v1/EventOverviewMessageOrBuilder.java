package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface EventOverviewMessageOrBuilder extends MessageOrBuilder {
   List<EventPlayerMessage> getPlayersList();

   EventPlayerMessage getPlayers(int var1);

   int getPlayersCount();

   List<? extends EventPlayerMessageOrBuilder> getPlayersOrBuilderList();

   EventPlayerMessageOrBuilder getPlayersOrBuilder(int var1);
}
