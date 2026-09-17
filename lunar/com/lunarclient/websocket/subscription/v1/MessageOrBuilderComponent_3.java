package com.lunarclient.websocket.subscription.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.websocket.cosmetic.v1.PlayerCosmeticsPush;
import com.lunarclient.websocket.cosmetic.v1.PlayerCosmeticsPushOrBuilder;
import com.lunarclient.websocket.radio.v1.PlayerRadioPush;
import com.lunarclient.websocket.radio.v1.PlayerRadioPushOrBuilder;
import java.util.List;

public interface SubscribeResponseOrBuilder extends MessageOrBuilder {
   List<PlayerCosmeticsPush> getCosmeticPushesList();

   PlayerCosmeticsPush getCosmeticPushes(int var1);

   int getCosmeticPushesCount();

   List<? extends PlayerCosmeticsPushOrBuilder> getCosmeticPushesOrBuilderList();

   PlayerCosmeticsPushOrBuilder getCosmeticPushesOrBuilder(int var1);

   List<PlayerRadioPush> getRadioPushesList();

   PlayerRadioPush getRadioPushes(int var1);

   int getRadioPushesCount();

   List<? extends PlayerRadioPushOrBuilder> getRadioPushesOrBuilderList();

   PlayerRadioPushOrBuilder getRadioPushesOrBuilder(int var1);
}
