package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.LocationOrBuilder;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.websocket.hostedworld.v1.Joinability;

public interface OnlineFriendOrBuilder extends MessageOrBuilder {
   boolean hasPlayer();

   UuidAndUsername getPlayer();

   UuidAndUsernameOrBuilder getPlayerOrBuilder();

   int getStatusValue();

   OnlineFriendStatus getStatus();

   boolean hasLocation();

   Location getLocation();

   LocationOrBuilder getLocationOrBuilder();

   boolean hasMinecraftVersion();

   MinecraftVersion getMinecraftVersion();

   MinecraftVersionOrBuilder getMinecraftVersionOrBuilder();

   boolean getJustCameOnline();

   int getHostedWorldJoinabilityValue();

   Joinability getHostedWorldJoinability();

   boolean hasLogoColor();

   Color getLogoColor();

   ColorOrBuilder getLogoColorOrBuilder();

   boolean hasModpack();

   PlayerModpack getModpack();

   PlayerModpackOrBuilder getModpackOrBuilder();

   boolean hasPlusColor();

   Color getPlusColor();

   ColorOrBuilder getPlusColorOrBuilder();

   boolean getIsRadioPremium();

   boolean hasFriendsSince();

   Timestamp getFriendsSince();

   TimestampOrBuilder getFriendsSinceOrBuilder();

   boolean hasSocials();

   FriendSocials getSocials();

   FriendSocialsOrBuilder getSocialsOrBuilder();

   String getRankName();

   ByteString getRankNameBytes();

   String getCountryCode();

   ByteString getCountryCodeBytes();

   int getBadgeId();
}
