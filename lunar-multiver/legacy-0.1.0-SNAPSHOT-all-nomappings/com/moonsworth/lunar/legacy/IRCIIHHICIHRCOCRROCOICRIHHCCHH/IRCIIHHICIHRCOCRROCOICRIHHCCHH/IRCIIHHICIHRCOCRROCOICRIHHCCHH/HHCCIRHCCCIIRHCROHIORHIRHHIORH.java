package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.block.BlockBarrier;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(BlockRendererDispatcher.class)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "getModelFromBlockState$v1_8", at = @At("RETURN"), cancellable = true)
   private void lunar$onGetModelFromBlockState(IBlockState var1, IBlockAccess var2, BlockPos var3, CallbackInfoReturnable<IBakedModel> var4) {
      if (var1.getBlock() instanceof BlockBarrier
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
            .CHCRHIRHRHCHCOHCIIHCHIRICHRORI()) {
         IBakedModel var5 = (IBakedModel)RRCRRCORICCHOHHIRCHIROOHIIOHCO.CHCROHCHROOCIHRCHOHOHIHIHHRHIO;
         if (var5 != null) {
            var4.setReturnValue(var5);
         }
      } else {
         var4.setReturnValue(
            (IBakedModel)com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.getReturnValue()
            )
         );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(method = "getModelForState$v1_12", at = @At("RETURN"), cancellable = true)
   private void lunar$onGetModelForState(IBlockState var1, CallbackInfoReturnable<IBakedModel> var2) {
      if (var1.getBlock() instanceof BlockBarrier
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
            .CHCRHIRHRHCHCOHCIIHCHIRICHRORI()) {
         IBakedModel var3 = (IBakedModel)RRCRRCORICCHOHHIRCHIROOHIIOHCO.CHCROHCHROOCIHRCHOHOHIHIHHRHIO;
         if (var3 != null) {
            var2.setReturnValue(var3);
         }
      }
   }
}
