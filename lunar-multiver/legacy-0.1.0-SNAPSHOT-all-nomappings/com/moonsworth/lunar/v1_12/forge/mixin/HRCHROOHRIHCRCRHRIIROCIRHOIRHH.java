package com.moonsworth.lunar.v1_12.forge.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.util.List;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.config.GuiUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiUtils.class)
public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @WrapMethod(method = "drawHoveringText(Lnet/minecraft/item/ItemStack;Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V")
   private static void lunar$wrapTooltipRender(
      ItemStack var0,
      List<String> var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      FontRenderer var7,
      Operation<Void> var8,
      @Share("context") LocalRef<OCOHORHCROHICRRIHCIHHRRCIHICRI> var9,
      @Share("guiContext") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var10,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var11
   ) {
      if (!com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, var2, var3, var9, var10, var11
      )) {
         ((OCOHORHCROHICRRIHCIHHRRCIHICRI)var9.get()).push();
         var8.call(new Object[]{var0, var1, var2, var3, var4, var5, var6, var7});
         ((OCOHORHCROHICRRIHCIHHRRCIHICRI)var9.get()).pop();
      }
   }

   @ModifyExpressionValue(
      method = "drawHoveringText(Lnet/minecraft/item/ItemStack;Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V",
      at = @At(value = "INVOKE", target = "Ljava/util/List;size()I")
   )
   private static int lunar$cancelLoopIter(
      int var0,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1
   ) {
      return var1.get() != null
            && ((com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.get())
               .isModified()
         ? 0
         : var0;
   }

   @Inject(
      method = "drawHoveringText(Lnet/minecraft/item/ItemStack;Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V",
      at = @At(value = "CONSTANT", args = "intValue=12", ordinal = 0)
   )
   private static void lunar$updateWidth(
      ItemStack var0,
      List<String> var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      FontRenderer var7,
      CallbackInfo var8,
      @Local(ordinal = 5) LocalIntRef var9,
      @Share("actualW") LocalIntRef var10,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var11
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var9, var10, var11
      );
   }

   @Inject(
      method = "drawHoveringText(Lnet/minecraft/item/ItemStack;Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V",
      at = @At(value = "CONSTANT", args = "intValue=4", ordinal = 2)
   )
   private static void lunar$updateHeight(
      ItemStack var0,
      List<String> var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      FontRenderer var7,
      CallbackInfo var8,
      @Local(ordinal = 9) LocalIntRef var9,
      @Share("actualH") LocalIntRef var10,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var11
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var9, var10, var11
      );
   }

   @ModifyVariable(
      method = "drawHoveringText(Lnet/minecraft/item/ItemStack;Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V",
      at = @At("LOAD"),
      ordinal = 0
   )
   private static boolean lunar$cancelWrap(
      boolean var0,
      @Share("event") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1
   ) {
      return var1.get() != null
            && ((com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.get())
               .isModified()
         ? false
         : var0;
   }

   @Inject(
      method = "drawHoveringText(Lnet/minecraft/item/ItemStack;Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/event/RenderTooltipEvent$Color;getBorderEnd()I", shift = Shift.AFTER)
   )
   private static void lunar$modifyPosition(
      ItemStack var0,
      List<String> var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      FontRenderer var7,
      CallbackInfo var8,
      @Local(ordinal = 5) LocalIntRef var9,
      @Local(ordinal = 9) LocalIntRef var10,
      @Local(ordinal = 7) LocalIntRef var11,
      @Local(ordinal = 8) LocalIntRef var12,
      @Share("actualW") LocalIntRef var13,
      @Share("actualH") LocalIntRef var14,
      @Share("context") LocalRef<OCOHORHCROHICRRIHCIHHRRCIHICRI> var15,
      @Share("guiContext") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var16
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var9, var10, var13, var14, var11, var12, var15, var16
      );
   }

   @Inject(
      method = "drawHoveringText(Lnet/minecraft/item/ItemStack;Ljava/util/List;IIIIILnet/minecraft/client/gui/FontRenderer;)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;enableLighting()V")
   )
   private static void lunar$renderComponents(
      ItemStack var0,
      List<String> var1,
      int var2,
      int var3,
      int var4,
      int var5,
      int var6,
      FontRenderer var7,
      CallbackInfo var8,
      @Local(ordinal = 7) int var9,
      @Local(ordinal = 8) int var10,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var11,
      @Share("context") LocalRef<OCOHORHCROHICRRIHCIHHRRCIHICRI> var12,
      @Share("guiContext") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var13
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var9, var10, var11, var12, var13
      );
   }
}
