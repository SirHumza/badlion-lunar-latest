package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.websocket.hostedworld.v1.JoinHostedWorldRequest.Source;
import com.moonsworth.lunar.client.util.CCHORHIOORICCIRIHRIIHIICORIORO;
import com.moonsworth.lunar.client.util.COIHORRCHRRCHOCIRHHRRIOIHRIHCC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ServerSelectionList;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.network.LanServerDetector.LanServerList;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.text.ITextComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiMultiplayer.class)
public abstract class CIOHHCORHRCCRICCCORIHCRHCCCRRR extends GuiScreen {
   @Shadow
   public ServerSelectionList serverListSelector;
   @Unique
   private com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH lunar$scanner;

   @Shadow
   public abstract void selectServer(int var1);

   @Inject(method = "connectToServer", at = @At("HEAD"), cancellable = true)
   public void lunar$blocklist(ServerData var1, CallbackInfo var2) {
      if (!com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORIRHOIOHCCHOHRIRIHCHIICOIIOOR
         .CCCHIIRHRCOIIHOCCHCHCROOCRICRH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCROOOORIRIHOORHRHCIHICIIRROO(var1.serverIP)
         )) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(
            com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HROOOIHOCROORRHICRCHIHHIOOIOCH
         );
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            this.mc.displayGuiScreen(new GuiDisconnected(this, "Disconnected", (ITextComponent)var3));
         } else {
            this.mc.displayGuiScreen(new GuiDisconnected(this, "Disconnected", (IChatComponent)var3));
         }

         var2.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "initGui",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/gui/ServerSelectionList;updateOnlineServers$v1_12(Lnet/minecraft/client/multiplayer/ServerList;)V"
      )
   )
   private void lunar$startScanningHostedWorlds$v1_12(CallbackInfo var1) {
      this.lunar$startScanningHostedWorlds();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(
      method = "initGui",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/ServerSelectionList;func_148195_a(Lnet/minecraft/client/multiplayer/ServerList;)V")
   )
   private void lunar$startScanningHostedWorlds$v1_7(CallbackInfo var1) {
      this.lunar$startScanningHostedWorlds();
   }

   @Unique
   private void lunar$startScanningHostedWorlds() {
      this.lunar$scanner = new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      this.lunar$scanner.start();
   }

   @Inject(method = "onGuiClosed", at = @At("HEAD"))
   private void lunar$stopScanningHostedWorlds(CallbackInfo var1) {
      if (this.lunar$scanner != null) {
         this.lunar$scanner.interrupt();
         this.lunar$scanner = null;
      }
   }

   @Inject(method = "mouseClicked", at = @At("TAIL"))
   private void lunar$armServerDrag(int var1, int var2, int var3, CallbackInfo var4) {
      ((com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.serverListSelector)
         .lunar$armServerDrag(var1, var2, var3);
   }

   @Inject(method = "connectToSelected", at = @At("TAIL"))
   private void impl$onJoinSelected(CallbackInfo var1) {
      int var2;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var2 = this.serverListSelector.getSelected$v1_12();
      } else {
         var2 = this.serverListSelector.func_148193_k$v1_7();
      }

      if ((var2 < 0 ? null : this.serverListSelector.getListEntry(var2)) instanceof com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
         && var4.OIICIHCOORRCCIRRRCRHCHIHHCCRRC()) {
         UuidAndUsername var5 = var4.CCOOCRHROHIRRCCHORCCRIOOHROHRO().getHost();
         COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               CCHORHIOORICCIRIHRIIHIICORIORO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5.getUuid()), var5.getUsername()
            ),
            Source.SOURCE_MULTIPLAYER_SERVER
         );
      }
   }

   @WrapOperation(
      method = "updateScreen",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/network/LanServerDetector$LanServerList;getWasUpdated()Z")
   )
   private boolean impl$updateNetworkServers(LanServerList var1, Operation<Boolean> var2) {
      boolean var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().CRIHHICHIOCHIOOCCRICCCOIIOHHIC();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().OCICRRCHRIRORHIRHIHOIRCCIHCHRH(false);
      if (!(Boolean)var2.call(new Object[]{var1}) && !var3) {
         return false;
      }

      this.selectServer(-1);
      return true;
   }

   @Inject(method = "connectToServer", at = @At("HEAD"), cancellable = true)
   private void lunar$maliciousServerWarning(ServerData var1, CallbackInfo var2) {
      if (this.lunar$isServerSpam()) {
         var2.cancel();
      } else if (this.lunar$maliciousServerWarning(var1)) {
         var2.cancel();
      } else {
         this.lunar$disconnectCurrentWorldOnJoin();
      }
   }

   @Unique
   private boolean lunar$maliciousServerWarning(ServerData var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHOIROCHCHORIOOOIHCIIIRHIORIIH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.serverIP, () -> {
            this.lunar$disconnectCurrentWorldOnJoin();
            this.mc.displayGuiScreen(new GuiConnecting(this.mc.currentScreen, this.mc, var1));
         }, () -> this.mc.displayGuiScreen(this));
   }

   @Unique
   private void lunar$disconnectCurrentWorldOnJoin() {
      Minecraft var1 = Minecraft.getMinecraft();
      if (var1.getCurrentServerData() != null && var1.world != null) {
         var1.world.sendQuittingDisconnectingPacket();
         var1.loadWorld(null);
      }
   }

   @Unique
   private boolean lunar$isServerSpam() {
      Minecraft var1 = Minecraft.getMinecraft();
      return var1.getCurrentServerData() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1
         && var1.world == null
         && var1.currentScreen instanceof GuiConnecting;
   }
}
