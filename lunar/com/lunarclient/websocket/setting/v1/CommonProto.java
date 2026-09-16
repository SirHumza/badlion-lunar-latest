package com.lunarclient.websocket.setting.v1;

import com.google.protobuf.AnyProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_setting_v1_LauncherSetting_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_setting_v1_LauncherSetting_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_setting_v1_LauncherSetting_descriptor, new String[]{"Id", "Value", "ChangedValue", "DefaultValue"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_setting_v1_ClientSetting_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_setting_v1_ClientSetting_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_setting_v1_ClientSetting_descriptor, new String[]{"Id", "Value", "ChangedValue", "DefaultValue"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
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
         "\n-lunarclient/websocket/setting/v1/common.proto\u0012 lunarclient.websocket.setting.v1\u001a\u0019google/protobuf/any.proto\"\u0097\u0001\n\u000fLauncherSetting\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012*\n\u0005value\u0018\u0002 \u0001(\u000b2\u0014.google.protobuf.AnyR\u0005value\u0012#\n\rchanged_value\u0018\u0003 \u0001(\bR\fchangedValue\u0012#\n\rdefault_value\u0018\u0004 \u0001(\bR\fdefaultValue\"\u0095\u0001\n\rClientSetting\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012*\n\u0005value\u0018\u0002 \u0001(\u000b2\u0014.google.protobuf.AnyR\u0005value\u0012#\n\rchanged_value\u0018\u0003 \u0001(\bR\fchangedValue\u0012#\n\rdefault_value\u0018\u0004 \u0001(\bR\fdefaultValueBÖ\u0001\n$com.lunarclient.websocket.setting.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWSª\u0002 Lunarclient.Websocket.Setting.V1Ê\u0002 Lunarclient\\Websocket\\Setting\\V1â\u0002,Lunarclient\\Websocket\\Setting\\V1\\GPBMetadataê\u0002#Lunarclient::Websocket::Setting::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});
      AnyProto.getDescriptor();
   }
}
