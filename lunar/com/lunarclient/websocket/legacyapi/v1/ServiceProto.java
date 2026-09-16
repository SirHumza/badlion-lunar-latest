package com.lunarclient.websocket.legacyapi.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.websocket.protocol.v1.CommonProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageRequest_descriptor, new String[]{"Feature"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_legacyapi_v1_RecordDeprecatedApiUsageResponse_descriptor, new String[0]
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
         "\n0lunarclient/websocket/legacyapi/v1/service.proto\u0012\"lunarclient.websocket.legacyapi.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\"Ç\u0004\n\u001fRecordDeprecatedApiUsageRequest\u0012e\n\u0007feature\u0018\u0001 \u0001(\u000e2K.lunarclient.websocket.legacyapi.v1.RecordDeprecatedApiUsageRequest.FeatureR\u0007feature\"¼\u0003\n\u0007Feature\u0012\u0017\n\u0013FEATURE_UNSPECIFIED\u0010\u0000\u0012\u001b\n\u0017FEATURE_TRANSFER_PACKET\u0010\u0001\u0012\u0014\n\u0010FEATURE_BOSS_BAR\u0010\u0002\u0012\u0011\n\rFEATURE_VOICE\u0010\u0003\u0012\u0014\n\u0010FEATURE_COOLDOWN\u0010\u0004\u0012\u0011\n\rFEATURE_GHOST\u0010\u0005\u0012\u0014\n\u0010FEATURE_HOLOGRAM\u0010\u0006\u0012\u0018\n\u0014FEATURE_MOD_SETTINGS\u0010\u0007\u0012\u0014\n\u0010FEATURE_NAMETAGS\u0010\b\u0012\u0018\n\u0014FEATURE_NOTIFICATION\u0010\t\u0012\u0017\n\u0013FEATURE_SERVER_RULE\u0010\n\u0012\u0019\n\u0015FEATURE_SERVER_UPDATE\u0010\u000b\u0012\u0015\n\u0011FEATURE_STAFF_MOD\u0010\f\u0012\u0015\n\u0011FEATURE_TEAMMATES\u0010\r\u0012\u0011\n\rFEATURE_TITLE\u0010\u000e\u0012\u0011\n\rFEATURE_WORLD\u0010\u000f\u0012\u0018\n\u0014FEATURE_WORLD_BORDER\u0010\u0010\u0012\u0014\n\u0010FEATURE_WAYPOINT\u0010\u0011\u0012\u0011\n\rFEATURE_EMOTE\u0010\u0012\"\"\n RecordDeprecatedApiUsageResponse2À\u0001\n\u0010LegacyApiService\u0012«\u0001\n\u0018RecordDeprecatedApiUsage\u0012C.lunarclient.websocket.legacyapi.v1.RecordDeprecatedApiUsageRequest\u001aD.lunarclient.websocket.legacyapi.v1.RecordDeprecatedApiUsageResponse\"\u0004\u0088µ\u0018\u0001Bä\u0001\n&com.lunarclient.websocket.legacyapi.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWLª\u0002\"Lunarclient.Websocket.Legacyapi.V1Ê\u0002\"Lunarclient\\Websocket\\Legacyapi\\V1â\u0002.Lunarclient\\Websocket\\Legacyapi\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Legacyapi::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor()});
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      CommonProto.getDescriptor();
   }
}
