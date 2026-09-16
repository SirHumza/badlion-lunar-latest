package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface LoadTabLogosRequestOrBuilder extends MessageOrBuilder {
   List<Uuid> getPlayerUuidsList();

   Uuid getPlayerUuids(int var1);

   int getPlayerUuidsCount();

   List<? extends UuidOrBuilder> getPlayerUuidsOrBuilderList();

   UuidOrBuilder getPlayerUuidsOrBuilder(int var1);
}
