package com.lunarclient.apollo.cooldown.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;

public interface CooldownStyleOrBuilder extends MessageOrBuilder {
   boolean hasCircleStartColor();

   Color getCircleStartColor();

   ColorOrBuilder getCircleStartColorOrBuilder();

   boolean hasCircleEndColor();

   Color getCircleEndColor();

   ColorOrBuilder getCircleEndColorOrBuilder();

   boolean hasCircleEdgeColor();

   Color getCircleEdgeColor();

   ColorOrBuilder getCircleEdgeColorOrBuilder();

   boolean hasTextColor();

   Color getTextColor();

   ColorOrBuilder getTextColorOrBuilder();
}
