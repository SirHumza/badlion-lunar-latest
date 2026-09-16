package com.lunarclient.websocket.setting.v1;

import com.google.protobuf.MessageOrBuilder;

public interface UpdateLauncherSettingRequestOrBuilder extends MessageOrBuilder {
   boolean hasSetting();

   LauncherSetting getSetting();

   LauncherSettingOrBuilder getSettingOrBuilder();

   int getInitiatorValue();

   UpdateLauncherSettingRequest.Initiator getInitiator();
}
