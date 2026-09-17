package com.lunarclient.apollo.stopwatch.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface StartTimerMessageOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();
}
