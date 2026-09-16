package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(ActiveRenderInfo.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @ModifyVariable(method = "updateRenderInfo", at = @At("HEAD"), index = 1, argsOnly = true)
   private static boolean lunar$rewindActiveRenderInfo$back(boolean var0) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0x -> !var0x.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer())
         ? false
         : var0;
   }

   @WrapOperation(
      method = "updateRenderInfo(Lnet/minecraft/entity/player/EntityPlayer;Z)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;rotationPitch:F"),
      expect = 0,
      require = 0
   )
   private static float lunar$rewindActiveRenderInfo$pitch(EntityPlayer var0, Operation<Float> var1) {
      return lunar$rewindPitch(var0, var1);
   }

   @WrapOperation(
      method = "updateRenderInfo(Lnet/minecraft/entity/Entity;Z)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;rotationPitch:F"),
      expect = 0,
      require = 0
   )
   @Dynamic
   private static float lunar$rewindActiveRenderInfo$pitch(Entity var0, Operation<Float> var1) {
      return lunar$rewindPitch(var0, var1);
   }

   @Unique
   private static float lunar$rewindPitch(Entity var0, Operation<Float> var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            var0x -> var0x.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHHCCIOICIIRRIRCHROOCCHRIHOROC()
               || !var0x.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer()
         )) {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0
            ? Minecraft.getMinecraft().renderViewEntity$v1_7.rotationPitch
            : Minecraft.getMinecraft().renderViewEntity$v1_8.rotationPitch;
      } else {
         return (Float)var1.call(new Object[]{var0});
      }
   }

   @WrapOperation(
      method = "updateRenderInfo(Lnet/minecraft/entity/player/EntityPlayer;Z)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;rotationYaw:F"),
      expect = 0,
      require = 0
   )
   private static float lunar$rewindActiveRenderInfo$yaw(EntityPlayer var0, Operation<Float> var1) {
      return lunar$rewindYaw(var0, var1);
   }

   @WrapOperation(
      method = "updateRenderInfo(Lnet/minecraft/entity/Entity;Z)V",
      at = @At(value = "FIELD", target = "Lnet/minecraft/entity/player/EntityPlayer;rotationYaw:F"),
      expect = 0,
      require = 0
   )
   @Dynamic
   private static float lunar$rewindActiveRenderInfo$yaw(Entity var0, Operation<Float> var1) {
      return lunar$rewindYaw(var0, var1);
   }

   @Unique
   private static float lunar$rewindYaw(Entity var0, Operation<Float> var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            var0x -> var0x.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHHCCIOICIIRRIRCHROOCCHRIHOROC()
               || !var0x.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer()
         )) {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0
            ? Minecraft.getMinecraft().renderViewEntity$v1_7.rotationYaw
            : Minecraft.getMinecraft().renderViewEntity$v1_8.rotationYaw;
      } else {
         return (Float)var1.call(new Object[]{var0});
      }
   }
}
