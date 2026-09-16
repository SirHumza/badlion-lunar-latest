package com.lunarclient.websocket.subscription.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface SubscribeRequestOrBuilder extends MessageOrBuilder {
   List<Uuid> getTargetUuidsList();

   Uuid getTargetUuids(int var1);

   int getTargetUuidsCount();

   List<? extends UuidOrBuilder> getTargetUuidsOrBuilderList();

   UuidOrBuilder getTargetUuidsOrBuilder(int var1);
}
