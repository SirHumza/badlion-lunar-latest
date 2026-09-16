package com.lunarclient.websocket.serverdiscovery.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface TrackServerJoinRequestOrBuilder extends MessageOrBuilder {
   String getSectionId();

   ByteString getSectionIdBytes();

   String getCardServerMappingsId();

   ByteString getCardServerMappingsIdBytes();

   String getCardRecommendationId();

   ByteString getCardRecommendationIdBytes();
}
