package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface SearchServersRequestOrBuilder extends MessageOrBuilder {
   String getQuery();

   ByteString getQueryBytes();
}
