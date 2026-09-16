package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface GlobalPosOrBuilder extends MessageOrBuilder {
   String getDimension();

   ByteString getDimensionBytes();

   int getX();

   int getY();

   int getZ();
}
