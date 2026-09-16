package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface ConfirmHostedWorldJoinRequestOrBuilder extends MessageOrBuilder {
   boolean hasWorldHostUuid();

   Uuid getWorldHostUuid();

   UuidOrBuilder getWorldHostUuidOrBuilder();
}
