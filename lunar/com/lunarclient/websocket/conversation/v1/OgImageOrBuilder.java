package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OgImageOrBuilder extends MessageOrBuilder {
   String getUrl();

   ByteString getUrlBytes();

   boolean hasWidth();

   int getWidth();

   boolean hasHeight();

   int getHeight();

   String getMimeType();

   ByteString getMimeTypeBytes();
}
