package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;

public interface SelectOutfitRequestOrBuilder extends MessageOrBuilder {
   boolean hasOutfitTree();

   OutfitTree getOutfitTree();

   OutfitTreeOrBuilder getOutfitTreeOrBuilder();
}
