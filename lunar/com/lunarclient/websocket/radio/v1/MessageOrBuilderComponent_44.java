package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.MessageOrBuilder;

public interface InboundRadioInfoOrBuilder extends MessageOrBuilder {
   boolean hasTrack();

   InboundRadioTrack getTrack();

   InboundRadioTrackOrBuilder getTrackOrBuilder();

   boolean hasStation();

   InboundRadioStation getStation();

   InboundRadioStationOrBuilder getStationOrBuilder();
}
