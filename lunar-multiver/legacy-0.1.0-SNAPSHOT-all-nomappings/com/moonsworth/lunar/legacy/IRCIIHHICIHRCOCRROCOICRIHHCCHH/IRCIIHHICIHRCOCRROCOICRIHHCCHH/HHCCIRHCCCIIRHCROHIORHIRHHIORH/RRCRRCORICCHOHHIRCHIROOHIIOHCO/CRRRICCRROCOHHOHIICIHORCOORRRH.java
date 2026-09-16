package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(World.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Final
   @Shadow
   public boolean isRemote;

   @Shadow
   public abstract void playSound$v1_7(double var1, double var3, double var5, String var7, float var8, float var9, boolean var10);

   @Shadow
   public abstract void playSound$v1_12(double var1, double var3, double var5, SoundEvent var7, SoundCategory var8, float var9, float var10, boolean var11);

   @Shadow
   public abstract boolean addWeatherEffect(Entity var1);

   @Inject(method = "updateEntities", at = @At("RETURN"))
   public void lunar$updateEntities(CallbackInfo var1) {
      if (this.isRemote) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORCICIRRCCORHCIHROHRIRIHCOHI();
         if (var2.isEnabled()) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH();
            if ((Boolean)var2.HCRHOHHIIRRICRRIOCIHRRHOHIRRIC().get() && var3 != null) {
               ThreadLocalRandom var4 = ThreadLocalRandom.current();
               if (var4.nextFloat() < 0.002F * (Float)var2.IOHIICCOHRHOOOHOCCIOOHORCHRHHC().get()) {
                  float var5 = (Float)var2.CHIRRIIRRRIORIIRHHHROCIROHRIIO().get();
                  float var6 = (Float)var2.OCHRROICHOHICIOHRCHRCIOROOOOCC().get();
                  double var7 = var3.bridge$getPosX() + (var4.nextFloat() - 0.5F) * 2.0F * var5;
                  double var9 = var3.bridge$getPosY() + (var4.nextFloat() - 0.5F) * 2.0F * var6;
                  double var11 = var3.bridge$getPosZ() + (var4.nextFloat() - 0.5F) * 2.0F * var5;
                  EntityLightningBolt var13;
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
                     var13 = new EntityLightningBolt((World)this, var7, var9, var11, true);
                  } else {
                     var13 = new EntityLightningBolt((World)this, var7, var9, var11);
                  }

                  ((IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var13).bridge$setAddedByWeatherChanger(true);
                  this.addWeatherEffect(var13);
                  if ((Boolean)var2.OOICCCCIOORHOHICCIHCCHIORHOOOR().get()) {
                     float var14 = 0.8F + var4.nextFloat() * 0.2F;
                     float var15 = 0.5F + var4.nextFloat() * 0.2F;
                     if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
                        this.playSound$v1_12(var7, var9, var11, SoundEvents.ENTITY_LIGHTNING_THUNDER, SoundCategory.WEATHER, 10000.0F, var14, false);
                        this.playSound$v1_12(var7, var9, var11, SoundEvents.ENTITY_LIGHTNING_IMPACT, SoundCategory.WEATHER, 2.0F, var15, false);
                     } else {
                        this.playSound$v1_7(var7, var9, var11, "ambient.weather.thunder", 10000.0F, var14, false);
                        this.playSound$v1_7(var7, var9, var11, "random.explode", 2.0F, var15, false);
                     }
                  }
               }
            }
         }
      }
   }
}
