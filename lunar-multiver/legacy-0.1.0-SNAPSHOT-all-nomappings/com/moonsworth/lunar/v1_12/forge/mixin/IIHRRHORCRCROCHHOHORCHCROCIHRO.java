package com.moonsworth.lunar.v1_12.forge.mixin;

import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.network.ServerStatusResponse;
import net.minecraft.network.status.server.SPacketServerInfo;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(present = "forge")
@Mixin(targets = "net.minecraft.client.network.ServerPinger$1")
public abstract class IIHRRHORCRCROCHHOHORCHCROCIHRO {
   @Final
   @Shadow
   public ServerData val$server;

   @Inject(method = "handleServerInfo(Lnet/minecraft/network/status/server/SPacketServerInfo;)V", at = @At("HEAD"))
   private void impl$onHandleServerInfo(SPacketServerInfo var1, CallbackInfo var2) {
      ServerStatusResponse var3 = var1.response;
      ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.val$server)
         .setLunarServer(
            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var3).getLunarServer()
         );
   }
}
