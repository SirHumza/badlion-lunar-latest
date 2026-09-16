package com.lunarclient.apollo.tntcountdown.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.EntityId;
import com.lunarclient.apollo.common.v1.EntityIdOrBuilder;

public interface SetTntCountdownMessageOrBuilder extends MessageOrBuilder {
   boolean hasEntityId();

   EntityId getEntityId();

   EntityIdOrBuilder getEntityIdOrBuilder();

   int getDurationTicks();
}
