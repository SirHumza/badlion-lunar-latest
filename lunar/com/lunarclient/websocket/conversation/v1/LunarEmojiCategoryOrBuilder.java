package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LunarEmojiCategoryOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getName();

   ByteString getNameBytes();

   String getIconUrl();

   ByteString getIconUrlBytes();

   List<LunarEmoji> getEmojisList();

   LunarEmoji getEmojis(int var1);

   int getEmojisCount();

   List<? extends LunarEmojiOrBuilder> getEmojisOrBuilderList();

   LunarEmojiOrBuilder getEmojisOrBuilder(int var1);
}
