package com.lunarclient.websocket.spray.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface UpdateEquippedSpraysRequestOrBuilder extends MessageOrBuilder {
   List<EquippedSpray> getEquippedSpraysList();

   EquippedSpray getEquippedSprays(int var1);

   int getEquippedSpraysCount();

   List<? extends EquippedSprayOrBuilder> getEquippedSpraysOrBuilderList();

   EquippedSprayOrBuilder getEquippedSpraysOrBuilder(int var1);
}
