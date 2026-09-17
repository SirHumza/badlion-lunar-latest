package com.lunarclient.gameipc.paynow.v1;

import com.google.protobuf.MessageOrBuilder;

public interface CheckPayNowCapabilitiesResponseOrBuilder extends MessageOrBuilder {
   int getEmbeddedCheckoutValue();

   CheckPayNowCapabilitiesResponse.EmbeddedCheckout getEmbeddedCheckout();
}
