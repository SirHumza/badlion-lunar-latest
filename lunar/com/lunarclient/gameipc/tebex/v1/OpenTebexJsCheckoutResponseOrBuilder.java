package com.lunarclient.gameipc.tebex.v1;

import com.google.protobuf.MessageOrBuilder;

public interface OpenTebexJsCheckoutResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   OpenTebexJsCheckoutResponse.Status getStatus();

   boolean getOpenMinecraftScreen();
}
