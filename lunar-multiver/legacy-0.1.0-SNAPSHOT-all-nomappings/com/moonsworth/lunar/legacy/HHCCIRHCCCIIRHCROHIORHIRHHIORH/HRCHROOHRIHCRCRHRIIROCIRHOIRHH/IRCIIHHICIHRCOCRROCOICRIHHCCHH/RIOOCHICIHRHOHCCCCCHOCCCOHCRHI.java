package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.entity.monster.EntitySkeleton;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EntitySkeleton.class)
public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   @Shadow
   public abstract int getSkeletonType$v1_7();

   public boolean bridge$isWitherSkeleton() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5 ? this.getSkeletonType$v1_7() == 1 : false;
   }
}
