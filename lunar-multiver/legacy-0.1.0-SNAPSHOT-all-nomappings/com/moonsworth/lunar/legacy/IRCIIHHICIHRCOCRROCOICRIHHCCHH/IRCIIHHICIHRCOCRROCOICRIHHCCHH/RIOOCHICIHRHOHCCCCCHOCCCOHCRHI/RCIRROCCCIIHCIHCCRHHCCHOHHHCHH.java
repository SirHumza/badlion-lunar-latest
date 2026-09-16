package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.stream.JsonReader;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(JsonReader.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   private char[] buffer;
   @Shadow
   private int pos;

   @Inject(
      method = "readEscapeCharacter",
      at = @At(
         ordinal = 5,
         value = "INVOKE",
         target = "Lcom/google/gson/stream/JsonReader;syntaxError(Ljava/lang/String;)Lcom/google/gson/stream/MalformedJsonException;"
      ),
      cancellable = true,
      require = 0
   )
   private void allowInvalidEscapeCharacters(CallbackInfoReturnable<Character> var1) {
      var1.setReturnValue(this.buffer[this.pos - 1]);
   }
}
