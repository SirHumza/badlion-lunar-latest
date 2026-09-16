package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.settings.KeyBinding_v1_8;
import net.minecraft.util.IntHashMap_v1_8;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
@Mixin(KeyBinding_v1_8.class)
public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Final
   @Shadow
   public static IntHashMap_v1_8<KeyBinding_v1_8> HASH;

   @WrapWithCondition(
      method = "resetKeyBindingArrayAndHash",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/IntHashMap_v1_8;addKey(ILjava/lang/Object;)V")
   )
   private static <V> boolean lunar$shouldIncludeModKeybind(IntHashMap_v1_8<KeyBinding_v1_8> var0, int var1, V var2) {
      KeyBinding_v1_8 var3 = (KeyBinding_v1_8)var2;
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var4 = (RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RIOCOIRRIORHRHHICHOIIOORICOHRI
         .inverse()
         .get(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3
         );
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
         KeyBinding_v1_8 var3 = (KeyBinding_v1_8)HASH.lookup(var0);
         if (var3 != null) {
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
