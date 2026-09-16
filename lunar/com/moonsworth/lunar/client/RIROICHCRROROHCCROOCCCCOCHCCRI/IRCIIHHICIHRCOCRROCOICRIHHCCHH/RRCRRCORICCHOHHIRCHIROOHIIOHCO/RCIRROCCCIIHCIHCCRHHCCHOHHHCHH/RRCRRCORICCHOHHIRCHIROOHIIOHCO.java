package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.websocket.cosmetic.v2.EquipCondition;
import com.lunarclient.websocket.cosmetic.v2.OnFireCondition;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   extends com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<OnFireCondition> {
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(EquipCondition var1) {
      super(var1);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      OnFireCondition var2
   ) {
      return var1 == null ? false : var1.bridge$isOnFire();
   }

   @Override
   public String ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (var1 == null) {
         return null;
      } else {
         return var1.bridge$isOnFire() ? this.HCOICHIRORIHROIRHHCCICCIHCRRRR().getConditionCase().name() : null;
      }
   }
}
