package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;

public interface CreateOutfitResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   CreateOutfitResponse.Status getStatus();

   boolean hasOutfit();

   Outfit getOutfit();

   OutfitOrBuilder getOutfitOrBuilder();
}
