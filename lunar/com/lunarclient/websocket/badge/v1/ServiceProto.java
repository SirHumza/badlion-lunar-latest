package com.lunarclient.websocket.badge.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_badge_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_badge_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_badge_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_badge_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_badge_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_badge_v1_LoginResponse_descriptor, new String[]{"OwnedBadges", "EquippedBadgeId", "HasAllBadgesFlag"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_badge_v1_EquipBadgeRequest_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_badge_v1_EquipBadgeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_badge_v1_EquipBadgeRequest_descriptor, new String[]{"BadgeId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_badge_v1_EquipBadgeResponse_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_badge_v1_EquipBadgeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_badge_v1_EquipBadgeResponse_descriptor, new String[0]
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
         "\n,lunarclient/websocket/badge/v1/service.proto\u0012\u001elunarclient.websocket.badge.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a+lunarclient/websocket/badge/v1/common.proto\"\u000e\n\fLoginRequest\"¹\u0001\n\rLoginResponse\u0012M\n\fowned_badges\u0018\u0001 \u0003(\u000b2*.lunarclient.websocket.badge.v1.OwnedBadgeR\u000bownedBadges\u0012*\n\u0011equipped_badge_id\u0018\u0002 \u0001(\u0005R\u000fequippedBadgeId\u0012-\n\u0013has_all_badges_flag\u0018\u0003 \u0001(\bR\u0010hasAllBadgesFlag\".\n\u0011EquipBadgeRequest\u0012\u0019\n\bbadge_id\u0018\u0001 \u0001(\u0005R\u0007badgeId\"\u0014\n\u0012EquipBadgeResponse2õ\u0001\n\fBadgeService\u0012j\n\u0005Login\u0012,.lunarclient.websocket.badge.v1.LoginRequest\u001a-.lunarclient.websocket.badge.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012y\n\nEquipBadge\u00121.lunarclient.websocket.badge.v1.EquipBadgeRequest\u001a2.lunarclient.websocket.badge.v1.EquipBadgeResponse\"\u0004\u0088µ\u0018\u0003BÐ\u0001\n\"com.lunarclient.websocket.badge.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWBª\u0002\u001eLunarclient.Websocket.Badge.V1Ê\u0002\u001eLunarclient\\Websocket\\Badge\\V1â\u0002*Lunarclient\\Websocket\\Badge\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Badge::V1b\u0006proto3"
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
