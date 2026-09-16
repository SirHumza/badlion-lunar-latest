package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.network.NetworkManager_v1_12;
import net.minecraft.network.NetworkManager_v1_7;
import net.minecraft.network.NetworkManager_v1_8;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "net.minecraft.client.multiplayer.GuiConnecting$1")
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Redirect(method = "run()V", at = @At(value = "INVOKE", target = "Ljava/net/InetAddress;getByName(Ljava/lang/String;)Ljava/net/InetAddress;"))
   private InetAddress lunar$getIpString(String var1, @Share("ip") LocalRef<String> var2) {
      try {
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCIOCOCCCOOIRIOCOCHOOCIIHCICCC = true;
         var2.set(var1);
         return RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORIRHOIOHCCHOHRIRIHCHIICOIIOOR
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCROOOORIRIHOORHRHCIHICIIRROO(var1)
            )
            .<InetSocketAddress>map(com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH::OROORHRRCHCOHRCORCCRHHCIORORCI)
            .map(InetSocketAddress::getAddress)
            .orElse(null);
      } catch (Throwable var4) {
         throw var4;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "run()V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/NetworkManager_v1_7;provideLanClient(Ljava/net/InetAddress;I)Lnet/minecraft/network/NetworkManager_v1_7;"
      )
   )
   private NetworkManager_v1_7 lunar$connectEvent$v1_7(InetAddress var1, int var2, @Share("ip") LocalRef<String> var3) {
      NetworkManager_v1_7 var4 = NetworkManager_v1_7.provideLanClient(var1, var2);
      String var5 = (String)var3.get();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
                  () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var5, var2
                  )
               )
         );
      return var4;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1, max = 1)
   @Redirect(
      method = "run()V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/NetworkManager_v1_8;createNetworkManagerAndConnect(Ljava/net/InetAddress;IZ)Lnet/minecraft/network/NetworkManager_v1_8;"
      )
   )
   private NetworkManager_v1_8 lunar$connectEvent$v1_8(InetAddress var1, int var2, boolean var3, @Share("ip") LocalRef<String> var4) {
      NetworkManager_v1_8 var5 = NetworkManager_v1_8.createNetworkManagerAndConnect(var1, var2, false);
      String var6 = (String)var4.get();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
                  () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var6, var2
                  )
               )
         );
      return var5;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Redirect(
      method = "run()V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/network/NetworkManager_v1_12;createNetworkManagerAndConnect(Ljava/net/InetAddress;IZ)Lnet/minecraft/network/NetworkManager_v1_12;"
      )
   )
   private NetworkManager_v1_12 lunar$connectEvent$v1_12(InetAddress var1, int var2, boolean var3, @Share("ip") LocalRef<String> var4) {
      NetworkManager_v1_12 var5 = NetworkManager_v1_12.createNetworkManagerAndConnect(var1, var2, var3);
      String var6 = (String)var4.get();
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
                  () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var6, var2
                  )
               )
         );
      return var5;
   }

   @Inject(method = "run()V", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/NetworkManager;setNetHandler(Lnet/minecraft/network/INetHandler;)V"))
   private void lunar$unlockJoin(CallbackInfo var1) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCIOCOCCCOOIRIOCOCHOOCIIHCICCC = false;
   }

   @WrapOperation(
      method = "run()V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V")
   )
   private void lunar$openGuiOnRenderThread(Minecraft var1, GuiScreen var2, Operation<Void> var3) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(() -> var3.call(new Object[]{var1, var2}));
   }
}
