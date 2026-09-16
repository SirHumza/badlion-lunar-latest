package com.lunarclient.websocket.handshake.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface InstalledModOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getName();

   ByteString getNameBytes();

   String getVersion();

   ByteString getVersionBytes();

   int getTypeValue();

   InstalledMod.Type getType();
}
