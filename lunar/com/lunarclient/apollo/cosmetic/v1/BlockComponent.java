package com.lunarclient.apollo.cosmetic.v1;

import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.common.v1.BlockLocationOrBuilder;
import com.lunarclient.apollo.packetenrichment.v1.Direction;

public interface DisplaySprayMessageOrBuilder extends MessageOrBuilder {
   int getSprayId();

   boolean hasLocation();

   BlockLocation getLocation();

   BlockLocationOrBuilder getLocationOrBuilder();

   int getFacingValue();

   Direction getFacing();

   float getRotation();

   boolean hasDuration();

   Duration getDuration();

   DurationOrBuilder getDurationOrBuilder();
}
