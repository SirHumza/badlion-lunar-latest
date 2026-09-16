package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.websocket.cosmetic.v2.EquipCondition;
import com.lunarclient.websocket.cosmetic.v2.InLiquidCondition;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<InLiquidCondition> {
   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(EquipCondition var1) {
      super(var1);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      InLiquidCondition var2
   ) {
      if (var1 == null) {
         return false;
      }

      return switch (this.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(var1)) {
         case LIQUID_WATER -> var2.getLiquid() == InLiquidCondition.Liquid.LIQUID_WATER;
         case LIQUID_LAVA -> var2.getLiquid() == InLiquidCondition.Liquid.LIQUID_LAVA;
         default -> false;
      };
   }

   @Override
   public String ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (var1 == null) {
         return null;
      }

      InLiquidCondition.Liquid var2 = this.OHIIIOHIRIRCCRRIOIICCHHIORRHOH(var1);
      return var2 == InLiquidCondition.Liquid.LIQUID_UNSPECIFIED ? null : var2.name();
   }

   private InLiquidCondition.Liquid OHIIIOHIRIRCCRRIOIICCHHIORRHOH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (var1.bridge$isInWater()) {
         return InLiquidCondition.Liquid.LIQUID_WATER;
      } else {
         return var1.bridge$isInLava() ? InLiquidCondition.Liquid.LIQUID_LAVA : InLiquidCondition.Liquid.LIQUID_UNSPECIFIED;
      }
   }
}
