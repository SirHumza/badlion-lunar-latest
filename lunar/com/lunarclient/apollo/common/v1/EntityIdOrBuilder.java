package com.lunarclient.apollo.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface EntityIdOrBuilder extends MessageOrBuilder {
   int getEntityId();

   boolean hasEntityUuid();

   Uuid getEntityUuid();

   UuidOrBuilder getEntityUuidOrBuilder();
}
