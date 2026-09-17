package com.lunarclient.gameipc.protocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface LauncherboundIPCMessageOrBuilder extends MessageOrBuilder {
   ByteString getRequestId();

   String getService();

   ByteString getServiceBytes();

   String getMethod();

   ByteString getMethodBytes();

   ByteString getInput();

   String getFullMethod();

   ByteString getFullMethodBytes();

   String getInputName();

   ByteString getInputNameBytes();

   String getInputFullName();

   ByteString getInputFullNameBytes();
}
