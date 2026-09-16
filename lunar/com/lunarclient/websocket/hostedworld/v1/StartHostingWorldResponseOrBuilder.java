package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface StartHostingWorldResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   StartHostingWorldResponse.Status getStatus();

   String getJoinIp();

   ByteString getJoinIpBytes();
}
