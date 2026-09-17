package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface UploadRequestItemOrBuilder extends MessageOrBuilder {
   String getContentType();

   ByteString getContentTypeBytes();

   long getExpectedSizeBytes();
}
