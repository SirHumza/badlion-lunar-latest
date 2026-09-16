package com.lunarclient.websocket.cosmetic.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface PlayerCosmeticsPushOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   boolean hasSettings();

   CustomizableCosmeticSettings getSettings();

   CustomizableCosmeticSettingsOrBuilder getSettingsOrBuilder();

   boolean hasLogoColor();

   Color getLogoColor();

   ColorOrBuilder getLogoColorOrBuilder();

   boolean getLogoAlwaysShow();

   int getBadgeId();

   boolean hasOutfitUuid();

   Uuid getOutfitUuid();

   UuidOrBuilder getOutfitUuidOrBuilder();
}
