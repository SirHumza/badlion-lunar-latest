package com.moonsworth.lunar.client.RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalDoubleRef;
import com.lunarclient.apollo.module.packetenrichment.PacketEnrichmentModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public Minecraft mc;
   @Shadow
   public Entity pointedEntity;
   @Final
   @Shadow
   public int[] lightmapColors;
   @Final
   @Shadow
   public DynamicTexture lightmapTexture;

   @Shadow
   public abstract void setupCameraTransform(float var1, int var2);

   @Inject(method = "<init>(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/resources/IResourceManager;)V", at = @At("TAIL"))
   private void lunar$initializeLightMap(CallbackInfo var1) {
      Arrays.fill(this.lightmapColors, -1);
      this.lightmapTexture.updateDynamicTexture();
   }

   @Redirect(method = "updateCameraAndRender", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiIngame;renderGameOverlay(FZII)V"))
   private void lunar$renderGui(GuiIngame var1, float var2, boolean var3, int var4, int var5) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         || !IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$isHideGui()) {
         Minecraft var6 = this.mc;
         CRHHOOCRCOHHRHOOOCHCROOHIOOCOH var7 = new CRHHOOCRCOHHRHOOOCHCROOHIOOCOH((RRCRRCORICCHOHHIRCHIROOHIIOHCO)Minecraft.getMinecraft());
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var7);
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var8 = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
         float var9 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.getScale();
         this.lunar$render3DOverlays(var2);
         var6.entityRenderer.setupOverlayRendering();
         var8.OIOIICCHICHHHCRROHIHIOICHROOCR();
         if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIRRORICCRRRHRCCOCHRHRCICOIRRH()) {
            var8.OIIHIOIORRHHRCRRCCORRHHCHRHORH();
            if (Minecraft.isFancyGraphicsEnabled()) {
               var1.renderVignette(this.mc.thePlayer.getBrightness(var2), var7.getScaledWidth(), var7.getScaledHeight());
            }

            var8.IRCHOHHOOROOHIIHHROOOOIIHHOIIH();
         }

         var8.push();
         var8.translate(0.0, 0.0, var1.zLevel);
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RICIIRICHOHCHIHOOORRHIORCIIHHR
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var7, () -> var1.renderGameOverlay(var2, var3, var4, var5));
         var8.pop();
         if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HIRRORICCRRRHRCCOCHRHRCICOIRRH()) {
            var8.IRCHOHHOOROOHIIHHROOOOIIHHOIIH();
            GL11.glEnable(32826);
            RenderHelper.enableGUIStandardItemLighting();

            for (int var10 = 0; var10 < 9; var10++) {
               int var11 = var7.getScaledWidth() / 2 - 90 + var10 * 20 + 2;
               int var12 = var7.getScaledHeight() - 16 - 3;
               var1.renderInventorySlot(var10, var11, var12, var2);
            }

            RenderHelper.disableStandardItemLighting();
            GL11.glDisable(32826);
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var14 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
               .HOROHROIORRIRIIIOOCCIROCRCROHI();
            if (var14 == null || var14.HIRRIIORHOOCIHORRCCIOIOHCOORII().ROOOHCCRRCOIOIHCHRCRRCRHOIHHHH()) {
               CIOHHCORHRCCRICCCORIHCRHCCCRRR var15 = OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
                     () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           var15
                        ),
                        var7.getScaledWidth() / 2 - 91,
                        var7.getScaledHeight() - 22
                     )
                  );
               var15.IRCHOHHOOROOHIIHHROOOOIIHHOIIH();
            }

            if (!this.mc.gameSettings.hideGUI) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var16 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
                  .HOROHROIORRIRIIIOOCCIROCRCROHI();
               boolean var17 = var16 == null || var16.HIRRIIORHOOCIHORRCCIOIOHCOORII().ROHIICHRHHIRROOCHIICIHROCHRIIO();
               var6.getTextureManager().bindTexture(Gui.icons);
               var8.OIOIICCHICHHHCRROHIHIOICHROOCR();
               if (var17) {
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                     .OHRCCHHHOCHIIHCORHICRCIRCRHHIC()
                     .isEnabled()) {
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .OHRCCHHHOCHIIHCORHICRCIRCRHHIC()
                        .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              var8,
                              new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                                 var8
                              ),
                              new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                                 var7.OORIRCRHIRCCRRRHOHOCHIRHCHRHHR(), var7.OIRIIHRORRRRIRRIORRIRRIIHCIOOH()
                              )
                           )
                        );
                  } else {
                     CRRRICCRROCOHHOHIICIHORCOORRRH var13 = (CRRRICCRROCOHHOHIICIHORCOORRRH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH.class, CRRRICCRROCOHHOHIICIHORCOORRRH::new);
                     if (var13 == null
                        || var13.RIHHRIORHCIOHCIRCOHIIHICOCCCOO()
                           != com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DENY) {
                        GL11.glEnable(3042);
                        OpenGlHelper.glBlendFunc(775, 769, 1, 0);
                        var1.drawTexturedModalRect(var7.getScaledWidth() / 2 - 7, var7.getScaledHeight() / 2 - 7, 0, 0, 16, 16);
                     }
                  }
               }

               OpenGlHelper.glBlendFunc(770, 771, 1, 0);
            }

            if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRICROCIRHOHCCOIORCCRCHIRRRHO()) {
               this.mc.mcProfiler.startSection("chat");
               var8.push();
               var8.OIOIICCHICHHHCRROHIHIOICHROOCR();
               var8.translate(0.0, var7.getScaledHeight() - 48, 0.0);
               var1.persistantChatGUI.drawChat(var1.updateCounter);
               var8.pop();
               this.mc.mcProfiler.endSection();
            }
         }

         var8.OIIHIOIORRHHRCRRCCORRHHCHRHORH();
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var7,
            var8,
            new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var8
            ),
            var9
         );
         var8.HHCCIRHCCCIIRHCROHIORHIRHHIORH(1.0F, 1.0F, 1.0F, 1.0F);
         var8.CHHHIRRRHHCOOHRRICOCICHHROHHIR();
         var8.OIIHIOIORRHHRCRRCCORRHHCHRHORH();
      }
   }

   @Unique
   private void lunar$render3DOverlays(float var1) {
      this.mc.mcProfiler.startSection("overlay3d");
      GL11.glClear(256);
      GL11.glMatrixMode(5888);
      GL11.glPushMatrix();
      GL11.glMatrixMode(5889);
      GL11.glPushMatrix();
      GameSettings var2 = Minecraft.getMinecraft().gameSettings;
      boolean var3 = var2.anaglyph;
      var2.anaglyph = false;
      this.setupCameraTransform(var1, 2);
      var2.anaglyph = var3;
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         var1
      );
      GL11.glMatrixMode(5889);
      GL11.glPopMatrix();
      GL11.glMatrixMode(5888);
      GL11.glPopMatrix();
      this.mc.mcProfiler.endSection();
   }

   @ModifyVariable(method = "getMouseOver(F)V", at = @At(value = "STORE", ordinal = 0), ordinal = 3)
   public double apollo$saveReachVariable(double var1, @Share("reach") LocalDoubleRef var3) {
      var3.set(var1);
      return var1;
   }

   @Inject(
      method = "getMouseOver(F)V",
      at = @At(
         value = "FIELD",
         target = "Lnet/minecraft/client/Minecraft;objectMouseOver:Lnet/minecraft/util/MovingObjectPosition;",
         shift = Shift.AFTER,
         opcode = 181,
         ordinal = 1
      )
   )
   private void apollo$reachCheck$v1_7(CallbackInfo var1, @Share("reach") LocalDoubleRef var2) {
      if (this.pointedEntity instanceof AbstractClientPlayer) {
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(PacketEnrichmentModule.class)
            .filter(var0 -> (Boolean)var0.getOptions().get(PacketEnrichmentModule.PLAYER_ATTACK_PACKET))
            .ifPresent(var2x -> ((IRRCCOICORICIHCHRHIHIHROIRHOCR)var2x).RHIIIIHIICHCCOHRRCHIOIOOHHOOHO().put(this.pointedEntity.getUniqueID(), var2.get()));
      }
   }
}
