package com.moonsworth.lunar.legacy.optifine.mixin.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import net.optifine.reflect.FieldLocatorTypes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FieldLocatorTypes.class)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/optifine/Config;warn(Ljava/lang/String;)V"))
   private void lunar$optifine$silentReflectorLog_v1_7(String var1) {
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/optifine/Log;log(Ljava/lang/String;)V"))
   private void lunar$optifine$silentReflectorLog(String var1) {
   }
}
