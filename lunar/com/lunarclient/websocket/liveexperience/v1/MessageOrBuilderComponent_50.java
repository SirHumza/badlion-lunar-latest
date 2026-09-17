package com.lunarclient.websocket.liveexperience.v1;

import com.google.protobuf.MessageOrBuilder;

public interface LoadLiveExperienceResponseOrBuilder extends MessageOrBuilder {
   boolean hasExperience();

   LiveExperience getExperience();

   LiveExperienceOrBuilder getExperienceOrBuilder();
}
