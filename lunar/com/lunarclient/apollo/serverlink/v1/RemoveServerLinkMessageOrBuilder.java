package com.lunarclient.apollo.serverlink.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface RemoveServerLinkMessageOrBuilder extends MessageOrBuilder {
   List<String> getServerLinkIdsList();

   int getServerLinkIdsCount();

   String getServerLinkIds(int var1);

   ByteString getServerLinkIdsBytes(int var1);
}
