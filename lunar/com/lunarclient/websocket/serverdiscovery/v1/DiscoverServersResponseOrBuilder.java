package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface DiscoverServersResponseOrBuilder extends MessageOrBuilder {
   List<ServerSection> getSectionsList();

   ServerSection getSections(int var1);

   int getSectionsCount();

   List<? extends ServerSectionOrBuilder> getSectionsOrBuilderList();

   ServerSectionOrBuilder getSectionsOrBuilder(int var1);
}
