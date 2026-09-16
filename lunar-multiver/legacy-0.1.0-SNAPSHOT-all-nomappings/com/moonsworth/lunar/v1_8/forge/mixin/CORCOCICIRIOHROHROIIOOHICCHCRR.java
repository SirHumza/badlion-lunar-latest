package com.moonsworth.lunar.v1_8.forge.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import java.util.List;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.fml.client.config.GuiUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiUtils.class)
public class CORCOCICIRIOHROHROIIOOHICCHCRR {
   @WrapMethod(method = "drawHoveringText")
   private static void lunar$wrapTooltipRender(
      List<String> var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      FontRenderer var6,
      Operation<Void> var7,
      @Share("context") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI> var8,
      @Share("guiContext") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var9,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var10
   ) {
      if (!com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, var1, var2, var8, var9, var10
      )) {
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI)var8.get())
            .push();
         var7.call(new Object[]{var0, var1, var2, var3, var4, var5, var6});
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI)var8.get())
            .pop();
      }
   }

   @ModifyExpressionValue(method = "drawHoveringText", at = @At(value = "INVOKE", target = "Ljava/util/List;size()I"))
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

   @Inject(method = "drawHoveringText", at = @At(value = "CONSTANT", args = "intValue=12", ordinal = 0))
   private static void lunar$updateWidth(
      List<String> var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      FontRenderer var6,
      CallbackInfo var7,
      @Local(ordinal = 5) LocalIntRef var8,
      @Share("actualW") LocalIntRef var9,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var10
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var8, var9, var10
      );
   }

   @Inject(method = "drawHoveringText", at = @At(value = "CONSTANT", args = "intValue=6", ordinal = 0))
   private static void lunar$updateHeight(
      List<String> var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      FontRenderer var6,
      CallbackInfo var7,
      @Local(ordinal = 9) LocalIntRef var8,
      @Share("actualH") LocalIntRef var9,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var10
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var8, var9, var10
      );
   }

   @ModifyVariable(method = "drawHoveringText", at = @At("LOAD"), ordinal = 0)
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

   @Inject(method = "drawHoveringText", at = @At(value = "CONSTANT", args = "intValue=-267386864", ordinal = 0))
   private static void lunar$modifyPosition(
      List<String> var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      FontRenderer var6,
      CallbackInfo var7,
      @Local(ordinal = 5) LocalIntRef var8,
      @Local(ordinal = 9) LocalIntRef var9,
      @Local(ordinal = 7) LocalIntRef var10,
      @Local(ordinal = 8) LocalIntRef var11,
      @Share("actualW") LocalIntRef var12,
      @Share("actualH") LocalIntRef var13,
      @Share("context") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI> var14,
      @Share("guiContext") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var15
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var8, var9, var12, var13, var10, var11, var14, var15
      );
   }

   @Inject(method = "drawHoveringText", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;enableLighting()V"))
   private static void lunar$renderComponents(
      List<String> var0,
      int var1,
      int var2,
      int var3,
      int var4,
      int var5,
      FontRenderer var6,
      CallbackInfo var7,
      @Local(ordinal = 7) int var8,
      @Local(ordinal = 8) int var9,
      @Share("modifyComponents") LocalRef<com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var10,
      @Share("context") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI> var11,
      @Share("guiContext") LocalRef<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var12
   ) {
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var8, var9, var10, var11, var12
      );
   }
}
