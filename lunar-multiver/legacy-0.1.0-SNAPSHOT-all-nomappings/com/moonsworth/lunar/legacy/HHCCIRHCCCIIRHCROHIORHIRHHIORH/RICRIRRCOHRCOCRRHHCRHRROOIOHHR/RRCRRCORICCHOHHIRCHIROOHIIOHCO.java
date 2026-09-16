package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.util.EnumFacing;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EnumFacing.class)
public class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   @Final
   @Shadow
   public int index;
   @Final
   @Shadow
   public int horizontalIndex$v1_8;

   public int bridge$index() {
      return this.index;
   }

   public int bridge$horizontalIndex() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return this.horizontalIndex$v1_8;
      }

      return switch (this.index) {
         case 2 -> 2;
         case 3 -> 0;
         case 4 -> 1;
         case 5 -> 3;
         default -> -1;
      };
   }
}
