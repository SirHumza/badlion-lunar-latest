package com.moonsworth.lunar.client.RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RenderBlocks.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Inject(method = "renderBlockByRenderType", at = @At("HEAD"), cancellable = true)
   public void impl$renderBlockByRenderType(Block var1, int var2, int var3, int var4, CallbackInfoReturnable<Boolean> var5) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
            .RCIICCOHIRICHCOCIIRCHOCOCRRRCR()
            .CIHCOICOIROIIOHIRHIRHRCHCHOCOR()
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HRCRHCHRCCRIOHCCCOCRCICORHRRCI().RCIICCOHIRICHCOCIIRCHOCOCRRRCR().isEnabled()
         && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
            .RCIICCOHIRICHCOCIIRCHOCOCRRRCR()
            .RORHHHOCOICROOIRHORIIICOCICCII()
            .contains((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1)) {
         var5.setReturnValue(false);
      }
   }

   @ModifyConstant(method = "renderBlockFire", constant = @Constant(floatValue = 1.4F))
   private float lunar$lowerFireHeight(float var1) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      if (var2.IOCRIHORCRHHHRCCRCCHROOOCCIRIR()) {
         var1 *= var2.ICRHHCRHIICCCRCRRRCHOOCOCOIIHO().get();
      }

      return var1;
   }
}
