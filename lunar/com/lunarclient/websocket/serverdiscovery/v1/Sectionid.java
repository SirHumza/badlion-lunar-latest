package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSectionCardsPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSectionCardsPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSectionCardsPush_descriptor, new String[]{"SectionId", "Cards"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PushProto() {
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
         "\n3lunarclient/websocket/serverdiscovery/v1/push.proto\u0012(lunarclient.websocket.serverdiscovery.v1\u001a5lunarclient/websocket/serverdiscovery/v1/common.proto\"\u0083\u0001\n\u0016ServerSectionCardsPush\u0012\u001d\n\nsection_id\u0018\u0001 \u0001(\tR\tsectionId\u0012J\n\u0005cards\u0018\u0002 \u0003(\u000b24.lunarclient.websocket.serverdiscovery.v1.ServerCardR\u0005cardsBü\u0001\n,com.lunarclient.websocket.serverdiscovery.v1B\tPushProtoP\u0001¢\u0002\u0003LWSª\u0002(Lunarclient.Websocket.Serverdiscovery.V1Ê\u0002(Lunarclient\\Websocket\\Serverdiscovery\\V1â\u00024Lunarclient\\Websocket\\Serverdiscovery\\V1\\GPBMetadataê\u0002+Lunarclient::Websocket::Serverdiscovery::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor()});
      CommonProto.getDescriptor();
   }
}
