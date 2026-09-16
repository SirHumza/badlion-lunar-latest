package com.lunarclient.gameipc.paynow.v1;

import com.google.protobuf.MessageOrBuilder;

public interface OpenPayNowJsCheckoutResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   OpenPayNowJsCheckoutResponse.Status getStatus();

   boolean getOpenMinecraftScreen();
}
