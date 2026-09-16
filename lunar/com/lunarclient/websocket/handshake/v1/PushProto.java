package com.lunarclient.websocket.handshake.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_handshake_v1_SessionIdentifyPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_handshake_v1_SessionIdentifyPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_handshake_v1_SessionIdentifyPush_descriptor, new String[]{"SessionId"}
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
         "\n-lunarclient/websocket/handshake/v1/push.proto\u0012\"lunarclient.websocket.handshake.v1\u001a lunarclient/common/v1/uuid.proto\"Q\n\u0013SessionIdentifyPush\u0012:\n\nsession_id\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\tsessionIdBÞ\u0001\n&com.lunarclient.websocket.handshake.v1B\tPushProtoP\u0001¢\u0002\u0003LWHª\u0002\"Lunarclient.Websocket.Handshake.V1Ê\u0002\"Lunarclient\\Websocket\\Handshake\\V1â\u0002.Lunarclient\\Websocket\\Handshake\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Handshake::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
