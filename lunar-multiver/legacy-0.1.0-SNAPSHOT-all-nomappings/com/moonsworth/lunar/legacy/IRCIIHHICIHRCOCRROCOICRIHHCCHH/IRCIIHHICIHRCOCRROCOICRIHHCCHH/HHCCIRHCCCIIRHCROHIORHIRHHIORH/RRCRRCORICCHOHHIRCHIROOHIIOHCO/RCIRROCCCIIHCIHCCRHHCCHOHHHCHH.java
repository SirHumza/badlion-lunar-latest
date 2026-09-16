package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.multiplayer.GuiConnecting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiConnecting.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Inject(method = "connect", at = @At("HEAD"))
   private void lunar$disconnectCurrentWorldOnJoin(String var1, int var2, CallbackInfo var3) {
      Minecraft var4 = Minecraft.getMinecraft();
      if (var4.world != null) {
         var4.world.sendQuittingDisconnectingPacket();
      }
   }

   @Inject(method = "actionPerformed", at = @At("HEAD"), cancellable = true)
   private void lunar$blockDisconnectButton(GuiButton var1, CallbackInfo var2) {
      if (var1.id == 0
         && com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCIOCOCCCOOIRIOCOCHOOCIIHCICCC
         )
       {
         var2.cancel();
      }
   }
}
