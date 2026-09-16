package com.lunarclient.websocket.analytics.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.Map;

public interface RecordEnabledModsRequestOrBuilder extends MessageOrBuilder {
   int getModsCount();

   boolean containsMods(String var1);

   @Deprecated
   Map<String, Boolean> getMods();

   Map<String, Boolean> getModsMap();

   boolean getModsOrDefault(String var1, boolean var2);

   boolean getModsOrThrow(String var1);
}
