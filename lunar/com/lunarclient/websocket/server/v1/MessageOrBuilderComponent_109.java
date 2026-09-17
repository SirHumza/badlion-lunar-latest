package com.lunarclient.websocket.server.v1;

import com.google.protobuf.MessageOrBuilder;

public interface CheckServerRecommendationsResponseOrBuilder extends MessageOrBuilder {
   boolean hasRecommendations();

   ServerRecommendations getRecommendations();

   ServerRecommendationsOrBuilder getRecommendationsOrBuilder();
}
