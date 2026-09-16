package com.lunarclient.websocket.paynow.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OpenPayNowCheckoutPushOrBuilder extends MessageOrBuilder {
   String getCheckoutToken();

   ByteString getCheckoutTokenBytes();
}
