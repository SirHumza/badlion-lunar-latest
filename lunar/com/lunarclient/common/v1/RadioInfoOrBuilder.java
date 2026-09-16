package com.lunarclient.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface RadioInfoOrBuilder extends MessageOrBuilder {
   boolean hasTrack();

   RadioTrack getTrack();

   RadioTrackOrBuilder getTrackOrBuilder();

   boolean hasStation();

   RadioStation getStation();

   RadioStationOrBuilder getStationOrBuilder();
}
