package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.MessageOrBuilder;

public interface StyngrTrackUpdateOrBuilder extends MessageOrBuilder {
   boolean hasTrack();

   StyngrTrackState getTrack();

   StyngrTrackStateOrBuilder getTrackOrBuilder();
}
