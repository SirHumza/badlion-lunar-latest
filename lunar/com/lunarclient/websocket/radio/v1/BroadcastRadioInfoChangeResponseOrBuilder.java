package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.RadioInfo;
import com.lunarclient.common.v1.RadioInfoOrBuilder;

public interface BroadcastRadioInfoChangeResponseOrBuilder extends MessageOrBuilder {
   boolean hasNewRadioInfo();

   RadioInfo getNewRadioInfo();

   RadioInfoOrBuilder getNewRadioInfoOrBuilder();
}
