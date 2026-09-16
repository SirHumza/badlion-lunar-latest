package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import net.minecraft.client.resources.I18n;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(I18n.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Inject(method = "format", at = @At("HEAD"), cancellable = true)
   private static void impl$onFormat(String var0, Object[] var1, CallbackInfoReturnable<String> var2) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR();
      if (var3 != null && var3.CCHHHHCICRCCCIOOIOICOOCRCRHCCR() != null) {
         String var4 = var3.CCHHHHCICRCCCIOOIOICOOCRCRHCCR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, false);
         if (var4 != null) {
            var2.setReturnValue(String.format(var4));
         }
      }
   }

   public String getLanguagePath() {
      return null;
   }
}
