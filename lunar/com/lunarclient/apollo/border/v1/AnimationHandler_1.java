package com.lunarclient.apollo.border.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.common.v1.Cuboid2D;
import com.lunarclient.apollo.common.v1.Cuboid2DOrBuilder;

public interface DisplayBorderMessageOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getWorld();

   ByteString getWorldBytes();

   boolean getCancelEntry();

   boolean getCancelExit();

   boolean getCanShrinkOrExpand();

   boolean hasColor();

   Color getColor();

   ColorOrBuilder getColorOrBuilder();

   boolean hasBounds();

   Cuboid2D getBounds();

   Cuboid2DOrBuilder getBoundsOrBuilder();

   int getDurationTicks();
}
