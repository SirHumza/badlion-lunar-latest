package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface HeartbeatOrBuilder extends MessageOrBuilder {
   List<JoinSource> getAllowedJoinSourcesList();

   int getAllowedJoinSourcesCount();

   JoinSource getAllowedJoinSources(int var1);

   List<Integer> getAllowedJoinSourcesValueList();

   int getAllowedJoinSourcesValue(int var1);

   int getMaxPlayers();

   List<Uuid> getWhitelistedUuidsList();

   Uuid getWhitelistedUuids(int var1);

   int getWhitelistedUuidsCount();

   List<? extends UuidOrBuilder> getWhitelistedUuidsOrBuilderList();

   UuidOrBuilder getWhitelistedUuidsOrBuilder(int var1);

   List<Heartbeat.OnlinePlayer> getOnlinePlayersList();

   Heartbeat.OnlinePlayer getOnlinePlayers(int var1);

   int getOnlinePlayersCount();

   List<? extends Heartbeat.OnlinePlayerOrBuilder> getOnlinePlayersOrBuilderList();

   Heartbeat.OnlinePlayerOrBuilder getOnlinePlayersOrBuilder(int var1);

   List<Heartbeat.OfflinePlayer> getOfflinePlayersList();

   Heartbeat.OfflinePlayer getOfflinePlayers(int var1);

   int getOfflinePlayersCount();

   List<? extends Heartbeat.OfflinePlayerOrBuilder> getOfflinePlayersOrBuilderList();

   Heartbeat.OfflinePlayerOrBuilder getOfflinePlayersOrBuilder(int var1);

   List<PingResponse> getPingResponsesList();

   PingResponse getPingResponses(int var1);

   int getPingResponsesCount();

   List<? extends PingResponseOrBuilder> getPingResponsesOrBuilderList();

   PingResponseOrBuilder getPingResponsesOrBuilder(int var1);
}
