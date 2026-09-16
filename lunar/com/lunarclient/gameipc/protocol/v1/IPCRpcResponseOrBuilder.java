package com.lunarclient.gameipc.protocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface IPCRpcResponseOrBuilder extends MessageOrBuilder {
   ByteString getRequestId();

   ByteString getOutput();
}
