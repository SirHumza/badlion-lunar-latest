package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface JoinHostedWorldPushOrBuilder extends MessageOrBuilder {
   boolean hasRelay();

   AddressAndPort getRelay();

   AddressAndPortOrBuilder getRelayOrBuilder();

   String getRelaySessionId();

   ByteString getRelaySessionIdBytes();

   boolean hasJoinerUuid();

   Uuid getJoinerUuid();

   UuidOrBuilder getJoinerUuidOrBuilder();

   boolean hasSimpleVoiceChatEndpoint();

   AddressAndPort getSimpleVoiceChatEndpoint();

   AddressAndPortOrBuilder getSimpleVoiceChatEndpointOrBuilder();
}
