package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface OverrideCosmeticResourcesMessageOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   int getCharacterTypeValue();

   CharacterType getCharacterType();

   String getModelPath();

   ByteString getModelPathBytes();

   String getAnimationPath();

   ByteString getAnimationPathBytes();

   String getTexturePath();

   ByteString getTexturePathBytes();
}
