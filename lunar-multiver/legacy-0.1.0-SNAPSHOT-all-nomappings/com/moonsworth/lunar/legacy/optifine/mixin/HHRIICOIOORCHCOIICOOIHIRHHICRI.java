package com.moonsworth.lunar.legacy.optifine.mixin;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.optifine.shaders.Shaders;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(RenderLivingBase.class)
public class HHRIICOIOORCHCOIICOOIHIRHHICRI {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "doRender", at = @At(value = "INVOKE", target = "shadersmod/client/Shaders.setEntityColor (FFFF)V"))
   private void lunar$applyHitColorOverride_v1_7(float var1, float var2, float var3, float var4) {
      this.lunar$applyHitColorOverride(var1, var2, var3, var4);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "setBrightness", at = @At(value = "INVOKE", target = "net/optifine/shaders/Shaders.setEntityColor (FFFF)V"))
   private void lunar$applyHitColorOverride_v1_8(float var1, float var2, float var3, float var4) {
      this.lunar$applyHitColorOverride(var1, var2, var3, var4);
   }

   private void lunar$applyHitColorOverride(float var1, float var2, float var3, float var4) {
      if (var1 == 1.0F && var2 == 0.0F && var3 == 0.0F && var4 == 0.3F) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .COIHORORRIICCRIIRHIRIRRHCHOHHC();
         Shaders.setEntityColor(
            var5.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var1),
            var5.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var2),
            var5.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var3),
            var5.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(var4)
         );
      } else {
         Shaders.setEntityColor(var1, var2, var3, var4);
      }
   }
}
