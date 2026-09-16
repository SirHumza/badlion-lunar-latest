package com.lunarclient.apollo.tebex.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OpenTebexEmbeddedCheckoutMessageOrBuilder extends MessageOrBuilder {
   String getBasketIdent();

   ByteString getBasketIdentBytes();

   String getLocale();

   ByteString getLocaleBytes();
}
