package com.lunarclient.apollo.paynow.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OpenPayNowEmbeddedCheckoutMessageOrBuilder extends MessageOrBuilder {
   String getCheckoutToken();

   ByteString getCheckoutTokenBytes();
}
