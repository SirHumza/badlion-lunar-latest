package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.ALCdevice;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ALC10.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Redirect(method = "alcGetString", at = @At(value = "INVOKE", target = "Lorg/lwjgl/openal/Util;checkALCError(Lorg/lwjgl/openal/ALCdevice;)V"))
   private static void lunar$fixStackOverflow(ALCdevice var0) {
   }
}
