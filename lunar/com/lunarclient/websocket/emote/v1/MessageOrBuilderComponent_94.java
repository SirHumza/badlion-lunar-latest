package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface UpdateEquippedEmotesRequestOrBuilder extends MessageOrBuilder {
   @Deprecated
   List<Integer> getEquippedEmoteIdsList();

   @Deprecated
   int getEquippedEmoteIdsCount();

   @Deprecated
   int getEquippedEmoteIds(int var1);

   List<EquippedEmote> getEquippedEmotesList();

   EquippedEmote getEquippedEmotes(int var1);

   int getEquippedEmotesCount();

   List<? extends EquippedEmoteOrBuilder> getEquippedEmotesOrBuilderList();

   EquippedEmoteOrBuilder getEquippedEmotesOrBuilder(int var1);
}
