package com.lunarclient.websocket.jam.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.GiftProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_jam_v1_OwnedJam_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_jam_v1_OwnedJam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_jam_v1_OwnedJam_descriptor, new String[]{"JamId", "GrantedAt", "ExpiresAt", "GiftInfo"}
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
         "\n)lunarclient/websocket/jam/v1/common.proto\u0012\u001clunarclient.websocket.jam.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a lunarclient/common/v1/gift.proto\"Õ\u0001\n\bOwnedJam\u0012\u0015\n\u0006jam_id\u0018\u0001 \u0001(\u0005R\u0005jamId\u00129\n\ngranted_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\tgrantedAt\u00129\n\nexpires_at\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampR\texpiresAt\u0012<\n\tgift_info\u0018\u0004 \u0001(\u000b2\u001f.lunarclient.common.v1.GiftInfoR\bgiftInfoBÂ\u0001\n com.lunarclient.websocket.jam.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWJª\u0002\u001cLunarclient.Websocket.Jam.V1Ê\u0002\u001cLunarclient\\Websocket\\Jam\\V1â\u0002(Lunarclient\\Websocket\\Jam\\V1\\GPBMetadataê\u0002\u001fLunarclient::Websocket::Jam::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor(), GiftProto.getDescriptor()}
      );
      TimestampProto.getDescriptor();
      GiftProto.getDescriptor();
   }
}
