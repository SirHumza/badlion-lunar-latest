package com.lunarclient.websocket.setting.v1;

import com.google.protobuf.MessageOrBuilder;

public interface UpdateClientSettingRequestOrBuilder extends MessageOrBuilder {
   boolean hasSetting();

   ClientSetting getSetting();

   ClientSettingOrBuilder getSettingOrBuilder();

   int getInitiatorValue();

   UpdateClientSettingRequest.Initiator getInitiator();
}
