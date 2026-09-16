package com.lunarclient.authenticator.v1;

import com.google.protobuf.MessageOrBuilder;

public interface ClientboundWebSocketMessageOrBuilder extends MessageOrBuilder {
   boolean hasEncryptionRequest();

   EncryptionRequestMessage getEncryptionRequest();

   EncryptionRequestMessageOrBuilder getEncryptionRequestOrBuilder();

   boolean hasAuthSuccess();

   AuthSuccessMessage getAuthSuccess();

   AuthSuccessMessageOrBuilder getAuthSuccessOrBuilder();

   ClientboundWebSocketMessage.ContentsCase getContentsCase();
}
