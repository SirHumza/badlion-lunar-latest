package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface EndPromotionViewResponseOrBuilder extends MessageOrBuilder {
   List<PromotionReward> getRewardsList();

   PromotionReward getRewards(int var1);

   int getRewardsCount();

   List<? extends PromotionRewardOrBuilder> getRewardsOrBuilderList();

   PromotionRewardOrBuilder getRewardsOrBuilder(int var1);
}
