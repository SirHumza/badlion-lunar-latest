package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;

public interface ConversationMessageEmbedOrBuilder extends MessageOrBuilder {
   boolean hasImage();

   ImageEmbed getImage();

   ImageEmbedOrBuilder getImageOrBuilder();

   boolean hasLinkPreview();

   LinkPreviewEmbed getLinkPreview();

   LinkPreviewEmbedOrBuilder getLinkPreviewOrBuilder();

   boolean hasCapturedAt();

   Timestamp getCapturedAt();

   TimestampOrBuilder getCapturedAtOrBuilder();

   ConversationMessageEmbed.EmbedCase getEmbedCase();
}
