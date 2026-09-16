package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface OutfitTreeOrBuilder extends MessageOrBuilder {
   List<OutfitTree.ConditionalOutfit> getConditionalOutfitsList();

   OutfitTree.ConditionalOutfit getConditionalOutfits(int var1);

   int getConditionalOutfitsCount();

   List<? extends OutfitTree.ConditionalOutfitOrBuilder> getConditionalOutfitsOrBuilderList();

   OutfitTree.ConditionalOutfitOrBuilder getConditionalOutfitsOrBuilder(int var1);

   boolean hasDefaultOutfitId();

   Uuid getDefaultOutfitId();

   UuidOrBuilder getDefaultOutfitIdOrBuilder();
}
