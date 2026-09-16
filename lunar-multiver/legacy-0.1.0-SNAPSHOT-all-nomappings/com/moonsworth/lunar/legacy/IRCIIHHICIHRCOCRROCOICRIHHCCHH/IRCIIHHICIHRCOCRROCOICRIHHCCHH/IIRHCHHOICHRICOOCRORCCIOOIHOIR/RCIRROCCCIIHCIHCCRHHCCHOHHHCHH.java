package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import com.lunarclient.apollo.module.limb.ArmorPiece;
import com.lunarclient.apollo.module.limb.LimbModule;
import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Collection;
import java.util.Optional;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(LayerCustomHead.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Inject(method = "doRenderLayer", at = @At("HEAD"), cancellable = true)
   private void lunar$doRenderLayer$HEAD(
      EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, CallbackInfo var9
   ) {
      Optional var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(LimbModule.class);
      if (var10.isPresent()) {
         Collection var11 = (Collection)((IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var10.get()).ICOHIOIHHOIOHIOIICHICIRHOORCOI().get(var1.getUniqueID());
         if (var11 != null && var11.contains(ArmorPiece.HELMET)) {
            var9.cancel();
            return;
         }
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH((CORCOCICIRIOHROHROIIOOHICCHCRR)var1)) {
         var9.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(
      method = "doRenderLayer",
      locals = LocalCapture.CAPTURE_FAILHARD,
      at = @At(
         value = "INVOKE",
         target = "net/minecraft/client/renderer/tileentity/TileEntitySkullRenderer.renderSkull(FFFLnet/minecraft/util/EnumFacing;FILcom/mojang/authlib/GameProfile;I)V"
      )
   )
   private void lunar$doRenderLayer$v1_8(
      EntityLivingBase var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      CallbackInfo var9,
      ItemStack var10,
      Item var11,
      Minecraft var12,
      boolean var13,
      float var14,
      GameProfile var15
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         (CORCOCICIRIOHROHROIIOOHICCHCRR)var1, var15
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "doRenderLayer",
      locals = LocalCapture.CAPTURE_FAILHARD,
      at = @At(
         value = "INVOKE",
         target = "net/minecraft/client/renderer/tileentity/TileEntitySkullRenderer.renderSkull(FFFLnet/minecraft/util/EnumFacing;FILcom/mojang/authlib/GameProfile;IF)V"
      )
   )
   private void lunar$doRenderLayer$v1_12(
      EntityLivingBase var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      CallbackInfo var9,
      ItemStack var10,
      Item var11,
      Minecraft var12,
      boolean var13,
      float var14,
      GameProfile var15
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         (CORCOCICIRIOHROHROIIOOHICCHCRR)var1, var15
      );
   }
}
