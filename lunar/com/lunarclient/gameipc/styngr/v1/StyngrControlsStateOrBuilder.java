package com.lunarclient.gameipc.styngr.v1;

import com.google.protobuf.MessageOrBuilder;

public interface StyngrControlsStateOrBuilder extends MessageOrBuilder {
   boolean getPlaying();

   boolean getMuted();

   float getVolume();
}
