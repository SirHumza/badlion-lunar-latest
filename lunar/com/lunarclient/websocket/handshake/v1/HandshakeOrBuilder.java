package com.lunarclient.websocket.handshake.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.LauncherVersion;
import com.lunarclient.common.v1.LauncherVersionOrBuilder;
import com.lunarclient.websocket.language.v1.Language;
import com.lunarclient.websocket.language.v1.LanguageOrBuilder;

public interface HandshakeOrBuilder extends MessageOrBuilder {
   boolean hasIdentity();

   MinecraftIdentity getIdentity();

   MinecraftIdentityOrBuilder getIdentityOrBuilder();

   boolean hasLauncherVersion();

   LauncherVersion getLauncherVersion();

   LauncherVersionOrBuilder getLauncherVersionOrBuilder();

   String getInstallationId();

   ByteString getInstallationIdBytes();

   @Deprecated
   String getHwid();

   @Deprecated
   ByteString getHwidBytes();

   String getOperatingSystem();

   ByteString getOperatingSystemBytes();

   String getOperatingSystemRelease();

   ByteString getOperatingSystemReleaseBytes();

   String getCpuArchitecture();

   ByteString getCpuArchitectureBytes();

   boolean hasLanguage();

   Language getLanguage();

   LanguageOrBuilder getLanguageOrBuilder();

   String getCanaryToken();

   ByteString getCanaryTokenBytes();

   String getOverwolfMuid();

   ByteString getOverwolfMuidBytes();

   boolean hasGameHandshake();

   GameHandshake getGameHandshake();

   GameHandshakeOrBuilder getGameHandshakeOrBuilder();

   boolean hasLauncherHandshake();

   LauncherHandshake getLauncherHandshake();

   LauncherHandshakeOrBuilder getLauncherHandshakeOrBuilder();

   Handshake.ClientCase getClientCase();
}
