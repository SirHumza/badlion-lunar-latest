package com.lunarclient.websocket.spray.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.common.v1.Vector3fOrBuilder;

public interface RemoveSprayRequestOrBuilder extends MessageOrBuilder {
   boolean hasPos();

   Vector3f getPos();

   Vector3fOrBuilder getPosOrBuilder();
}
