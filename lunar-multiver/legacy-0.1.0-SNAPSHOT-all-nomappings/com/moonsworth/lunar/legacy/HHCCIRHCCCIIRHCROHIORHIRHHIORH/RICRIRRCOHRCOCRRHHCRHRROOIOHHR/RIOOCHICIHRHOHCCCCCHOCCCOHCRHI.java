package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import net.minecraft.util.FoodStats;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(FoodStats.class)
public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public abstract float getSaturationLevel();

   @Shadow
   public abstract int getFoodLevel();

   public float bridge$getSaturationLevel() {
      return this.getSaturationLevel();
   }

   public float bridge$getFoodLevel() {
      return this.getFoodLevel();
   }
}
