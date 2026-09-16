package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;

public interface TimeConditionOrBuilder extends MessageOrBuilder {
   int getTimeValue();

   TimeCondition.Time getTime();
}
