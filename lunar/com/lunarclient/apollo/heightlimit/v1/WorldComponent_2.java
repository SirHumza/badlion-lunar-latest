package com.lunarclient.apollo.heightlimit.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface OverrideHeightLimitMessageOrBuilder extends MessageOrBuilder {
   String getWorld();

   ByteString getWorldBytes();

   int getLimit();

   String getDisplayNameAdventureJsonLines();

   ByteString getDisplayNameAdventureJsonLinesBytes();
}
