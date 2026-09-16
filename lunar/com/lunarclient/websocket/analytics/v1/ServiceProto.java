package com.lunarclient.websocket.analytics.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_analytics_v1_RecordCountersRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_analytics_v1_RecordCountersRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_analytics_v1_RecordCountersRequest_descriptor, new String[]{"Updates"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_analytics_v1_RecordCountersResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_analytics_v1_RecordCountersResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_analytics_v1_RecordCountersResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionRequest_descriptor, new String[]{"ServerIp", "InteractionType"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_analytics_v1_RecordPinnedServerInteractionResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_descriptor, new String[]{"Mods"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_ModsEntry_descriptor = internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_ModsEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsRequest_ModsEntry_descriptor, new String[]{"Key", "Value"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_analytics_v1_RecordEnabledModsResponse_descriptor, new String[0]
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
         "\n0lunarclient/websocket/analytics/v1/service.proto\u0012\"lunarclient.websocket.analytics.v1\u001a/lunarclient/websocket/analytics/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"d\n\u0015RecordCountersRequest\u0012K\n\u0007updates\u0018\u0001 \u0003(\u000b21.lunarclient.websocket.analytics.v1.CounterUpdateR\u0007updates\"\u0018\n\u0016RecordCountersResponse\"µ\u0002\n$RecordPinnedServerInteractionRequest\u0012\u001b\n\tserver_ip\u0018\u0001 \u0001(\tR\bserverIp\u0012\u0083\u0001\n\u0010interaction_type\u0018\u0002 \u0001(\u000e2X.lunarclient.websocket.analytics.v1.RecordPinnedServerInteractionRequest.InteractionTypeR\u000finteractionType\"j\n\u000fInteractionType\u0012 \n\u001cINTERACTION_TYPE_UNSPECIFIED\u0010\u0000\u0012\u001a\n\u0016INTERACTION_TYPE_HOVER\u0010\u0001\u0012\u0019\n\u0015INTERACTION_TYPE_PLAY\u0010\u0002\"'\n%RecordPinnedServerInteractionResponse\"¯\u0001\n\u0018RecordEnabledModsRequest\u0012Z\n\u0004mods\u0018\u0001 \u0003(\u000b2F.lunarclient.websocket.analytics.v1.RecordEnabledModsRequest.ModsEntryR\u0004mods\u001a7\n\tModsEntry\u0012\u0010\n\u0003key\u0018\u0001 \u0001(\tR\u0003key\u0012\u0014\n\u0005value\u0018\u0002 \u0001(\bR\u0005value:\u00028\u0001\"\u001b\n\u0019RecordEnabledModsResponse2ø\u0003\n\u0010AnalyticsService\u0012\u008d\u0001\n\u000eRecordCounters\u00129.lunarclient.websocket.analytics.v1.RecordCountersRequest\u001a:.lunarclient.websocket.analytics.v1.RecordCountersResponse\"\u0004\u0088µ\u0018\u0003\u0012º\u0001\n\u001dRecordPinnedServerInteraction\u0012H.lunarclient.websocket.analytics.v1.RecordPinnedServerInteractionRequest\u001aI.lunarclient.websocket.analytics.v1.RecordPinnedServerInteractionResponse\"\u0004\u0088µ\u0018\u0001\u0012\u0096\u0001\n\u0011RecordEnabledMods\u0012<.lunarclient.websocket.analytics.v1.RecordEnabledModsRequest\u001a=.lunarclient.websocket.analytics.v1.RecordEnabledModsResponse\"\u0004\u0088µ\u0018\u0001Bä\u0001\n&com.lunarclient.websocket.analytics.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWAª\u0002\"Lunarclient.Websocket.Analytics.V1Ê\u0002\"Lunarclient\\Websocket\\Analytics\\V1â\u0002.Lunarclient\\Websocket\\Analytics\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Analytics::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor(), com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor()}
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      CommonProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
   }
}
