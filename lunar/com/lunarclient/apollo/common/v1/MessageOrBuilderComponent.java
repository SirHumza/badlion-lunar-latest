package com.lunarclient.apollo.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface Cuboid3DOrBuilder extends MessageOrBuilder {
   double getMinX();

   double getMinY();

   double getMinZ();

   double getMaxX();

   double getMaxY();

   double getMaxZ();
}
