package com.lunarclient.common.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface PublicServerVersionsOrBuilder extends MessageOrBuilder {
   List<MinecraftVersion> getSupportedList();

   MinecraftVersion getSupported(int var1);

   int getSupportedCount();

   List<? extends MinecraftVersionOrBuilder> getSupportedOrBuilderList();

   MinecraftVersionOrBuilder getSupportedOrBuilder(int var1);

   boolean hasRecommended();

   MinecraftVersion getRecommended();

   MinecraftVersionOrBuilder getRecommendedOrBuilder();
}
