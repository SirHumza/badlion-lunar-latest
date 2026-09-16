package com.lunarclient.gameipc.launch.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PlayServerPushOrBuilder extends MessageOrBuilder {
   String getAutoJoinServerIp();

   ByteString getAutoJoinServerIpBytes();
}
