package com.lunarclient.authenticator.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface AuthSuccessMessageOrBuilder extends MessageOrBuilder {
   String getJwt();

   ByteString getJwtBytes();
}
