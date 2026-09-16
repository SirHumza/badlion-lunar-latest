package com.lunarclient.apollo.entity.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.EntityId;
import com.lunarclient.apollo.common.v1.EntityIdOrBuilder;
import java.util.List;

public interface FlipEntityMessageOrBuilder extends MessageOrBuilder {
   List<EntityId> getEntityIdsList();

   EntityId getEntityIds(int var1);

   int getEntityIdsCount();

   List<? extends EntityIdOrBuilder> getEntityIdsOrBuilderList();

   EntityIdOrBuilder getEntityIdsOrBuilder(int var1);
}
