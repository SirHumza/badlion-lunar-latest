package com.moonsworth.lunar.legacy.optifine.mixin;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Optional;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding_v1_7;
import net.minecraft.client.settings.KeyBinding_v1_8;
import net.minecraft.client.settings.GameSettings.Options;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameSettings.class)
public abstract class HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public KeyBinding_v1_7 ofKeyBindZoom$v1_7;
   @Shadow
   public KeyBinding_v1_8 ofKeyBindZoom$v1_8;
   @Shadow
   public boolean ofRenderRegions$v1_8;

   @Shadow
   public abstract void updateVSync();

   public void bridge$updateVSync() {
      this.updateVSync();
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> bridge$getZoomKey() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? Optional.of(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.ofKeyBindZoom$v1_8
         )
         : Optional.of(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.ofKeyBindZoom$v1_7
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "isKeyDown$v1_8", at = @At("HEAD"), cancellable = true)
   private static void lunar$isKeyDown$v1_8(KeyBinding_v1_8 var0, CallbackInfoReturnable<Boolean> var1) {
      if (var0 == IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$getZoomKey().orElse(null)
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().HOCHHHRHHIOOIHCRCRHRROIHCCRRHR().isEnabled()) {
         var1.setReturnValue(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "isKeyDown$v1_7", at = @At("HEAD"), cancellable = true)
   private static void lunar$isKeyDown$v1_7(KeyBinding_v1_7 var0, CallbackInfoReturnable<Boolean> var1) {
      if (var0 == IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$getZoomKey().orElse(null)
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().HOCHHHRHHIOOIHCRCRHRROIHCCRRHR().isEnabled()) {
         var1.setReturnValue(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "setOptionValue", at = @At("HEAD"))
   private void lunar$setOptionValue$head(Options var1, int var2, CallbackInfo var3) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
         .ifPresent(var0 -> var0.setReloading(true));
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "setOptionValueOF$v1_8", at = @At("HEAD"))
   private void lunar$setOptionValueOF$head(Options var1, int var2, CallbackInfo var3) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
         .ifPresent(var0 -> var0.setReloading(true));
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "setOptionValue", at = @At("RETURN"))
   private void lunar$setOptionValue$tail(Options var1, int var2, CallbackInfo var3) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
         .ifPresent(var0 -> var0.setReloading(false));
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "setOptionValueOF$v1_8", at = @At("RETURN"))
   private void lunar$setOptionValueOF$tail(Options var1, int var2, CallbackInfo var3) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
         .ifPresent(var0 -> var0.setReloading(false));
   }

   @Inject(method = "updateWaterOpacity", at = @At("HEAD"), cancellable = true)
   private void lunar$rewindSkipUpdateWaterOpacity(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         var1.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "setOptionValueOF$v1_8", at = @At("TAIL"))
   private void lunar$onOptionsChange(Options var1, int var2, CallbackInfo var3) {
      if (var1 == Options.RENDER_REGIONS$v1_8) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
            .RIRORCOIICORICHCICRRRCCRCHRCIC()
            .RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(this.ofRenderRegions$v1_8);
      }
   }
}
