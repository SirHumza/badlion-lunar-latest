package com.lunarclient.apollo.serverlink.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface AddServerLinkMessageOrBuilder extends MessageOrBuilder {
   List<ServerLink> getServerLinksList();

   ServerLink getServerLinks(int var1);

   int getServerLinksCount();

   List<? extends ServerLinkOrBuilder> getServerLinksOrBuilderList();

   ServerLinkOrBuilder getServerLinksOrBuilder(int var1);
}
