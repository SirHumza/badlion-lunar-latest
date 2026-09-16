package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.MessageOrBuilder;

public interface JoinHostedWorldResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   JoinHostedWorldResponse.Status getStatus();

   boolean hasRelay();

   AddressAndPort getRelay();

   AddressAndPortOrBuilder getRelayOrBuilder();

   int getJoinabilityValue();

   Joinability getJoinability();
}
