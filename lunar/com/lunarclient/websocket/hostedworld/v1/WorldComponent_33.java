package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface HostedWorldAvailablePushOrBuilder extends MessageOrBuilder {
   boolean hasWorldHost();

   UuidAndUsername getWorldHost();

   UuidAndUsernameOrBuilder getWorldHostOrBuilder();
}
