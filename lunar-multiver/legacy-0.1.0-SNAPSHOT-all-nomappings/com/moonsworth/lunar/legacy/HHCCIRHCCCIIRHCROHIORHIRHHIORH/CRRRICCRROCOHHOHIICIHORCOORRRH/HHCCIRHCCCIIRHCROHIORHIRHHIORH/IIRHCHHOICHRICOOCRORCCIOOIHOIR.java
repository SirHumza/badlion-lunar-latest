package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiGameOver;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(GuiGameOver.class)
public abstract class IIRHCHHOICHRICOOCRORCCIOOIHOIR
   extends GuiScreen
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   @Inject(
      method = "actionPerformed",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;displayGuiScreen(Lnet/minecraft/client/gui/GuiScreen;)V", ordinal = 1)
   )
   private void lunar$quitEarlier(GuiButton var1, CallbackInfo var2) {
      this.mc.displayGuiScreen(new GuiMainMenu());
      if (this.mc.world != null) {
         this.mc.world.sendQuittingDisconnectingPacket();
      }

      this.mc.loadWorld(null);
   }

   @Inject(
      method = "confirmClicked",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;sendQuittingDisconnectingPacket()V"),
      cancellable = true
   )
   private void lunar$stopQuit(CallbackInfo var1) {
      var1.cancel();
   }
}
