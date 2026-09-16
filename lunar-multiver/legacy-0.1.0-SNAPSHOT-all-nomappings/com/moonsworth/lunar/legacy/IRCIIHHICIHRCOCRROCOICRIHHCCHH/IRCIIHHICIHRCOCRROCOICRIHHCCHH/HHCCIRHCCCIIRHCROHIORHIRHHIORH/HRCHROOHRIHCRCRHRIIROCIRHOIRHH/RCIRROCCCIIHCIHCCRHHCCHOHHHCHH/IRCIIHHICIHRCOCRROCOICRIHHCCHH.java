package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.renderer.chunk.VisGraph;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(VisGraph.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Inject(method = {"func_178606_a$v1_8", "setOpaqueCube$v1_12"}, at = @At("HEAD"), cancellable = true)
   public void apollo$setOpaqueCube(CallbackInfo var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOCIIROIRCOHIRHHHROHCOOHIICIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
         .RCIICCOHIRICHCOCIIRCHOCOCRRRCR();
      if (var2.CIHCOICOIROIIOHIRHIRHRCHCHOCOR() && var2.isEnabled()) {
         var1.cancel();
      }
   }
}
