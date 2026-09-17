package com.lunarclient.websocket.paynow.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PayNowCheckoutOpenedRequestOrBuilder extends MessageOrBuilder {
   String getCheckoutToken();

   ByteString getCheckoutTokenBytes();

   int getBackendValue();

   PayNowCheckoutOpenedRequest.Backend getBackend();
}
