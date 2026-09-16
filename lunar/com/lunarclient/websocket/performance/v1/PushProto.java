package com.lunarclient.websocket.performance.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_StartJfrProfilePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_StartJfrProfilePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_StartJfrProfilePush_descriptor, new String[]{"Duration"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_performance_v1_StopJfrProfilePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_performance_v1_StopJfrProfilePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_performance_v1_StopJfrProfilePush_descriptor, new String[0]
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
         "\n/lunarclient/websocket/performance/v1/push.proto\u0012$lunarclient.websocket.performance.v1\u001a\u001egoogle/protobuf/duration.proto\"L\n\u0013StartJfrProfilePush\u00125\n\bduration\u0018\u0001 \u0001(\u000b2\u0019.google.protobuf.DurationR\bduration\"\u0014\n\u0012StopJfrProfilePushBè\u0001\n(com.lunarclient.websocket.performance.v1B\tPushProtoP\u0001¢\u0002\u0003LWPª\u0002$Lunarclient.Websocket.Performance.V1Ê\u0002$Lunarclient\\Websocket\\Performance\\V1â\u00020Lunarclient\\Websocket\\Performance\\V1\\GPBMetadataê\u0002'Lunarclient::Websocket::Performance::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{DurationProto.getDescriptor()});
      DurationProto.getDescriptor();
   }
}
