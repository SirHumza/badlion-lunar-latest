package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import javax.vecmath.Matrix4f;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderPlayer_v1_8;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(RenderPlayer_v1_8.class)
public abstract class HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   extends RenderLivingBase<AbstractClientPlayer>
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Unique
   private float lunar$savedPartialTicks;

   @Shadow
   public abstract ModelPlayer getMainModel();

   @Inject(method = "doRender*", at = @At("HEAD"), cancellable = true)
   private void lunar$preRenderPlayerEvent$v1_8(AbstractClientPlayer var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      if (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1,
            var2,
            var4,
            var6,
            var9
         )
         .isCancelled()) {
         var10.cancel();
      } else {
         GlStateManager.enableBlend();
         GlStateManager.blendFunc(770, 771);
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
            .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
            .IRHOCOORCOORCHCIICCOHHHOICHCCR();
         this.lunar$savedPartialTicks = var9;
      }
   }

   @Inject(method = "renderRightArm", at = @At("HEAD"))
   private void lunar$onRenderLeftArm(AbstractClientPlayer var1, CallbackInfo var2) {
      GlStateManager.enableBlend();
      GlStateManager.blendFunc(770, 771);
   }

   public void renderModel(AbstractClientPlayer var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
         .IRHOCOORCOORCHCIICCOHHHOICHCCR();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
         .RICOIROIIOCOHICCHOHOICRHRCROHC();
      Matrix4f var9 = var8.getMatrix();
      var8.CCICHRCORROHIOCIOIRHOICHRRIRHO();
      if (var1.isSneaking()) {
         var8.CRICCOOHHHCHOORCICOCOHIHOIRHOO(0.0F, 0.2F, 0.0F);
      }

      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1,
               var9,
               this.bridge$getMainModel(),
               this.lunar$savedPartialTicks
            )
         );
      var8.ORHHRHCOIOCOHIIHIROCIRCOIRIHHI();
      super.renderModel(var1, var2, var3, var4, var5, var6, var7);
   }

   @Inject(
      method = "renderRightArm",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderPlayer_v1_8;setModelVisibilities(Lnet/minecraft/client/entity/AbstractClientPlayer;)V",
         shift = Shift.AFTER
      )
   )
   private void lunar$disableSleeveRight(AbstractClientPlayer var1, CallbackInfo var2) {
      if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICIIHRIOHCHOOCICICROOHIOIRHOIH()
            .isEnabled()
         && (Boolean)com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICIIHRIOHCHOOCICICROOHIOIRHOIH()
            .ORROHOHCRHCOOHRCRHOHOCOCRHHRHO()
            .get()) {
         ModelPlayer var3 = this.getMainModel();
         var3.bipedRightArmwear.showModel = false;
      }
   }

   @Inject(method = "renderRightArm", at = @At("RETURN"))
   private void lunar$renderRightArm(AbstractClientPlayer var1, CallbackInfo var2) {
      GlStateManager.enableBlend();
      ModelPlayer var3 = this.getMainModel();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
         0.0625F,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var3.bipedRightArm,
         var3.bipedRightArmwear.showModel,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
         var3.smallArms,
         false
      );
      GlStateManager.disableBlend();
   }

   @Inject(
      method = "renderLeftArm",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderPlayer_v1_8;setModelVisibilities(Lnet/minecraft/client/entity/AbstractClientPlayer;)V",
         shift = Shift.AFTER
      )
   )
   private void lunar$disableSleeveLeft(AbstractClientPlayer var1, CallbackInfo var2) {
      if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICIIHRIOHCHOOCICICROOHIOIRHOIH()
            .isEnabled()
         && (Boolean)com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICIIHRIOHCHOOCICICROOHIOIRHOIH()
            .CRORCRHCHICRRORCCORHCCORIORHRH()
            .get()) {
         ModelPlayer var3 = this.getMainModel();
         var3.bipedLeftArmwear.showModel = false;
      }
   }

   @Inject(method = "renderLeftArm", at = @At("RETURN"))
   private void lunar$renderLeftArm(AbstractClientPlayer var1, CallbackInfo var2) {
      GlStateManager.enableBlend();
      ModelPlayer var3 = this.getMainModel();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
         0.0625F,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var3.bipedLeftArm,
         var3.bipedLeftArmwear.showModel,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
         var3.smallArms,
         true
      );
      GlStateManager.disableBlend();
   }

   @WrapOperation(
      method = "doRender(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;isUser$v1_8()Z")
   )
   private boolean lunar$rewindRenderPlayer(AbstractClientPlayer var1, Operation<Boolean> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
               var0 -> var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHHCCIOICIIRRIRCHROOCCHRIHOROC()
                  || !var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer()
            )
         ? false
         : (Boolean)var2.call(new Object[]{var1});
   }
}
