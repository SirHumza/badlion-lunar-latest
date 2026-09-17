package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.LocationOrBuilder;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;

public interface RunningInstanceOrBuilder extends MessageOrBuilder {
   String getLaunchId();

   ByteString getLaunchIdBytes();

   boolean hasMinecraftVersion();

   MinecraftVersion getMinecraftVersion();

   MinecraftVersionOrBuilder getMinecraftVersionOrBuilder();

   String getModule();

   ByteString getModuleBytes();

   boolean hasModpack();

   PlayerModpack getModpack();

   PlayerModpackOrBuilder getModpackOrBuilder();

   boolean hasLocation();

   Location getLocation();

   LocationOrBuilder getLocationOrBuilder();

   boolean hasLoader();

   RunningInstanceLoader getLoader();

   RunningInstanceLoaderOrBuilder getLoaderOrBuilder();
}
