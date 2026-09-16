package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.ColorProto;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_descriptor,
      new String[]{"PlayerUuid", "LogoColor", "LogoAlwaysShow", "PlusColor", "ConditionalCosmetics", "DefaultCosmetics", "BadgeId", "OutfitUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_ConditionalCosmetics_descriptor = internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_ConditionalCosmetics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_ConditionalCosmetics_descriptor, new String[]{"EquipCondition", "Cosmetics"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_cosmetic_v2_RefreshCosmeticsPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_cosmetic_v2_RefreshCosmeticsPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_cosmetic_v2_RefreshCosmeticsPush_descriptor, new String[0]
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
         "\n,lunarclient/websocket/cosmetic/v2/push.proto\u0012!lunarclient.websocket.cosmetic.v2\u001a!lunarclient/common/v1/color.proto\u001a lunarclient/common/v1/uuid.proto\u001a.lunarclient/websocket/cosmetic/v2/common.proto\"\u0081\u0006\n\u0015PlayerCosmeticsPushV2\u0012<\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nplayerUuid\u0012;\n\nlogo_color\u0018\u0002 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tlogoColor\u0012(\n\u0010logo_always_show\u0018\u0003 \u0001(\bR\u000elogoAlwaysShow\u0012;\n\nplus_color\u0018\u0004 \u0001(\u000b2\u001c.lunarclient.common.v1.ColorR\tplusColor\u0012\u0082\u0001\n\u0015conditional_cosmetics\u0018\u0005 \u0003(\u000b2M.lunarclient.websocket.cosmetic.v2.PlayerCosmeticsPushV2.ConditionalCosmeticsR\u0014conditionalCosmetics\u0012`\n\u0011default_cosmetics\u0018\u0006 \u0003(\u000b23.lunarclient.websocket.cosmetic.v2.EquippedCosmeticR\u0010defaultCosmetics\u0012\u0019\n\bbadge_id\u0018\u0007 \u0001(\u0005R\u0007badgeId\u0012<\n\u000boutfit_uuid\u0018\b \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\noutfitUuid\u001aÅ\u0001\n\u0014ConditionalCosmetics\u0012Z\n\u000fequip_condition\u0018\u0001 \u0001(\u000b21.lunarclient.websocket.cosmetic.v2.EquipConditionR\u000eequipCondition\u0012Q\n\tcosmetics\u0018\u0002 \u0003(\u000b23.lunarclient.websocket.cosmetic.v2.EquippedCosmeticR\tcosmetics\"\u0016\n\u0014RefreshCosmeticsPushBÙ\u0001\n%com.lunarclient.websocket.cosmetic.v2B\tPushProtoP\u0001¢\u0002\u0003LWCª\u0002!Lunarclient.Websocket.Cosmetic.V2Ê\u0002!Lunarclient\\Websocket\\Cosmetic\\V2â\u0002-Lunarclient\\Websocket\\Cosmetic\\V2\\GPBMetadataê\u0002$Lunarclient::Websocket::Cosmetic::V2b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), UuidProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
