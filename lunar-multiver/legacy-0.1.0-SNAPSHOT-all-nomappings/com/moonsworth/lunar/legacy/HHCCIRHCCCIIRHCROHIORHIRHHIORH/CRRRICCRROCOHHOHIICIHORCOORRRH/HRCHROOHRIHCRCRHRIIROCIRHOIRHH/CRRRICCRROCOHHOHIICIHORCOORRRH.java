package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import net.minecraft.client.multiplayer.ServerData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets = "net.minecraft.client.network.ServerPinger$1")
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Redirect(
      method = "handlePong(Lnet/minecraft/network/status/server/SPacketPong;)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/multiplayer/ServerData;pingToServer:J", opcode = 181)
   )
   private void lunar$ping(ServerData var1, long var2) {
      var1.pingToServer = var2;
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1;
      if (var4.bridge$getPingCallback() != null) {
         var4.bridge$getPingCallback().accept(var2);
      }
   }
}
