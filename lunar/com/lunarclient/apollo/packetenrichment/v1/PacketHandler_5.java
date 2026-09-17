package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.MessageOrBuilder;

public interface PlayerChatOpenMessageOrBuilder extends MessageOrBuilder {
   boolean hasPlayerInfo();

   PlayerInfo getPlayerInfo();

   PlayerInfoOrBuilder getPlayerInfoOrBuilder();

   boolean hasPacketInfo();

   PacketInfo getPacketInfo();

   PacketInfoOrBuilder getPacketInfoOrBuilder();
}
