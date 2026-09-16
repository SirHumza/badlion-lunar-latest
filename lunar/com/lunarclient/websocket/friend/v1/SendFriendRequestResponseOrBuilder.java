package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface SendFriendRequestResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   SendFriendRequestResponse.Status getStatus();

   boolean hasTarget();

   UuidAndUsername getTarget();

   UuidAndUsernameOrBuilder getTargetOrBuilder();

   boolean hasTargetLogoColor();

   Color getTargetLogoColor();

   ColorOrBuilder getTargetLogoColorOrBuilder();

   boolean hasTargetPlusColor();

   Color getTargetPlusColor();

   ColorOrBuilder getTargetPlusColorOrBuilder();

   String getTargetRankName();

   ByteString getTargetRankNameBytes();

   int getTargetBadgeId();
}
