package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class MeleeProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_PlayerAttackMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_PlayerAttackMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_PlayerAttackMessage_descriptor,
      new String[]{"PacketInfo", "TargetInfo", "AttackerInfo", "Distance"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private MeleeProto() {
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
         "\n2lunarclient/apollo/packetenrichment/v1/melee.proto\u0012&lunarclient.apollo.packetenrichment.v1\u001a3lunarclient/apollo/packetenrichment/v1/packet.proto\u001a3lunarclient/apollo/packetenrichment/v1/player.proto\"´\u0002\n\u0013PlayerAttackMessage\u0012S\n\u000bpacket_info\u0018\u0001 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PacketInfoR\npacketInfo\u0012S\n\u000btarget_info\u0018\u0002 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PlayerInfoR\ntargetInfo\u0012W\n\rattacker_info\u0018\u0003 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PlayerInfoR\fattackerInfo\u0012\u001a\n\bdistance\u0018\u0004 \u0001(\u0001R\bdistanceBó\u0001\n*com.lunarclient.apollo.packetenrichment.v1B\nMeleeProtoP\u0001¢\u0002\u0003LAPª\u0002&Lunarclient.Apollo.Packetenrichment.V1Ê\u0002&Lunarclient\\Apollo\\Packetenrichment\\V1â\u00022Lunarclient\\Apollo\\Packetenrichment\\V1\\GPBMetadataê\u0002)Lunarclient::Apollo::Packetenrichment::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{PacketProto.getDescriptor(), PlayerProto.getDescriptor()}
      );
      PacketProto.getDescriptor();
      PlayerProto.getDescriptor();
   }
}
