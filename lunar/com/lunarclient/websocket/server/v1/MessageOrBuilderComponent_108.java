package com.lunarclient.websocket.server.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface CheckAuthorizedFeaturesRequestOrBuilder extends MessageOrBuilder {
   String getServerIp();

   ByteString getServerIpBytes();
}
