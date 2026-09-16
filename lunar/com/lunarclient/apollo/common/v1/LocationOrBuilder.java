package com.lunarclient.apollo.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface LocationOrBuilder extends MessageOrBuilder {
   String getWorld();

   ByteString getWorldBytes();

   double getX();

   double getY();

   double getZ();
}
