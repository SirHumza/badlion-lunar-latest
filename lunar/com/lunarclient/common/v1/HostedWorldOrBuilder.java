package com.lunarclient.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface HostedWorldOrBuilder extends MessageOrBuilder {
   boolean hasWorldHost();

   UuidAndUsername getWorldHost();

   UuidAndUsernameOrBuilder getWorldHostOrBuilder();
}
