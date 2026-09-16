package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.ichor.util.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import net.minecraft.init.Bootstrap;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Bootstrap.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "register", at = @At("HEAD"))
   private static void lunar$forceRedirectOutputToLogging$v1_7(CallbackInfo var0) {
      lunar$forceRedirectOutputToLogging();
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(method = "register", at = @At(value = "INVOKE", target = "Lorg/apache/logging/log4j/Logger;isDebugEnabled()Z"))
   private static boolean lunar$forceRedirectOutputToLogging$v1_8(Logger var0, Operation<Boolean> var1) {
      lunar$forceRedirectOutputToLogging();
      return false;
   }

   @Unique
   private static void lunar$forceRedirectOutputToLogging() {
      if (System.out instanceof HICHRCOHCCRHOHCICOOCHOIHCCHIRI var0) {
         System.setOut(var0.OORCOROORIORCCRRHCOOORICHOCOCH());
      }

      if (System.err instanceof HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2) {
         System.setErr(var2.OORCOROORIORCCRRHCOOORICHOCOCH());
      }

      System.setErr(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH("STDERR", System.err));
      System.setOut(new HRCHROOHRIHCRCRHRIIROCIRHOIRHH("STDOUT", System.out));
   }
}
