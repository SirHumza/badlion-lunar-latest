package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface ConversationParticipantOrBuilder extends MessageOrBuilder {
   boolean hasPlayer();

   UuidAndUsername getPlayer();

   UuidAndUsernameOrBuilder getPlayerOrBuilder();

   boolean hasLogoColor();

   Color getLogoColor();

   ColorOrBuilder getLogoColorOrBuilder();

   boolean hasPlusColor();

   Color getPlusColor();

   ColorOrBuilder getPlusColorOrBuilder();

   String getRankName();

   ByteString getRankNameBytes();

   boolean getIsRadioPremium();

   int getBadgeId();
}
