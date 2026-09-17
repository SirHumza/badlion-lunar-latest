package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface OverrideCharacterSuitResourcesMessageOrBuilder extends MessageOrBuilder {
   int getCharacterTypeValue();

   CharacterType getCharacterType();

   List<String> getSuitNamesList();

   int getSuitNamesCount();

   String getSuitNames(int var1);

   ByteString getSuitNamesBytes(int var1);
}
