package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface FriendRequestOrBuilder extends MessageOrBuilder {
   boolean hasPlayer();

   UuidAndUsername getPlayer();

   UuidAndUsernameOrBuilder getPlayerOrBuilder();

   boolean hasSentAt();

   Timestamp getSentAt();

   TimestampOrBuilder getSentAtOrBuilder();

   boolean hasPlayerLogoColor();

   Color getPlayerLogoColor();

   ColorOrBuilder getPlayerLogoColorOrBuilder();

   boolean hasPlayerPlusColor();

   Color getPlayerPlusColor();

   ColorOrBuilder getPlayerPlusColorOrBuilder();

   String getPlayerRankName();

   ByteString getPlayerRankNameBytes();

   int getPlayerBadgeId();
}
