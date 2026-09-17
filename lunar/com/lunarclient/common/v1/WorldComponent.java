package com.lunarclient.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface InboundHostedWorldOrBuilder extends MessageOrBuilder {
   boolean hasWorldHost();

   Uuid getWorldHost();

   UuidOrBuilder getWorldHostOrBuilder();
}
