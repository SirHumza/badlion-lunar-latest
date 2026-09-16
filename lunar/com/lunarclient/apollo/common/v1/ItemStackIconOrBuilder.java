package com.lunarclient.apollo.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface ItemStackIconOrBuilder extends MessageOrBuilder {
   boolean hasItemId();

   int getItemId();

   boolean hasItemName();

   String getItemName();

   ByteString getItemNameBytes();

   @Deprecated
   int getCustomModelData();

   boolean hasProfile();

   Profile getProfile();

   ProfileOrBuilder getProfileOrBuilder();

   boolean hasCustomModelDataObject();

   CustomModelData getCustomModelDataObject();

   CustomModelDataOrBuilder getCustomModelDataObjectOrBuilder();

   String getPotion();

   ByteString getPotionBytes();

   ItemStackIcon.ItemCase getItemCase();
}
