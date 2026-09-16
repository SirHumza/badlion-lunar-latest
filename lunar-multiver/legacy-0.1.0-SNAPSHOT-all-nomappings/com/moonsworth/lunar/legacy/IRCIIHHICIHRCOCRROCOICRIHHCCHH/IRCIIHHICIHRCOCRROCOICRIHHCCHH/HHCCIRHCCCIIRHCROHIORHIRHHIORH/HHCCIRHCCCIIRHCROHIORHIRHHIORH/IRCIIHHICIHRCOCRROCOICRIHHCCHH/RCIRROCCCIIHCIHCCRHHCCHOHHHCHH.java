package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import net.minecraft.client.gui.toasts.TutorialToast;
import net.minecraft.client.gui.toasts.IToast.Visibility;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
@Mixin(TutorialToast.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Inject(method = "draw", at = @At("HEAD"), cancellable = true)
   private void lunar$doNotRenderTutorialInRewind(CallbackInfoReturnable<Visibility> var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         var1.setReturnValue(Visibility.HIDE);
      }
   }
}
