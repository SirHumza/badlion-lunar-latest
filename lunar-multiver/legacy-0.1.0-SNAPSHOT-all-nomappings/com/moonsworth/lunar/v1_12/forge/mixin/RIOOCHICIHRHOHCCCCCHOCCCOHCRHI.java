package com.moonsworth.lunar.v1_12.forge.mixin;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.command.ICommandSender;
import net.minecraftforge.client.ClientCommandHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(GuiScreen.class)
public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Redirect(
      method = "sendChatMessage(Ljava/lang/String;Z)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraftforge/client/ClientCommandHandler;executeCommand(Lnet/minecraft/command/ICommandSender;Ljava/lang/String;)I"
      )
   )
   private int fixInvalidCommands(ClientCommandHandler var1, ICommandSender var2, String var3) {
      return var3.startsWith("/") ? var1.executeCommand(var2, var3) : 0;
   }
}
