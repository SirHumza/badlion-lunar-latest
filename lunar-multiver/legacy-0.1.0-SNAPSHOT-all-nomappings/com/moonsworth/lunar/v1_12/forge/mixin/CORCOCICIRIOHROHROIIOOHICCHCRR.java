package com.moonsworth.lunar.v1_12.forge.mixin;

import net.minecraft.client.network.NetHandlerLoginClient;
import net.minecraft.network.NetworkManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(NetHandlerLoginClient.class)
public class CORCOCICIRIOHROHROIIOOHICCHCRR {
   @Redirect(
      method = "handleLoginSuccess",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraftforge/fml/common/network/internal/FMLNetworkHandler;fmlClientHandshake(Lnet/minecraft/network/NetworkManager;)V"
      )
   )
   public void impl$fmlClientHandshake(NetworkManager var1) {
   }
}
