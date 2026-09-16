package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Map;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer_v1_8;
import net.minecraft.client.renderer.entity.Render_v1_7;
import net.minecraft.client.renderer.entity.Render_v1_8;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RenderManager.class)
public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public Map<String, RenderPlayer_v1_8> skinMap$v1_8;
   @Final
   @Shadow
   public RenderPlayer_v1_8 playerRenderer$v1_8;
   @Shadow
   public static RenderManager instance$v1_7;
   @Shadow
   public boolean renderOutlines$v1_8;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Unique
   private boolean lunar$renderOutlines;

   @Shadow
   public abstract Render_v1_8 getEntityClassRenderObject$v1_8(Class<? extends Entity> var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "cacheActiveRenderInfo$v1_8", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;rotationYaw:F"))
   private float lunar$cacheActiveRenderInfo$rotationYaw$v1_8(Entity var1) {
      return this.lunar$freelookYaw(var1.rotationYaw);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "cacheActiveRenderInfo$v1_8", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;prevRotationYaw:F"))
   private float lunar$cacheActiveRenderInfo$prevRotationYaw$v1_8(Entity var1) {
      return this.lunar$freelookYaw(var1.prevRotationYaw);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "cacheActiveRenderInfo$v1_7", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;rotationYaw:F"))
   private float lunar$cacheActiveRenderInfo$rotationYaw$v1_7(EntityLivingBase var1) {
      return this.lunar$freelookYaw(var1.rotationYaw);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "cacheActiveRenderInfo$v1_7", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;prevRotationYaw:F"))
   private float lunar$cacheActiveRenderInfo$prevRotationYaw$v1_7(EntityLivingBase var1) {
      return this.lunar$freelookYaw(var1.prevRotationYaw);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "cacheActiveRenderInfo$v1_8", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;rotationPitch:F"))
   private float lunar$cacheActiveRenderInfo$rotationPitch$v1_8(Entity var1) {
      return this.lunar$freelookPitch(var1.rotationPitch);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "cacheActiveRenderInfo$v1_8", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;prevRotationPitch:F"))
   private float lunar$cacheActiveRenderInfo$prevRotationPitch$v1_8(Entity var1) {
      return this.lunar$freelookPitch(var1.prevRotationPitch);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "cacheActiveRenderInfo$v1_7", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;rotationPitch:F"))
   private float lunar$cacheActiveRenderInfo$rotationPitch$v1_7(EntityLivingBase var1) {
      return this.lunar$freelookPitch(var1.rotationPitch);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "cacheActiveRenderInfo$v1_7", at = @At(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;prevRotationPitch:F"))
   private float lunar$cacheActiveRenderInfo$prevRotationPitch$v1_7(EntityLivingBase var1) {
      return this.lunar$freelookPitch(var1.prevRotationPitch);
   }

   @Unique
   private float lunar$freelookYaw(float var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CHICCHHHRCRROORCRCCCRHOICIOROC();
      return var2.isEnabled() && var2.isActive() ? var2.HRHOIRCHICHROHIHORRCRIRHOCRRRH() : var1;
   }

   @Unique
   private float lunar$freelookPitch(float var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CHICCHHHRCRROORCRCCCRHOICIOROC();
      return var2.isEnabled() && var2.isActive() ? var2.HIICIHRORROOIIROCCRHICCHIHRCOH() : var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public void bridge$setRenderOutlines(boolean var1) {
      this.lunar$renderOutlines = var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "doRenderEntity$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render_v1_7;doRender(Lnet/minecraft/entity/Entity;DDDFF)V")
   )
   @Dynamic
   private void lunar$setRenderOutline$v1_7(
      Entity var1,
      double var2,
      double var4,
      double var6,
      float var8,
      float var9,
      boolean var10,
      CallbackInfoReturnable<Boolean> var11,
      @Local Render_v1_7 var12
   ) {
      if (var12 instanceof RendererLivingEntity var13) {
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var13)
            .bridge$setRenderOutlines(this.lunar$renderOutlines);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "doRenderEntity$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render_v1_8;doRender(Lnet/minecraft/entity/Entity;DDDFF)V")
   )
   @Dynamic
   private void setLunar$renderOutlines$v1_8(
      Entity var1,
      double var2,
      double var4,
      double var6,
      float var8,
      float var9,
      boolean var10,
      CallbackInfoReturnable<Boolean> var11,
      @Local Render_v1_8 var12
   ) {
      if (var12 instanceof RendererLivingEntity var13) {
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var13)
            .bridge$setRenderOutlines(this.renderOutlines$v1_8);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(
      method = "doRenderEntity$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render_v1_7;doRenderShadowAndFire(Lnet/minecraft/entity/Entity;DDDFF)V")
   )
   @Dynamic
   private boolean lunar$dontRenderShadowIfOutline$v1_7(Render_v1_7 var1, Entity var2, double var3, double var5, double var7, float var9, float var10) {
      return !this.lunar$renderOutlines;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapWithCondition(
      method = "doRenderEntity$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render_v1_8;doRenderShadowAndFire(Lnet/minecraft/entity/Entity;DDDFF)V")
   )
   private boolean lunar$dontRenderShadowIfOutline$v1_8(Render_v1_8 var1, Entity var2, double var3, double var5, double var7, float var9, float var10) {
      return !this.renderOutlines$v1_8;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "doRenderEntity$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$onEntityRenderPre$v1_7(
      Entity var1, double var2, double var4, double var6, float var8, float var9, boolean var10, CallbackInfoReturnable<Boolean> var11
   ) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1
            )
         );
      if (var12 != null && var12.isCancelled()) {
         var11.setReturnValue(false);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "renderEntity$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$onEntityRenderPre$v1_12(Entity var1, double var2, double var4, double var6, float var8, float var9, boolean var10, CallbackInfo var11) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1
            )
         );
      if (var12 != null && var12.isCancelled()) {
         var11.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "getEntityRenderObject$v1_8", at = @At("HEAD"), cancellable = true)
   private void lunar$getEntityClassRenderObject$v1_8(Entity var1, CallbackInfoReturnable<Render_v1_8> var2) {
      if (var1 instanceof com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var3) {
         com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = var3.lunar$getCache();
         if (var1 instanceof AbstractClientPlayer var5) {
            com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.CORCOCICIRIOHROHROIIOOHICCHCRR var6 = (com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.CORCOCICIRIOHROHROIIOOHICCHCRR)var4;
            String var7 = var5.getSkinType$v1_8();
            if (var7 == null) {
               var6.ROCRHIOCHIIOCROIHHOHHROCHCIHCH(this.playerRenderer$v1_8);
            } else if (!var7.equals(var6.skinType)) {
               var6.skinType = var7;
               RenderPlayer_v1_8 var8 = this.skinMap$v1_8.get(var7);
               if (var8 == null) {
                  var8 = this.playerRenderer$v1_8;
               }

               var6.ROCRHIOCHIIOCROIHHOHHROCHCIHCH(var8);
            }

            var2.setReturnValue((Render_v1_8)var6.RRRHCIIOHOROIRCOCCOCIIHRRRRHCO());
         } else {
            Render_v1_8 var9 = (Render_v1_8)var4.RRRHCIIOHOROIRCOCCOCIIHRRRRHCO();
            if (var9 == null) {
               var9 = (Render_v1_8)var4.ROCRHIOCHIIOCROIHHOHHROCHCIHCH(this.getEntityClassRenderObject$v1_8((Class<? extends Entity>)var1.getClass()));
            }

            var2.setReturnValue(var9);
         }
      }
   }
}
