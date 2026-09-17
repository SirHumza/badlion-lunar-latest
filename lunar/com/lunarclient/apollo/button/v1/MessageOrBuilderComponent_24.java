package com.lunarclient.apollo.button.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ButtonTooltipOrBuilder extends MessageOrBuilder {
   List<String> getAdventureJsonLinesList();

   int getAdventureJsonLinesCount();

   String getAdventureJsonLines(int var1);

   ByteString getAdventureJsonLinesBytes(int var1);
}
