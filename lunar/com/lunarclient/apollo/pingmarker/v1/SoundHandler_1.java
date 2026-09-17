package com.lunarclient.apollo.pingmarker.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.common.v1.Icon;
import com.lunarclient.apollo.common.v1.IconOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import com.lunarclient.apollo.common.v1.Sound;
import com.lunarclient.apollo.common.v1.SoundOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface DisplayPlayerPingMessageOrBuilder extends MessageOrBuilder {
   boolean hasId();

   Uuid getId();

   UuidOrBuilder getIdOrBuilder();

   String getType();

   ByteString getTypeBytes();

   boolean hasLocation();

   Location getLocation();

   LocationOrBuilder getLocationOrBuilder();

   boolean hasColor();

   Color getColor();

   ColorOrBuilder getColorOrBuilder();

   boolean hasIcon();

   Icon getIcon();

   IconOrBuilder getIconOrBuilder();

   boolean hasSound();

   Sound getSound();

   SoundOrBuilder getSoundOrBuilder();

   boolean hasDuration();

   Duration getDuration();

   DurationOrBuilder getDurationOrBuilder();

   boolean getFocus();
}
