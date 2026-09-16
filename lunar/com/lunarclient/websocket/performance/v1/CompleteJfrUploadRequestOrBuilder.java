package com.lunarclient.websocket.performance.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface CompleteJfrUploadRequestOrBuilder extends MessageOrBuilder {
   String getUploadId();

   ByteString getUploadIdBytes();
}
