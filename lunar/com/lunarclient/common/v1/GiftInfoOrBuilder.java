package com.lunarclient.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface GiftInfoOrBuilder extends MessageOrBuilder {
   boolean hasGiftedBy();

   UuidAndUsername getGiftedBy();

   UuidAndUsernameOrBuilder getGiftedByOrBuilder();

   boolean hasMessage();

   String getMessage();

   ByteString getMessageBytes();

   boolean getIsAnonymous();
}
