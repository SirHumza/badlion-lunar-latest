package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.gui.toasts.IToast;
import net.minecraft.client.gui.toasts.TutorialToast;
import net.minecraft.client.gui.toasts.GuiToast.ToastInstance;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
@Mixin(ToastInstance.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T extends IToast> {
   @Final
   @Shadow
   public T toast;

   @Inject(method = "render", at = @At("HEAD"), cancellable = true)
   private void lunar$onRenderToast(CallbackInfoReturnable<Boolean> var1) {
      if (this.toast instanceof TutorialToast
         && !(Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .ORHCRHHHCHOCOICHHIIIORICRHOROR()
            .get()) {
         var1.setReturnValue(true);
      }
   }
}
