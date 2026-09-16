package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ChatProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_PlayerChatOpenMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_PlayerChatOpenMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_PlayerChatOpenMessage_descriptor, new String[]{"PlayerInfo", "PacketInfo"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_PlayerChatCloseMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_PlayerChatCloseMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_PlayerChatCloseMessage_descriptor, new String[]{"PlayerInfo", "PacketInfo"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private ChatProto() {
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
         "\n1lunarclient/apollo/packetenrichment/v1/chat.proto\u0012&lunarclient.apollo.packetenrichment.v1\u001a3lunarclient/apollo/packetenrichment/v1/packet.proto\u001a3lunarclient/apollo/packetenrichment/v1/player.proto\"Á\u0001\n\u0015PlayerChatOpenMessage\u0012S\n\u000bplayer_info\u0018\u0001 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PlayerInfoR\nplayerInfo\u0012S\n\u000bpacket_info\u0018\u0002 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PacketInfoR\npacketInfo\"Â\u0001\n\u0016PlayerChatCloseMessage\u0012S\n\u000bplayer_info\u0018\u0001 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PlayerInfoR\nplayerInfo\u0012S\n\u000bpacket_info\u0018\u0002 \u0001(\u000b22.lunarclient.apollo.packetenrichment.v1.PacketInfoR\npacketInfoBò\u0001\n*com.lunarclient.apollo.packetenrichment.v1B\tChatProtoP\u0001¢\u0002\u0003LAPª\u0002&Lunarclient.Apollo.Packetenrichment.V1Ê\u0002&Lunarclient\\Apollo\\Packetenrichment\\V1â\u00022Lunarclient\\Apollo\\Packetenrichment\\V1\\GPBMetadataê\u0002)Lunarclient::Apollo::Packetenrichment::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{PacketProto.getDescriptor(), PlayerProto.getDescriptor()}
      );
      PacketProto.getDescriptor();
      PlayerProto.getDescriptor();
   }
}
