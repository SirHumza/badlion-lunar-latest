package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface OverrideCharacterMessageOrBuilder extends MessageOrBuilder {
   int getCharacterTypeValue();

   CharacterType getCharacterType();

   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   boolean hasColor();

   Color getColor();

   ColorOrBuilder getColorOrBuilder();

   boolean getEquipped();

   String getSuitName();

   ByteString getSuitNameBytes();
}
