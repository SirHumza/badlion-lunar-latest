package com.lunarclient.apollo.modsetting.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface InstalledModsResponseOrBuilder extends MessageOrBuilder {
   ByteString getRequestId();

   int getPage();

   int getTotalPages();

   List<ModGroup> getModGroupsList();

   ModGroup getModGroups(int var1);

   int getModGroupsCount();

   List<? extends ModGroupOrBuilder> getModGroupsOrBuilderList();

   ModGroupOrBuilder getModGroupsOrBuilder(int var1);
}
