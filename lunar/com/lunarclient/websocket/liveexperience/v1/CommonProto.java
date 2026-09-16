package com.lunarclient.websocket.liveexperience.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_liveexperience_v1_LiveExperience_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_liveexperience_v1_LiveExperience_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_liveexperience_v1_LiveExperience_descriptor, new String[]{"Id", "Name", "BackgroundImage", "ForegroundImage"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_liveexperience_v1_AddressAndPort_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_liveexperience_v1_AddressAndPort_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_liveexperience_v1_AddressAndPort_descriptor, new String[]{"Address", "Port"}
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
         "\n4lunarclient/websocket/liveexperience/v1/common.proto\u0012'lunarclient.websocket.liveexperience.v1\"\u008a\u0001\n\u000eLiveExperience\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0012\n\u0004name\u0018\u0002 \u0001(\tR\u0004name\u0012)\n\u0010background_image\u0018\u0003 \u0001(\tR\u000fbackgroundImage\u0012)\n\u0010foreground_image\u0018\u0004 \u0001(\tR\u000fforegroundImage\">\n\u000eAddressAndPort\u0012\u0018\n\u0007address\u0018\u0001 \u0001(\tR\u0007address\u0012\u0012\n\u0004port\u0018\u0002 \u0001(\u0005R\u0004portBù\u0001\n+com.lunarclient.websocket.liveexperience.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWLª\u0002'Lunarclient.Websocket.Liveexperience.V1Ê\u0002'Lunarclient\\Websocket\\Liveexperience\\V1â\u00023Lunarclient\\Websocket\\Liveexperience\\V1\\GPBMetadataê\u0002*Lunarclient::Websocket::Liveexperience::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
