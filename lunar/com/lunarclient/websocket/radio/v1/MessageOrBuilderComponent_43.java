package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.MessageOrBuilder;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   boolean getIsPremium();

   int getRadioPlayingVisibilityValue();

   RadioPlayingVisibility getRadioPlayingVisibility();
}
