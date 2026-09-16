package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import java.util.Collections;
import net.minecraft.server.management.PlayerProfileCache;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PlayerProfileCache.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @ModifyExpressionValue(
      method = "load()V",
      at = @At(value = "INVOKE", target = "Lcom/google/gson/Gson;fromJson(Ljava/io/Reader;Ljava/lang/reflect/Type;)Ljava/lang/Object;")
   )
   private Object lunar$fromJson(Object var1) {
      return var1 != null ? var1 : Collections.emptyList();
   }
}
