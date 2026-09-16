package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;

public interface PacketInfoOrBuilder extends MessageOrBuilder {
   boolean hasInstantiationTime();

   Timestamp getInstantiationTime();

   TimestampOrBuilder getInstantiationTimeOrBuilder();
}
