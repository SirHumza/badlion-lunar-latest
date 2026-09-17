package com.lunarclient.websocket.protocol.v1;

import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.MessageOrBuilder;

public interface ClientboundWebSocketMessageOrBuilder extends MessageOrBuilder {
   boolean hasRpcResponse();

   WebSocketRpcResponse getRpcResponse();

   WebSocketRpcResponseOrBuilder getRpcResponseOrBuilder();

   boolean hasPushNotification();

   Any getPushNotification();

   AnyOrBuilder getPushNotificationOrBuilder();

   ClientboundWebSocketMessage.ContentsCase getContentsCase();
}
