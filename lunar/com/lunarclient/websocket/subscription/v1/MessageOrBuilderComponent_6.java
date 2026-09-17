package com.lunarclient.websocket.subscription.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.websocket.cosmetic.v2.PlayerCosmeticsPushV2;
import com.lunarclient.websocket.cosmetic.v2.PlayerCosmeticsPushV2OrBuilder;
import com.lunarclient.websocket.radio.v1.PlayerRadioPush;
import com.lunarclient.websocket.radio.v1.PlayerRadioPushOrBuilder;
import java.util.List;

public interface SubscribeV2ResponseOrBuilder extends MessageOrBuilder {
   List<PlayerCosmeticsPushV2> getCosmeticPushesList();

   PlayerCosmeticsPushV2 getCosmeticPushes(int var1);

   int getCosmeticPushesCount();

   List<? extends PlayerCosmeticsPushV2OrBuilder> getCosmeticPushesOrBuilderList();

   PlayerCosmeticsPushV2OrBuilder getCosmeticPushesOrBuilder(int var1);

   List<PlayerRadioPush> getRadioPushesList();

   PlayerRadioPush getRadioPushes(int var1);

   int getRadioPushesCount();

   List<? extends PlayerRadioPushOrBuilder> getRadioPushesOrBuilderList();

   PlayerRadioPushOrBuilder getRadioPushesOrBuilder(int var1);
}
