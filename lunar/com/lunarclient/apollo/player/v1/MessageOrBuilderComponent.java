package com.lunarclient.apollo.player.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

@Deprecated
public interface ModMessageOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getName();

   ByteString getNameBytes();

   String getVersion();

   ByteString getVersionBytes();

   int getTypeValue();

   ModMessage.Type getType();
}
