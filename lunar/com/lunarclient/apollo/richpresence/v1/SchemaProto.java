package com.lunarclient.apollo.richpresence.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_richpresence_v1_OverrideServerRichPresenceMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_richpresence_v1_OverrideServerRichPresenceMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_richpresence_v1_OverrideServerRichPresenceMessage_descriptor,
      new String[]{"GameName", "GameVariantName", "GameState", "PlayerState", "MapName", "SubServer", "TeamCurrentSize", "TeamMaxSize"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_richpresence_v1_ResetServerRichPresenceMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_richpresence_v1_ResetServerRichPresenceMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_richpresence_v1_ResetServerRichPresenceMessage_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private SchemaProto() {
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
         "\n/lunarclient/apollo/richpresence/v1/schema.proto\u0012\"lunarclient.apollo.richpresence.v1\"¸\u0002\n!OverrideServerRichPresenceMessage\u0012\u001b\n\tgame_name\u0018\u0001 \u0001(\tR\bgameName\u0012*\n\u0011game_variant_name\u0018\u0002 \u0001(\tR\u000fgameVariantName\u0012\u001d\n\ngame_state\u0018\u0003 \u0001(\tR\tgameState\u0012!\n\fplayer_state\u0018\u0004 \u0001(\tR\u000bplayerState\u0012\u0019\n\bmap_name\u0018\u0005 \u0001(\tR\u0007mapName\u0012\u001d\n\nsub_server\u0018\u0006 \u0001(\tR\tsubServer\u0012*\n\u0011team_current_size\u0018\u0007 \u0001(\u0005R\u000fteamCurrentSize\u0012\"\n\rteam_max_size\u0018\b \u0001(\u0005R\u000bteamMaxSize\" \n\u001eResetServerRichPresenceMessageBà\u0001\n&com.lunarclient.apollo.richpresence.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LARª\u0002\"Lunarclient.Apollo.Richpresence.V1Ê\u0002\"Lunarclient\\Apollo\\Richpresence\\V1â\u0002.Lunarclient\\Apollo\\Richpresence\\V1\\GPBMetadataê\u0002%Lunarclient::Apollo::Richpresence::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
