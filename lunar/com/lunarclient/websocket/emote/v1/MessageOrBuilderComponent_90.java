package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   @Deprecated
   List<Integer> getOwnedEmoteIdsList();

   @Deprecated
   int getOwnedEmoteIdsCount();

   @Deprecated
   int getOwnedEmoteIds(int var1);

   @Deprecated
   List<Integer> getEquippedEmoteIdsList();

   @Deprecated
   int getEquippedEmoteIdsCount();

   @Deprecated
   int getEquippedEmoteIds(int var1);

   @Deprecated
   int getLunarPlusFreeEmoteId();

   List<OwnedEmote> getOwnedEmotesList();

   OwnedEmote getOwnedEmotes(int var1);

   int getOwnedEmotesCount();

   List<? extends OwnedEmoteOrBuilder> getOwnedEmotesOrBuilderList();

   OwnedEmoteOrBuilder getOwnedEmotesOrBuilder(int var1);

   boolean getHasAllEmotesFlag();

   List<EquippedEmote> getEquippedEmotesList();

   EquippedEmote getEquippedEmotes(int var1);

   int getEquippedEmotesCount();

   List<? extends EquippedEmoteOrBuilder> getEquippedEmotesOrBuilderList();

   EquippedEmoteOrBuilder getEquippedEmotesOrBuilder(int var1);

   List<Integer> getLunarPlusFreeEmoteIdsList();

   int getLunarPlusFreeEmoteIdsCount();

   int getLunarPlusFreeEmoteIds(int var1);
}
