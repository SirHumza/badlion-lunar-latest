package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer_v1_8;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(RenderPlayer_v1_8.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public abstract ModelPlayer getMainModel();

   @Inject(
      method = "renderRightArm",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderPlayer_v1_8;setModelVisibilities(Lnet/minecraft/client/entity/AbstractClientPlayer;)V",
         shift = Shift.AFTER
      )
   )
   private void lunar$disableSleeveRight(AbstractClientPlayer var1, CallbackInfo var2) {
      if (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICIIHRIOHCHOOCICICROOHIOIRHOIH().isEnabled()
         && (Boolean)RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICIIHRIOHCHOOCICICROOHIOIRHOIH().ORROHOHCRHCOOHRCRHOHOCOCRHHRHO().get()) {
         ModelPlayer var3 = this.getMainModel();
         var3.bipedRightArmwear.showModel = false;
      }
   }

   @Inject(method = "renderRightArm", at = @At("RETURN"))
   private void impl$renderRightArm(AbstractClientPlayer var1, CallbackInfo var2) {
      GlStateManager.enableBlend();
      ModelPlayer var3 = this.getMainModel();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
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
      if (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICIIHRIOHCHOOCICICROOHIOIRHOIH().isEnabled()
         && (Boolean)RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICIIHRIOHCHOOCICICROOHIOIRHOIH().CRORCRHCHICRRORCCORHCCORIORHRH().get()) {
         ModelPlayer var3 = this.getMainModel();
         var3.bipedLeftArmwear.showModel = false;
      }
   }

   @Inject(method = "renderLeftArm", at = @At("RETURN"))
   private void impl$renderLeftArm(AbstractClientPlayer var1, CallbackInfo var2) {
      GlStateManager.enableBlend();
      ModelPlayer var3 = this.getMainModel();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
         0.0625F,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var3.bipedLeftArm,
         var3.bipedLeftArmwear.showModel,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
         var3.smallArms,
         true
      );
      GlStateManager.disableBlend();
   }
}
