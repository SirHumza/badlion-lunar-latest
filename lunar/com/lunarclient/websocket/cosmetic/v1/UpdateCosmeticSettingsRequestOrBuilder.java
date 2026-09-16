package com.lunarclient.websocket.cosmetic.v1;

import com.google.protobuf.MessageOrBuilder;

public interface UpdateCosmeticSettingsRequestOrBuilder extends MessageOrBuilder {
   boolean hasSettings();

   CustomizableCosmeticSettings getSettings();

   CustomizableCosmeticSettingsOrBuilder getSettingsOrBuilder();
}
