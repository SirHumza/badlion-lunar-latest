package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   List<ConversationStub> getConversationsList();

   ConversationStub getConversations(int var1);

   int getConversationsCount();

   List<? extends ConversationStubOrBuilder> getConversationsOrBuilderList();

   ConversationStubOrBuilder getConversationsOrBuilder(int var1);

   int getParticipantLimit();

   List<LunarStickerPack> getStickerPacksList();

   LunarStickerPack getStickerPacks(int var1);

   int getStickerPacksCount();

   List<? extends LunarStickerPackOrBuilder> getStickerPacksOrBuilderList();

   LunarStickerPackOrBuilder getStickerPacksOrBuilder(int var1);

   List<LunarEmojiCategory> getEmojiCategoriesList();

   LunarEmojiCategory getEmojiCategories(int var1);

   int getEmojiCategoriesCount();

   List<? extends LunarEmojiCategoryOrBuilder> getEmojiCategoriesOrBuilderList();

   LunarEmojiCategoryOrBuilder getEmojiCategoriesOrBuilder(int var1);

   int getTotalConversations();

   int getMaxMessageLength();

   int getPinnedConversationLimit();
}
