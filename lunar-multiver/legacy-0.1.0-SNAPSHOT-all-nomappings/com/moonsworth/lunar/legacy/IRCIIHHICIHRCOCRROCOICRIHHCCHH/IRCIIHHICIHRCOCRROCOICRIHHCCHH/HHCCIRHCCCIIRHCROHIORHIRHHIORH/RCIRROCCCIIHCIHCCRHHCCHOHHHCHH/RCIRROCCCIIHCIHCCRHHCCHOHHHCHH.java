package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.audio.PositionedSound;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PositionedSound.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public float volume;
   @Shadow
   public float pitch;

   @Shadow
   public abstract ResourceLocation getSoundLocation();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "getVolume", at = @At("HEAD"), cancellable = true)
   private void lunar$fixNullSound$volume(CallbackInfoReturnable<Float> var1) {
      var1.setReturnValue(this.volume);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "getPitch", at = @At("HEAD"), cancellable = true)
   private void lunar$fixNullSound$pitch(CallbackInfoReturnable<Float> var1) {
      var1.setReturnValue(this.pitch);
   }

   @ModifyReturnValue(method = "getVolume", at = @At("RETURN"))
   private float lunar$modifyVolume(float var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI();
      if (var2 != null) {
         var1 *= var2.ICIIOROHCICHHICCOIOIIOHOROCHRC().IIIIRIHIRIOHCCOOROIICCCCHOIOOO();
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RCORCHORIOHORCOOHOHRCICORHCOCO().isEnabled()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOROCROIRCHIHIHHOOIRIIIRRCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOROCROIRCHIHIHHOOIRIIIRRCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RCORCHORIOHORCOOHOHRCICORHCOCO()
            .IROOCHICCRORIHCRORROROOIHCORHR()
            .get(this.getSoundLocation());
         if (var3 != null) {
            return var1 * (var3.getVolume() * 0.01F);
         }
      }

      return var1;
   }
}
