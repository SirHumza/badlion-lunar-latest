package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ServerSectionCardsPushOrBuilder extends MessageOrBuilder {
   String getSectionId();

   ByteString getSectionIdBytes();

   List<ServerCard> getCardsList();

   ServerCard getCards(int var1);

   int getCardsCount();

   List<? extends ServerCardOrBuilder> getCardsOrBuilderList();

   ServerCardOrBuilder getCardsOrBuilder(int var1);
}
