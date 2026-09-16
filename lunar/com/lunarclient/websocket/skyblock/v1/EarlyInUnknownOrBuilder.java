package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Vector2i;
import com.lunarclient.common.v1.Vector2iOrBuilder;

public interface EarlyInUnknownOrBuilder extends MessageOrBuilder {
   boolean hasPosition();

   Vector2i getPosition();

   Vector2iOrBuilder getPositionOrBuilder();
}
