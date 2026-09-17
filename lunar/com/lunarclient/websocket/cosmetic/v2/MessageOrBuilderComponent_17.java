package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;

public interface WeatherConditionOrBuilder extends MessageOrBuilder {
   int getWeatherValue();

   WeatherCondition.Weather getWeather();
}
