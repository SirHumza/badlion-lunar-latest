package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleDigging;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ParticleManager.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public Map<Integer, IParticleFactory> particleTypes$v1_8;
   @Shadow
   public World world;

   @Shadow
   public abstract void addEffect(Particle var1);

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "registerVanillaParticles$v1_8", at = @At("TAIL"))
   private void lunar$registerVanillaParticles(CallbackInfo var1) {
      for (int var3 : this.particleTypes$v1_8.keySet()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getParticleFromId(
            var3
         );
         HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = var4.asModernParticle();
         var5.setDataProvider(
            new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var4.getParticleName(), var4.getParticleID()
            )
         );
      }

      HHCCIRHCCCIIRHCROHIORHIRHHIORH.populateRegistry();
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(
      method = "spawnEffectParticle$v1_8(IDDDDDD[I)Lnet/minecraft/client/particle/Particle;",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/particle/ParticleManager;addEffect(Lnet/minecraft/client/particle/Particle;)V")
   )
   private void lunar$spawnEffectParticle(
      ParticleManager var1,
      Particle var2,
      Operation<Void> var3,
      @Local(argsOnly = true, ordinal = 0) int var4,
      @Local(argsOnly = true, ordinal = 0) double var5,
      @Local(argsOnly = true, ordinal = 1) double var7,
      @Local(argsOnly = true, ordinal = 2) double var9,
      @Local(argsOnly = true, ordinal = 3) double var11,
      @Local(argsOnly = true, ordinal = 4) double var13,
      @Local(argsOnly = true, ordinal = 5) double var15,
      @Local(argsOnly = true, ordinal = 0) int[] var17,
      @Local IParticleFactory var18
   ) {
      CRRRICCRROCOHHOHIICIHORCOORRRH var19 = (CRRRICCRROCOHHOHIICIHORCOORRRH)var2;
      var19.bridge$setParticleType(HHCCIRHCCCIIRHCROHIORHIRHHIORH.getParticleFromId(var4));
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var20 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RHRIRRCRRHCCRROCOIHRROORORIIIH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var19.bridge$getParticleType());
      if (var20 != null && var20.isActive()) {
         ThreadLocalRandom var21 = ThreadLocalRandom.current();
         int var22 = var20.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var21);
         if (var22 == 0) {
            return;
         }

         if (var22 == 1) {
            var3.call(new Object[]{var1, var2});
            return;
         }

         for (int var23 = 0; var23 < var22; var23++) {
            double var24 = var20.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var21, var5);
            double var26 = var20.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var21, var7);
            double var28 = var20.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var21, var9);
            double var30 = var20.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var21, var11);
            double var32 = var20.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var21, var13);
            double var34 = var20.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var21, var15);
            Particle var36;
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
               var36 = var18.createParticle$v1_12(var4, this.world, var24, var26, var28, var30, var32, var34, var17);
            } else {
               var36 = var18.getEntityFX$v1_8(var4, this.world, var24, var26, var28, var30, var32, var34, var17);
            }

            if (var36 != null) {
               ((CRRRICCRROCOHHOHIICIHORCOORRRH)var36).bridge$setParticleType(HHCCIRHCCCIIRHCROHIORHIRHHIORH.getParticleFromId(var4));
               this.addEffect(var36);
            }
         }
      }

      var3.call(new Object[]{var1, var2});
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(
      method = "renderParticles",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/particle/Particle;renderParticle$v1_8(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/entity/Entity;FFFFFF)V"
      ),
      require = 0,
      expect = 0
   )
   private void lunar$renderParticle$v1_8(
      Particle var1, BufferBuilder var2, Entity var3, float var4, float var5, float var6, float var7, float var8, float var9
   ) {
      OIHCOHRCICCCRHRCROOCIOIRRHHHIH var10 = (OIHCOHRCICCCRHRCROOCIOIRRHHHIH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.class, () -> new OIHCOHRCICCCRHRCROOCIOIRRHHHIH((CRRRICCRROCOHHOHIICIHORCOORRRH)var1));
      if (var10 == null || !var10.isCancelled()) {
         var1.renderParticle$v1_8(var2, var3, var4, var5, var6, var7, var8, var9);
      }
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "renderParticles",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/particle/Particle;renderParticle$v1_7(Lnet/minecraft/client/renderer/Tessellator;FFFFFF)V")
   )
   private void lunar$renderParticle$v1_7(Particle var1, Tessellator var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      OIHCOHRCICCCRHRCROOCIOIRRHHHIH var9 = (OIHCOHRCICCCRHRCROOCIOIRRHHHIH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OIHCOHRCICCCRHRCROOCIOIRRHHHIH.class, () -> new OIHCOHRCICCCRHRCROOCIOIRRHHHIH((CRRRICCRROCOHHOHIICIHORCOORRRH)var1));
      if (var9 == null || !var9.isCancelled()) {
         var1.renderParticle$v1_7(var2, var3, var4, var5, var6, var7, var8);
      }
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "addBlockDestroyEffects$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$addBlockDestroyEffects$head(CallbackInfo var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RHRIRRCRRHCCRROCOIHRROORORIIIH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.BLOCK);
      if (var2 != null && var2.COOOIHCOIIOIOIIOHHCIORROIICHII()) {
         var1.cancel();
      }
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "addBlockHitEffects$v1_7(IIII)V", at = @At("HEAD"), cancellable = true)
   private void lunar$addBlockHitEffects$head(CallbackInfo var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHIIIRHOOCHRCCCCIORIROCOIRRHCC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RHRIRRCRRHCCRROCOIHRROORORIIIH()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.BLOCK);
      if (var2 != null && var2.COOOIHCOIIOIOIIOHHCIORROIICHII()) {
         var1.cancel();
      }
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyExpressionValue(
      method = {
            "addBlockHitEffects$v1_8(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V",
            "addBlockDestroyEffects$v1_8(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V"
      },
      at = @At(value = "NEW", target = "net/minecraft/client/particle/ParticleDigging")
   )
   private ParticleDigging lunar$setIdOfBreakingParticles$v1_8(ParticleDigging var1) {
      ((CRRRICCRROCOHHOHIICIHORCOORRRH)var1)
         .bridge$setParticleType(
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.getParticleFromId(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BLOCK_DUST
                  .getParticleID()
            )
         );
      return var1;
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyExpressionValue(
      method = {"addBlockHitEffects$v1_7", "addBlockDestroyEffects$v1_7"},
      at = @At(value = "NEW", target = "net/minecraft/client/particle/ParticleDigging")
   )
   private ParticleDigging lunar$setIdOfBreakingParticles$v1_7(ParticleDigging var1) {
      ((CRRRICCRROCOHHOHIICIHORCOORRRH)var1)
         .bridge$setParticleType(
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.getParticleFromId(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BLOCK_DUST
                  .getParticleID()
            )
         );
      return var1;
   }

   @Inject(method = "addEffect", at = @At("HEAD"), cancellable = true)
   private void lunar$rewindPreventSpawnUselessParticles(Particle var1, CallbackInfo var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            var1x -> var1x.HRCHICHIOHOROOHHHOHROHCICCROIO().RHHIIIHORICCOCHHORHHOCCHCCIICC() / 50L > var1.particleMaxAge - var1.particleAge
         )) {
         var2.cancel();
      }
   }
}
