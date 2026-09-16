package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface PreSendActionResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   PreSendActionResponse.Status getStatus();
}
