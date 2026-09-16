package com.moonsworth.lunar.client.RHCHRCOCCOIIIHCHRHIRCORHRHRICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.IntHashMap;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
@Mixin(KeyBinding.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public static IntHashMap<KeyBinding> HASH;

   @WrapWithCondition(
      method = "resetKeyBindingArrayAndHash",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/IntHashMap;addKey(ILjava/lang/Object;)V")
   )
   private static <V> boolean lunar$shouldIncludeModKeybind(IntHashMap var0, int var1, V var2) {
      KeyBinding var3 = (KeyBinding)var2;
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var4 = (RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RIOCOIRRIORHRHHICHOIIOORICOHRI
         .inverse()
         .get((IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3);
      return var4 != null && var4.RCRIRCIIRIIRRHIORRRCHOHORHCCRH()
         ? false
         : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() == null
            || IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() == null
            || !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .OOOROCHORHORHOIOIRRHRIRHICOIIR()
               .contains(var3.getKeyCategory());
   }

   @Inject(method = "setKeyBindState", at = @At("HEAD"), cancellable = true)
   private static void lunar$setKeybindState(int var0, boolean var1, CallbackInfo var2) {
      if (var0 != 0) {
         KeyBinding var3 = (KeyBinding)HASH.lookup(var0);
         if (var3 != null
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .CIIOCRCHOROIOORCORHRCRICHIIOOR(var3.keyCategory);
            if (var4 != null && !var4.isEnabled()) {
               var2.cancel();
            }
         }
      }
   }
}
