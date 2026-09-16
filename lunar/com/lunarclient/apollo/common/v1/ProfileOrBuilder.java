package com.lunarclient.apollo.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ProfileOrBuilder extends MessageOrBuilder {
   boolean hasId();

   Uuid getId();

   UuidOrBuilder getIdOrBuilder();

   String getTexture();

   ByteString getTextureBytes();

   String getSignature();

   ByteString getSignatureBytes();
}
