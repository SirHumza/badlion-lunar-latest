package com.moonsworth.lunar.client.RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
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
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public Minecraft mc;
   @Final
   @Shadow
   public int[] lightmapColors;
   @Final
   @Shadow
   public DynamicTexture lightmapTexture;
   @Shadow
   public ItemStack itemActivationItem;
   @Shadow
   public int itemActivationTicks;
   @Shadow
   public float itemActivationOffX;
   @Shadow
   public float itemActivationOffY;

   @Shadow
   public abstract void setupOverlayRendering();

   @Shadow
   public abstract void setupCameraTransform(float var1, int var2);

   @Inject(method = "displayItemActivation", at = @At("RETURN"))
   private void lunar$onDisplayItemActivation(ItemStack var1, CallbackInfo var2) {
      if (this.lunar$isTotemAnimationOverriden()) {
         this.itemActivationTicks = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
            .RIRIOIRCIOCRIRROCHOHIIRHHRIIOC()
            .ORRHHHCORHIROCIICCRHCHRHOIORII();
      }
   }

   @WrapMethod(method = "renderItemActivation")
   private void lunar$onRenderItemActivation(int var1, int var2, float var3, Operation<Void> var4) {
      if (!this.lunar$isTotemAnimationOverriden()) {
         this.itemActivationTicks = Math.min(40, this.itemActivationTicks);
         var4.call(new Object[]{var1, var2, var3});
      } else {
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
            .RIRIOIRCIOCRIRROCHOHIIRHHRIIOC();
         if (this.itemActivationItem != null && this.itemActivationTicks > 0 && !var5.ROHOCCCORHRIRHRHCRRIOICRIOHOCR()) {
            int var6 = var5.ORRHHHCORHIROCIICCRHCHRHOIORII();
            int var7 = var6 - this.itemActivationTicks;
            float var8 = (var7 + var3) / var6;
            var8 = MathHelper.clamp(var8, 0.0F, 1.0F);
            float var9 = var8 * var8;
            float var10 = var8 * var9;
            float var11 = 10.25F * var10 * var9 + -24.95F * var9 * var9 + 25.5F * var10 + -13.8F * var9 + 4.0F * var8;
            var11 *= (float) Math.PI;
            int var12 = var5.RCHHHORIRORROOHRRHHIIIOIROHHCC(var1);
            int var13 = var5.CIOORRCRICOIICROHRHRHHOHRCCRII(var2);
            boolean var14 = var5.OOCCHRRHHROCHCIORHIRROHOCIOROR();
            float var15 = var14 ? this.itemActivationOffX * (var12 / 4) : 0.0F;
            float var16 = var14 ? this.itemActivationOffY * (var13 / 4) : 0.0F;
            GlStateManager.enableAlpha();
            GlStateManager.pushMatrix();
            GlStateManager.pushAttrib();
            GlStateManager.enableDepth();
            GlStateManager.disableCull();
            RenderHelper.enableStandardItemLighting();
            GlStateManager.translate(
               var5.HCOIOHCCHIHRCHCCICCIRCIOHCRIHH(var12 / 2) + var15 * MathHelper.abs(MathHelper.sin(var11 * 2.0F)),
               var5.HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(var13 / 2) + var16 * MathHelper.abs(MathHelper.sin(var11 * 2.0F)),
               -50.0F
            );
            float var17 = 50.0F + 175.0F * var5.HORHCHIIOCRROHOHRCORCCICCRCCHO(true) * MathHelper.sin(var11);
            GlStateManager.scale(var17, -var17, var17);
            if (var5.CIHHRIRCHHOHCIIRIOHRIIRIIRCOIC()) {
               float var18 = var5.RROOHHCCIHOCROHHHICCIIICRCOIHH();
               GlStateManager.rotate(900.0F * MathHelper.abs(MathHelper.sin(var11 * var18)), 0.0F, 1.0F, 0.0F);
               GlStateManager.rotate(6.0F * MathHelper.cos(var8 * 8.0F * var18), 1.0F, 0.0F, 0.0F);
               GlStateManager.rotate(6.0F * MathHelper.cos(var8 * 8.0F * var18), 0.0F, 0.0F, 1.0F);
            }

            this.mc.getRenderItem().renderItem(this.itemActivationItem, TransformType.FIXED);
            GlStateManager.popAttrib();
            GlStateManager.popMatrix();
            RenderHelper.disableStandardItemLighting();
            GlStateManager.enableCull();
            GlStateManager.disableDepth();
         }
      }
   }

   @Unique
   private boolean lunar$isTotemAnimationOverriden() {
      if (this.itemActivationItem != null && this.itemActivationItem.getItem() == Items.TOTEM_OF_UNDYING) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
         return var1.isEnabled() && var1.RIRIOIRCIOCRIRROCHOHIIRHHRIIOC().isEnabled();
      } else {
         return false;
      }
   }

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
         CRHHOOCRCOHHRHOOOCHCROOHIOOCOH var4 = new CRHHOOCRCOHHRHOOOCHCROOHIOOCOH(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO)Minecraft.getMinecraft()
         );
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4);
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var5 = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
         float var6 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.getScale();
         this.lunar$render3DOverlays(var2);
         var5.OIOIICCHICHHHCRROHIHIOICHROOCR();
         ScaledResolution var7 = new ScaledResolution(var3);
         if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIRRORICCRRRHRCCOCHRHRCICOIRRH()) {
            if (Minecraft.isFancyGraphicsEnabled()) {
               var1.renderVignette(var3.player.getBrightness(), new ScaledResolution(var3));
            }

            if (!var3.playerController.isSpectator()) {
               var1.renderHotbar(var7, var2);
            }

            var5.IRCHOHHOOROOHIIHHROOOOIIHHOIIH();
         }

         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RICIIRICHOHCHIHOOORRHIORCIIHHR
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var4, () -> var1.renderGameOverlay(var2));
         if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIRRORICCRRRHRCCOCHRHRCICOIRRH()) {
            this.setupOverlayRendering();
            var5.IRCHOHHOOROOHIIHHROOOOIIHHOIIH();
            if (!var3.gameSettings.hideGUI) {
               IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
                  .HOROHROIORRIRIIIOOCCIROCRCROHI();
               boolean var9 = var8 == null || var8.HIRRIIORHOOCIHORRCCIOIOHCOORII().ROHIICHRHHIRROOCHIICIHROCHRIIO();
               var3.getTextureManager().bindTexture(Gui.ICONS);
               var5.OIOIICCHICHHHCRROHIHIOICHROOCR();
               if (var9) {
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                     .OHRCCHHHOCHIIHCORHICRCIRCRHHIC()
                     .isEnabled()) {
                     this.lunar$renderAttackIndicator(var1, var4);
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
                     var1.renderAttackIndicator(var2, var7);
                  }
               }

               GlStateManager.tryBlendFuncSeparate(770, 771, 1, 0);
            }

            if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRICROCIRHOHCCOIORCCRCHIRRRHO()) {
               var3.profiler.startSection("chat");
               var5.push();
               var5.OIOIICCHICHHHCRROHIHIOICHROOCR();
               var5.translate(0.0, var4.getScaledHeight() - 48, 0.0);
               var1.persistantChatGUI.drawChat(var1.updateCounter);
               var5.pop();
               var3.profiler.endSection();
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
      this.mc.profiler.startSection("overlay3d");
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
      this.mc.profiler.endSection();
   }

   @Unique
   private void lunar$renderAttackIndicator(Gui var1, CRHHOOCRCOHHRHOOOCHCROOHIOOCOH var2) {
      int var3 = var2.getScaledWidth();
      int var4 = var2.getScaledHeight();
      GlStateManager.tryBlendFuncSeparate(SourceFactor.ONE_MINUS_DST_COLOR, DestFactor.ONE_MINUS_SRC_COLOR, SourceFactor.ONE, DestFactor.ZERO);
      GlStateManager.enableAlpha();
      if (this.mc.gameSettings.attackIndicator == 1
         && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CHOIHIROOCORIOOIHOOHRROCOCCHHI()
            .RIHRORIHCRCHHHOORRHIOHHHIICRRR()) {
         float var5 = this.mc.player.getCooledAttackStrength(0.0F);
         boolean var6 = false;
         if (this.mc.pointedEntity != null && this.mc.pointedEntity instanceof EntityLivingBase && var5 >= 1.0F) {
            var6 = this.mc.player.getCooldownPeriod() > 5.0F;
            var6 = var6 && this.mc.pointedEntity.isEntityAlive();
         }

         int var7 = var4 / 2 - 7 + 16;
         int var8 = var3 / 2 - 8;
         if (var6) {
            var1.drawTexturedModalRect(var8, var7, 68, 94, 16, 16);
         } else if (var5 < 1.0F) {
            int var9 = (int)(var5 * 17.0F);
            var1.drawTexturedModalRect(var8, var7, 36, 94, 16, 4);
            var1.drawTexturedModalRect(var8, var7, 52, 94, var9, 4);
         }
      }

      GlStateManager.tryBlendFuncSeparate(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO);
   }
}
