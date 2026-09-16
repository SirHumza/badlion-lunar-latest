package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.tileentity.TileEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TileEntityRendererDispatcher.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = {"render$v1_12(Lnet/minecraft/tileentity/TileEntity;FI)V", "renderTileEntity$v1_8"}, at = @At("HEAD"), cancellable = true)
   public void lunar$renderTileEntity$v1_8(TileEntity var1, float var2, int var3, CallbackInfo var4) {
      this.lunar$renderTileEntity(var1, var4);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "renderTileEntity$v1_7", at = @At("HEAD"), cancellable = true)
   public void lunar$renderTileEntity$v1_7(TileEntity var1, float var2, CallbackInfo var3) {
      this.lunar$renderTileEntity(var1, var3);
   }

   @Unique
   private void lunar$renderTileEntity(TileEntity var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var3.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var4 = var3.HOROHROIORRIRIIIOOCCIROCRCROHI().IROIIOOCICHRIHCIOHCRCCCRICHIHC();
         if ((Boolean)var4.CCRIOOOOCRRCHOICOHOCOIRICIIIRC().get() && !(Boolean)var4.IHCOIOHICOIIRRORIRHRHOOOIIHIIO().get()) {
            var2.cancel();
         }

         if ((Boolean)var4.IRCOOICRICCRCCROHRROIRHHIHHCCO().get() && (Boolean)var4.OOHIIRRIOHRIICIOHIIRRHHHHCRRIH().get()) {
            var2.cancel();
         }
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOCIIROIRCOHIRHHHROHCOOHIICIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
         .RCIICCOHIRICHCOCIIRCHOCOCRRRCR();
      if (var6.isEnabled() && var6.CIHCOICOIROIIOHIRHIRHRCHCHOCOR() && !var6.RORHHHOCOICROOIRHORIIICOCICCII().contains(var1.getBlockType())) {
         var2.cancel();
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1;
      if (!com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var5.bridge$getBlockType())) {
         var2.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyExpressionValue(
      method = "renderTileEntity$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getLightBrightnessForSkyBlocks$v1_7(IIII)I")
   )
   private int lunar$xrayTileEntityBrightness$v1_7(int var1) {
      return this.apollo$isXrayActive() ? 15728880 : var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyExpressionValue(
      method = {"render$v1_12(Lnet/minecraft/tileentity/TileEntity;FI)V", "renderTileEntity$v1_8"},
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getCombinedLight$v1_8(Lnet/minecraft/util/math/BlockPos;I)I")
   )
   private int lunar$xrayTileEntityBrightness$v1_8(int var1) {
      return this.apollo$isXrayActive() ? 15728880 : var1;
   }

   @Unique
   private boolean apollo$isXrayActive() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOCIIROIRCOHIRHHHROHCOOHIICIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
         .RCIICCOHIRICHCOCIIRCHOCOCRRRCR();
      return var1.isEnabled() && var1.CIHCOICOIROIIOHIRHIRHRCHCHOCOR();
   }
}
