package com.lunarclient.websocket.marker.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface BroadcastNewMarkerRequestOrBuilder extends MessageOrBuilder {
   boolean hasMarker();

   Marker getMarker();

   MarkerOrBuilder getMarkerOrBuilder();

   List<Uuid> getReceiverUuidsList();

   Uuid getReceiverUuids(int var1);

   int getReceiverUuidsCount();

   List<? extends UuidOrBuilder> getReceiverUuidsOrBuilderList();

   UuidOrBuilder getReceiverUuidsOrBuilder(int var1);
}
