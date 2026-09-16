package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import net.minecraft.client.renderer.entity.RenderGuardian;
import net.minecraft.entity.monster.EntityGuardian;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(RenderGuardian.class)
public class CORCOCICIRIOHROHROIIOOHICCHCRR {
   @Inject(
      method = "doRender(Lnet/minecraft/entity/monster/EntityGuardian;DDDFF)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderLiving;doRender(Lnet/minecraft/entity/EntityLiving;DDDFF)V",
         shift = Shift.AFTER
      ),
      cancellable = true
   )
   private void lunar$fireRenderBeamEvent(EntityGuardian var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO var11 = (RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.class,
            () -> new RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var1
            )
         );
      if (var11 != null && var11.isCancelled()) {
         var10.cancel();
      }
   }
}
