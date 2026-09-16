package com.lunarclient.websocket.performance.v1;

import com.google.protobuf.Duration;
import com.google.protobuf.DurationOrBuilder;
import com.google.protobuf.MessageOrBuilder;

public interface StartJfrProfilePushOrBuilder extends MessageOrBuilder {
   boolean hasDuration();

   Duration getDuration();

   DurationOrBuilder getDurationOrBuilder();
}
