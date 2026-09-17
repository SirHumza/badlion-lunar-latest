package com.lunarclient.websocket.spray.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Direction;
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.common.v1.Vector3fOrBuilder;

public interface UseSprayRequestOrBuilder extends MessageOrBuilder {
   int getSprayId();

   boolean hasPos();

   Vector3f getPos();

   Vector3fOrBuilder getPosOrBuilder();

   int getFacingValue();

   Direction getFacing();

   float getRotation();
}
