package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;

public interface UpdateOutfitRequestOrBuilder extends MessageOrBuilder {
   boolean hasOutfit();

   Outfit getOutfit();

   OutfitOrBuilder getOutfitOrBuilder();
}
