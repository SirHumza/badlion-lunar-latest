package com.lunarclient.apollo.chat.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface DisplayLiveChatMessageMessageOrBuilder extends MessageOrBuilder {
   int getMessageId();

   String getAdventureJsonLines();

   ByteString getAdventureJsonLinesBytes();
}
