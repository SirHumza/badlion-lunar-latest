package com.lunarclient.apollo.cosmetic.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.common.v1.BlockLocationOrBuilder;

public interface RemoveSprayMessageOrBuilder extends MessageOrBuilder {
   int getSprayId();

   boolean hasLocation();

   BlockLocation getLocation();

   BlockLocationOrBuilder getLocationOrBuilder();
}
