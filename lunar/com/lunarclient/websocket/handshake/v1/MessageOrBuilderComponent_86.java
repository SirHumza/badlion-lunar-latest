package com.lunarclient.websocket.handshake.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.websocket.radio.v1.InboundRadioInfo;
import com.lunarclient.websocket.radio.v1.InboundRadioInfoOrBuilder;
import com.lunarclient.websocket.setting.v1.LauncherSetting;
import com.lunarclient.websocket.setting.v1.LauncherSettingOrBuilder;
import java.util.List;

public interface LauncherHandshakeOrBuilder extends MessageOrBuilder {
   String getEnvironment();

   ByteString getEnvironmentBytes();

   String getSessionId();

   ByteString getSessionIdBytes();

   String getUpdaterStream();

   ByteString getUpdaterStreamBytes();

   int getElectronBinariesTypeValue();

   LauncherHandshake.ElectronBinariesType getElectronBinariesType();

   boolean getElevated();

   boolean getSilentStart();

   int getUptimeSinceStart();

   boolean hasStartedAt();

   Timestamp getStartedAt();

   TimestampOrBuilder getStartedAtOrBuilder();

   int getBuildNumber();

   String getGitCommitHash();

   ByteString getGitCommitHashBytes();

   String getGitShortCommitHash();

   ByteString getGitShortCommitHashBytes();

   boolean hasRadioInfo();

   InboundRadioInfo getRadioInfo();

   InboundRadioInfoOrBuilder getRadioInfoOrBuilder();

   boolean getOptimizedAds();

   boolean getAnalytics();

   boolean getOwahe();

   List<LauncherSetting> getSettingsList();

   LauncherSetting getSettings(int var1);

   int getSettingsCount();

   List<? extends LauncherSettingOrBuilder> getSettingsOrBuilderList();

   LauncherSettingOrBuilder getSettingsOrBuilder(int var1);

   boolean getSafeStorage();
}
