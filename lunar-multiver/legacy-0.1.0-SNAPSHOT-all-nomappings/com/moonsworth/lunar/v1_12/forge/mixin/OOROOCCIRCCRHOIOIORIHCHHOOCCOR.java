package com.moonsworth.lunar.v1_12.forge.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.settings.KeyBindingMap;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyBinding.class)
public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   @Final
   @Shadow
   public static KeyBindingMap b;

   @WrapWithCondition(
      method = "resetKeyBindingArrayAndHash",
      at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/settings/KeyBindingMap;addKey(ILnet/minecraft/client/settings/KeyBinding;)V")
   )
   private static boolean lunar$shouldIncludeModKeybind(KeyBindingMap var0, int var1, KeyBinding var2) {
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH var3 = (RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RIOCOIRRIORHRHHICHOIIOORICOHRI
         .inverse()
         .get(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2
         );
      return var3 != null && var3.RCRIRCIIRIIRRHIORRRCHOHORHCCRH()
         ? false
         : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() == null
            || IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() == null
            || !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .OOOROCHORHORHOIOIRRHRIRHICOIIR()
               .contains(var2.getKeyCategory());
   }

   @Inject(method = "setKeyBindState", at = @At("HEAD"), cancellable = true)
   private static void lunar$setKeybindState(int var0, boolean var1, CallbackInfo var2) {
      if (var0 != 0) {
         for (KeyBinding var4 : b.lookupAll(var0)) {
            if (var4 != null
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR() != null) {
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                  .CIIOCRCHOROIOORCORHRCRICHIIOOR(var4.keyCategory);
               if (var5 != null && !var5.isEnabled()) {
                  var2.cancel();
               }
            }
         }
      }
   }
}
