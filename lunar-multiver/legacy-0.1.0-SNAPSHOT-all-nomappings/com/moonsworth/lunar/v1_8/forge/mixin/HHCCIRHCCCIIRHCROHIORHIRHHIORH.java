package com.moonsworth.lunar.v1_8.forge.mixin;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraftforge.client.ClientCommandHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ClientCommandHandler.class)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Redirect(
      method = "executeCommand",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/command/ICommand;processCommand(Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V")
   )
   private void impl$processCommand(ICommand var1, ICommandSender var2, String[] var3) {
      if (((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1)
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2
         )) {
         var1.processCommand(var2, var3);
      }
   }
}
