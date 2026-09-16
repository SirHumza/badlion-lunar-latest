package com.lunarclient.apollo.waypoint.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.common.v1.BlockLocationOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;

public interface DisplayWaypointMessageOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();

   boolean hasLocation();

   BlockLocation getLocation();

   BlockLocationOrBuilder getLocationOrBuilder();

   boolean hasColor();

   Color getColor();

   ColorOrBuilder getColorOrBuilder();

   boolean getPreventRemoval();

   boolean getHidden();

   boolean getShowBeam();

   boolean getHighlightBlock();

   float getHighlightBlockLineWidth();

   boolean hasStyle();

   WaypointTextStyle getStyle();

   WaypointTextStyleOrBuilder getStyleOrBuilder();
}
