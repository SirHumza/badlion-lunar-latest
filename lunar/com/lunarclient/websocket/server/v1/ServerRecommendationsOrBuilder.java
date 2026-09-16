package com.lunarclient.websocket.server.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;
import java.util.List;

public interface ServerRecommendationsOrBuilder extends MessageOrBuilder {
   boolean hasModpack();

   PlayerModpack getModpack();

   PlayerModpackOrBuilder getModpackOrBuilder();

   List<String> getIpAddressesList();

   int getIpAddressesCount();

   String getIpAddresses(int var1);

   ByteString getIpAddressesBytes(int var1);

   List<MinecraftVersion> getVersionsList();

   MinecraftVersion getVersions(int var1);

   int getVersionsCount();

   List<? extends MinecraftVersionOrBuilder> getVersionsOrBuilderList();

   MinecraftVersionOrBuilder getVersionsOrBuilder(int var1);
}
