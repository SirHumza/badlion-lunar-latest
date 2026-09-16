package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import net.minecraft.entity.item.EntityTNTPrimed;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(EntityTNTPrimed.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Unique
   private int lunar$maximumFuse = 80;

   public int bridge$getMaximumFuse() {
      return this.lunar$maximumFuse;
   }

   public void bridge$setMaximumFuse(int var1) {
      this.lunar$maximumFuse = var1;
   }
}
