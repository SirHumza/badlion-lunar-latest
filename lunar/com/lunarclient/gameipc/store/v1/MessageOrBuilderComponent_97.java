package com.lunarclient.gameipc.store.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface StartStorePreviewSessionPushOrBuilder extends MessageOrBuilder {
   String getBasketIdent();

   ByteString getBasketIdentBytes();

   String getCurrency();

   ByteString getCurrencyBytes();

   boolean hasPackageId();

   int getPackageId();
}
