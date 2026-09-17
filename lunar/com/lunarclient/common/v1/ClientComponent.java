package com.lunarclient.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface InboundInGameOrBuilder extends MessageOrBuilder {
   boolean hasMinecraftVersion();

   MinecraftVersion getMinecraftVersion();

   MinecraftVersionOrBuilder getMinecraftVersionOrBuilder();

   boolean getIsLaunch();

   boolean hasModpack();

   PlayerModpack getModpack();

   PlayerModpackOrBuilder getModpackOrBuilder();

   boolean getIsBadlion();
}
