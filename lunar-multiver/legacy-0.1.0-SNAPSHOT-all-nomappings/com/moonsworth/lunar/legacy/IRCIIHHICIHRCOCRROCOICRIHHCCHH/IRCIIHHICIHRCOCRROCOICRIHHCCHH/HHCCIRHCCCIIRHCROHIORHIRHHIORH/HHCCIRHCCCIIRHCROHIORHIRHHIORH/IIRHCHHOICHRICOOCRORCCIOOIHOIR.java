package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.client.gui.GuiOverlayDebug;
import net.minecraft.client.gui.ScaledResolution;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(GuiOverlayDebug.class)
public class IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   @Inject(method = "getDebugInfoRight", at = @At("RETURN"))
   private void lunar$getDebugInfoRight(CallbackInfoReturnable<List<String>> var1) {
      com.moonsworth.lunar.client.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHCIORHICIHRCHHIORIIOIIIIORHIC
         .RHRCRCIOIOICRHRCCROIICCRRCOOOI((List)var1.getReturnValue());
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CHIROHOORHIRORIORHOHORHOHHHOOH()
         .HCOCCOCCHIIICOOROOOICCOCHOORRI()
         .RHRCRCIOIOICRHRCCROIICCRRCOOOI((List)var1.getReturnValue());
   }

   @Inject(method = "renderDebugInfo", at = @At("HEAD"), cancellable = true)
   private void lunar$renderDebugInfo(ScaledResolution var1, CallbackInfo var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RIRRCRRIRRHHIORCICCOHHRRHOCIIC().isEnabled()) {
         var2.cancel();
      }
   }

   @Inject(method = "renderLagometer", at = @At("HEAD"), cancellable = true)
   private void lunar$renderLagometer(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().RIRRCRRIRRHHIORCICCOHHRRHOCIIC().isEnabled()) {
         var1.cancel();
      }
   }
}
