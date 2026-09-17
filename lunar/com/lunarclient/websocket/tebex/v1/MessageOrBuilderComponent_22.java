package com.lunarclient.websocket.tebex.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OpenTebexJsCheckoutPushOrBuilder extends MessageOrBuilder {
   String getBasketIdent();

   ByteString getBasketIdentBytes();

   String getLocale();

   ByteString getLocaleBytes();
}
