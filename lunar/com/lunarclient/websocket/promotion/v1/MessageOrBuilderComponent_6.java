package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface StartPromotionViewRequestOrBuilder extends MessageOrBuilder {
   String getPromotionId();

   ByteString getPromotionIdBytes();
}
