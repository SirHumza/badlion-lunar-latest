package com.moonsworth.lunar.client.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.settings.GameSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public Minecraft mc;
   @Shadow
   public DynamicTexture lightmapTexture;
   @Shadow
   public int[] lightmapColors;

   @Shadow
   public abstract void setupCameraTransform(float var1, int var2);

   @Inject(method = "<init>(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/resources/IResourceManager;)V", at = @At("TAIL"))
   private void lunar$initializeLightMap(CallbackInfo var1) {
      Arrays.fill(this.lightmapColors, -1);
      this.lightmapTexture.updateDynamicTexture();
   }

   @Redirect(method = "updateCameraAndRender", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiIngame;renderGameOverlay(F)V"))
   private void lunar$renderGui(GuiIngame var1, float var2) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         || !IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$isHideGui()) {
         Minecraft var3 = this.mc;
         CRHHOOCRCOHHRHOOOCHCROOHIOOCOH var4 = new CRHHOOCRCOHHRHOOOCHCROOHIOOCOH((RRCRRCORICCHOHHIRCHIROOHIIOHCO)Minecraft.getMinecraft());
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4);
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var5 = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
         float var6 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.getScale();
         this.lunar$render3DOverlays(var2);
         var3.entityRenderer.setupOverlayRendering();
         var5.OIOIICCHICHHHCRROHIHIOICHROOCR();
         if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIRRORICCRRRHRCCOCHRHRCICOIRRH()) {
            ScaledResolution var7 = new ScaledResolution(var3);
            if (Minecraft.isFancyGraphicsEnabled()) {
               var1.renderVignette(this.mc.thePlayer.getBrightness(var2), var7);
            }

            if (!this.mc.playerController.isSpectator()) {
               var1.renderTooltip(var7, var2);
            }

            var5.IRCHOHHOOROOHIIHHROOOOIIHHOIIH();
            var5.OIIHIOIORRHHRCRRCCORRHHCHRHORH();
         }

         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RICIIRICHOHCHIHOOORRHIORCIIHHR
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var4, () -> var1.renderGameOverlay(var2));
         if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIRRORICCRRRHRCCOCHRHRCICOIRRH()) {
            var3.entityRenderer.setupOverlayRendering();
            var5.IRCHOHHOOROOHIIHHROOOOIIHHOIIH();
            if (!this.mc.gameSettings.hideGUI
               && (
                  var1.showCrosshair()
                     || IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .OHRCCHHHOCHIIHCORHICRCIRCRHHIC()
                        .isEnabled()
               )) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
                  .HOROHROIORRIRIIIOOCCIROCRCROHI();
               boolean var8 = var9 == null || var9.HIRRIIORHOOCIHORRCCIOIOHCOORII().ROHIICHRHHIRROOCHIICIHROCHRIIO();
               var3.getTextureManager().bindTexture(Gui.icons);
               var5.OIOIICCHICHHHCRROHIHIOICHROOCR();
               if (var8) {
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                     .OHRCCHHHOCHIIHCORHICRCIRCRHHIC()
                     .isEnabled()) {
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .OHRCCHHHOCHIIHCORHICRCIRCRHHIC()
                        .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              var5,
                              new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5),
                              new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                                 var4.OORIRCRHIRCCRRRHOHOCHIRHCHRHHR(), var4.OIRIIHRORRRRIRRIORRIRRIIHCIOOH()
                              )
                           )
                        );
                  } else {
                     GlStateManager.tryBlendFuncSeparate(775, 769, 1, 0);
                     GlStateManager.enableAlpha();
                     var1.drawTexturedModalRect(var4.getScaledWidth() / 2 - 7, var4.getScaledHeight() / 2 - 7, 0, 0, 16, 16);
                  }
               }

               GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            }

            if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRICROCIRHOHCCOIORCCRCHIRRRHO()) {
               this.mc.mcProfiler.startSection("chat");
               var5.push();
               var5.OIOIICCHICHHHCRROHIHIOICHROOCR();
               var5.translate(0.0, var4.getScaledHeight() - 48, 0.0);
               var1.persistantChatGUI.drawChat(var1.updateCounter);
               var5.pop();
               this.mc.mcProfiler.endSection();
            }
         }

         var5.OIIHIOIORRHHRCRRCCORRHHCHRHORH();
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var4, var5, new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5), var6
         );
         var5.HHCCIRHCCCIIRHCROHIORHIRHHIORH(1.0F, 1.0F, 1.0F, 1.0F);
         var5.CHHHIRRRHHCOOHRRICOCICHHROHHIR();
         var5.OIIHIOIORRHHRCRRCCORRHHCHRHORH();
      }
   }

   @Unique
   private void lunar$render3DOverlays(float var1) {
      this.mc.mcProfiler.startSection("overlay3d");
      GlStateManager.clear(256);
      GlStateManager.matrixMode(5888);
      GlStateManager.pushMatrix();
      GlStateManager.matrixMode(5889);
      GlStateManager.pushMatrix();
      GameSettings var2 = Minecraft.getMinecraft().gameSettings;
      boolean var3 = var2.anaglyph;
      var2.anaglyph = false;
      this.setupCameraTransform(var1, 2);
      var2.anaglyph = var3;
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         var1
      );
      GlStateManager.matrixMode(5889);
      GlStateManager.popMatrix();
      GlStateManager.matrixMode(5888);
      GlStateManager.popMatrix();
      this.mc.mcProfiler.endSection();
   }
}
