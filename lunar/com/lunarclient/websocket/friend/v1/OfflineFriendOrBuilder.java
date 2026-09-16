package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface OfflineFriendOrBuilder extends MessageOrBuilder {
   boolean hasPlayer();

   UuidAndUsername getPlayer();

   UuidAndUsernameOrBuilder getPlayerOrBuilder();

   boolean hasLastVisibleOnline();

   Timestamp getLastVisibleOnline();

   TimestampOrBuilder getLastVisibleOnlineOrBuilder();

   boolean hasLogoColor();

   Color getLogoColor();

   ColorOrBuilder getLogoColorOrBuilder();

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
