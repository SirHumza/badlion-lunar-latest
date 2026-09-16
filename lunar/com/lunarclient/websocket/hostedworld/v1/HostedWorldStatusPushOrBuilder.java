package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface HostedWorldStatusPushOrBuilder extends MessageOrBuilder {
   List<HostedWorldStatusPush.OnlinePlayer> getOnlinePlayersList();

   HostedWorldStatusPush.OnlinePlayer getOnlinePlayers(int var1);

   int getOnlinePlayersCount();

   List<? extends HostedWorldStatusPush.OnlinePlayerOrBuilder> getOnlinePlayersOrBuilderList();

   HostedWorldStatusPush.OnlinePlayerOrBuilder getOnlinePlayersOrBuilder(int var1);

   List<HostedWorldStatusPush.OfflinePlayer> getOfflinePlayersList();

   HostedWorldStatusPush.OfflinePlayer getOfflinePlayers(int var1);

   int getOfflinePlayersCount();

   List<? extends HostedWorldStatusPush.OfflinePlayerOrBuilder> getOfflinePlayersOrBuilderList();

   HostedWorldStatusPush.OfflinePlayerOrBuilder getOfflinePlayersOrBuilder(int var1);

   List<JoinSource> getAllowedJoinSourcesList();

   int getAllowedJoinSourcesCount();

   JoinSource getAllowedJoinSources(int var1);

   List<Integer> getAllowedJoinSourcesValueList();

   int getAllowedJoinSourcesValue(int var1);

   int getMaxPlayers();
}
