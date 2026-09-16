package com.moonsworth.lunar.v1_12.forge.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHRIICOIOORCHCOIICOOIHIRHHICRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;
import com.moonsworth.lunar.client.util.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiBossOverlay;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.gui.GuiSpectator;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.world.storage.WorldInfo;
import net.minecraftforge.client.GuiIngameForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GuiIngameForge.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   @Shadow
   public RenderGameOverlayEvent eventParent;
   @Unique
   private boolean lunar$foodRendered;

   @Inject(
      method = "renderGameOverlay(F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/GuiIngameForge;renderRecordOverlay(IIF)V"),
      require = 1
   )
   private void lunar$renderGameOverlay$forge(float var1, CallbackInfo var2) {
      ScaledResolution var3 = new ScaledResolution(Minecraft.getMinecraft());
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var4 = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
      if (!Minecraft.getMinecraft().gameSettings.showDebugInfo) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var4,
                  new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     var4
                  ),
                  new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     var3.getScaledWidth_double(), var3.getScaledHeight_double()
                  )
               )
            );
      }

      var4.push();
      float var5 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.getScale();
      var4.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var5, var5);
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var4,
               new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var4
               ),
               new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var3.getScaledWidth_double() / var5, var3.getScaledHeight_double() / var5
               )
            )
         );
      var4.pop();
   }

   @Inject(method = "renderGameOverlay(F)V", at = @At("HEAD"), cancellable = true)
   private void lunar$preventHud(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().ICHHCOOCHRRHICRROCROHIRCCRRHOC().HCCROIIICICIIICRIIRHHHOCCOIORC()) {
         var1.cancel();
      }
   }

   @Redirect(method = "renderChat", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiNewChat;drawChat(I)V"))
   private void lunar$drawChat(GuiNewChat var1, int var2) {
      ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var3 = (ROOCOCCCIRHHHIRIOIHHHHRHIICHHR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.class, () -> new ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var2));
      if (var3 == null
         || var3.RIHHRIORHCIOHCIRCOHIIHICOCCCOO()
            != com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DENY) {
         var1.drawChat(var2);
      }
   }

   @Redirect(method = "renderHealth", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/storage/WorldInfo;isHardcoreModeEnabled()Z"))
   private boolean lunar$renderPlayerStats_isHardcoreModeEnabled(WorldInfo var1) {
      return var1.isHardcoreModeEnabled()
         || IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CCIRRROHCHHIRRIRHHRIROICHCCCHO()
            .HHROHHCHCHHCIOORIOIRIOIHICHHRH();
   }

   @Redirect(
      method = "renderPlayerList(II)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiPlayerTabOverlay;renderPlayerlist(ILnet/minecraft/scoreboard/Scoreboard;Lnet/minecraft/scoreboard/ScoreObjective;)V"
      )
   )
   private void lunar$onRenderPlayerList(GuiPlayerTabOverlay var1, int var2, Scoreboard var3, ScoreObjective var4) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var5 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH::new
         );
      if (var5 == null || !var5.isCancelled()) {
         var1.renderPlayerlist(var2, var3, var4);
      }
   }

   @Redirect(method = "renderTitle", at = @At(value = "FIELD", target = "Lnet/minecraftforge/client/GuiIngameForge;titlesTimer:I", opcode = 180, ordinal = 0))
   private int lunar$renderGameOverlay$title(GuiIngameForge var1) {
      return 0;
   }

   @ModifyExpressionValue(method = "renderPlayerList", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/settings/KeyBinding;isKeyDown()Z"))
   private boolean lunar$isTabKeyDown(boolean var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var2.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         return ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)var2.HOROHROIORRIRIIIOOCCIROCRCROHI()
               .COICHIOIHHOHRHRHCIOICORCRORIIR()
               .get())
            .RHIOHIOHOCOCHOHIHIOIOICCIIHIRR()
            .getOrDefault(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.TAB,
               false
            );
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      return var3.isEnabled() ? var3.isActive() : var1;
   }

   @Inject(method = "renderHotbar", at = @At("HEAD"), cancellable = true)
   public void lunar$disableRenderTooltip(ScaledResolution var1, float var2, CallbackInfo var3) {
      if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHORCRHOORCIOHHIOCORCCCCCIRCCR()) {
         var3.cancel();
      } else if (this.eventParent == null) {
         this.eventParent = new RenderGameOverlayEvent(var2, var1);
      }
   }

   @Inject(method = "pre", at = @At("HEAD"), cancellable = true)
   public void lunar$checkValidEvent$pre(ElementType var1, CallbackInfoReturnable<Boolean> var2) {
      if (this.eventParent == null) {
         var2.setReturnValue(false);
      }
   }

   @Inject(method = "post", at = @At("HEAD"), cancellable = true)
   public void lunar$checkValidEvent$post(ElementType var1, CallbackInfo var2) {
      if (this.eventParent == null) {
         var2.cancel();
      }
   }

   @Inject(method = "renderFood", at = @At("HEAD"), cancellable = true)
   private void lunar$onRenderFood(int var1, int var2, CallbackInfo var3) {
      HHRIICOIOORCHCOIICOOIHIRHHICRI var4 = (HHRIICOIOORCHCOIICOOIHIRHHICRI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHRIICOIOORCHCOIICOOIHIRHHICRI.class, HHRIICOIOORCHCOIICOOIHIRHHICRI::new);
      if (var4 != null && var4.isCancelled()) {
         var3.cancel();
      }
   }

   @Inject(method = "renderFood", at = @At("TAIL"))
   private void lunar$trackFoodRendered(int var1, int var2, CallbackInfo var3) {
      this.lunar$foodRendered = true;
   }

   @Inject(method = "renderArmor", at = @At("HEAD"), cancellable = true)
   private void lunar$onDrawArmor(int var1, int var2, CallbackInfo var3) {
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR var4 = (RICRIRRCOHRCOCRRHHCRHRROOIOHHR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class, RICRIRRCOHRCOCRRHHCRHRROOIOHHR::new);
      if (var4 != null && var4.isCancelled()) {
         var3.cancel();
      }
   }

   @WrapOperation(method = "renderArmor", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/GuiIngameForge;drawTexturedModalRect(IIIIII)V"))
   private void lunar$drawArmorBarIcons(
      GuiIngameForge var1, int var2, int var3, int var4, int var5, int var6, int var7, Operation<Void> var8, @Local(index = 6) int var9
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var10 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HOOOOOCOCRIRCHIOCOHOCORCIOHRHR();
      int var11 = var9 / 2;
      if (var10 == null
         || !var10.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
            ),
            var11,
            var2,
            var3
         )) {
         var8.call(new Object[]{var1, var2, var3, var4, var5, var6, var7});
      }
   }

   @Inject(method = "renderArmor", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;disableBlend()V"))
   private void lunar$restoreArmorBarsState(int var1, int var2, CallbackInfo var3) {
      if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HOOOOOCOCRIRCHIOCOHOCORCIOHRHR()
         != null) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH();
         var4.RRIRHIRRCRIIHCCIOORCCIOCICOCHI();
         var4.HORCCIOICHOIHHCOCHIHIHOROHRROO();
         this.mc.getTextureManager().bindTexture(Gui.ICONS);
      }
   }

   @WrapWithCondition(method = "renderBossHealth", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiBossOverlay;renderBossHealth()V"))
   private boolean lunar$onRenderBossHealth(GuiBossOverlay var1) {
      HICRRICCHCCROOHHCHOCOCCHOIHHOC var2 = (HICRRICCHCCROOHHCHOCOCCHOIHHOC)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.class, HICRRICCHCCROOHHCHOCOCCHOIHHOC::new);
      return var2 == null || !var2.isCancelled();
   }

   @Inject(method = "renderGameOverlay", at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/GuiIngameForge;renderSleepFade(II)V"))
   private void lunar$renderHealthBarEvent(float var1, CallbackInfo var2) {
      boolean var3 = this.lunar$foodRendered;
      this.lunar$foodRendered = false;
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> !var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer())) {
         if (this.mc.playerController.shouldDrawHUD() && this.mc.getRenderViewEntity() instanceof EntityPlayer) {
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  IHHCHHHCRIHOOCOIOOCRIIICIOROIR.class,
                  () -> {
                     ScaledResolution var2x = new ScaledResolution(this.mc);
                     CIOHHCORHRCCRICCCORIHCRHCCCRRR var3x = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
                     return new IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
                        var3x,
                        new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           var3x
                        ),
                        new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           var2x.getScaledWidth_double(), var2x.getScaledHeight_double()
                        ),
                        var3
                     );
                  }
               );
         }
      }
   }

   @Inject(
      method = {"renderHealth", "renderArmor", "renderFood", "renderHealthMount", "renderAir", "renderExperience", "renderToolHighlight"},
      at = @At("HEAD"),
      cancellable = true
   )
   private void lunar$rewindDisableHotbar(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> !var0.HIRRIIORHOOCIHORRCCIOIOHCOORII().ROOOHCCRRCOIOIHCHRCRRCRHOIHHHH())) {
         var1.cancel();
      }
   }

   @Inject(method = "renderRecordOverlay", at = @At("HEAD"), cancellable = true)
   private void lunar$rewindDisableOverlayMessage(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> !var0.HIRRIIORHOOCIHORRCCIOIOHCOORII().COIOCCHHORHCIIIRCIHRHHHHIHRHRO())) {
         var1.cancel();
      }
   }

   @Inject(method = "renderRecordOverlay", at = @At("HEAD"), cancellable = true)
   private void lunar$actionBarDisableOverlayMessage(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().CIIHHRCCRHIOOIRROCHRCHCIHOOHHC().isEnabled()) {
         var1.cancel();
      }
   }

   @Inject(method = "pre", at = @At("HEAD"), cancellable = true)
   private void lunar$renderDebugInfo(ElementType var1, CallbackInfoReturnable<Boolean> var2) {
      if (var1 == ElementType.DEBUG
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RIRRCRRIRRHHIORCICCOHHRRHOCIIC().isEnabled()) {
         var2.setReturnValue(true);
      }
   }

   @WrapOperation(
      method = "renderHotbar",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiSpectator;renderTooltip(Lnet/minecraft/client/gui/ScaledResolution;F)V")
   )
   private void lunar$scaleHotbar$spectator(GuiSpectator var1, ScaledResolution var2, float var3, Operation<Void> var4) {
      MutableBoolean var5 = new MutableBoolean();
      var2 = this.lunar$scaleHotbar$pre(var2, var5);
      var4.call(new Object[]{var1, var2, var3});
      if (var5.getValue()) {
         this.lunar$scaleHotbar$post();
      }
   }

   @Unique
   private ScaledResolution lunar$scaleHotbar$pre(ScaledResolution var1, MutableBoolean var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var3 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.class,
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO::new
         );
      float var4 = var3 == null ? 1.0F : var3.getScale();
      if (var4 == 1.0F) {
         return var1;
      }

      var2.setValue(true);
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().HHIHIIOICHCCHIIRRCCRHHHOOCOOCO();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().bridge$scale(var4, var4, 1.0F);
      ScaledResolution var5 = new ScaledResolution(this.mc);
      var5.scaledWidth = Math.round(var5.scaledWidth / var4);
      var5.scaledHeight = Math.round(var5.scaledHeight / var4);
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         new CRHHOOCRCOHHRHOOOCHCROOHIOOCOH(
            var5.scaleFactor, var5.scaledWidth * var5.scaleFactor, var5.scaledHeight * var5.scaleFactor, var5.scaledWidth, var5.scaledHeight
         )
      );
      return var5;
   }

   @ModifyVariable(
      method = {"renderJumpBar", "renderExperience", "renderFood", "renderHealth", "renderAir", "renderHealthMount", "renderArmor"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0
   )
   private int lunar$scaleHotbar$pre$width(int var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.class,
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO::new
         );
      float var3 = var2 == null ? 1.0F : var2.getScale();
      return (int)(var1 / var3);
   }

   @ModifyVariable(
      method = {"renderJumpBar", "renderExperience", "renderFood", "renderHealth", "renderAir", "renderHealthMount", "renderArmor"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 1
   )
   private int lunar$scaleHotbar$pre$height(int var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.class,
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO::new
         );
      float var3 = var2 == null ? 1.0F : var2.getScale();
      return (int)(var1 / var3);
   }

   @Inject(
      method = "renderGameOverlay",
      at = {
            @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/PlayerControllerMP;shouldDrawHUD()Z"),
            @At(value = "INVOKE", target = "Lnet/minecraftforge/client/GuiIngameForge;renderSleepFade(II)V", shift = Shift.AFTER)
      }
   )
   private void lunar$scaleHotbar$pre$overlay(CallbackInfo var1, @Share("scaled") LocalBooleanRef var2) {
      MutableBoolean var3 = new MutableBoolean();
      this.lunar$scaleHotbar$pre(new ScaledResolution(this.mc), var3);
      var2.set(var3.getValue());
   }

   @Inject(
      method = "renderGameOverlay",
      at = {
            @At(value = "INVOKE", target = "Lnet/minecraftforge/client/GuiIngameForge;renderSleepFade(II)V"),
            @At(value = "INVOKE", target = "Lnet/minecraftforge/client/GuiIngameForge;renderToolHighlight(Lnet/minecraft/client/gui/ScaledResolution;)V")
      }
   )
   private void lunar$scaleHotbar$post$overlay(CallbackInfo var1, @Share("scaled") LocalBooleanRef var2) {
      if (var2.get()) {
         this.lunar$scaleHotbar$post();
      }
   }

   @ModifyVariable(method = "renderToolHighlight", at = @At("HEAD"), argsOnly = true, ordinal = 0)
   @Dynamic
   private ScaledResolution lunar$scaleHotbar$pre$resolution(ScaledResolution var1, @Share("scaled") LocalBooleanRef var2) {
      MutableBoolean var3 = new MutableBoolean();
      var1 = this.lunar$scaleHotbar$pre(var1, var3);
      var2.set(var3.getValue());
      return var1;
   }

   @Inject(method = "renderToolHighlight", at = @At("RETURN"))
   @Dynamic
   private void lunar$scaleHotbar$post$resolution(CallbackInfo var1, @Share("scaled") LocalBooleanRef var2) {
      if (var2.get()) {
         this.lunar$scaleHotbar$post();
      }
   }

   @Unique
   private void lunar$scaleHotbar$post() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().HROOORICCCOROOORORCORRHRHORIRC();
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         new CRHHOOCRCOHHRHOOOCHCROOHIOOCOH(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO)this.mc
         )
      );
   }
}
