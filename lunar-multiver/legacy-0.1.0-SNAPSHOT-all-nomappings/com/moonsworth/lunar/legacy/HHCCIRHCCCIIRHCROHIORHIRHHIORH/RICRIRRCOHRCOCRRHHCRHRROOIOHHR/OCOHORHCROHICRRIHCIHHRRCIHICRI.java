package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import java.util.List;
import net.minecraft.util.TabCompleter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
@Mixin(TabCompleter.class)
public class OCOHORHCROHICRRIHCIHHRRCIHICRI {
   @Shadow
   public List<String> completions$v1_12;
   @Unique
   private String lunar$lastRequestedInput;

   @Inject(method = "requestCompletions$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$requestCompletions(String var1, CallbackInfo var2) {
      this.lunar$lastRequestedInput = var1;
      List var3 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RICCICOHIICIIORHCHCRCRHOOOCHIC(
         var1
      );
      if (!var3.isEmpty()) {
         this.completions$v1_12.addAll(var3);
         var2.cancel();
      }
   }

   @ModifyVariable(method = "setCompletions$v1_12", at = @At("HEAD"), argsOnly = true)
   private String[] lunar$mergeCustomSuggestions(String[] var1) {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1, this.lunar$lastRequestedInput
      );
   }
}
