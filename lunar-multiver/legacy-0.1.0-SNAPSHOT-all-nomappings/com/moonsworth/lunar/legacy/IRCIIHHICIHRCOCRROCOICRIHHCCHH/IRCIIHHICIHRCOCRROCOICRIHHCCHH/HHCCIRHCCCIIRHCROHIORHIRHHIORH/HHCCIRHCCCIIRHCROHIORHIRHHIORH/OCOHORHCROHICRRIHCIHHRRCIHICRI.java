package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class OCOHORHCROHICRRIHCIHHRRCIHICRI {
   @Inject(
      method = {
            "drawTexturedModalRect(IIIIII)V",
            "drawTexturedModalRect$v1_8(FFIIII)V",
            "drawTexturedModalRect$v1_8(IILnet/minecraft/client/renderer/texture/TextureAtlasSprite;II)V"
      },
      at = @At("HEAD")
   )
   private void lunar$applyGuiTint(CallbackInfo var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.CRRRICCRROCOHHOHIICIHORCOORRRH.HICOCHRORIIRIHOICIIHOCRHHRHIRR();
   }

   @Inject(
      method = {
            "drawTexturedModalRect(IIIIII)V",
            "drawTexturedModalRect$v1_8(FFIIII)V",
            "drawTexturedModalRect$v1_8(IILnet/minecraft/client/renderer/texture/TextureAtlasSprite;II)V"
      },
      at = @At("RETURN")
   )
   private void lunar$clearGuiTint(CallbackInfo var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.CRRRICCRROCOHHOHIICIHORCOORRRH.COOHHCIHIRICOOOIIICCIOHCHICHII();
   }
}
