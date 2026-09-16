package com.lunarclient.gameipc.tebex.v1;

import com.google.protobuf.MessageOrBuilder;

public interface CheckTebexCapabilitiesResponseOrBuilder extends MessageOrBuilder {
   int getEmbeddedCheckoutValue();

   CheckTebexCapabilitiesResponse.EmbeddedCheckout getEmbeddedCheckout();
}
