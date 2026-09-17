package com.lunarclient.websocket.badge.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_badge_v1_OwnedBadge_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_badge_v1_OwnedBadge_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_badge_v1_OwnedBadge_descriptor,
      new String[]{"BadgeId", "GrantedAt", "ExpiresAt", "ExpirationReason", "IsLunarPlus"}
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
         "\n+lunarclient/websocket/badge/v1/common.proto\u0012\u001elunarclient.websocket.badge.v1\u001a\u001fgoogle/protobuf/timestamp.proto\"¬\u0003\n\nOwnedBadge\u0012\u0019\n\bbadge_id\u0018\u0001 \u0001(\u0005R\u0007badgeId\u00129\n\ngranted_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\tgrantedAt\u00129\n\nexpires_at\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampR\texpiresAt\u0012h\n\u0011expiration_reason\u0018\u0004 \u0001(\u000e2;.lunarclient.websocket.badge.v1.OwnedBadge.ExpirationReasonR\u0010expirationReason\u0012\"\n\ris_lunar_plus\u0018\u0006 \u0001(\bR\u000bisLunarPlus\"\u007f\n\u0010ExpirationReason\u0012!\n\u001dEXPIRATION_REASON_UNSPECIFIED\u0010\u0000\u0012!\n\u001dEXPIRATION_REASON_TIME_LAPSED\u0010\u0001\u0012%\n!EXPIRATION_REASON_LEFT_LC_DISCORD\u0010\u0002BÌ\u0001\n\"com.lunarclient.websocket.badge.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWBª\u0002\u001eLunarclient.Websocket.Badge.V1Ê\u0002\u001eLunarclient\\Websocket\\Badge\\V1â\u0002*Lunarclient\\Websocket\\Badge\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Badge::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor()});
      TimestampProto.getDescriptor();
   }
}
