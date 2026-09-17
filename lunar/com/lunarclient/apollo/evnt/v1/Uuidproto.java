package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class EventProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_EventPlayerStatusMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_EventPlayerStatusMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_EventPlayerStatusMessage_descriptor, new String[]{"PlayerUuid", "Health", "UltimatePercentage", "RespawnAt"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_EventStatusOverviewMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_EventStatusOverviewMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_EventStatusOverviewMessage_descriptor, new String[]{"TeamOneStatus", "TeamTwoStatus"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_EventTeamStatusMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_EventTeamStatusMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_EventTeamStatusMessage_descriptor,
      new String[]{
         "TopWitherHealth", "TopCrystalHealth", "MiddleWitherHealth", "MiddleCrystalHealth", "BottomWitherHealth", "BottomCrystalHealth", "DragonHealth"
      }
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_EventGameOverviewMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_EventGameOverviewMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_EventGameOverviewMessage_descriptor,
      new String[]{"TeamOneStatus", "TeamTwoStatus", "TierThreeHealth", "GameStartTime", "WitherShields", "LockGameTime", "MidRespawnTime"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_EventPlayerMessage_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_EventPlayerMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_EventPlayerMessage_descriptor, new String[]{"PlayerUuid", "PlayerNameAdventure", "CharacterType", "TeamOne"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_EventOverviewMessage_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_EventOverviewMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_EventOverviewMessage_descriptor, new String[]{"Players"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private EventProto() {
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
         "\n&lunarclient/apollo/evnt/v1/event.proto\u0012\u001alunarclient.apollo.evnt.v1\u001a'lunarclient/apollo/common/v1/uuid.proto\u001a*lunarclient/apollo/evnt/v1/character.proto\"Ç\u0001\n\u0018EventPlayerStatusMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u0012\u0016\n\u0006health\u0018\u0002 \u0001(\u0002R\u0006health\u0012/\n\u0013ultimate_percentage\u0018\u0003 \u0001(\u0002R\u0012ultimatePercentage\u0012\u001d\n\nrespawn_at\u0018\u0004 \u0001(\u0003R\trespawnAt\"Ø\u0001\n\u001aEventStatusOverviewMessage\u0012\\\n\u000fteam_one_status\u0018\u0001 \u0003(\u000b24.lunarclient.apollo.evnt.v1.EventPlayerStatusMessageR\rteamOneStatus\u0012\\\n\u000fteam_two_status\u0018\u0002 \u0003(\u000b24.lunarclient.apollo.evnt.v1.EventPlayerStatusMessageR\rteamTwoStatus\"ã\u0002\n\u0016EventTeamStatusMessage\u0012*\n\u0011top_wither_health\u0018\u0001 \u0001(\u0002R\u000ftopWitherHealth\u0012,\n\u0012top_crystal_health\u0018\u0002 \u0001(\u0002R\u0010topCrystalHealth\u00120\n\u0014middle_wither_health\u0018\u0003 \u0001(\u0002R\u0012middleWitherHealth\u00122\n\u0015middle_crystal_health\u0018\u0004 \u0001(\u0002R\u0013middleCrystalHealth\u00120\n\u0014bottom_wither_health\u0018\u0005 \u0001(\u0002R\u0012bottomWitherHealth\u00122\n\u0015bottom_crystal_health\u0018\u0006 \u0001(\u0002R\u0013bottomCrystalHealth\u0012#\n\rdragon_health\u0018\u0007 \u0001(\u0002R\fdragonHealth\"\u009d\u0003\n\u0018EventGameOverviewMessage\u0012Z\n\u000fteam_one_status\u0018\u0001 \u0001(\u000b22.lunarclient.apollo.evnt.v1.EventTeamStatusMessageR\rteamOneStatus\u0012Z\n\u000fteam_two_status\u0018\u0002 \u0001(\u000b22.lunarclient.apollo.evnt.v1.EventTeamStatusMessageR\rteamTwoStatus\u0012*\n\u0011tier_three_health\u0018\u0003 \u0001(\u0002R\u000ftierThreeHealth\u0012&\n\u000fgame_start_time\u0018\u0004 \u0001(\u0003R\rgameStartTime\u0012%\n\u000ewither_shields\u0018\u0005 \u0001(\bR\rwitherShields\u0012$\n\u000elock_game_time\u0018\u0006 \u0001(\bR\flockGameTime\u0012(\n\u0010mid_respawn_time\u0018\u0007 \u0001(\u0003R\u000emidRespawnTime\"ú\u0001\n\u0012EventPlayerMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u00122\n\u0015player_name_adventure\u0018\u0002 \u0001(\tR\u0013playerNameAdventure\u0012P\n\u000echaracter_type\u0018\u0003 \u0001(\u000e2).lunarclient.apollo.evnt.v1.CharacterTypeR\rcharacterType\u0012\u0019\n\bteam_one\u0018\u0004 \u0001(\bR\u0007teamOne\"`\n\u0014EventOverviewMessage\u0012H\n\u0007players\u0018\u0001 \u0003(\u000b2..lunarclient.apollo.evnt.v1.EventPlayerMessageR\u0007playersB·\u0001\n\u001ecom.lunarclient.apollo.evnt.v1B\nEventProtoP\u0001¢\u0002\u0003LAEª\u0002\u001aLunarclient.Apollo.Evnt.V1Ê\u0002\u001aLunarclient\\Apollo\\Evnt\\V1â\u0002&Lunarclient\\Apollo\\Evnt\\V1\\GPBMetadataê\u0002\u001dLunarclient::Apollo::Evnt::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor(), CharacterProto.getDescriptor()}
      );
      UuidProto.getDescriptor();
      CharacterProto.getDescriptor();
   }
}
