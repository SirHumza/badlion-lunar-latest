package com.lunarclient.apollo.team.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.common.v1.Component;
import com.lunarclient.apollo.common.v1.ComponentOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface TeamMemberOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   @Deprecated
   boolean hasPlayerDisplayName();

   @Deprecated
   Component getPlayerDisplayName();

   @Deprecated
   ComponentOrBuilder getPlayerDisplayNameOrBuilder();

   boolean hasLocation();

   Location getLocation();

   LocationOrBuilder getLocationOrBuilder();

   boolean hasMarkerColor();

   Color getMarkerColor();

   ColorOrBuilder getMarkerColorOrBuilder();

   String getAdventureJsonPlayerName();

   ByteString getAdventureJsonPlayerNameBytes();
}
