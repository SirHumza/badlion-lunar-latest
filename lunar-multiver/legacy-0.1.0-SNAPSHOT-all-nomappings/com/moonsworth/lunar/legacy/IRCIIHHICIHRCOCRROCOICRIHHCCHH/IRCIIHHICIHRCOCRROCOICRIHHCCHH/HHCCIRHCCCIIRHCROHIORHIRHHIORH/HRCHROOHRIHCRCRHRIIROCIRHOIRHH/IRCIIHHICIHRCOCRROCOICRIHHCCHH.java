package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.block.BlockFire;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.BlockModelRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(BlockModelRenderer.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Unique
   private static final int lunar$VERTEX_STRIDE = 7;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "renderModel$v1_8", at = @At("HEAD"), cancellable = true)
   public void lunar$staffModXray_v1_8(
      IBlockAccess var1, IBakedModel var2, IBlockState var3, BlockPos var4, BufferBuilder var5, CallbackInfoReturnable<Boolean> var6
   ) {
      this.lunar$staffModXray(var3, var6);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "renderModel$v1_12", at = @At("HEAD"), cancellable = true)
   public void lunar$staffModXray_v1_12(
      IBlockAccess var1, IBakedModel var2, IBlockState var3, BlockPos var4, BufferBuilder var5, boolean var6, long var7, CallbackInfoReturnable<Boolean> var9
   ) {
      this.lunar$staffModXray(var3, var9);
   }

   public void lunar$staffModXray(IBlockState var1, CallbackInfoReturnable<Boolean> var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
            .RCIICCOHIRICHCOCIIRCHOCOCRRRCR()
            .CIHCOICOIROIIOHIRHIRHRCHCHOCOR()
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HRCRHCHRCCRIOHCCCOCRCICORHRRCI().RCIICCOHIRICHCOCIIRCHOCOCRRRCR().isEnabled()
         && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
            .RCIICCOHIRICHCOCIIRCHOCOCRRRCR()
            .RORHHHOCOICROOIRHORIIICOCICCII()
            .contains((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.getBlock())) {
         var2.setReturnValue(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "renderModel$v1_8", at = @At("HEAD"))
   private void lunar$lowerFireHeight_v1_8(
      CallbackInfoReturnable<Boolean> var1, @Local(argsOnly = true) IBakedModel var2, @Local(argsOnly = true) IBlockState var3
   ) {
      if (var3.getBlock() instanceof BlockFire) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR();

         for (int var5 = 0; var5 < EnumFacing.VALUES.length; var5++) {
            lunar$applyFireHeight(var2.getFaceQuads$v1_8(EnumFacing.VALUES[var5]), var4);
         }

         lunar$applyFireHeight(var2.getGeneralQuads$v1_8(), var4);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "renderModel$v1_12", at = @At("HEAD"))
   private void lunar$lowerFireHeight_v1_12(
      CallbackInfoReturnable<Boolean> var1,
      @Local(argsOnly = true) IBakedModel var2,
      @Local(argsOnly = true) IBlockState var3,
      @Local(argsOnly = true) long var4
   ) {
      if (var3.getBlock() instanceof BlockFire) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
         lunar$applyFireHeight(var2.getQuads$v1_12(var3, null, var4), var6);

         for (EnumFacing var10 : EnumFacing.values()) {
            lunar$applyFireHeight(var2.getQuads$v1_12(var3, var10, var4), var6);
         }
      }
   }

   @Unique
   private static void lunar$applyFireHeight(
      List<BakedQuad> var0,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1
   ) {
      if (var0 != null && !var0.isEmpty()) {
         int var2 = var0.size();

         for (int var3 = 0; var3 < var2; var3++) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, ((BakedQuad)var0.get(var3)).getVertexData(), 7
            );
         }
      }
   }
}
