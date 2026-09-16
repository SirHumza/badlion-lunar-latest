package com.lunarclient.websocket.setting.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingRequest_descriptor, new String[]{"Setting", "Initiator"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_setting_v1_UpdateLauncherSettingResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingRequest_descriptor, new String[]{"Setting", "Initiator"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_setting_v1_UpdateClientSettingResponse_descriptor, new String[0]
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
         "\n.lunarclient/websocket/setting/v1/service.proto\u0012 lunarclient.websocket.setting.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a-lunarclient/websocket/setting/v1/common.proto\"£\u0002\n\u001cUpdateLauncherSettingRequest\u0012K\n\u0007setting\u0018\u0001 \u0001(\u000b21.lunarclient.websocket.setting.v1.LauncherSettingR\u0007setting\u0012f\n\tinitiator\u0018\u0002 \u0001(\u000e2H.lunarclient.websocket.setting.v1.UpdateLauncherSettingRequest.InitiatorR\tinitiator\"N\n\tInitiator\u0012\u0019\n\u0015INITIATOR_UNSPECIFIED\u0010\u0000\u0012\u0013\n\u000fINITIATOR_RESET\u0010\u0001\u0012\u0011\n\rINITIATOR_SET\u0010\u0002\"\u001f\n\u001dUpdateLauncherSettingResponse\"\u009d\u0002\n\u001aUpdateClientSettingRequest\u0012I\n\u0007setting\u0018\u0001 \u0001(\u000b2/.lunarclient.websocket.setting.v1.ClientSettingR\u0007setting\u0012d\n\tinitiator\u0018\u0002 \u0001(\u000e2F.lunarclient.websocket.setting.v1.UpdateClientSettingRequest.InitiatorR\tinitiator\"N\n\tInitiator\u0012\u0019\n\u0015INITIATOR_UNSPECIFIED\u0010\u0000\u0012\u0013\n\u000fINITIATOR_RESET\u0010\u0001\u0012\u0011\n\rINITIATOR_SET\u0010\u0002\"\u001d\n\u001bUpdateClientSettingResponse2Ì\u0002\n\u000eSettingService\u0012\u009e\u0001\n\u0015UpdateLauncherSetting\u0012>.lunarclient.websocket.setting.v1.UpdateLauncherSettingRequest\u001a?.lunarclient.websocket.setting.v1.UpdateLauncherSettingResponse\"\u0004\u0088µ\u0018\u0002\u0012\u0098\u0001\n\u0013UpdateClientSetting\u0012<.lunarclient.websocket.setting.v1.UpdateClientSettingRequest\u001a=.lunarclient.websocket.setting.v1.UpdateClientSettingResponse\"\u0004\u0088µ\u0018\u0001BÚ\u0001\n$com.lunarclient.websocket.setting.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWSª\u0002 Lunarclient.Websocket.Setting.V1Ê\u0002 Lunarclient\\Websocket\\Setting\\V1â\u0002,Lunarclient\\Websocket\\Setting\\V1\\GPBMetadataê\u0002#Lunarclient::Websocket::Setting::V1b\u0006proto3"
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
