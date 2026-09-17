package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface SearchServersResponseOrBuilder extends MessageOrBuilder {
   List<ServerCard> getServersList();

   ServerCard getServers(int var1);

   int getServersCount();

   List<? extends ServerCardOrBuilder> getServersOrBuilderList();

   ServerCardOrBuilder getServersOrBuilder(int var1);
}
