package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.InboundLocation;
import com.lunarclient.common.v1.InboundLocationOrBuilder;

public interface BroadcastLocationChangeRequestOrBuilder extends MessageOrBuilder {
   boolean hasNewLocation();

   InboundLocation getNewLocation();

   InboundLocationOrBuilder getNewLocationOrBuilder();

   int getTriggerValue();

   BroadcastLocationChangeRequest.Trigger getTrigger();
}
