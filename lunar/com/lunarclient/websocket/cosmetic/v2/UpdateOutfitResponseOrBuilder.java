package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;

public interface UpdateOutfitResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   UpdateOutfitResponse.Status getStatus();

   boolean hasOutfit();

   Outfit getOutfit();

   OutfitOrBuilder getOutfitOrBuilder();
}
