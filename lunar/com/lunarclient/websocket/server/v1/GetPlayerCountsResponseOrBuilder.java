package com.lunarclient.websocket.server.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface GetPlayerCountsResponseOrBuilder extends MessageOrBuilder {
   List<GetPlayerCountsResponse.Server> getServersList();

   GetPlayerCountsResponse.Server getServers(int var1);

   int getServersCount();

   List<? extends GetPlayerCountsResponse.ServerOrBuilder> getServersOrBuilderList();

   GetPlayerCountsResponse.ServerOrBuilder getServersOrBuilder(int var1);
}
