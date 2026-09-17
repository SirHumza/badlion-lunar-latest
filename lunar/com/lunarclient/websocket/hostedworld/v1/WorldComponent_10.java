package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   boolean getHostingEnabled();

   boolean getJoiningEnabled();

   int getMaxWorldPlayerCount();

   List<AddressAndPort> getPingRequestsList();

   AddressAndPort getPingRequests(int var1);

   int getPingRequestsCount();

   List<? extends AddressAndPortOrBuilder> getPingRequestsOrBuilderList();

   AddressAndPortOrBuilder getPingRequestsOrBuilder(int var1);

   int getMultiplayerRefreshIntervalSeconds();
}
