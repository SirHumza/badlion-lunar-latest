package com.lunarclient.apollo.team.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.ComponentProto;
import com.lunarclient.apollo.common.v1.LocationProto;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_team_v1_TeamMember_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_team_v1_TeamMember_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_team_v1_TeamMember_descriptor,
      new String[]{"PlayerUuid", "PlayerDisplayName", "Location", "MarkerColor", "AdventureJsonPlayerName"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_team_v1_UpdateTeamMembersMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_team_v1_UpdateTeamMembersMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_team_v1_UpdateTeamMembersMessage_descriptor, new String[]{"Members"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_team_v1_ResetTeamMembersMessage_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_team_v1_ResetTeamMembersMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_team_v1_ResetTeamMembersMessage_descriptor, new String[0]
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
         "\n'lunarclient/apollo/team/v1/schema.proto\u0012\u001alunarclient.apollo.team.v1\u001a(lunarclient/apollo/common/v1/color.proto\u001a,lunarclient/apollo/common/v1/component.proto\u001a+lunarclient/apollo/common/v1/location.proto\u001a'lunarclient/apollo/common/v1/uuid.proto\"÷\u0002\n\nTeamMember\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u0012[\n\u0013player_display_name\u0018\u0002 \u0001(\u000b2'.lunarclient.apollo.common.v1.ComponentB\u0002\u0018\u0001R\u0011playerDisplayName\u0012B\n\blocation\u0018\u0003 \u0001(\u000b2&.lunarclient.apollo.common.v1.LocationR\blocation\u0012F\n\fmarker_color\u0018\u0004 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u000bmarkerColor\u0012;\n\u001aadventure_json_player_name\u0018\u0005 \u0001(\tR\u0017adventureJsonPlayerName\"\\\n\u0018UpdateTeamMembersMessage\u0012@\n\u0007members\u0018\u0001 \u0003(\u000b2&.lunarclient.apollo.team.v1.TeamMemberR\u0007members\"\u0019\n\u0017ResetTeamMembersMessageB¸\u0001\n\u001ecom.lunarclient.apollo.team.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LATª\u0002\u001aLunarclient.Apollo.Team.V1Ê\u0002\u001aLunarclient\\Apollo\\Team\\V1â\u0002&Lunarclient\\Apollo\\Team\\V1\\GPBMetadataê\u0002\u001dLunarclient::Apollo::Team::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), ComponentProto.getDescriptor(), LocationProto.getDescriptor(), UuidProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      ComponentProto.getDescriptor();
      LocationProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
