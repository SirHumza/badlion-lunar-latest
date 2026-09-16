package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface RemovePinnedMessageResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   RemovePinnedMessageResponse.Status getStatus();
}
