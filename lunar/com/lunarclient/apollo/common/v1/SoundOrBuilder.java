package com.lunarclient.apollo.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface SoundOrBuilder extends MessageOrBuilder {
   boolean hasSimpleResourceLocation();

   SimpleResourceLocationSound getSimpleResourceLocation();

   SimpleResourceLocationSoundOrBuilder getSimpleResourceLocationOrBuilder();

   Sound.ContentsCase getContentsCase();
}
