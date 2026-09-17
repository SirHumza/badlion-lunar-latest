package com.lunarclient.apollo.transfer.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface PingRequestOrBuilder extends MessageOrBuilder {
   ByteString getRequestId();

   List<String> getServerIpsList();

   int getServerIpsCount();

   String getServerIps(int var1);

   ByteString getServerIpsBytes(int var1);
}
