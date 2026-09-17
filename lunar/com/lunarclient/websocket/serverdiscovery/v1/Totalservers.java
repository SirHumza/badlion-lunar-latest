package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_LoginRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_LoginResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_LoginResponse_descriptor, new String[]{"TotalServers", "Announcement", "GameTypes"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersResponse_descriptor, new String[]{"Sections"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersRequest_descriptor, new String[]{"Query"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_SearchServersResponse_descriptor, new String[]{"Servers"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_LoadAutocompleteSuggestionsResponse_descriptor, new String[]{"Suggestions"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_AutocompleteSuggestion_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_AutocompleteSuggestion_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_AutocompleteSuggestion_descriptor, new String[]{"Name", "PrimaryAddress", "Addresses"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalRequest_descriptor, new String[]{"ServerMappingsId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(10);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_LoadServerModalResponse_descriptor, new String[]{"Details"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_TrackSectionNotInterestedRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(11);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_TrackSectionNotInterestedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_TrackSectionNotInterestedRequest_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_TrackSectionNotInterestedResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(12);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_TrackSectionNotInterestedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_TrackSectionNotInterestedResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(13);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinRequest_descriptor,
      new String[]{"SectionId", "CardServerMappingsId", "CardRecommendationId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(14);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_TrackServerJoinResponse_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private ServiceProto() {
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
         "\n6lunarclient/websocket/serverdiscovery/v1/service.proto\u0012(lunarclient.websocket.serverdiscovery.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a5lunarclient/websocket/serverdiscovery/v1/common.proto\"\u000e\n\fLoginRequest\"ï\u0001\n\rLoginResponse\u0012#\n\rtotal_servers\u0018\u0001 \u0001(\u0005R\ftotalServers\u0012`\n\fannouncement\u0018\u0002 \u0001(\u000b2<.lunarclient.websocket.serverdiscovery.v1.GlobalAnnouncementR\fannouncement\u0012W\n\ngame_types\u0018\u0003 \u0003(\u000b28.lunarclient.websocket.serverdiscovery.v1.ServerGameTypeR\tgameTypes\"\u0018\n\u0016DiscoverServersRequest\"n\n\u0017DiscoverServersResponse\u0012S\n\bsections\u0018\u0001 \u0003(\u000b27.lunarclient.websocket.serverdiscovery.v1.ServerSectionR\bsections\",\n\u0014SearchServersRequest\u0012\u0014\n\u0005query\u0018\u0001 \u0001(\tR\u0005query\"g\n\u0015SearchServersResponse\u0012N\n\u0007servers\u0018\u0001 \u0003(\u000b24.lunarclient.websocket.serverdiscovery.v1.ServerCardR\u0007servers\"$\n\"LoadAutocompleteSuggestionsRequest\"\u0089\u0001\n#LoadAutocompleteSuggestionsResponse\u0012b\n\u000bsuggestions\u0018\u0001 \u0003(\u000b2@.lunarclient.websocket.serverdiscovery.v1.AutocompleteSuggestionR\u000bsuggestions\"s\n\u0016AutocompleteSuggestion\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012'\n\u000fprimary_address\u0018\u0002 \u0001(\tR\u000eprimaryAddress\u0012\u001c\n\taddresses\u0018\u0003 \u0003(\tR\taddresses\"F\n\u0016LoadServerModalRequest\u0012,\n\u0012server_mappings_id\u0018\u0001 \u0001(\tR\u0010serverMappingsId\"q\n\u0017LoadServerModalResponse\u0012V\n\u0007details\u0018\u0001 \u0001(\u000b2<.lunarclient.websocket.serverdiscovery.v1.ServerModalDetailsR\u0007details\"2\n TrackSectionNotInterestedRequest\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"#\n!TrackSectionNotInterestedResponse\"¤\u0001\n\u0016TrackServerJoinRequest\u0012\u001d\n\nsection_id\u0018\u0001 \u0001(\tR\tsectionId\u00125\n\u0017card_server_mappings_id\u0018\u0002 \u0001(\tR\u0014cardServerMappingsId\u00124\n\u0016card_recommendation_id\u0018\u0003 \u0001(\tR\u0014cardRecommendationId\"\u0019\n\u0017TrackServerJoinResponse2\u008e\t\n\u0016ServerDiscoveryService\u0012~\n\u0005Login\u00126.lunarclient.websocket.serverdiscovery.v1.LoginRequest\u001a7.lunarclient.websocket.serverdiscovery.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009c\u0001\n\u000fDiscoverServers\u0012@.lunarclient.websocket.serverdiscovery.v1.DiscoverServersRequest\u001aA.lunarclient.websocket.serverdiscovery.v1.DiscoverServersResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0096\u0001\n\rSearchServers\u0012>.lunarclient.websocket.serverdiscovery.v1.SearchServersRequest\u001a?.lunarclient.websocket.serverdiscovery.v1.SearchServersResponse\"\u0004\u0088µ\u0018\u0003\u0012À\u0001\n\u001bLoadAutocompleteSuggestions\u0012L.lunarclient.websocket.serverdiscovery.v1.LoadAutocompleteSuggestionsRequest\u001aM.lunarclient.websocket.serverdiscovery.v1.LoadAutocompleteSuggestionsResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009c\u0001\n\u000fLoadServerModal\u0012@.lunarclient.websocket.serverdiscovery.v1.LoadServerModalRequest\u001aA.lunarclient.websocket.serverdiscovery.v1.LoadServerModalResponse\"\u0004\u0088µ\u0018\u0003\u0012º\u0001\n\u0019TrackSectionNotInterested\u0012J.lunarclient.websocket.serverdiscovery.v1.TrackSectionNotInterestedRequest\u001aK.lunarclient.websocket.serverdiscovery.v1.TrackSectionNotInterestedResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009c\u0001\n\u000fTrackServerJoin\u0012@.lunarclient.websocket.serverdiscovery.v1.TrackServerJoinRequest\u001aA.lunarclient.websocket.serverdiscovery.v1.TrackServerJoinResponse\"\u0004\u0088µ\u0018\u0003B\u0082\u0002\n,com.lunarclient.websocket.serverdiscovery.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWSª\u0002(Lunarclient.Websocket.Serverdiscovery.V1Ê\u0002(Lunarclient\\Websocket\\Serverdiscovery\\V1â\u00024Lunarclient\\Websocket\\Serverdiscovery\\V1\\GPBMetadataê\u0002+Lunarclient::Websocket::Serverdiscovery::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
