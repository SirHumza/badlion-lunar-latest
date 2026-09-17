package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.MessageOrBuilder;

public interface PromotionRewardOrBuilder extends MessageOrBuilder {
   boolean hasCosmetic();

   CosmeticPromotionReward getCosmetic();

   CosmeticPromotionRewardOrBuilder getCosmeticOrBuilder();

   boolean hasEmote();

   EmotePromotionReward getEmote();

   EmotePromotionRewardOrBuilder getEmoteOrBuilder();

   boolean hasSpray();

   SprayPromotionReward getSpray();

   SprayPromotionRewardOrBuilder getSprayOrBuilder();

   boolean hasBadge();

   BadgePromotionReward getBadge();

   BadgePromotionRewardOrBuilder getBadgeOrBuilder();

   PromotionReward.RewardCase getRewardCase();
}
