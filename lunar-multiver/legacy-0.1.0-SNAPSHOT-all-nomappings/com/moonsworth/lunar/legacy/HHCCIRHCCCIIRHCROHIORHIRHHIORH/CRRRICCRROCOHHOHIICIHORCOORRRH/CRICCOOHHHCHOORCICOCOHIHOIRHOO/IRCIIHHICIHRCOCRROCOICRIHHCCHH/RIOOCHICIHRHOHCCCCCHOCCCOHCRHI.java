package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import net.minecraft.client.renderer.block.model.ModelRotation;
import net.minecraft.util.EnumFacing;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(ModelRotation.class)
public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements IRCRRHRCIRHIHIHROHCRRHIIHHHHCH {
   @Shadow
   public abstract EnumFacing rotateFace(EnumFacing var1);

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI bridge$rotateFace(OHHRIOHROOIHOROCIRHCHORIHRRRRI var1) {
      return (OHHRIOHROOIHOROCIRHCHORIHRRRRI)this.rotateFace((EnumFacing)var1);
   }
}
