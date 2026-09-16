package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.GiftInfo;
import com.lunarclient.common.v1.GiftInfoOrBuilder;
import java.util.List;

public interface OwnedEmoteOrBuilder extends MessageOrBuilder {
   int getEmoteId();

   boolean hasGrantedAt();

   Timestamp getGrantedAt();

   TimestampOrBuilder getGrantedAtOrBuilder();

   boolean hasExpiresAt();

   Timestamp getExpiresAt();

   TimestampOrBuilder getExpiresAtOrBuilder();

   List<RecommendedJam> getRecommendedJamsList();

   RecommendedJam getRecommendedJams(int var1);

   int getRecommendedJamsCount();

   List<? extends RecommendedJamOrBuilder> getRecommendedJamsOrBuilderList();

   RecommendedJamOrBuilder getRecommendedJamsOrBuilder(int var1);

   boolean hasGiftInfo();

   GiftInfo getGiftInfo();

   GiftInfoOrBuilder getGiftInfoOrBuilder();
}
