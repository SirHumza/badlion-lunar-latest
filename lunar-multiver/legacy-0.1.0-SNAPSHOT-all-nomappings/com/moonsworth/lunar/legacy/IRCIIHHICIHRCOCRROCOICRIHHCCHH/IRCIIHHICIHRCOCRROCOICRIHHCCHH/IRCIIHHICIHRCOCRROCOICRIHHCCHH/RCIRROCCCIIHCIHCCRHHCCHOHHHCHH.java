package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Block.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Inject(method = {"shouldSideBeRendered$v1_7", "shouldSideBeRendered$v1_8", "shouldSideBeRendered$v1_12"}, at = @At("HEAD"), cancellable = true)
   private void lunar$xrayDontRenderBlockSides(CallbackInfoReturnable<Boolean> var1) {
      if (this.apollo$isXrayActive()) {
         var1.setReturnValue(
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
               .RCIICCOHIRICHCOCIIRCHOCOCRRRCR()
               .RORHHHOCOICROOIRHORIIICOCICCII()
               .contains((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this)
         );
      }
   }

   @Inject(method = {"getAmbientOcclusionLightValue$v1_7", "getAmbientOcclusionLightValue$v1_12"}, at = @At("HEAD"), cancellable = true)
   private void lunar$setXrayLightLevel(CallbackInfoReturnable<Float> var1) {
      if (this.apollo$isXrayActive()) {
         var1.setReturnValue(1.0F);
      }
   }

   @Inject(
      method = {"getMixedBrightnessForBlock$v1_7", "getMixedBrightnessForBlock$v1_8", "getPackedLightmapCoords$v1_12"},
      at = @At("HEAD"),
      cancellable = true
   )
   private void lunar$setXrayBrightness(CallbackInfoReturnable<Integer> var1) {
      if (this.apollo$isXrayActive()) {
         var1.setReturnValue(15728880);
      }
   }

   @Unique
   private boolean apollo$isXrayActive() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOCIIROIRCOHIRHHHROHCOOHIICIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
         .RCIICCOHIRICHCOCIIRCHOCOCRRRCR();
      return var1.isEnabled() && var1.CIHCOICOIROIIOHIRHIRHRCHCHOCOR();
   }
}
