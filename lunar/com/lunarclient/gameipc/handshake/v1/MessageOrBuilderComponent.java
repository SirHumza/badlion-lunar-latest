package com.lunarclient.gameipc.handshake.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface HandshakeOrBuilder extends MessageOrBuilder {
   String getLaunchId();

   ByteString getLaunchIdBytes();

   String getProcessId();

   ByteString getProcessIdBytes();

   String getInstallationId();

   ByteString getInstallationIdBytes();
}
