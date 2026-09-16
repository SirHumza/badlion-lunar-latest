package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.client.util.RRHHORICORICIRHICOHHROHIIHICCH;
import net.minecraft.client.resources.FileResourcePack;
import net.minecraft.client.resources.FolderResourcePack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({FolderResourcePack.class, FileResourcePack.class})
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Inject(method = "hasResourceName", at = @At("HEAD"), cancellable = true)
   private void lunar$hasResourceName(String var1, CallbackInfoReturnable<Boolean> var2) {
      if (!RRHHORICORICIRHICOHHROHIIHICCH.ICRIOCOOICRIIIRIHIRIOIHCOHHIIC(var1)) {
         var2.setReturnValue(false);
      }
   }
}
