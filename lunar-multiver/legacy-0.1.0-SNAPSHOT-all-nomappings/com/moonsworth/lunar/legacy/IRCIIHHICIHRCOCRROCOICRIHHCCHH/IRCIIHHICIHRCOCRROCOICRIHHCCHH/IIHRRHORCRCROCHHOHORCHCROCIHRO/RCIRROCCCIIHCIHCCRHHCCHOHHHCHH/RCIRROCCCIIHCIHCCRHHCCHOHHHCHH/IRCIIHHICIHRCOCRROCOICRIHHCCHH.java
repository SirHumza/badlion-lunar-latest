package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import org.lwjgl.openal.AL;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AL.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @WrapOperation(
      method = "create(Ljava/lang/String;IIZZ)V",
      at = @At(
         value = "INVOKE",
         target = "Lorg/lwjgl/LWJGLUtil;getLibraryPaths(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/ClassLoader;)[Ljava/lang/String;"
      )
   )
   private static String[] lunar$addMacOsLib(String var0, String[] var1, ClassLoader var2, Operation<String[]> var3) {
      if (var1.length == 1 && var1[0].equals("openal.dylib")) {
         var1 = new String[]{"libopenalsoft.dylib", "openal.dylib"};
      }

      return (String[])var3.call(new Object[]{var0, var1, var2});
   }
}
