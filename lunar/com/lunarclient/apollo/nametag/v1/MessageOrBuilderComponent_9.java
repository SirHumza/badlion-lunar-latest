package com.lunarclient.apollo.nametag.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Component;
import com.lunarclient.apollo.common.v1.ComponentOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.util.List;

public interface OverrideNametagMessageOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   @Deprecated
   List<Component> getLinesList();

   @Deprecated
   Component getLines(int var1);

   @Deprecated
   int getLinesCount();

   @Deprecated
   List<? extends ComponentOrBuilder> getLinesOrBuilderList();

   @Deprecated
   ComponentOrBuilder getLinesOrBuilder(int var1);

   List<String> getAdventureJsonLinesList();

   int getAdventureJsonLinesCount();

   String getAdventureJsonLines(int var1);

   ByteString getAdventureJsonLinesBytes(int var1);

   int getVisibilityOverrideValue();

   NametagVisibilityOverride getVisibilityOverride();
}
