package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.lunarclient.apollo.module.glow.GlowModule;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Shadow
   public World world;
   @Unique
   public CRRRICCRROCOHHOHIICIHORCOORRRH lunar$cache;

   @Inject(method = "setSneaking(Z)V", at = @At("HEAD"))
   private void lunar$stopAnimatingWhenSneaking(boolean var1, CallbackInfo var2) {
      if (var1 && this instanceof EntityPlayer) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this,
               false
            );
      }
   }

   @Inject(method = "isInRangeToRender3d", at = @At("HEAD"), cancellable = true)
   private void lunar$shouldRender(double var1, double var3, double var5, CallbackInfoReturnable<Boolean> var7) {
      if (!com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
         .OCOROCROIRCHIHIHHOOIRIIIRRCRHI(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)this
         )) {
         var7.setReturnValue(false);
      }

      if (this instanceof EntityArrow
         && ((EntityArrow)this).inGround
         && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
            .OCIRRROOCHOIOCRROHCHRRRHRIIOHI()) {
         var7.setReturnValue(false);
      }
   }

   @Inject(method = "isInRangeToRender3d", at = @At("HEAD"), cancellable = true)
   private void lunar$rewindRenderEntities(double var1, double var3, double var5, CallbackInfoReturnable<Boolean> var7) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var8.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var9 = var8.HOROHROIORRIRIIIOOCCIROCRCROHI().IROIIOOCICHRIHCIOHCRCCCRICHIHC();
         if ((Boolean)var9.CCRIOOOOCRRCHOICOHOCOIRICIIIRC().get()) {
            if (this instanceof EntityPlayer) {
               var7.setReturnValue((Boolean)var9.OCHHOCIIHIRIHCRHHCROOIIHROROHC().get());
            } else {
               var7.setReturnValue((Boolean)var9.HHRHCRRHIRIIIHCOCCRCHHIRCRIIOO().get());
            }
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @ModifyReturnValue(method = "isGlowing$v1_12", at = @At("RETURN"))
   private boolean apollo$modifyGlowValue(boolean var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(GlowModule.class)
            .filter(
               var1x -> ((HICHRCOHCCRHOHCICOOCHOIHCCHIRI)var1x)
                  .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)this
                  )
            )
            .isPresent()
         ? true
         : var1;
   }

   @WrapOperation(method = "onEntityUpdate", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;handleWaterMovement()Z"))
   private boolean lunar$rewindSkipUpdate$water(Entity var1, Operation<Boolean> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> var0.HRCHICHIOHOROOHHHOHROHCICCROIO().RHHIIIHORICCOCHHORHHOCCHCCIICC() / 50L > 20L)
         ? false
         : (Boolean)var2.call(new Object[]{var1});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @Inject(method = "func_145781_i$v1_7", at = @At("HEAD"))
   private void lunar$dataWatcherUpdated$v1_7(int var1, CallbackInfo var2) {
      if (var1 == 10 && this instanceof IRRCCOICORICIHCHRHIHIHROIRHOCR var3) {
         var3.lunar$onNameTagUpdate();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "onDataWatcherUpdate$v1_8", at = @At("HEAD"))
   private void lunar$dataWatcherUpdated$v1_8(int var1, CallbackInfo var2) {
      if (var1 == 2 && this instanceof IRRCCOICORICIHCHRHIHIHROIRHOCR var3) {
         var3.lunar$onNameTagUpdate();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(method = "notifyDataManagerChange$v1_12", at = @At("HEAD"))
   private void lunar$dataWatcherUpdated$v1_12(DataParameter<?> var1, CallbackInfo var2) {
      if (Entity.CUSTOM_NAME$v1_12.equals(var1) && this instanceof IRRCCOICORICIHCHRHIHIHROIRHOCR var3) {
         var3.lunar$onNameTagUpdate();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "getBrightnessForRender$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$getBrightnessForRender$v1_7(float var1, CallbackInfoReturnable<Integer> var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HHCRORCOROHHHRRIICHHROOOCHHIIH();
      if (var3.HHCOCOORCOCOICOOORHCIOOOCRHRIR() || this.lunar$isXrayActive()) {
         var2.setReturnValue(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .OCCCCRRCROIRIHRROHCHCHORCOCICC()
         );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "getBrightnessForRender$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$getBrightnessForRender$v1_12(CallbackInfoReturnable<Integer> var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HHCRORCOROHHHRRIICHHROOOCHHIIH();
      if (var2.HHCOCOORCOCOICOOORHCIOOOCRHRIR() || this.lunar$isXrayActive()) {
         var1.setReturnValue(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
               .OCCCCRRCROIRIHRROHCHCHORCOCICC()
         );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "getBrightness$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$getBrightness$v1_7(float var1, CallbackInfoReturnable<Float> var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HHCRORCOROHHHRRIICHHROOOCHHIIH();
      if (var3.HHCOCOORCOCOICOOORHCIOOOCRHRIR() || this.lunar$isXrayActive()) {
         var2.setReturnValue(this.world.provider.lightBrightnessTable[15]);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "getBrightness$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$getBrightness$v1_12(CallbackInfoReturnable<Float> var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HHCRORCOROHHHRRIICHHROOOCHHIIH();
      if (var2.HHCOCOORCOCOICOOORHCIOOOCRHRIR() || this.lunar$isXrayActive()) {
         var1.setReturnValue(this.world.provider.lightBrightnessTable[15]);
      }
   }

   @Unique
   private boolean lunar$isXrayActive() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOCIIROIRCOHIRHHHROHCOOHIICIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HRCRHCHRCCRIOHCCCOCRCICORHRRCI()
         .RCIICCOHIRICHCOCIIRCHOCOCRRRCR();
      return var1.isEnabled() && var1.CIHCOICOIROIIOHIRHIRHRCHCHOCOR();
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH lunar$getCache() {
      if (this.lunar$cache == null) {
         if (this instanceof EntityPlayer) {
            this.lunar$cache = new CORCOCICIRIOHROHROIIOOHICCHCRR();
         } else {
            this.lunar$cache = new CRRRICCRROCOHHOHIICIHORCOORRRH();
         }
      }

      return this.lunar$cache;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "isGlowing$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$rewind$highlightEntity(CallbackInfoReturnable<Boolean> var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1x -> var1x.RCHHHIICCRCOROCHCCOICIOIIRIHHO().IROCHOOOIORRICOOORROOHOIORIHIH() == this)) {
         var1.setReturnValue(true);
      }
   }
}
