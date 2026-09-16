package com.lunarclient.gameipc.paynow.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OpenPayNowJsCheckoutRequestOrBuilder extends MessageOrBuilder {
   String getCheckoutToken();

   ByteString getCheckoutTokenBytes();
}
