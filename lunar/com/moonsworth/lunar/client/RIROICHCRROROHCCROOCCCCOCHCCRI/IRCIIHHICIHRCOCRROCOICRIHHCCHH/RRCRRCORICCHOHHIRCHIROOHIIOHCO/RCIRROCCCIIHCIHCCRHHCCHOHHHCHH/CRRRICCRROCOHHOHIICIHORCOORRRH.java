package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.websocket.cosmetic.v2.EquipCondition;
import com.lunarclient.websocket.cosmetic.v2.MovementStateCondition;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   extends com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<MovementStateCondition> {
   public CRRRICCRROCOHHOHIICIHORCOORRRH(EquipCondition var1) {
      super(var1);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      MovementStateCondition var2
   ) {
      if (var1 == null) {
         return false;
      }

      MovementStateCondition.State var3 = this.IHICORCROOROHCIHIHCOIHRRHICICO(var1);
      return var3 != MovementStateCondition.State.STATE_UNSPECIFIED && var3 == var2.getState();
   }

   @Override
   public String ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (var1 == null) {
         return null;
      }

      MovementStateCondition.State var2 = this.IHICORCROOROHCIHIHCOIHRRHICICO(var1);
      return var2 == MovementStateCondition.State.STATE_UNSPECIFIED ? null : var2.name();
   }

   private MovementStateCondition.State IHICORCROOROHCIHIHCOIHRRHICICO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (var1.bridge$isSwimming()) {
         return MovementStateCondition.State.STATE_SWIMMING;
      } else if (var1.bridge$isElytraFlying()) {
         return MovementStateCondition.State.STATE_ELYTRA_FLYING;
      } else {
         return var1.bridge$isFlying() ? MovementStateCondition.State.STATE_CREATIVE_FLYING : MovementStateCondition.State.STATE_UNSPECIFIED;
      }
   }
}
