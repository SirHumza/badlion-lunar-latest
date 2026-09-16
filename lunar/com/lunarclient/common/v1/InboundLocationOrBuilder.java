package com.lunarclient.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface InboundLocationOrBuilder extends MessageOrBuilder {
   boolean hasServer();

   InboundServer getServer();

   InboundServerOrBuilder getServerOrBuilder();

   boolean hasSinglePlayer();

   InboundSinglePlayer getSinglePlayer();

   InboundSinglePlayerOrBuilder getSinglePlayerOrBuilder();

   boolean hasMinecraftRealms();

   InboundMinecraftRealms getMinecraftRealms();

   InboundMinecraftRealmsOrBuilder getMinecraftRealmsOrBuilder();

   boolean hasInMenus();

   InboundInMenus getInMenus();

   InboundInMenusOrBuilder getInMenusOrBuilder();

   boolean hasInLauncher();

   InboundInLauncher getInLauncher();

   InboundInLauncherOrBuilder getInLauncherOrBuilder();

   boolean hasHostedWorld();

   InboundHostedWorld getHostedWorld();

   InboundHostedWorldOrBuilder getHostedWorldOrBuilder();

   boolean hasReplayWorld();

   InboundReplayWorld getReplayWorld();

   InboundReplayWorldOrBuilder getReplayWorldOrBuilder();

   boolean hasInGame();

   InboundInGame getInGame();

   InboundInGameOrBuilder getInGameOrBuilder();

   boolean hasRewindWorld();

   InboundRewindWorld getRewindWorld();

   InboundRewindWorldOrBuilder getRewindWorldOrBuilder();

   InboundLocation.LocationCase getLocationCase();
}
