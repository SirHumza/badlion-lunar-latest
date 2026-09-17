package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ServerGameTypeOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();

   String getEmoji();

   ByteString getEmojiBytes();
}
