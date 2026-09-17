package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface OutfitOrBuilder extends MessageOrBuilder {
   boolean hasId();

   Uuid getId();

   UuidOrBuilder getIdOrBuilder();

   String getName();

   ByteString getNameBytes();

   List<EquippedCosmetic> getCosmeticsList();

   EquippedCosmetic getCosmetics(int var1);

   int getCosmeticsCount();

   List<? extends EquippedCosmeticOrBuilder> getCosmeticsOrBuilderList();

   EquippedCosmeticOrBuilder getCosmeticsOrBuilder(int var1);

   boolean getFavorite();

   boolean hasCreatedAt();

   Timestamp getCreatedAt();

   TimestampOrBuilder getCreatedAtOrBuilder();

   boolean hasUpdatedAt();

   Timestamp getUpdatedAt();

   TimestampOrBuilder getUpdatedAtOrBuilder();

   boolean hasSkinHash();

   String getSkinHash();

   ByteString getSkinHashBytes();

   boolean hasBadgeId();

   int getBadgeId();
}
