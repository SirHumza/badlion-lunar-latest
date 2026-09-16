package com.lunarclient.apollo.player.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Value;
import com.lunarclient.apollo.common.v1.LunarClientVersion;
import com.lunarclient.apollo.common.v1.LunarClientVersionOrBuilder;
import com.lunarclient.apollo.common.v1.MinecraftVersion;
import com.lunarclient.apollo.common.v1.MinecraftVersionOrBuilder;
import java.util.List;
import java.util.Map;

public interface PlayerHandshakeMessageOrBuilder extends MessageOrBuilder {
   boolean hasMinecraftVersion();

   MinecraftVersion getMinecraftVersion();

   MinecraftVersionOrBuilder getMinecraftVersionOrBuilder();

   boolean hasLunarClientVersion();

   LunarClientVersion getLunarClientVersion();

   LunarClientVersionOrBuilder getLunarClientVersionOrBuilder();

   @Deprecated
   List<ModMessage> getInstalledModsList();

   @Deprecated
   ModMessage getInstalledMods(int var1);

   @Deprecated
   int getInstalledModsCount();

   @Deprecated
   List<? extends ModMessageOrBuilder> getInstalledModsOrBuilderList();

   @Deprecated
   ModMessageOrBuilder getInstalledModsOrBuilder(int var1);

   int getEmbeddedCheckoutSupportValue();

   EmbeddedCheckoutSupport getEmbeddedCheckoutSupport();

   int getModStatusCount();

   boolean containsModStatus(String var1);

   @Deprecated
   Map<String, Value> getModStatus();

   Map<String, Value> getModStatusMap();

   Value getModStatusOrDefault(String var1, Value var2);

   Value getModStatusOrThrow(String var1);
}
