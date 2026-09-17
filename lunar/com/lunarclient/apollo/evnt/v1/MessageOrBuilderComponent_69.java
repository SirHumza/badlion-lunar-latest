package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface OverrideCharacterAbilityMessageOrBuilder extends MessageOrBuilder {
   List<CharacterAbilityMessage> getAbilitiesList();

   CharacterAbilityMessage getAbilities(int var1);

   int getAbilitiesCount();

   List<? extends CharacterAbilityMessageOrBuilder> getAbilitiesOrBuilderList();

   CharacterAbilityMessageOrBuilder getAbilitiesOrBuilder(int var1);
}
