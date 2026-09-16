package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleFirework.Overlay;
import net.minecraft.client.particle.ParticleFirework.Spark;
import net.minecraft.client.particle.ParticleFirework.Starter;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Particle.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Unique
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH lunar$particleType = null;
   @Unique
   private Vector4f lunar$colorBackup = null;
   @Unique
   private float lunar$scaleBackup = 1.0F;
   @Shadow
   public float particleRed;
   @Shadow
   public float particleGreen;
   @Shadow
   public float particleBlue;
   @Shadow
   public float particleAlpha;
   @Shadow
   public float particleScale;

   @Shadow
   public abstract float getRedColorF();

   @Shadow
   public abstract float getBlueColorF();

   @Shadow
   public abstract float getGreenColorF();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @ModifyExpressionValue(method = "move$v1_12", at = @At(value = "FIELD", target = "Lnet/minecraft/client/particle/Particle;canCollide$v1_12:Z"))
   private boolean lunar$disableCollisionChecks(boolean var1) {
      return var1
         && (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
            .ORRHIRHIOCCCCOIROCRCORCRIIHOHH()
            .get();
   }

   public float bridge$getRed() {
      return this.getRedColorF();
   }

   public float bridge$getGreen() {
      return this.getGreenColorF();
   }

   public float bridge$getBlue() {
      return this.getBlueColorF();
   }

   public float bridge$getAlpha() {
      return this.particleAlpha;
   }

   public void bridge$setParticleType(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.lunar$particleType = var1;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getParticleType() {
      return this.lunar$particleType;
   }

   @Inject(method = {"renderParticle$v1_8", "renderParticle$v1_7"}, at = @At("HEAD"))
   private void lunar$onRender(CallbackInfo var1) {
      if (!this.bridge$isFirework() && this.lunar$particleType != null) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .RHRIRRCRRHCCRROCOIHRROORORIIIH()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.bridge$getParticleType());
         if (var2 != null && var2.isActive()) {
            this.lunar$colorBackup = new Vector4f(this.particleRed, this.particleGreen, this.particleBlue, this.particleAlpha);
            this.lunar$scaleBackup = this.particleScale;
            this.particleRed = var2.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(this.particleRed);
            this.particleGreen = var2.RRHOOOORORHHOOIHRCCHIIHHIIIIOH(this.particleGreen);
            this.particleBlue = var2.HIHHOCRHHRORRHHRORRRIIHHORIHOC(this.particleBlue);
            this.particleAlpha = var2.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(this.particleAlpha);
            this.particleScale = var2.IIIIRHIHROIRCROHHROIHIIHRCRRHO(this.particleScale);
         }
      }
   }

   @Inject(method = {"renderParticle$v1_8", "renderParticle$v1_7"}, at = @At("TAIL"))
   private void lunar$onRenderPost(CallbackInfo var1) {
      if (this.lunar$colorBackup != null) {
         this.particleRed = this.lunar$colorBackup.x;
         this.particleGreen = this.lunar$colorBackup.y;
         this.particleBlue = this.lunar$colorBackup.z;
         this.particleAlpha = this.lunar$colorBackup.w;
         this.particleScale = this.lunar$scaleBackup;
         this.lunar$colorBackup = null;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public boolean bridge$isFirework() {
      Particle var1 = (Particle)this;
      return var1 instanceof Starter || var1 instanceof Overlay || var1 instanceof Spark;
   }
}
