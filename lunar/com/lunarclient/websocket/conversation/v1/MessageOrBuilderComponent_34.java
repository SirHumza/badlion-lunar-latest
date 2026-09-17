package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface LinkPreviewEmbedOrBuilder extends MessageOrBuilder {
   String getRawUrl();

   ByteString getRawUrlBytes();

   String getNormalizedUrl();

   ByteString getNormalizedUrlBytes();

   String getProxiedUrl();

   ByteString getProxiedUrlBytes();

   String getSiteName();

   ByteString getSiteNameBytes();

   String getTitle();

   ByteString getTitleBytes();

   String getDescription();

   ByteString getDescriptionBytes();

   boolean hasImage();

   OgImage getImage();

   OgImageOrBuilder getImageOrBuilder();

   String getOgType();

   ByteString getOgTypeBytes();

   String getContentType();

   ByteString getContentTypeBytes();
}
