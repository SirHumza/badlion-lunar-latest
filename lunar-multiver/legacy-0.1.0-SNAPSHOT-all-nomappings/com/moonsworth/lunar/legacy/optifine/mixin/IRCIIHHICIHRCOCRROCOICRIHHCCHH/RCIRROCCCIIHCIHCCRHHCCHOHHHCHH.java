package com.moonsworth.lunar.legacy.optifine.mixin.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import net.optifine.reflect.FieldLocatorName;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(FieldLocatorName.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "getField", at = @At(value = "INVOKE", target = "Lnet/optifine/Config;log(Ljava/lang/String;)V"))
   private void lunar$optifine$silentReflectorLog_v1_7(String var1) {
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "getField", at = @At(value = "INVOKE", target = "Lnet/optifine/Log;log(Ljava/lang/String;)V"))
   private void lunar$optifine$silentReflectorLog_v1_8(String var1) {
   }
}
