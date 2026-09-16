package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ConversationMessageContentsOrBuilder extends MessageOrBuilder {
   boolean hasPlainText();

   String getPlainText();

   ByteString getPlainTextBytes();

   boolean hasSticker();

   LunarSticker getSticker();

   LunarStickerOrBuilder getStickerOrBuilder();

   boolean hasSystem();

   SystemMessage getSystem();

   SystemMessageOrBuilder getSystemOrBuilder();

   List<ConversationImage> getImagesList();

   ConversationImage getImages(int var1);

   int getImagesCount();

   List<? extends ConversationImageOrBuilder> getImagesOrBuilderList();

   ConversationImageOrBuilder getImagesOrBuilder(int var1);

   boolean hasEmbed();

   ConversationMessageEmbed getEmbed();

   ConversationMessageEmbedOrBuilder getEmbedOrBuilder();

   ConversationMessageContents.ContentsCase getContentsCase();
}
