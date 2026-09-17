package com.lunarclient.gameipc.promotion.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface PendingPromotionUpdatePushOrBuilder extends MessageOrBuilder {
   @Deprecated
   boolean getHasPendingPromotion();

   List<PromotionType> getPendingPromotionsList();

   int getPendingPromotionsCount();

   PromotionType getPendingPromotions(int var1);

   List<Integer> getPendingPromotionsValueList();

   int getPendingPromotionsValue(int var1);
}
