package com.lunarclient.authenticator.v1;

import com.google.protobuf.MessageOrBuilder;

public interface ServerboundWebSocketMessageOrBuilder extends MessageOrBuilder {
   boolean hasHello();

   HelloMessage getHello();

   HelloMessageOrBuilder getHelloOrBuilder();

   boolean hasEncryptionResponse();

   EncryptionResponseMessage getEncryptionResponse();

   EncryptionResponseMessageOrBuilder getEncryptionResponseOrBuilder();

   boolean hasEncryptionFail();

   EncryptionFailMessage getEncryptionFail();

   EncryptionFailMessageOrBuilder getEncryptionFailOrBuilder();

   ServerboundWebSocketMessage.ContentsCase getContentsCase();
}
