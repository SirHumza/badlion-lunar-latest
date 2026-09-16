package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.MessageOrBuilder;

public interface ClaimPendingRewardRequestOrBuilder extends MessageOrBuilder {
   int getInitiatorValue();

   ClaimPendingRewardRequest.Initiator getInitiator();

   int getTypeValue();

   PendingRewardType getType();

   boolean hasReward();

   PromotionReward getReward();

   PromotionRewardOrBuilder getRewardOrBuilder();
}
