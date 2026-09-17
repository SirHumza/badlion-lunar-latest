package com.lunarclient.apollo.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface PlayerLocationOrBuilder extends MessageOrBuilder {
   boolean hasLocation();

   Location getLocation();

   LocationOrBuilder getLocationOrBuilder();

   float getYaw();

   float getPitch();
}
