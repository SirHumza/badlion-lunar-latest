package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.MessageOrBuilder;

public interface RendererPositionOrBuilder extends MessageOrBuilder {
   int getPositionX();

   int getPositionY();

   int getWidth();

   int getHeight();

   int getDisplayId();

   boolean getPrimaryDisplay();

   int getDisplayWidth();

   int getDisplayHeight();

   int getDisplayTypeValue();

   RendererPosition.DisplayType getDisplayType();
}
