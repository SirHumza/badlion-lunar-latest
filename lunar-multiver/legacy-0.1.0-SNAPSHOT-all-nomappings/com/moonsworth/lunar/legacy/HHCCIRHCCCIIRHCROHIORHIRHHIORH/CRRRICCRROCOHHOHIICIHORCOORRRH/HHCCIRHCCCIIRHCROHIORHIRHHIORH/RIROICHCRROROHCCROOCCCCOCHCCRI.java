package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.lunarclient.websocket.analytics.v1.RecordPinnedServerInteractionRequest.InteractionType;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ServerListEntryNormal;
import net.minecraft.client.gui.GuiListExtended.IGuiListEntry;
import net.minecraft.client.multiplayer.ServerData;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GuiMultiplayer.class)
public abstract class RIROICHCRROROHCCROOCCCCOCHCCRI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIROICHCRROROHCCROOCCCCOCHCCRI {
   @Mutable
   @Final
   @Shadow
   public GuiScreen parentScreen;
   @Shadow
   public GuiButton btnDeleteServer;
   @Shadow
   public GuiButton btnEditServer;

   @WrapOperation(
      method = "drawScreen",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiMultiplayer;drawCenteredString(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;III)V",
         ordinal = 0
      ),
      require = 0,
      expect = 0
   )
   private void lunar$hideMultiplayerTitle(GuiMultiplayer var1, FontRenderer var2, String var3, int var4, int var5, int var6, Operation<Void> var7) {
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC();
      if (var8 == null
         || var8.HHOCRICRHROCOORCHIOOOCRHCCCCCR()
            != com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCRCCIOOHRRCIOHOIIRHRCOORCRRHI
         )
       {
         var7.call(new Object[]{var1, var2, var3, var4, var5, var6});
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = {"canMoveUp$v1_12", "func_175392_a$v1_8"}, at = @At("HEAD"), cancellable = true)
   private void lunar$canMoveUp(ServerListEntryNormal var1, int var2, CallbackInfoReturnable<Boolean> var3) {
      if (var2 <= IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().OORRROHOHHOOROORRRCCCOCCOOCCHI().RCCOHRIIRRIHHHHCRIOHRHRRHIOIOH().size()) {
         var3.setReturnValue(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = {"canMoveDown$v1_12", "func_175394_b$v1_8"}, at = @At("HEAD"), cancellable = true)
   private void lunar$canMoveDown(ServerListEntryNormal var1, int var2, CallbackInfoReturnable<Boolean> var3) {
      if (var2 < IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().OORRROHOHHOOROORRRCCCOCCOOCCHI().RCCOHRIIRRIHHHHCRIOHRHRRHIOIOH().size()) {
         var3.setReturnValue(false);
      }
   }

   @WrapOperation(
      method = "connectToSelected",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/GuiMultiplayer;connectToServer(Lnet/minecraft/client/multiplayer/ServerData;)V",
         ordinal = 0
      )
   )
   private void lunar$connectToSelected(GuiMultiplayer var1, ServerData var2, Operation<Void> var3) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var2;
      if (var4.bridge$isPinned()) {
         var4.bridge$setPinnedClicked(true);
      }

      var3.call(new Object[]{var1, var2});
   }

   @Inject(method = "actionPerformed", at = @At("HEAD"))
   private void lunar$actionPerformed(GuiButton var1, CallbackInfo var2) {
      if (var1.id == 0 && this.parentScreen instanceof GuiIngameMenu && IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() == null) {
         this.parentScreen = null;
      }
   }

   @Inject(method = "confirmClicked(ZI)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/ServerList;removeServerData(I)V"))
   private void lunar$confirmClick(boolean var1, int var2, CallbackInfo var3, @Local IGuiListEntry var4) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .OORRROHOHHOOROORRRCCCOCCOOCCHI();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)((ServerListEntryNormal)var4)
         .getServerData();
      if (var1 && var6.bridge$isPinned()) {
         var5.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var6);
      }
   }

   @Inject(method = "selectServer(I)V", at = @At("TAIL"))
   private void lunar$selectServer(int var1, CallbackInfo var2, @Local IGuiListEntry var3) {
      if (var3 instanceof ServerListEntryNormal var4) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .OORRROHOHHOOROORRRCCCOCCOOCCHI();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var4.getServerData();
         if (var6.bridge$isPinned()) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO()
               .ifPresent(var1x -> var1x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, InteractionType.INTERACTION_TYPE_HOVER));
            this.btnDeleteServer.enabled = var5.CRRRICCRROCOHHOHIICIHORCOORRRH(var6);
            this.btnEditServer.enabled = false;
         }
      }
   }
}
