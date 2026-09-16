package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.MessageOrBuilder;

public interface SetRadioPlayingVisibilityRequestOrBuilder extends MessageOrBuilder {
   int getVisibilityValue();

   RadioPlayingVisibility getVisibility();
}
