package com.lunarclient.websocket.spray.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.GiftProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_OwnedSpray_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_OwnedSpray_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_OwnedSpray_descriptor, new String[]{"SprayId", "GrantedAt", "ExpiresAt", "GiftInfo"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_spray_v1_EquippedSpray_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_spray_v1_EquippedSpray_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_spray_v1_EquippedSpray_descriptor, new String[]{"SprayId", "SlotNumber"}
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
         "\n+lunarclient/websocket/spray/v1/common.proto\u0012\u001elunarclient.websocket.spray.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a lunarclient/common/v1/gift.proto\"Û\u0001\n\nOwnedSpray\u0012\u0019\n\bspray_id\u0018\u0001 \u0001(\u0005R\u0007sprayId\u00129\n\ngranted_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\tgrantedAt\u00129\n\nexpires_at\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampR\texpiresAt\u0012<\n\tgift_info\u0018\u0004 \u0001(\u000b2\u001f.lunarclient.common.v1.GiftInfoR\bgiftInfo\"K\n\rEquippedSpray\u0012\u0019\n\bspray_id\u0018\u0001 \u0001(\u0005R\u0007sprayId\u0012\u001f\n\u000bslot_number\u0018\u0002 \u0001(\u0005R\nslotNumberBÌ\u0001\n\"com.lunarclient.websocket.spray.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWSª\u0002\u001eLunarclient.Websocket.Spray.V1Ê\u0002\u001eLunarclient\\Websocket\\Spray\\V1â\u0002*Lunarclient\\Websocket\\Spray\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Spray::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor(), GiftProto.getDescriptor()}
      );
      TimestampProto.getDescriptor();
      GiftProto.getDescriptor();
   }
}
