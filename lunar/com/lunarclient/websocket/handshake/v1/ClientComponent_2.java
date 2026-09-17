package com.lunarclient.websocket.handshake.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.InboundLocation;
import com.lunarclient.common.v1.InboundLocationOrBuilder;
import com.lunarclient.common.v1.LunarClientUiVersion;
import com.lunarclient.common.v1.LunarClientUiVersionOrBuilder;
import com.lunarclient.common.v1.LunarClientVersion;
import com.lunarclient.common.v1.LunarClientVersionOrBuilder;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;
import com.lunarclient.websocket.setting.v1.ClientSetting;
import com.lunarclient.websocket.setting.v1.ClientSettingOrBuilder;
import java.util.List;

public interface GameHandshakeOrBuilder extends MessageOrBuilder {
   boolean hasMinecraftVersion();

   MinecraftVersion getMinecraftVersion();

   MinecraftVersionOrBuilder getMinecraftVersionOrBuilder();

   boolean hasLunarClientVersion();

   LunarClientVersion getLunarClientVersion();

   LunarClientVersionOrBuilder getLunarClientVersionOrBuilder();

   boolean hasLocation();

   InboundLocation getLocation();

   InboundLocationOrBuilder getLocationOrBuilder();

   List<String> getIchorModulesList();

   int getIchorModulesCount();

   String getIchorModules(int var1);

   ByteString getIchorModulesBytes(int var1);

   List<InstalledMod> getInstalledModsList();

   InstalledMod getInstalledMods(int var1);

   int getInstalledModsCount();

   List<? extends InstalledModOrBuilder> getInstalledModsOrBuilderList();

   InstalledModOrBuilder getInstalledModsOrBuilder(int var1);

   boolean hasModpack();

   PlayerModpack getModpack();

   PlayerModpackOrBuilder getModpackOrBuilder();

   List<String> getGlExtensionsList();

   int getGlExtensionsCount();

   String getGlExtensions(int var1);

   ByteString getGlExtensionsBytes(int var1);

   String getLaunchId();

   ByteString getLaunchIdBytes();

   boolean hasNvidiaMemory();

   NvidiaGpuMemory getNvidiaMemory();

   NvidiaGpuMemoryOrBuilder getNvidiaMemoryOrBuilder();

   boolean hasMesaMemory();

   MesaGpuMemory getMesaMemory();

   MesaGpuMemoryOrBuilder getMesaMemoryOrBuilder();

   List<ClientSetting> getSettingsList();

   ClientSetting getSettings(int var1);

   int getSettingsCount();

   List<? extends ClientSettingOrBuilder> getSettingsOrBuilderList();

   ClientSettingOrBuilder getSettingsOrBuilder(int var1);

   boolean hasLunarClientUiVersion();

   LunarClientUiVersion getLunarClientUiVersion();

   LunarClientUiVersionOrBuilder getLunarClientUiVersionOrBuilder();

   GameHandshake.GpuMemoryCase getGpuMemoryCase();
}
