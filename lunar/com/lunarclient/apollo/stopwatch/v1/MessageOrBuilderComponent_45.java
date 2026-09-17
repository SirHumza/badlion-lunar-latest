package com.lunarclient.apollo.stopwatch.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.hud.v1.HudPosition;
import com.lunarclient.apollo.hud.v1.HudPositionOrBuilder;

public interface AddStopwatchMessageOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getName();

   ByteString getNameBytes();

   boolean getResetOnStart();

   boolean getPreventModification();

   boolean getHideWhenStopped();

   String getDisplayFormat();

   ByteString getDisplayFormatBytes();

   boolean hasTextColor();

   Color getTextColor();

   ColorOrBuilder getTextColorOrBuilder();

   boolean hasHudPosition();

   HudPosition getHudPosition();

   HudPositionOrBuilder getHudPositionOrBuilder();
}
