package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   @Deprecated
   boolean getCornerExempt();

   boolean getShowAds();

   int getOutplayedPromotionStateValue();

   LoginResponse.OutplayedPromotionState getOutplayedPromotionState();

   List<PendingReward> getPendingRewardsList();

   PendingReward getPendingRewards(int var1);

   int getPendingRewardsCount();

   List<? extends PendingRewardOrBuilder> getPendingRewardsOrBuilderList();

   PendingRewardOrBuilder getPendingRewardsOrBuilder(int var1);

   int getMedalPromotionStateValue();

   LoginResponse.MedalPromotionState getMedalPromotionState();
}
