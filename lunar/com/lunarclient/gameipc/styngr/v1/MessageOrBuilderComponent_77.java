package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.MessageOrBuilder;

public interface StyngrTrackControlsUpdateOrBuilder extends MessageOrBuilder {
   boolean getPlaying();

   boolean getMuted();

   float getVolume();
}
