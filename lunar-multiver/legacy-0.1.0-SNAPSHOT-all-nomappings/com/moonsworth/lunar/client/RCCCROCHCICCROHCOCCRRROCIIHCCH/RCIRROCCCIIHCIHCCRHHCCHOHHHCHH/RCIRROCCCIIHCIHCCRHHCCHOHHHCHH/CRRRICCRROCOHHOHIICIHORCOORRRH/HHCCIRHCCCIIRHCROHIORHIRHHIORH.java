package com.moonsworth.lunar.client.RCCCROCHCICCROHCOCCRRROCIIHCCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.RenderGlobal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RenderGlobal.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Shadow
   public abstract EntityFX doSpawnParticle(String var1, double var2, double var4, double var6, double var8, double var10, double var12);

   @Inject(
      method = "spawnParticle",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/RenderGlobal;doSpawnParticle(Ljava/lang/String;DDDDDD)Lnet/minecraft/client/particle/EntityFX;"
      ),
      cancellable = true
   )
   private void lunar$spawnParticle$doSpawnParticle(
      String var1, double var2, double var4, double var6, double var8, double var10, double var12, CallbackInfo var14
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var15 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getParticleFromName(
         var1
      );
      if (var15 != null) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var16 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RHRIRRCRRHCCRROCOIHRROORORIIIH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var15.asModernParticle());
         if (var16 != null && var16.isActive()) {
            ThreadLocalRandom var17 = ThreadLocalRandom.current();
            int var18 = var16.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17);
            if (var18 == 0) {
               var14.cancel();
            }

            if (var18 <= 1) {
               return;
            }

            for (int var19 = 0; var19 < var18; var19++) {
               double var20 = var16.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var2);
               double var22 = var16.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var4);
               double var24 = var16.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, var6);
               double var26 = var16.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var17, var8);
               double var28 = var16.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var17, var10);
               double var30 = var16.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var17, var12);
               this.doSpawnParticle(var1, var20, var22, var24, var26, var28, var30);
            }
         }
      }
   }

   @Inject(method = "doSpawnParticle", at = @At("RETURN"))
   private void lunar$doSpawnParticle(
      String var1, double var2, double var4, double var6, double var8, double var10, double var12, CallbackInfoReturnable<EntityFX> var14
   ) {
      EntityFX var15 = (EntityFX)var14.getReturnValue();
      if (var15 != null) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var16 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getParticleFromName(
            var1
         );
         if (var16 != null) {
            CRRRICCRROCOHHOHIICIHORCOORRRH var17 = var16.asModernParticle().getDataProvider();
            if (var17 != null) {
               int var18 = var17.getId();
               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH)var15)
                  .bridge$setParticleType(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.getParticleFromId(
                        var18
                     )
                  );
            }
         }
      }
   }
}
