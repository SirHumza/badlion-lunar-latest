package com.lunarclient.websocket.skyblock.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Vector2i;
import com.lunarclient.common.v1.Vector2iOrBuilder;
import java.util.List;

public interface EarlyInRoomOrBuilder extends MessageOrBuilder {
   List<Vector2i> getComponentsList();

   Vector2i getComponents(int var1);

   int getComponentsCount();

   List<? extends Vector2iOrBuilder> getComponentsOrBuilderList();

   Vector2iOrBuilder getComponentsOrBuilder(int var1);

   int getTypeValue();

   DungeonRoomType getType();
}
