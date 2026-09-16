package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_CosmeticPromotionReward_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_CosmeticPromotionReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_CosmeticPromotionReward_descriptor, new String[]{"CosmeticId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_EmotePromotionReward_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_EmotePromotionReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_EmotePromotionReward_descriptor, new String[]{"EmoteId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_SprayPromotionReward_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_SprayPromotionReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_SprayPromotionReward_descriptor, new String[]{"SprayId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_BadgePromotionReward_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_BadgePromotionReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_BadgePromotionReward_descriptor, new String[]{"BadgeId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_PromotionReward_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_PromotionReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_PromotionReward_descriptor, new String[]{"Cosmetic", "Emote", "Spray", "Badge", "Reward"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_promotion_v1_PendingReward_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_promotion_v1_PendingReward_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_promotion_v1_PendingReward_descriptor, new String[]{"Type", "Rewards"}
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
         "\n/lunarclient/websocket/promotion/v1/common.proto\u0012\"lunarclient.websocket.promotion.v1\":\n\u0017CosmeticPromotionReward\u0012\u001f\n\u000bcosmetic_id\u0018\u0001 \u0001(\u0005R\ncosmeticId\"1\n\u0014EmotePromotionReward\u0012\u0019\n\bemote_id\u0018\u0001 \u0001(\u0005R\u0007emoteId\"1\n\u0014SprayPromotionReward\u0012\u0019\n\bspray_id\u0018\u0001 \u0001(\u0005R\u0007sprayId\"1\n\u0014BadgePromotionReward\u0012\u0019\n\bbadge_id\u0018\u0001 \u0001(\u0005R\u0007badgeId\"ì\u0002\n\u000fPromotionReward\u0012Y\n\bcosmetic\u0018\u0001 \u0001(\u000b2;.lunarclient.websocket.promotion.v1.CosmeticPromotionRewardH\u0000R\bcosmetic\u0012P\n\u0005emote\u0018\u0002 \u0001(\u000b28.lunarclient.websocket.promotion.v1.EmotePromotionRewardH\u0000R\u0005emote\u0012P\n\u0005spray\u0018\u0003 \u0001(\u000b28.lunarclient.websocket.promotion.v1.SprayPromotionRewardH\u0000R\u0005spray\u0012P\n\u0005badge\u0018\u0004 \u0001(\u000b28.lunarclient.websocket.promotion.v1.BadgePromotionRewardH\u0000R\u0005badgeB\b\n\u0006reward\"©\u0001\n\rPendingReward\u0012I\n\u0004type\u0018\u0001 \u0001(\u000e25.lunarclient.websocket.promotion.v1.PendingRewardTypeR\u0004type\u0012M\n\u0007rewards\u0018\u0002 \u0003(\u000b23.lunarclient.websocket.promotion.v1.PromotionRewardR\u0007rewards*W\n\u0011PendingRewardType\u0012#\n\u001fPENDING_REWARD_TYPE_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019PENDING_REWARD_TYPE_MEDAL\u0010\u0001Bà\u0001\n&com.lunarclient.websocket.promotion.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWPª\u0002\"Lunarclient.Websocket.Promotion.V1Ê\u0002\"Lunarclient\\Websocket\\Promotion\\V1â\u0002.Lunarclient\\Websocket\\Promotion\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Promotion::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
