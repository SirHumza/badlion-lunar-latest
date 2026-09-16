package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.MessageOrBuilder;

public interface PlayerUseItemMessageOrBuilder extends MessageOrBuilder {
   boolean hasPacketInfo();

   PacketInfo getPacketInfo();

   PacketInfoOrBuilder getPacketInfoOrBuilder();

   boolean hasPlayerInfo();

   PlayerInfo getPlayerInfo();

   PlayerInfoOrBuilder getPlayerInfoOrBuilder();

   boolean getMainHand();
}
