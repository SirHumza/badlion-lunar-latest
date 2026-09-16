package com.lunarclient.apollo.marker.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;

public interface InterestMarkerOrBuilder extends MessageOrBuilder {
   boolean hasColor();

   Color getColor();

   ColorOrBuilder getColorOrBuilder();
}
