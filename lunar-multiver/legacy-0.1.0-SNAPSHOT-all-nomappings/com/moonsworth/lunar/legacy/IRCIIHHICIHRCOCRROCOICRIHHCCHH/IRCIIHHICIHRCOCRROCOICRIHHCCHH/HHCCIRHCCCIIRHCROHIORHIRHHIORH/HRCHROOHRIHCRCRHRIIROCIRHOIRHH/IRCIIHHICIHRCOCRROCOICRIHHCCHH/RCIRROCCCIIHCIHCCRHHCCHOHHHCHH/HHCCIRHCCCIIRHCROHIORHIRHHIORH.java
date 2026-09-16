package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.apollo.module.limb.BodyPart;
import com.lunarclient.apollo.module.limb.LimbModule;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Set;
import java.util.UUID;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(LayerHeldItem.class)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(
      method = "doRenderLayer(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V"),
      cancellable = true
   )
   private void apollo$hideHeldItem$v1_8(
      EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, CallbackInfo var9
   ) {
      if (var1 instanceof AbstractClientPlayer) {
         if (this.apollo$shouldHideItem(var1.getUniqueID(), BodyPart.RIGHT_ARM)) {
            var9.cancel();
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "renderHeldItem$v1_12",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V"),
      cancellable = true
   )
   private void apollo$hideHeldItem$v1_12(EntityLivingBase var1, ItemStack var2, TransformType var3, EnumHandSide var4, CallbackInfo var5) {
      if (var1 instanceof AbstractClientPlayer) {
         BodyPart var6 = var4 == EnumHandSide.RIGHT ? BodyPart.RIGHT_ARM : BodyPart.LEFT_ARM;
         if (this.apollo$shouldHideItem(var1.getUniqueID(), var6)) {
            var5.cancel();
         }
      }
   }

   @Unique
   private boolean apollo$shouldHideItem(UUID var1, BodyPart var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(LimbModule.class)
         .map(var1x -> (Set)((IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var1x).HHHRCHICIIHIRIOROHHCIOCCCRRORR().get(var1))
         .filter(var1x -> var1x != null && var1x.contains(var2))
         .isPresent();
   }
}
