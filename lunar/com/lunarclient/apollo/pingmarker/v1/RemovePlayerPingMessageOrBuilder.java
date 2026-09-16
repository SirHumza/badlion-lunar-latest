package com.lunarclient.apollo.pingmarker.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface RemovePlayerPingMessageOrBuilder extends MessageOrBuilder {
   boolean hasId();

   Uuid getId();

   UuidOrBuilder getIdOrBuilder();
}
