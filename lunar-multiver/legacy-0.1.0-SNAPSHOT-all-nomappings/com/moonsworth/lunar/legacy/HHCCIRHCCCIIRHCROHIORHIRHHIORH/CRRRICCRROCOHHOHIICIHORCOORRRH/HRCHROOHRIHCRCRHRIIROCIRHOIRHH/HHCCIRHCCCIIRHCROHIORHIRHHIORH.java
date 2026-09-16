package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Optional;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.network.ServerPinger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ServerPinger.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Shadow
   public abstract void ping(ServerData var1);

   @Shadow
   public abstract void pingPendingNetworks();

   public void bridge$ping(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      this.ping((ServerData)var1);
   }

   @Redirect(
      method = "ping(Lnet/minecraft/client/multiplayer/ServerData;)V",
      at = @At(value = "INVOKE", target = "Ljava/net/InetAddress;getByName(Ljava/lang/String;)Ljava/net/InetAddress;")
   )
   private InetAddress lunar$ping(String var1) {
      Optional var2 = com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORIRHOIOHCCHOHRIRIHCHIICOIIOOR
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCROOOORIRIHOORHRHCIHICIIRROO(var1)
         )
         .map(com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH::OROORHRRCHCOHRCORCCRHHCIORORCI);
      return var2.isEmpty() ? null : ((InetSocketAddress)var2.get()).getAddress();
   }

   public void bridge$tick() {
      this.pingPendingNetworks();
   }
}
