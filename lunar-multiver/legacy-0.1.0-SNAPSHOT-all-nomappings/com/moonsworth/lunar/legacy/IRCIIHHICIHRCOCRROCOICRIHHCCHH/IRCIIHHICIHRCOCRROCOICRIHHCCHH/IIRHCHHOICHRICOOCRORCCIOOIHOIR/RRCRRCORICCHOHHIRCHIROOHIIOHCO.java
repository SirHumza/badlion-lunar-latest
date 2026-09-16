package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import javax.annotation.Nullable;
import net.minecraft.client.model.ModelSkeletonHead;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer_v1_8;
import net.minecraft.tileentity.TileEntitySkull;
import net.minecraft.util.EnumFacing;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(TileEntitySkullRenderer_v1_8.class)
public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "renderTileEntityAt$v1_8(Lnet/minecraft/tileentity/TileEntitySkull;DDDFI)V", at = @At("HEAD"))
   private void lunar$prepareSkullBlockRendering(TileEntitySkull var1, double var2, double var4, double var6, float var8, int var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1, var1.getPlayerProfile$v1_8()
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "render$v1_12(Lnet/minecraft/tileentity/TileEntitySkull;DDDFIF)V", at = @At("HEAD"))
   private void lunar$prepareSkullBlockRendering(
      TileEntitySkull var1, double var2, double var4, double var6, float var8, int var9, float var10, CallbackInfo var11
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1, var1.getPlayerProfile$v1_8()
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(
      method = "renderSkull$v1_8",
      at = @At(value = "INVOKE", target = "net/minecraft/client/model/ModelBase.render(Lnet/minecraft/entity/Entity;FFFFFF)V")
   )
   private void lunar$setupSkull(
      float var1, float var2, float var3, EnumFacing var4, float var5, int var6, @Nullable GameProfile var7, int var8, CallbackInfo var9
   ) {
      ModelSkeletonHead var10 = ((TileEntitySkullRenderer_v1_8)this).humanoidHead;
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var7,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var10.skeletonHead,
         (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var10
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "renderSkull$v1_12",
      at = @At(value = "INVOKE", target = "net/minecraft/client/model/ModelBase.render(Lnet/minecraft/entity/Entity;FFFFFF)V")
   )
   private void lunar$setupSkull(
      float var1, float var2, float var3, EnumFacing var4, float var5, int var6, @Nullable GameProfile var7, int var8, float var9, CallbackInfo var10
   ) {
      ModelSkeletonHead var11 = ((TileEntitySkullRenderer_v1_8)this).humanoidHead;
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var7,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var11.skeletonHead,
         (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var11
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(
      method = "renderSkull$v1_8",
      at = @At(value = "INVOKE", target = "net/minecraft/client/model/ModelBase.render(Lnet/minecraft/entity/Entity;FFFFFF)V", shift = Shift.AFTER)
   )
   private void lunar$renderSkull(
      float var1, float var2, float var3, EnumFacing var4, float var5, int var6, @Nullable GameProfile var7, int var8, CallbackInfo var9
   ) {
      GlStateManager.enableBlend();
      GlStateManager.blendFunc(770, 771);
      ModelSkeletonHead var10 = ((TileEntitySkullRenderer_v1_8)this).humanoidHead;
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var7,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var10.skeletonHead,
         (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var10
      );
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(), var7, var5, 0.0F, (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var10
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "renderSkull$v1_12",
      at = @At(value = "INVOKE", target = "net/minecraft/client/model/ModelBase.render(Lnet/minecraft/entity/Entity;FFFFFF)V", shift = Shift.AFTER)
   )
   private void lunar$renderSkull(
      float var1, float var2, float var3, EnumFacing var4, float var5, int var6, @Nullable GameProfile var7, int var8, float var9, CallbackInfo var10
   ) {
      ModelSkeletonHead var11 = ((TileEntitySkullRenderer_v1_8)this).humanoidHead;
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var7,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var11.skeletonHead,
         (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var11
      );
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(), var7, var5, 0.0F, (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var11
      );
   }
}
