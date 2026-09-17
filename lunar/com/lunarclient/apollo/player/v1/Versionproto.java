package com.lunarclient.apollo.player.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.StructProto;
import com.lunarclient.apollo.common.v1.VersionProto;

public final class HandshakeProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_player_v1_ModMessage_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_player_v1_ModMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_player_v1_ModMessage_descriptor, new String[]{"Id", "Name", "Version", "Type"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_descriptor,
      new String[]{"MinecraftVersion", "LunarClientVersion", "InstalledMods", "EmbeddedCheckoutSupport", "ModStatus"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_ModStatusEntry_descriptor = internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_ModStatusEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_player_v1_PlayerHandshakeMessage_ModStatusEntry_descriptor, new String[]{"Key", "Value"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private HandshakeProto() {
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
         "\n,lunarclient/apollo/player/v1/handshake.proto\u0012\u001clunarclient.apollo.player.v1\u001a\u001cgoogle/protobuf/struct.proto\u001a*lunarclient/apollo/common/v1/version.proto\"\u0096\u0002\n\nModMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012\u0018\n\u0007version\u0018\u0003 \u0001(\tR\u0007version\u0012A\n\u0004type\u0018\u0004 \u0001(\u000e2-.lunarclient.apollo.player.v1.ModMessage.TypeR\u0004type\"\u0082\u0001\n\u0004Type\u0012\u0014\n\u0010TYPE_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014TYPE_FABRIC_INTERNAL\u0010\u0001\u0012\u0018\n\u0014TYPE_FABRIC_EXTERNAL\u0010\u0002\u0012\u0017\n\u0013TYPE_FORGE_INTERNAL\u0010\u0003\u0012\u0017\n\u0013TYPE_FORGE_EXTERNAL\u0010\u0004:\u0002\u0018\u0001\"Û\u0004\n\u0016PlayerHandshakeMessage\u0012[\n\u0011minecraft_version\u0018\u0001 \u0001(\u000b2..lunarclient.apollo.common.v1.MinecraftVersionR\u0010minecraftVersion\u0012b\n\u0014lunar_client_version\u0018\u0002 \u0001(\u000b20.lunarclient.apollo.common.v1.LunarClientVersionR\u0012lunarClientVersion\u0012S\n\u000einstalled_mods\u0018\u0003 \u0003(\u000b2(.lunarclient.apollo.player.v1.ModMessageB\u0002\u0018\u0001R\rinstalledMods\u0012q\n\u0019embedded_checkout_support\u0018\u0004 \u0001(\u000e25.lunarclient.apollo.player.v1.EmbeddedCheckoutSupportR\u0017embeddedCheckoutSupport\u0012b\n\nmod_status\u0018\u0005 \u0003(\u000b2C.lunarclient.apollo.player.v1.PlayerHandshakeMessage.ModStatusEntryR\tmodStatus\u001aT\n\u000eModStatusEntry\u0012\u0010\n\u0003key\u0018\u0001 \u0001(\tR\u0003key\u0012,\n\u0005value\u0018\u0002 \u0001(\u000b2\u0016.google.protobuf.ValueR\u0005value:\u00028\u0001*\u0091\u0001\n\u0017EmbeddedCheckoutSupport\u0012)\n%EMBEDDED_CHECKOUT_SUPPORT_UNSPECIFIED\u0010\u0000\u0012%\n!EMBEDDED_CHECKOUT_SUPPORT_OVERLAY\u0010\u0001\u0012$\n EMBEDDED_CHECKOUT_SUPPORT_WINDOW\u0010\u0002BÅ\u0001\n com.lunarclient.apollo.player.v1B\u000eHandshakeProtoP\u0001¢\u0002\u0003LAPª\u0002\u001cLunarclient.Apollo.Player.V1Ê\u0002\u001cLunarclient\\Apollo\\Player\\V1â\u0002(Lunarclient\\Apollo\\Player\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Player::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{StructProto.getDescriptor(), VersionProto.getDescriptor()}
      );
      StructProto.getDescriptor();
      VersionProto.getDescriptor();
   }
}
