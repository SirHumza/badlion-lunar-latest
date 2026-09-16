package com.lunarclient.websocket.spray.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.PositionProto;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_UseSprayPush_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_UseSprayPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_UseSprayPush_descriptor,
      new String[]{"PlayerUuid", "SprayId", "Pos", "Facing", "Rotation", "MaxActiveSprays"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_RemoveSprayPush_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_RemoveSprayPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_RemoveSprayPush_descriptor, new String[]{"PlayerUuid", "Pos"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_RefreshSpraysPush_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_RefreshSpraysPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_RefreshSpraysPush_descriptor, new String[0]
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
         "\n)lunarclient/websocket/spray/v1/push.proto\u0012\u001elunarclient.websocket.spray.v1\u001a$lunarclient/common/v1/position.proto\u001a lunarclient/common/v1/uuid.proto\"\u009c\u0002\n\fUseSprayPush\u0012<\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nplayerUuid\u0012\u0019\n\bspray_id\u0018\u0002 \u0001(\u0005R\u0007sprayId\u00121\n\u0003pos\u0018\u0003 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector3fR\u0003pos\u00128\n\u0006facing\u0018\u0004 \u0001(\u000e2 .lunarclient.common.v1.DirectionR\u0006facing\u0012\u001a\n\brotation\u0018\u0005 \u0001(\u0002R\brotation\u0012*\n\u0011max_active_sprays\u0018\u0006 \u0001(\u0005R\u000fmaxActiveSprays\"\u0082\u0001\n\u000fRemoveSprayPush\u0012<\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nplayerUuid\u00121\n\u0003pos\u0018\u0002 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector3fR\u0003pos\"\u0013\n\u0011RefreshSpraysPushBÊ\u0001\n\"com.lunarclient.websocket.spray.v1B\tPushProtoP\u0001¢\u0002\u0003LWSª\u0002\u001eLunarclient.Websocket.Spray.V1Ê\u0002\u001eLunarclient\\Websocket\\Spray\\V1â\u0002*Lunarclient\\Websocket\\Spray\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Spray::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{PositionProto.getDescriptor(), UuidProto.getDescriptor()}
      );
      PositionProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
