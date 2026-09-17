package com.lunarclient.apollo.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface BlockLocationOrBuilder extends MessageOrBuilder {
   String getWorld();

   ByteString getWorldBytes();

   int getX();

   int getY();

   int getZ();
}
