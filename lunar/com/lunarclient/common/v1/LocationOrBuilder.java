package com.lunarclient.common.v1;

import com.google.protobuf.MessageOrBuilder;

public interface LocationOrBuilder extends MessageOrBuilder {
   boolean hasPublicServer();

   PublicServer getPublicServer();

   PublicServerOrBuilder getPublicServerOrBuilder();

   boolean hasPrivateServer();

   PrivateServer getPrivateServer();

   PrivateServerOrBuilder getPrivateServerOrBuilder();

   boolean hasLocalServer();

   LocalServer getLocalServer();

   LocalServerOrBuilder getLocalServerOrBuilder();

   boolean hasSinglePlayer();

   SinglePlayer getSinglePlayer();

   SinglePlayerOrBuilder getSinglePlayerOrBuilder();

   boolean hasMinecraftRealms();

   MinecraftRealms getMinecraftRealms();

   MinecraftRealmsOrBuilder getMinecraftRealmsOrBuilder();

   boolean hasInMenus();

   InMenus getInMenus();

   InMenusOrBuilder getInMenusOrBuilder();

   boolean hasInLauncher();

   InLauncher getInLauncher();

   InLauncherOrBuilder getInLauncherOrBuilder();

   boolean hasHostedWorld();

   HostedWorld getHostedWorld();

   HostedWorldOrBuilder getHostedWorldOrBuilder();

   boolean hasReplayWorld();

   ReplayWorld getReplayWorld();

   ReplayWorldOrBuilder getReplayWorldOrBuilder();

   boolean hasInGame();

   InGame getInGame();

   InGameOrBuilder getInGameOrBuilder();

   boolean hasRewindWorld();

   RewindWorld getRewindWorld();

   RewindWorldOrBuilder getRewindWorldOrBuilder();

   Location.LocationCase getLocationCase();
}
