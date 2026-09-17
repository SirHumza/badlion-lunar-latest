package com.lunarclient.gameipc.launch.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;

public interface LaunchGameRequestOrBuilder extends MessageOrBuilder {
   String getVersion();

   ByteString getVersionBytes();

   String getModule();

   ByteString getModuleBytes();

   String getAutoJoinServerIp();

   ByteString getAutoJoinServerIpBytes();

   int getLaunchSourceValue();

   LaunchGameRequest.LaunchSource getLaunchSource();

   boolean hasModpack();

   PlayerModpack getModpack();

   PlayerModpackOrBuilder getModpackOrBuilder();
}
