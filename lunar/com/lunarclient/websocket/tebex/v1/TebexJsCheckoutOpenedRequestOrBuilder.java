package com.lunarclient.websocket.tebex.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface TebexJsCheckoutOpenedRequestOrBuilder extends MessageOrBuilder {
   String getBasketIdent();

   ByteString getBasketIdentBytes();

   int getBackendValue();

   TebexJsCheckoutOpenedRequest.Backend getBackend();

   String getLocale();

   ByteString getLocaleBytes();
}
