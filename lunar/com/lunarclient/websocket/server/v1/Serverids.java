package com.lunarclient.websocket.server.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_server_v1_GetPlayerCountsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_server_v1_GetPlayerCountsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_server_v1_GetPlayerCountsRequest_descriptor, new String[]{"ServerIds"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_descriptor, new String[]{"Servers"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_Server_descriptor = internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_Server_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_server_v1_GetPlayerCountsResponse_Server_descriptor, new String[]{"ServerId", "Status", "OnlineCount", "MaxCount"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsRequest_descriptor, new String[]{"ServerIp"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_server_v1_CheckServerRecommendationsResponse_descriptor, new String[]{"Recommendations"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_server_v1_GetServerRecommendationsResponse_descriptor, new String[]{"Recommendations"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesRequest_descriptor, new String[]{"ServerIp"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_server_v1_CheckAuthorizedFeaturesResponse_descriptor,
      new String[]{"Scopes", "AssociatedCosmeticIds", "AssociatedEmoteIds", "AssociatedSprayIds"}
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
         "\n-lunarclient/websocket/server/v1/service.proto\u0012\u001flunarclient.websocket.server.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a,lunarclient/websocket/server/v1/common.proto\"7\n\u0016GetPlayerCountsRequest\u0012\u001d\n\nserver_ids\u0018\u0001 \u0003(\tR\tserverIds\"\u0085\u0003\n\u0017GetPlayerCountsResponse\u0012Y\n\u0007servers\u0018\u0001 \u0003(\u000b2?.lunarclient.websocket.server.v1.GetPlayerCountsResponse.ServerR\u0007servers\u001a\u008e\u0002\n\u0006Server\u0012\u001b\n\tserver_id\u0018\u0001 \u0001(\tR\bserverId\u0012^\n\u0006status\u0018\u0002 \u0001(\u000e2F.lunarclient.websocket.server.v1.GetPlayerCountsResponse.Server.StatusR\u0006status\u0012!\n\fonline_count\u0018\u0003 \u0001(\u0005R\u000bonlineCount\u0012\u001b\n\tmax_count\u0018\u0004 \u0001(\u0005R\bmaxCount\"G\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\u0011\n\rSTATUS_ONLINE\u0010\u0001\u0012\u0012\n\u000eSTATUS_OFFLINE\u0010\u0002\"@\n!CheckServerRecommendationsRequest\u0012\u001b\n\tserver_ip\u0018\u0001 \u0001(\tR\bserverIp\"\u0086\u0001\n\"CheckServerRecommendationsResponse\u0012`\n\u000frecommendations\u0018\u0001 \u0001(\u000b26.lunarclient.websocket.server.v1.ServerRecommendationsR\u000frecommendations\"!\n\u001fGetServerRecommendationsRequest\"\u0084\u0001\n GetServerRecommendationsResponse\u0012`\n\u000frecommendations\u0018\u0001 \u0003(\u000b26.lunarclient.websocket.server.v1.ServerRecommendationsR\u000frecommendations\"=\n\u001eCheckAuthorizedFeaturesRequest\u0012\u001b\n\tserver_ip\u0018\u0001 \u0001(\tR\bserverIp\"Õ\u0001\n\u001fCheckAuthorizedFeaturesResponse\u0012\u0016\n\u0006scopes\u0018\u0001 \u0003(\tR\u0006scopes\u00126\n\u0017associated_cosmetic_ids\u0018\u0002 \u0003(\u0005R\u0015associatedCosmeticIds\u00120\n\u0014associated_emote_ids\u0018\u0003 \u0003(\u0005R\u0012associatedEmoteIds\u00120\n\u0014associated_spray_ids\u0018\u0004 \u0003(\u0005R\u0012associatedSprayIds2\u0097\u0005\n\rServerService\u0012\u008a\u0001\n\u000fGetPlayerCounts\u00127.lunarclient.websocket.server.v1.GetPlayerCountsRequest\u001a8.lunarclient.websocket.server.v1.GetPlayerCountsResponse\"\u0004\u0088µ\u0018\u0003\u0012«\u0001\n\u001aCheckServerRecommendations\u0012B.lunarclient.websocket.server.v1.CheckServerRecommendationsRequest\u001aC.lunarclient.websocket.server.v1.CheckServerRecommendationsResponse\"\u0004\u0088µ\u0018\u0001\u0012¥\u0001\n\u0018GetServerRecommendations\u0012@.lunarclient.websocket.server.v1.GetServerRecommendationsRequest\u001aA.lunarclient.websocket.server.v1.GetServerRecommendationsResponse\"\u0004\u0088µ\u0018\u0001\u0012¢\u0001\n\u0017CheckAuthorizedFeatures\u0012?.lunarclient.websocket.server.v1.CheckAuthorizedFeaturesRequest\u001a@.lunarclient.websocket.server.v1.CheckAuthorizedFeaturesResponse\"\u0004\u0088µ\u0018\u0001BÕ\u0001\n#com.lunarclient.websocket.server.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWSª\u0002\u001fLunarclient.Websocket.Server.V1Ê\u0002\u001fLunarclient\\Websocket\\Server\\V1â\u0002+Lunarclient\\Websocket\\Server\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Server::V1b\u0006proto3"
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
