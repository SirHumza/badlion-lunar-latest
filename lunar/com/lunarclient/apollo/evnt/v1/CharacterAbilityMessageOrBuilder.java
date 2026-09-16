package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface CharacterAbilityMessageOrBuilder extends MessageOrBuilder {
   int getCharacterTypeValue();

   CharacterType getCharacterType();

   List<String> getAbilitiesAdventureList();

   int getAbilitiesAdventureCount();

   String getAbilitiesAdventure(int var1);

   ByteString getAbilitiesAdventureBytes(int var1);
}
