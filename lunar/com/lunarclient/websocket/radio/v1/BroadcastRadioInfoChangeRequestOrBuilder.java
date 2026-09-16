package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.MessageOrBuilder;

public interface BroadcastRadioInfoChangeRequestOrBuilder extends MessageOrBuilder {
   boolean hasNewRadioInfo();

   InboundRadioInfo getNewRadioInfo();

   InboundRadioInfoOrBuilder getNewRadioInfoOrBuilder();

   int getInitiatorValue();

   BroadcastRadioInfoChangeRequest.InfoChangeInitiator getInitiator();

   int getInitiatorSourceValue();

   BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSource getInitiatorSource();
}
