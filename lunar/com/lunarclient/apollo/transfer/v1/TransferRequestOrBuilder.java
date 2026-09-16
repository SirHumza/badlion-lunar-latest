package com.lunarclient.apollo.transfer.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface TransferRequestOrBuilder extends MessageOrBuilder {
   ByteString getRequestId();

   String getServerIp();

   ByteString getServerIpBytes();
}
