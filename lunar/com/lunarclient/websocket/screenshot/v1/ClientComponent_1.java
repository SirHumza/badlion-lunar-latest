package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.LocationOrBuilder;
import com.lunarclient.common.v1.LunarClientVersion;
import com.lunarclient.common.v1.LunarClientVersionOrBuilder;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;

public interface ExtraScreenshotDataOrBuilder extends MessageOrBuilder {
   boolean hasMcVersion();

   MinecraftVersion getMcVersion();

   MinecraftVersionOrBuilder getMcVersionOrBuilder();

   boolean hasLunarVersion();

   LunarClientVersion getLunarVersion();

   LunarClientVersionOrBuilder getLunarVersionOrBuilder();

   boolean hasLocation();

   Location getLocation();

   LocationOrBuilder getLocationOrBuilder();
}
