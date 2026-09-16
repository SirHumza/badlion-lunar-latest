package com.moonsworth.lunar.legacy.optifine.mixin;

import java.util.Set;
import net.minecraft.client.gui.GuiScreen;
import net.optifine.gui.GuiAnimationSettingsOF;
import net.optifine.gui.GuiDetailSettingsOF;
import net.optifine.gui.GuiOtherSettingsOF;
import net.optifine.gui.GuiPerformanceSettingsOF;
import net.optifine.gui.GuiQualitySettingsOF;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = GuiScreen.class, priority = 1001)
public class OCOHORHCROHICRRIHCIHHRRCIHICRI {
   @Unique
   private static boolean lunar$lazyInitOF = true;

   @Inject(method = "<clinit>", at = @At("TAIL"))
   private static void lunar$blurMenusOptiFine(CallbackInfo var0) {
      if (lunar$lazyInitOF && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOOCCIROOCRIHROCOCHCRCHOIRRCHO();
         Set var2 = var1.HRHCIIOICICCOHROCRCIHIROICRCIO().ROOIOHOHIOCHIICIORIOICHIHHHCIO();
         var2.add(GuiAnimationSettingsOF.class);
         var2.add(GuiDetailSettingsOF.class);
         var2.add(GuiQualitySettingsOF.class);
         var2.add(GuiPerformanceSettingsOF.class);
         var2.add(GuiOtherSettingsOF.class);
         lunar$lazyInitOF = false;
      }
   }
}
