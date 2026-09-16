package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.LocationProto;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class PlayerProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInfo_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInfo_descriptor,
      new String[]{"PlayerUuid", "Location", "Sneaking", "Sprinting", "Jumping", "ForwardSpeed", "StrafeSpeed"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PlayerProto() {
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
         "\n3lunarclient/apollo/packetenrichment/v1/player.proto\u0012&lunarclient.apollo.packetenrichment.v1\u001a+lunarclient/apollo/common/v1/location.proto\u001a'lunarclient/apollo/common/v1/uuid.proto\"·\u0002\n\nPlayerInfo\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u0012H\n\blocation\u0018\u0002 \u0001(\u000b2,.lunarclient.apollo.common.v1.PlayerLocationR\blocation\u0012\u001a\n\bsneaking\u0018\u0003 \u0001(\bR\bsneaking\u0012\u001c\n\tsprinting\u0018\u0004 \u0001(\bR\tsprinting\u0012\u0018\n\u0007jumping\u0018\u0005 \u0001(\bR\u0007jumping\u0012#\n\rforward_speed\u0018\u0006 \u0001(\u0002R\fforwardSpeed\u0012!\n\fstrafe_speed\u0018\u0007 \u0001(\u0002R\u000bstrafeSpeedBô\u0001\n*com.lunarclient.apollo.packetenrichment.v1B\u000bPlayerProtoP\u0001¢\u0002\u0003LAPª\u0002&Lunarclient.Apollo.Packetenrichment.V1Ê\u0002&Lunarclient\\Apollo\\Packetenrichment\\V1â\u00022Lunarclient\\Apollo\\Packetenrichment\\V1\\GPBMetadataê\u0002)Lunarclient::Apollo::Packetenrichment::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{LocationProto.getDescriptor(), UuidProto.getDescriptor()}
      );
      LocationProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
