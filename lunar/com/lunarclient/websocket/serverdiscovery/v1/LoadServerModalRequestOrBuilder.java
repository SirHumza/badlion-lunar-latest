package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface LoadServerModalRequestOrBuilder extends MessageOrBuilder {
   String getServerMappingsId();

   ByteString getServerMappingsIdBytes();
}
