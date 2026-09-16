package com.lunarclient.apollo.cosmetic.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.util.List;

public interface EquipNpcCosmeticsMessageOrBuilder extends MessageOrBuilder {
   boolean hasNpcUuid();

   Uuid getNpcUuid();

   UuidOrBuilder getNpcUuidOrBuilder();

   List<Cosmetic> getCosmeticsList();

   Cosmetic getCosmetics(int var1);

   int getCosmeticsCount();

   List<? extends CosmeticOrBuilder> getCosmeticsOrBuilderList();

   CosmeticOrBuilder getCosmeticsOrBuilder(int var1);

   boolean getCopyLocalCosmetics();
}
