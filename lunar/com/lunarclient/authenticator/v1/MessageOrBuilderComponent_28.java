package com.lunarclient.authenticator.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface EncryptionResponseMessageOrBuilder extends MessageOrBuilder {
   ByteString getSecretKey();

   ByteString getPublicKey();
}
