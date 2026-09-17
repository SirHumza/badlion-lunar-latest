package com.lunarclient.apollo.waypoint.v1;

import com.google.protobuf.MessageOrBuilder;

public interface WaypointTextStyleOrBuilder extends MessageOrBuilder {
   boolean getShowText();

   boolean getOnlyShowTextWhenLookingNear();

   boolean getShowIcons();

   float getTextIconScale();

   float getLabelScale();

   float getBoxPadding();

   boolean getBoxBorders();

   boolean getTextShadow();

   boolean getShowDistance();
}
