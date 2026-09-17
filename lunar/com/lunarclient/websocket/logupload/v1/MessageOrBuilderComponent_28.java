package com.lunarclient.websocket.logupload.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface CompleteLogUploadRequestOrBuilder extends MessageOrBuilder {
   String getUploadId();

   ByteString getUploadIdBytes();
}
