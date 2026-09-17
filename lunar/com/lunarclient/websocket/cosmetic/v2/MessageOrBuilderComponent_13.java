package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;

public interface EquippedCosmeticOrBuilder extends MessageOrBuilder {
   int getCosmeticId();

   boolean hasGeckolibMetadata();

   Struct getGeckolibMetadata();

   StructOrBuilder getGeckolibMetadataOrBuilder();

   boolean getClothCloak();

   boolean getShowOverSkinLayer();

   boolean getShowOverHelmet();

   boolean getShowOverChestplate();

   boolean getShowOverLeggings();

   boolean getShowOverBoots();

   float getHatHeightOffset();

   boolean getFlipArm();
}
