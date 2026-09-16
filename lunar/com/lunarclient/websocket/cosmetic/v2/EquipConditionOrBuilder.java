package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;

public interface EquipConditionOrBuilder extends MessageOrBuilder {
   boolean hasDimension();

   DimensionCondition getDimension();

   DimensionConditionOrBuilder getDimensionOrBuilder();

   boolean hasWeather();

   WeatherCondition getWeather();

   WeatherConditionOrBuilder getWeatherOrBuilder();

   boolean hasBiomeTemperature();

   BiomeTemperatureCondition getBiomeTemperature();

   BiomeTemperatureConditionOrBuilder getBiomeTemperatureOrBuilder();

   boolean hasPassengerOfEntity();

   PassengerOfEntityCondition getPassengerOfEntity();

   PassengerOfEntityConditionOrBuilder getPassengerOfEntityOrBuilder();

   boolean hasMovementState();

   MovementStateCondition getMovementState();

   MovementStateConditionOrBuilder getMovementStateOrBuilder();

   boolean hasInLiquid();

   InLiquidCondition getInLiquid();

   InLiquidConditionOrBuilder getInLiquidOrBuilder();

   boolean hasRadioPlaying();

   RadioPlayingCondition getRadioPlaying();

   RadioPlayingConditionOrBuilder getRadioPlayingOrBuilder();

   boolean hasOnFire();

   OnFireCondition getOnFire();

   OnFireConditionOrBuilder getOnFireOrBuilder();

   boolean hasServer();

   ServerCondition getServer();

   ServerConditionOrBuilder getServerOrBuilder();

   boolean hasTime();

   TimeCondition getTime();

   TimeConditionOrBuilder getTimeOrBuilder();

   EquipCondition.ConditionCase getConditionCase();
}
