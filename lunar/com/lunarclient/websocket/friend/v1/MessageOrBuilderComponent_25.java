package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface FriendRequestReceivedPushOrBuilder extends MessageOrBuilder {
   boolean hasSender();

   UuidAndUsername getSender();

   UuidAndUsernameOrBuilder getSenderOrBuilder();

   boolean hasSenderLogoColor();

   Color getSenderLogoColor();

   ColorOrBuilder getSenderLogoColorOrBuilder();

   boolean hasSenderPlusColor();

   Color getSenderPlusColor();

   ColorOrBuilder getSenderPlusColorOrBuilder();

   String getSenderRankName();

   ByteString getSenderRankNameBytes();

   int getSenderBadgeId();
}
