package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface EventPlayerMessageOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   String getPlayerNameAdventure();

   ByteString getPlayerNameAdventureBytes();

   int getCharacterTypeValue();

   CharacterType getCharacterType();

   boolean getTeamOne();
}
