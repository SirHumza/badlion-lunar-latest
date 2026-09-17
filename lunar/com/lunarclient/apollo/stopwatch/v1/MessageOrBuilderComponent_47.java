package com.lunarclient.apollo.stopwatch.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.hud.v1.HudPosition;
import com.lunarclient.apollo.hud.v1.HudPositionOrBuilder;

public interface AddTimerMessageOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getName();

   ByteString getNameBytes();

   boolean hasDuration();

   Duration getDuration();

   DurationOrBuilder getDurationOrBuilder();

   boolean getLoop();

   boolean getPreventModification();

   boolean getInGameNotification();

   boolean getHideWhenStopped();

   String getDisplayFormat();

   ByteString getDisplayFormatBytes();

   String getTitleTextAdventureJsonLines();

   ByteString getTitleTextAdventureJsonLinesBytes();

   boolean hasTextColor();

   Color getTextColor();

   ColorOrBuilder getTextColorOrBuilder();

   boolean hasHudPosition();

   HudPosition getHudPosition();

   HudPositionOrBuilder getHudPositionOrBuilder();
}
