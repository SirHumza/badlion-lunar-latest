package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.MessageOrBuilder;

public interface PlayerUseItemBucketMessageOrBuilder extends MessageOrBuilder {
   boolean hasPacketInfo();

   PacketInfo getPacketInfo();

   PacketInfoOrBuilder getPacketInfoOrBuilder();

   boolean hasPlayerInfo();

   PlayerInfo getPlayerInfo();

   PlayerInfoOrBuilder getPlayerInfoOrBuilder();

   boolean hasRayTraceResult();

   RayTraceResult getRayTraceResult();

   RayTraceResultOrBuilder getRayTraceResultOrBuilder();
}
