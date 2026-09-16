package com.lunarclient.gameipc.promotion.v1;

import com.google.protobuf.MessageOrBuilder;

public interface PlayPromotionRequestOrBuilder extends MessageOrBuilder {
   int getTypeValue();

   PromotionType getType();
}
