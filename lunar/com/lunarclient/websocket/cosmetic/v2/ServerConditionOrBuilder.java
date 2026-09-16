package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ServerConditionOrBuilder extends MessageOrBuilder {
   String getServerIp();

   ByteString getServerIpBytes();
}
