package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ServerSectionOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getName();

   ByteString getNameBytes();

   String getEmoji();

   ByteString getEmojiBytes();

   boolean getShowNotInterested();

   int getCardSizeValue();

   ServerSection.CardSize getCardSize();

   List<ServerCard> getCardsList();

   ServerCard getCards(int var1);

   int getCardsCount();

   List<? extends ServerCardOrBuilder> getCardsOrBuilderList();

   ServerCardOrBuilder getCardsOrBuilder(int var1);

   String getDescription();

   ByteString getDescriptionBytes();
}
