package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.MessageOrBuilder;

public interface FetchStateResponseOrBuilder extends MessageOrBuilder {
   boolean hasTrack();

   StyngrTrackState getTrack();

   StyngrTrackStateOrBuilder getTrackOrBuilder();

   boolean hasControls();

   StyngrControlsState getControls();

   StyngrControlsStateOrBuilder getControlsOrBuilder();

   boolean hasProgress();

   StyngrProgressState getProgress();

   StyngrProgressStateOrBuilder getProgressOrBuilder();
}
