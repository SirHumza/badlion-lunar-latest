package com.lunarclient.apollo.modsetting.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface ModGroupOrBuilder extends MessageOrBuilder {
   int getTypeValue();

   ModGroup.Type getType();

   List<Mod> getModsList();

   Mod getMods(int var1);

   int getModsCount();

   List<? extends ModOrBuilder> getModsOrBuilderList();

   ModOrBuilder getModsOrBuilder(int var1);
}
