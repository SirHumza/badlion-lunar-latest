package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.PlayerLocation;
import com.lunarclient.apollo.common.v1.PlayerLocationOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface PlayerInfoOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   boolean hasLocation();

   PlayerLocation getLocation();

   PlayerLocationOrBuilder getLocationOrBuilder();

   boolean getSneaking();

   boolean getSprinting();

   boolean getJumping();

   float getForwardSpeed();

   float getStrafeSpeed();
}
