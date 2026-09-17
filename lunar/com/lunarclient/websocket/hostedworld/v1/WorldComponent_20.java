package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ListHostedWorldsResponseOrBuilder extends MessageOrBuilder {
   List<ListHostedWorldsResponse.HostedWorld> getHostedWorldsList();

   ListHostedWorldsResponse.HostedWorld getHostedWorlds(int var1);

   int getHostedWorldsCount();

   List<? extends ListHostedWorldsResponse.HostedWorldOrBuilder> getHostedWorldsOrBuilderList();

   ListHostedWorldsResponse.HostedWorldOrBuilder getHostedWorldsOrBuilder(int var1);
}
