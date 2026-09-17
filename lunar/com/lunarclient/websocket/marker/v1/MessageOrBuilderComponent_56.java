package com.lunarclient.websocket.marker.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface NewMarkerPushOrBuilder extends MessageOrBuilder {
   boolean hasSenderUuid();

   Uuid getSenderUuid();

   UuidOrBuilder getSenderUuidOrBuilder();

   boolean hasMarker();

   Marker getMarker();

   MarkerOrBuilder getMarkerOrBuilder();
}
