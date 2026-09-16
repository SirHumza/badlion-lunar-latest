package com.lunarclient.websocket.spray.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   List<OwnedSpray> getOwnedSpraysList();

   OwnedSpray getOwnedSprays(int var1);

   int getOwnedSpraysCount();

   List<? extends OwnedSprayOrBuilder> getOwnedSpraysOrBuilderList();

   OwnedSprayOrBuilder getOwnedSpraysOrBuilder(int var1);

   List<EquippedSpray> getEquippedSpraysList();

   EquippedSpray getEquippedSprays(int var1);

   int getEquippedSpraysCount();

   List<? extends EquippedSprayOrBuilder> getEquippedSpraysOrBuilderList();

   EquippedSprayOrBuilder getEquippedSpraysOrBuilder(int var1);

   @Deprecated
   int getLunarPlusFreeSprayId();

   boolean getHasAllSpraysFlag();

   int getMaxActiveSprays();

   List<Integer> getLunarPlusFreeSprayIdsList();

   int getLunarPlusFreeSprayIdsCount();

   int getLunarPlusFreeSprayIds(int var1);
}
