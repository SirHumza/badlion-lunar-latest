package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.lunarclient.apollo.module.coloredfire.ColoredFireModule;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.function.Function;
import net.minecraft.client.renderer.entity.Render_v1_8;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(Render_v1_8.class)
public class CORCOCICIRIOHROHROIIOOHICCHCRR {
   @Unique
   private static float apollo$extractColor(float var0, Function<Integer, Float> var1, Entity var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ColoredFireModule.class)
         .map(
            var1x -> var2 != null
               ? ((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var1x)
                  .CRRRICCRROCOHHOHIICIHORCOORRRH(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var2
                  )
               : -1
         )
         .filter(var0x -> var0x != 1)
         .<Float>map(var1)
         .orElse(var0);
   }

   @Inject(method = "renderEntityOnFire", at = @At("HEAD"), cancellable = true)
   private void apollo$renderEntityOnFire(
      Entity var1, double var2, double var4, double var6, float var8, CallbackInfo var9, @Share("entity") LocalRef<Entity> var10
   ) {
      var10.set(var1);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
         .RCIRCCRRHOOIOOROCOHCORHHRIRORH()) {
         var9.cancel();
      }
   }

   @ModifyConstant(method = "renderEntityOnFire", constant = @Constant(floatValue = 1.0F, ordinal = 1))
   private float apollo$renderEntityOnFire$red(float var1, @Share("entity") LocalRef<Entity> var2) {
      return apollo$extractColor(var1, com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI::RCHRHOCCORRRCRORCHIIRRIIIRRCRR, (Entity)var2.get());
   }

   @ModifyConstant(method = "renderEntityOnFire", constant = @Constant(floatValue = 1.0F, ordinal = 2))
   private float apollo$renderEntityOnFire$green(float var1, @Share("entity") LocalRef<Entity> var2) {
      return apollo$extractColor(var1, com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI::HOHHRHCIOCRCHCOOOHORROICORCCCC, (Entity)var2.get());
   }

   @ModifyConstant(method = "renderEntityOnFire", constant = @Constant(floatValue = 1.0F, ordinal = 3))
   private float apollo$renderEntityOnFire$blue(float var1, @Share("entity") LocalRef<Entity> var2) {
      return apollo$extractColor(var1, com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI::RICIORHICRROHOCHRRCRIHCROOCIIC, (Entity)var2.get());
   }

   @Inject(method = "renderEntityOnFire", at = @At("TAIL"))
   private void apollo$renderEntityOnFire$tail(
      Entity var1, double var2, double var4, double var6, float var8, CallbackInfo var9, @Share("entity") LocalRef<Entity> var10
   ) {
      var10.set(null);
   }

   @Redirect(
      method = "doRenderShadowAndFire",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/Render_v1_8;renderShadow(Lnet/minecraft/entity/Entity;DDDFF)V")
   )
   public void lunar$doRenderShadowAndFire(Render_v1_8<?> var1, Entity var2, double var3, double var5, double var7, float var9, float var10) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
            .IIRIRHOOCOCCOOIRCRCCIHCOOCCOIC()
         && var1.getWorldFromRenderManager() != null) {
         var1.renderShadow(var2, var3, var5, var7, var9, var10);
      }
   }

   @Inject(method = "renderLivingLabel", at = @At("HEAD"), cancellable = true)
   private void lunar$rewindRenderNametags(Entity var1, String var2, double var3, double var5, double var7, int var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var11.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR var12 = var11.HOROHROIORRIRIIIOOCCIROCRCROHI()
            .IROIIOOCICHRIHCIOHCRCCCRICHIHC();
         if ((Boolean)var12.CCRIOOOOCRRCHOICOHOCOIRICIIIRC().get() && !(Boolean)var12.OHOCRIICRIICIHRHCCCCIOROHICHIR().get()) {
            var10.cancel();
         }
      }
   }
}
