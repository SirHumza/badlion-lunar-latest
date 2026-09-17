package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface PreJoinHostedWorldResponseOrBuilder extends MessageOrBuilder {
   List<AddressAndPort> getRelaysToPingList();

   AddressAndPort getRelaysToPing(int var1);

   int getRelaysToPingCount();

   List<? extends AddressAndPortOrBuilder> getRelaysToPingOrBuilderList();

   AddressAndPortOrBuilder getRelaysToPingOrBuilder(int var1);
}
