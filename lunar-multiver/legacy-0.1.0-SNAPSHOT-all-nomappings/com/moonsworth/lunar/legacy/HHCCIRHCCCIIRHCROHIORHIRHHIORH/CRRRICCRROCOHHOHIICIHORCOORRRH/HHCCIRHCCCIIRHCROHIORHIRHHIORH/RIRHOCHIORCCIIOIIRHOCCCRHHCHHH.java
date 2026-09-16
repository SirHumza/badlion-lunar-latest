package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.gui.GuiSlot;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
   absent = {"forge", "optifine"},
   available = @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
)
@Mixin(GuiSlot.class)
public class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   implements com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Unique
   private boolean lunar$renderBackground = true;

   @Override
   public void ext$setRenderBackgrounds(boolean var1) {
      this.lunar$renderBackground = var1;
   }

   @WrapOperation(method = "drawScreen", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiSlot;drawBackground()V"))
   private void lunar$cancelBackgroundDraw(GuiSlot var1, Operation<Void> var2) {
      if (this.lunar$renderBackground) {
         var2.call(new Object[]{var1});
      }
   }

   @Inject(method = "overlayBackground", at = @At("HEAD"), cancellable = true)
   private void lunar$cancelOverlayBackground(int var1, int var2, int var3, int var4, CallbackInfo var5) {
      if (!this.lunar$renderBackground) {
         var5.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(
      method = "drawScreen",
      at = {
            @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;draw$v1_8()V", ordinal = 0),
            @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;draw$v1_8()V", ordinal = 1),
            @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;draw$v1_8()V", ordinal = 2)
      }
   )
   private void lunar$hideBackgroundElements$v1_8(Tessellator var1, Operation<Void> var2) {
      if (!this.lunar$renderBackground) {
         GlStateManager.colorMask(false, false, false, false);
      }

      var2.call(new Object[]{var1});
      if (!this.lunar$renderBackground) {
         GlStateManager.colorMask(true, true, true, true);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @WrapOperation(
      method = "drawScreen",
      at = {
            @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;draw$v1_7()I", ordinal = 0),
            @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;draw$v1_7()I", ordinal = 1),
            @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;draw$v1_7()I", ordinal = 2)
      }
   )
   @Dynamic
   private int lunar$hideBackgroundElements$v1_7(Tessellator var1, Operation<Integer> var2) {
      if (!this.lunar$renderBackground) {
         GL11.glColorMask(false, false, false, false);
      }

      int var3 = (Integer)var2.call(new Object[]{var1});
      if (!this.lunar$renderBackground) {
         GL11.glColorMask(true, true, true, true);
      }

      return var3;
   }
}
