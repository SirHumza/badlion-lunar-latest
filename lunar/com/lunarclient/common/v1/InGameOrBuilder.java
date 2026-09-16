package com.lunarclient.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface InGameOrBuilder extends MessageOrBuilder {
   boolean hasMinecraftVersion();

   MinecraftVersion getMinecraftVersion();

   MinecraftVersionOrBuilder getMinecraftVersionOrBuilder();

   boolean hasModpack();

   PlayerModpack getModpack();

   PlayerModpackOrBuilder getModpackOrBuilder();

   boolean getIsBadlion();
}
