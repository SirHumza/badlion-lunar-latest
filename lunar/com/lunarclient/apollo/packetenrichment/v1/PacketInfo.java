package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class WorldProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemMessage_descriptor, new String[]{"PacketInfo", "PlayerInfo", "MainHand"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemBucketMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemBucketMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemBucketMessage_descriptor, new String[]{"PacketInfo", "PlayerInfo", "RayTraceResult"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private WorldProto() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n2lunarclient/apollo/packetenrichment/v1/world.proto\u0012&lunarclient.apollo.packetenrichment.v1\u001a3lunarclient/apollo/packetenrichment/v1/packet.proto\u001a3lunarclient/apollo/packetenrichment/v1/player.proto\u001a5lunarclient/apollo/packetenrichment/v1/raytrace.proto\"Ý\u0001\n\u0014PlayerUseItemMessage\u0012S\n\u000bpacket_info\u0018\u0001 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PacketInfoR\npacketInfo\u0012S\n\u000bplayer_info\u0018\u0002 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PlayerInfoR\nplayerInfo\u0012\u001b\n\tmain_hand\u0018\u0003 \u0001(\bR\bmainHand\"¨\u0002\n\u001aPlayerUseItemBucketMessage\u0012S\n\u000bpacket_info\u0018\u0001 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PacketInfoR\npacketInfo\u0012S\n\u000bplayer_info\u0018\u0002 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PlayerInfoR\nplayerInfo\u0012`\n\u0010ray_trace_result\u0018\u0003 \u0001(\u000b26.lunarclient.apollo.packetenrichment.v1.RayTraceResultR\u000erayTraceResultBó\u0001\n*com.lunarclient.apollo.packetenrichment.v1B\nWorldProtoP\u0001¢\u0002\u0003LAPª\u0002&Lunarclient.Apollo.Packetenrichment.V1Ê\u0002&Lunarclient\\Apollo\\Packetenrichment\\V1â\u00022Lunarclient\\Apollo\\Packetenrichment\\V1\\GPBMetadataê\u0002)Lunarclient::Apollo::Packetenrichment::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{PacketProto.getDescriptor(), PlayerProto.getDescriptor(), RaytraceProto.getDescriptor()}
      );
      PacketProto.getDescriptor();
      PlayerProto.getDescriptor();
      RaytraceProto.getDescriptor();
   }
}
