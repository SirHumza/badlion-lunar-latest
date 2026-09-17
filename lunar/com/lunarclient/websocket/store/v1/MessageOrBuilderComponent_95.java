package com.lunarclient.websocket.store.v1;

import com.google.protobuf.MessageOrBuilder;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   int getIncomingGiftPrivacyValue();

   IncomingGiftPrivacy getIncomingGiftPrivacy();

   long getCoins();
}
