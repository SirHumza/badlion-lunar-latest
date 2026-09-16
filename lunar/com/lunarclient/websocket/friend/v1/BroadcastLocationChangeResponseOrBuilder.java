package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.LocationOrBuilder;

public interface BroadcastLocationChangeResponseOrBuilder extends MessageOrBuilder {
   boolean hasNewLocation();

   Location getNewLocation();

   LocationOrBuilder getNewLocationOrBuilder();
}
