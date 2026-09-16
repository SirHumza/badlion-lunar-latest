package com.lunarclient.gameipc.tebex.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OpenTebexJsCheckoutRequestOrBuilder extends MessageOrBuilder {
   String getBasketIdent();

   ByteString getBasketIdentBytes();

   String getLocale();

   ByteString getLocaleBytes();
}
