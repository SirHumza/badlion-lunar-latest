package com.lunarclient.websocket.cosmetic.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_PlayerCosmeticsPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_PlayerCosmeticsPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_PlayerCosmeticsPush_descriptor,
      new String[]{"PlayerUuid", "Settings", "LogoColor", "LogoAlwaysShow", "BadgeId", "OutfitUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v1_RefreshCosmeticsPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v1_RefreshCosmeticsPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v1_RefreshCosmeticsPush_descriptor, new String[0]
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
         "\n,lunarclient/websocket/cosmetic/v1/push.proto\u0012!lunarclient.websocket.cosmetic.v1\u001a!lunarclient/common/v1/color.proto\u001a lunarclient/common/v1/uuid.proto\u001a.lunarclient/websocket/cosmetic/v1/common.proto\"ð\u0002\n\u0013PlayerCosmeticsPush\u0012<\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nplayerUuid\u0012[\n\bsettings\u0018\u0002 \u0001(\u000b2?.lunarclient.websocket.cosmetic.v1.CustomizableCosmeticSettingsR\bsettings\u0012;\n\nlogo_color\u0018\u0003 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012(\n\u0010logo_always_show\u0018\u0004 \u0001(\bR\u000elogoAlwaysShow\u0012\u0019\n\bbadge_id\u0018\u0005 \u0001(\u0005R\u0007badgeId\u0012<\n\u000boutfit_uuid\u0018\u0006 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\noutfitUuid\"\u0016\n\u0014RefreshCosmeticsPushBÙ\u0001\n%com.lunarclient.websocket.cosmetic.v1B\tPushProtoP\u0001¢\u0002\u0003LWCª\u0002!Lunarclient.Websocket.Cosmetic.V1Ê\u0002!Lunarclient\\Websocket\\Cosmetic\\V1â\u0002-Lunarclient\\Websocket\\Cosmetic\\V1\\GPBMetadataê\u0002$Lunarclient::Websocket::Cosmetic::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), UuidProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
