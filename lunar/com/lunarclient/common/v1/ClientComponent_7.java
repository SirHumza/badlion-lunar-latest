package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface MinecraftVersionOrBuilder extends MessageOrBuilder {
   String getEnum();

   ByteString getEnumBytes();

   int getTypeValue();

   MinecraftVersion.MinecraftVersionType getType();

   String getId();

   ByteString getIdBytes();
}
