package com.lunarclient.apollo.stats;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Range;

@ApiStatus.NonExtendable
public interface ApolloStats {
   boolean isOnlineMode();

   String getIcon();

   String getVersion();

   List<ApolloPluginDescription> getPlugins();

   String getPlatformSubtype();

   String getPlatformVersion();

   @Range(from = 0L, to = 2147483647L) int getTotalPlayers();
}
