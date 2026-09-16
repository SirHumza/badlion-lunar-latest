package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import net.minecraft.client.resources.data.TextureMetadataSection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(TextureMetadataSection.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Shadow
   public abstract boolean getTextureBlur();

   @Shadow
   public abstract boolean getTextureClamp();

   public boolean bridge$getTextureBlur() {
      return this.getTextureBlur();
   }

   public boolean bridge$getTextureClamp() {
      return this.getTextureClamp();
   }
}
