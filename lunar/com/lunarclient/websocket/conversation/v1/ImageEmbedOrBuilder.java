package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ImageEmbedOrBuilder extends MessageOrBuilder {
   String getRawUrl();

   ByteString getRawUrlBytes();

   String getNormalizedUrl();

   ByteString getNormalizedUrlBytes();

   String getProxiedUrl();

   ByteString getProxiedUrlBytes();

   String getMimeType();

   ByteString getMimeTypeBytes();

   boolean hasWidth();

   int getWidth();

   boolean hasHeight();

   int getHeight();

   boolean hasContentLength();

   long getContentLength();
}
