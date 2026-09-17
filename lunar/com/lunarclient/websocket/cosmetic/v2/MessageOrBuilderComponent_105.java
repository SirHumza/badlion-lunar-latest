package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;

public interface BiomeTemperatureConditionOrBuilder extends MessageOrBuilder {
   int getTemperatureValue();

   BiomeTemperatureCondition.Temperature getTemperature();
}
