package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.common.v1.UuidOrBuilder;
import com.lunarclient.common.v1.Vector3f;
import com.lunarclient.common.v1.Vector3fOrBuilder;
import java.util.List;

public interface ScreenshotMessageOrBuilder extends MessageOrBuilder {
   boolean hasAuthor();

   UuidAndUsername getAuthor();

   UuidAndUsernameOrBuilder getAuthorOrBuilder();

   List<PlayerState> getStatesList();

   int getStatesCount();

   PlayerState getStates(int var1);

   List<Integer> getStatesValueList();

   int getStatesValue(int var1);

   List<ScreenshotPlayer> getPlayersList();

   ScreenshotPlayer getPlayers(int var1);

   int getPlayersCount();

   List<? extends ScreenshotPlayerOrBuilder> getPlayersOrBuilderList();

   ScreenshotPlayerOrBuilder getPlayersOrBuilder(int var1);

   String getDimension();

   ByteString getDimensionBytes();

   String getBiome();

   ByteString getBiomeBytes();

   float getYaw();

   float getPitch();

   boolean hasPos();

   Vector3f getPos();

   Vector3fOrBuilder getPosOrBuilder();

   boolean hasSize();

   Dimensions getSize();

   DimensionsOrBuilder getSizeOrBuilder();

   int getPerspectiveValue();

   Perspective getPerspective();

   boolean getHasHud();

   long getDayTime();

   int getWeatherValue();

   Weather getWeather();

   float getHealth();

   float getMaxHealth();

   float getFoodLevel();

   float getSaturationLevel();

   boolean hasLocalId();

   Uuid getLocalId();

   UuidOrBuilder getLocalIdOrBuilder();
}
