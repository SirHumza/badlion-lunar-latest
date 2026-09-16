package com.lunarclient.gameipc.location.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.InboundLocation;
import com.lunarclient.common.v1.InboundLocationOrBuilder;
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.LocationOrBuilder;

public interface UpdateLocationRequestOrBuilder extends MessageOrBuilder {
   boolean hasLocation();

   Location getLocation();

   LocationOrBuilder getLocationOrBuilder();

   boolean hasInboundLocation();

   InboundLocation getInboundLocation();

   InboundLocationOrBuilder getInboundLocationOrBuilder();
}
