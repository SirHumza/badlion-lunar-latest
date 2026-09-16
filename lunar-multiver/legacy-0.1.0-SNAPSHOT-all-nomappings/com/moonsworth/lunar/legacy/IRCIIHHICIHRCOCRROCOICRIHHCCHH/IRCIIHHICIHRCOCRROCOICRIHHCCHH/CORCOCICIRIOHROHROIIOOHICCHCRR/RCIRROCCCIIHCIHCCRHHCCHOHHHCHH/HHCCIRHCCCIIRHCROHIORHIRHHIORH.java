package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import org.lwjgl.opengl.GL14;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GL14.class)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Inject(method = "glBlendFuncSeparate", at = @At("HEAD"))
   private static void lunar$blendFuncSeparate(int var0, int var1, int var2, int var3, CallbackInfo var4) {
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI var5 = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH;
      var5.OCOOORIHHCIRCICRIIORIIRRRHHHOH = var0;
      var5.IOHCHICCOIOHHCHICIHICCCRIHRIRR = var1;
      var5.IORROIRCOCRICCRCCOORHOIIHRRHIO = var2;
      var5.CIOIICCRCICRRROORCIIIIRHRCIIRC = var3;
   }
}
