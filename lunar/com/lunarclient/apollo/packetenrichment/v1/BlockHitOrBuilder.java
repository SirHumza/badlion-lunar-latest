package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.common.v1.BlockLocationOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;

public interface BlockHitOrBuilder extends MessageOrBuilder {
   boolean hasHitLocation();

   Location getHitLocation();

   LocationOrBuilder getHitLocationOrBuilder();

   boolean hasBlockLocation();

   BlockLocation getBlockLocation();

   BlockLocationOrBuilder getBlockLocationOrBuilder();

   int getDirectionValue();

   Direction getDirection();
}
