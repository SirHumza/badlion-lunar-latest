package com.lunarclient.websocket.server.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface CheckServerRecommendationsRequestOrBuilder extends MessageOrBuilder {
   String getServerIp();

   ByteString getServerIpBytes();
}
