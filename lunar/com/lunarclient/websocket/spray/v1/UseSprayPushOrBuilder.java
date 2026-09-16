package com.lunarclient.websocket.spray.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Direction;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.common.v1.Vector3fOrBuilder;

public interface UseSprayPushOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   int getSprayId();

   boolean hasPos();

   Vector3f getPos();

   Vector3fOrBuilder getPosOrBuilder();

   int getFacingValue();

   Direction getFacing();

   float getRotation();

   int getMaxActiveSprays();
}
