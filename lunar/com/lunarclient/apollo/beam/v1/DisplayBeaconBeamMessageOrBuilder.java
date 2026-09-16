package com.lunarclient.apollo.beam.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.common.v1.BlockLocationOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;

public interface DisplayBeaconBeamMessageOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   boolean hasColor();

   Color getColor();

   ColorOrBuilder getColorOrBuilder();

   boolean hasLocation();

   BlockLocation getLocation();

   BlockLocationOrBuilder getLocationOrBuilder();
}
