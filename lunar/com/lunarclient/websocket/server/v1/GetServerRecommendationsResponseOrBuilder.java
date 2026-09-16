package com.lunarclient.websocket.server.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface GetServerRecommendationsResponseOrBuilder extends MessageOrBuilder {
   List<ServerRecommendations> getRecommendationsList();

   ServerRecommendations getRecommendations(int var1);

   int getRecommendationsCount();

   List<? extends ServerRecommendationsOrBuilder> getRecommendationsOrBuilderList();

   ServerRecommendationsOrBuilder getRecommendationsOrBuilder(int var1);
}
