package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.NetworkManager_v1_12;
import net.minecraft.network.NetworkManager_v1_7;
import net.minecraft.network.NetworkManager_v1_8;
import net.minecraft.network.Packet_v1_7;
import net.minecraft.network.Packet_v1_8;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(NetHandlerPlayServer.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Shadow
   public abstract void sendPacket$v1_8(Packet_v1_8 var1);

   @Shadow
   public abstract void sendPacket$v1_7(Packet_v1_7 var1);

   @Shadow
   public abstract void sendPacket$v1_12(Packet_v1_8<?> var1);

   public void bridge$send(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.sendPacket$v1_12((Packet_v1_8<?>)var1);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.sendPacket$v1_8((Packet_v1_8)var1);
      } else {
         this.sendPacket$v1_7((Packet_v1_7)var1);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @WrapWithCondition(
      method = "<init>(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/network/NetworkManager_v1_7;Lnet/minecraft/entity/player/EntityPlayerMP;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/network/NetworkManager_v1_7;setNetHandler(Lnet/minecraft/network/INetHandler;)V")
   )
   private boolean lunar$hackDummyInstance$setNetHandler$v1_7(
      NetworkManager_v1_7 var1, INetHandler var2, MinecraftServer var3, NetworkManager_v1_7 var4, EntityPlayerMP var5
   ) {
      return var3 != null || var4 != null || var5 != null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @WrapWithCondition(
      method = "<init>(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/network/NetworkManager_v1_7;Lnet/minecraft/entity/player/EntityPlayerMP;)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayerMP;connection:Lnet/minecraft/network/NetHandlerPlayServer;")
   )
   private boolean lunar$hackDummyInstance$connection$v1_7(
      EntityPlayerMP var1, NetHandlerPlayServer var2, MinecraftServer var3, NetworkManager_v1_7 var4, EntityPlayerMP var5
   ) {
      return var3 != null || var4 != null || var5 != null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapWithCondition(
      method = "<init>(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/network/NetworkManager_v1_8;Lnet/minecraft/entity/player/EntityPlayerMP;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/network/NetworkManager_v1_8;setNetHandler(Lnet/minecraft/network/INetHandler;)V")
   )
   private boolean lunar$hackDummyInstance$setNetHandler$v1_8(
      NetworkManager_v1_8 var1, INetHandler var2, MinecraftServer var3, NetworkManager_v1_8 var4, EntityPlayerMP var5
   ) {
      return var3 != null || var4 != null || var5 != null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapWithCondition(
      method = "<init>(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/network/NetworkManager_v1_8;Lnet/minecraft/entity/player/EntityPlayerMP;)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayerMP;connection:Lnet/minecraft/network/NetHandlerPlayServer;")
   )
   private boolean lunar$hackDummyInstance$connection$v1_8(
      EntityPlayerMP var1, NetHandlerPlayServer var2, MinecraftServer var3, NetworkManager_v1_8 var4, EntityPlayerMP var5
   ) {
      return var3 != null || var4 != null || var5 != null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @WrapWithCondition(
      method = "<init>(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/network/NetworkManager_v1_12;Lnet/minecraft/entity/player/EntityPlayerMP;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/network/NetworkManager_v1_12;setNetHandler(Lnet/minecraft/network/INetHandler;)V")
   )
   private boolean lunar$hackDummyInstance$setNetHandler$v1_12(
      NetworkManager_v1_12 var1, INetHandler var2, MinecraftServer var3, NetworkManager_v1_12 var4, EntityPlayerMP var5
   ) {
      return var3 != null || var4 != null || var5 != null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @WrapWithCondition(
      method = "<init>(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/network/NetworkManager_v1_12;Lnet/minecraft/entity/player/EntityPlayerMP;)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayerMP;connection:Lnet/minecraft/network/NetHandlerPlayServer;")
   )
   private boolean lunar$hackDummyInstance$connection$v1_12(
      EntityPlayerMP var1, NetHandlerPlayServer var2, MinecraftServer var3, NetworkManager_v1_12 var4, EntityPlayerMP var5
   ) {
      return var3 != null || var4 != null || var5 != null;
   }
}
