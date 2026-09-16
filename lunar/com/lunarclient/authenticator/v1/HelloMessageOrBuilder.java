package com.lunarclient.authenticator.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;

public interface HelloMessageOrBuilder extends MessageOrBuilder {
   boolean hasIdentity();

   UuidAndUsername getIdentity();

   UuidAndUsernameOrBuilder getIdentityOrBuilder();

   String getInitiator();

   ByteString getInitiatorBytes();
}
