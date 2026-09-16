package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.MessageOrBuilder;

public interface PlayerAttackMessageOrBuilder extends MessageOrBuilder {
   boolean hasPacketInfo();

   PacketInfo getPacketInfo();

   PacketInfoOrBuilder getPacketInfoOrBuilder();

   boolean hasTargetInfo();

   PlayerInfo getTargetInfo();

   PlayerInfoOrBuilder getTargetInfoOrBuilder();

   boolean hasAttackerInfo();

   PlayerInfo getAttackerInfo();

   PlayerInfoOrBuilder getAttackerInfoOrBuilder();

   double getDistance();
}
