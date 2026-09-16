package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface LunarEmojiOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getUrl();

   ByteString getUrlBytes();

   String getName();

   ByteString getNameBytes();
}
