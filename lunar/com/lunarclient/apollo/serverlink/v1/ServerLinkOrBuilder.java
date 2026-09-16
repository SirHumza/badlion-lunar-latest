package com.lunarclient.apollo.serverlink.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ServerLinkOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   String getDisplayNameAdventureJsonLines();

   ByteString getDisplayNameAdventureJsonLinesBytes();

   String getUrl();

   ByteString getUrlBytes();
}
