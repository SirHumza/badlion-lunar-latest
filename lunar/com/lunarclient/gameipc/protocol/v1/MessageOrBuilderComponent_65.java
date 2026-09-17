package com.lunarclient.gameipc.protocol.v1;

import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.MessageOrBuilder;

public interface GameboundIPCMessageOrBuilder extends MessageOrBuilder {
   boolean hasRpcResponse();

   IPCRpcResponse getRpcResponse();

   IPCRpcResponseOrBuilder getRpcResponseOrBuilder();

   boolean hasPushNotification();

   Any getPushNotification();

   AnyOrBuilder getPushNotificationOrBuilder();

   GameboundIPCMessage.ContentsCase getContentsCase();
}
