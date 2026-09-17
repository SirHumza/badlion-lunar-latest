package com.lunarclient.apollo.cosmetic.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.util.List;

public interface UnequipNpcCosmeticsMessageOrBuilder extends MessageOrBuilder {
   boolean hasNpcUuid();

   Uuid getNpcUuid();

   UuidOrBuilder getNpcUuidOrBuilder();

   List<Integer> getCosmeticIdsList();

   int getCosmeticIdsCount();

   int getCosmeticIds(int var1);
}
