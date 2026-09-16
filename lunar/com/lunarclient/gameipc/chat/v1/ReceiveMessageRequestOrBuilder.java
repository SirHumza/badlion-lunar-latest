package com.lunarclient.gameipc.chat.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface ReceiveMessageRequestOrBuilder extends MessageOrBuilder {
   boolean hasSender();

   UuidAndUsername getSender();

   UuidAndUsernameOrBuilder getSenderOrBuilder();

   String getContent();

   ByteString getContentBytes();
}
