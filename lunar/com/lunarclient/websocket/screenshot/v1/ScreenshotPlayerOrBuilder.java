package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.MinecraftSkin;
import com.lunarclient.common.v1.MinecraftSkinOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.util.List;

public interface ScreenshotPlayerOrBuilder extends MessageOrBuilder {
   boolean hasPlayer();

   UuidAndUsername getPlayer();

   UuidAndUsernameOrBuilder getPlayerOrBuilder();

   List<PlayerState> getStatesList();

   int getStatesCount();

   PlayerState getStates(int var1);

   List<Integer> getStatesValueList();

   int getStatesValue(int var1);

   List<Integer> getCosmeticsList();

   int getCosmeticsCount();

   int getCosmetics(int var1);

   int getEmote();

   int getEmoteJam();

   boolean hasSkin();

   MinecraftSkin getSkin();

   MinecraftSkinOrBuilder getSkinOrBuilder();

   String getCape();

   ByteString getCapeBytes();
}
