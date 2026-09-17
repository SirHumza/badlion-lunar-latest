package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.Map;

public interface GameHeartbeatRequestOrBuilder extends MessageOrBuilder {
   @Deprecated
   int getModsCount();

   @Deprecated
   boolean containsMods(String var1);

   @Deprecated
   Map<String, Boolean> getMods();

   @Deprecated
   Map<String, Boolean> getModsMap();

   @Deprecated
   boolean getModsOrDefault(String var1, boolean var2);

   @Deprecated
   boolean getModsOrThrow(String var1);

   @Deprecated
   String getServerGameMode();

   @Deprecated
   ByteString getServerGameModeBytes();
}
