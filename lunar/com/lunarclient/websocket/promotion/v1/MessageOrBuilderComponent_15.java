package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface EndPromotionViewRequestOrBuilder extends MessageOrBuilder {
   String getPromotionId();

   ByteString getPromotionIdBytes();

   boolean getCompleted();
}
