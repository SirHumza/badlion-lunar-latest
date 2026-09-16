package com.lunarclient.apollo.player.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class WorldProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_player_v1_UpdatePlayerWorldMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_player_v1_UpdatePlayerWorldMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_player_v1_UpdatePlayerWorldMessage_descriptor, new String[]{"World"}
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
         "\n(lunarclient/apollo/player/v1/world.proto\u0012\u001clunarclient.apollo.player.v1\"0\n\u0018UpdatePlayerWorldMessage\u0012\u0014\n\u0005world\u0018\u0001 \u0001(\tR\u0005worldBÁ\u0001\n com.lunarclient.apollo.player.v1B\nWorldProtoP\u0001¢\u0002\u0003LAPª\u0002\u001cLunarclient.Apollo.Player.V1Ê\u0002\u001cLunarclient\\Apollo\\Player\\V1â\u0002(Lunarclient\\Apollo\\Player\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Player::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
