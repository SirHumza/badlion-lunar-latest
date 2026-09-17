package com.lunarclient.apollo.hologram.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Component;
import com.lunarclient.apollo.common.v1.ComponentOrBuilder;
import com.lunarclient.apollo.common.v1.Location;
import com.lunarclient.apollo.common.v1.LocationOrBuilder;
import java.util.List;

public interface DisplayHologramMessageOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   boolean hasLocation();

   Location getLocation();

   LocationOrBuilder getLocationOrBuilder();

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

   boolean getShowThroughWalls();

   boolean getShowShadow();

   boolean getShowBackground();

   List<String> getAdventureJsonLinesList();

   int getAdventureJsonLinesCount();

   String getAdventureJsonLines(int var1);

   ByteString getAdventureJsonLinesBytes(int var1);
}
