package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LunarStickerPackOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getName();

   ByteString getNameBytes();

   String getIconUrl();

   ByteString getIconUrlBytes();

   List<LunarSticker> getStickersList();

   LunarSticker getStickers(int var1);

   int getStickersCount();

   List<? extends LunarStickerOrBuilder> getStickersOrBuilderList();

   LunarStickerOrBuilder getStickersOrBuilder(int var1);
}
