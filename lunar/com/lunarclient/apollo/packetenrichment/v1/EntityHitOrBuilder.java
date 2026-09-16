package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.EntityId;
import com.lunarclient.apollo.common.v1.EntityIdOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;

public interface EntityHitOrBuilder extends MessageOrBuilder {
   boolean hasHitLocation();

   Location getHitLocation();

   LocationOrBuilder getHitLocationOrBuilder();

   boolean hasEntityId();

   EntityId getEntityId();

   EntityIdOrBuilder getEntityIdOrBuilder();
}
