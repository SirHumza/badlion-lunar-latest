package com.moonsworth.lunar.client.RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.client.gui.GuiSubtitleOverlay;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.GuiSubtitleOverlay.Subtitle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiSubtitleOverlay.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public List<Subtitle> subtitles;

   @Inject(method = "renderSubtitles", at = @At(value = "INVOKE", target = "Ljava/util/List;iterator()Ljava/util/Iterator;", ordinal = 1), cancellable = true)
   private void lunar$onRender(
      ScaledResolution var1,
      CallbackInfo var2,
      @Local(ordinal = 1) int var3,
      @Local(ordinal = 0) Vec3d var4,
      @Local(ordinal = 1) Vec3d var5,
      @Local(ordinal = 3) Vec3d var6
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OCOIIROOHHHHCOCIHHOOROHOCHIHHH();
      if (var7.isEnabled()) {
         var2.cancel();
         GlStateManager.popMatrix();
         var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.subtitles, var3, (CRHROHHHCIHHCOHCOORCRIHHIICROR)var4, (CRHROHHHCIHHCOHCOORCRIHHIICROR)var5, (CRHROHHHCIHHCOHCOORCRIHHIICROR)var6
         );
      }
   }
}
