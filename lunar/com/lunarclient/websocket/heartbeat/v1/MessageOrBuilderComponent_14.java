package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OpenRendererOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getRoute();

   ByteString getRouteBytes();

   String getTitle();

   ByteString getTitleBytes();

   boolean getFocused();

   boolean getVisible();

   boolean getFullscreened();

   boolean getMinimized();

   boolean hasPosition();

   RendererPosition getPosition();

   RendererPositionOrBuilder getPositionOrBuilder();

   int getContentTypeValue();

   OpenRenderer.ContentType getContentType();
}
