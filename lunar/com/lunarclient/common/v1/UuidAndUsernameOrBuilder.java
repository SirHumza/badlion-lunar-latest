package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface UuidAndUsernameOrBuilder extends MessageOrBuilder {
   boolean hasUuid();

   Uuid getUuid();

   UuidOrBuilder getUuidOrBuilder();

   String getUsername();

   ByteString getUsernameBytes();
}
