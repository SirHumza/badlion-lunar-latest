package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface PlayerTargetOrBuilder extends MessageOrBuilder {
   boolean hasUuid();

   Uuid getUuid();

   UuidOrBuilder getUuidOrBuilder();

   String getName();

   ByteString getNameBytes();
}
