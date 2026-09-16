package com.lunarclient.apollo.transfer.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PingDataOrBuilder extends MessageOrBuilder {
   String getServerIp();

   ByteString getServerIpBytes();

   int getStatusValue();

   PingData.Status getStatus();

   int getPing();
}
