package com.lunarclient.apollo.pingmarker.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface RequestPlayerPingMessageOrBuilder extends MessageOrBuilder {
   boolean hasId();

   Uuid getId();

   UuidOrBuilder getIdOrBuilder();

   String getType();

   ByteString getTypeBytes();

   boolean hasSourceLocation();

   Location getSourceLocation();

   LocationOrBuilder getSourceLocationOrBuilder();

   boolean hasTargetLocation();

   Location getTargetLocation();

   LocationOrBuilder getTargetLocationOrBuilder();
}
