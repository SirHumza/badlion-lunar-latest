package com.lunarclient.websocket.liveexperience.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface JoinLiveExperienceRequestOrBuilder extends MessageOrBuilder {
   String getExperienceId();

   ByteString getExperienceIdBytes();
}
