package com.lunarclient.websocket.protocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface WebSocketRichClosePushOrBuilder extends MessageOrBuilder {
   int getReconnectDelayValue();

   WebSocketRichClosePush.ReconnectDelay getReconnectDelay();

   String getReason();

   ByteString getReasonBytes();

   String getReconnectAuthenticatorJwt();

   ByteString getReconnectAuthenticatorJwtBytes();
}
