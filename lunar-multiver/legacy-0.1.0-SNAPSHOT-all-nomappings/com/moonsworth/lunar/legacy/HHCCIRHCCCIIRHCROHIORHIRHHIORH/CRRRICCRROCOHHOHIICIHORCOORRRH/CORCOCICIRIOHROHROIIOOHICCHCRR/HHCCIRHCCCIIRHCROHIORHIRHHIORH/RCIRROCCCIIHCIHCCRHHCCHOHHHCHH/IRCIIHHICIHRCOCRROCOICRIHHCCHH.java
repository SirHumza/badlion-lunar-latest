package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.Optional;
import mchorse.emoticons.capabilities.cosmetic.EmoteController;
import mchorse.emoticons.skin_n_bones.api.animation.AnimationMesh;
import mchorse.emoticons.skin_n_bones.api.bobj.BOBJArmature;
import mchorse.emoticons.skin_n_bones.api.bobj.BOBJBone;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderPlayer_v1_8;
import net.minecraft.client.renderer.entity.layers.LayerCape;
import net.minecraft.entity.player.EnumPlayerModelParts;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(LayerCape.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Final
   @Shadow
   public RenderPlayer_v1_8 playerRenderer;

   @Shadow
   public abstract void doRenderLayer(AbstractClientPlayer var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8);

   @Inject(
      method = "doRenderLayer",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", shift = Shift.AFTER),
      cancellable = true
   )
   public void lunar$doRenderLayer$pushMatrix(
      AbstractClientPlayer var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, CallbackInfo var9
   ) {
      EmoteController var10 = (EmoteController)EmoteController.get((CRRRICCRROCOHHOHIICIHORCOORRRH)var1);
      if (var10 != null && var10.isEmoting()) {
         if (!var10.shouldRenderCape()) {
            var9.cancel();
            GlStateManager.popMatrix();
         } else {
            BOBJArmature var11 = ((AnimationMesh)var10.animator.animation.meshes.get(0)).armature;
            var10.animator.setupMatrix((BOBJBone)var11.bones.get("low_body"));
            GlStateManager.translate(0.0, 0.375, 0.0);
            GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
         }
      }
   }

   @Redirect(
      method = "doRenderLayer",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/RenderPlayer_v1_8;bindTexture(Lnet/minecraft/util/ResourceLocation;)V")
   )
   private void lunar$bindTexture(RenderPlayer_v1_8 var1, ResourceLocation var2) {
      if (var2 != null) {
         var1.bindTexture(var2);
      }
   }

   @WrapWithCondition(method = "doRenderLayer", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/ModelPlayer;renderCape(F)V"))
   private boolean lunar$doRenderLayer(ModelPlayer var1, float var2, AbstractClientPlayer var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .IIHRRHORCRCROCHHOHORCHCROCIHRO((HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var3)
         && com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK.canShowCosmetic()) {
         CORCOCICIRIOHROHROIIOOHICCHCRR var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HCCICHCRRIICICCHCIRCRRIIRROHHC();
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3)
               .bridge$getUniqueID(),
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK
         );
         if (var5 != null && var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5)) {
            return false;
         }

         if (((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3)
               .bridge$isDummyMannequin()
            && var5 == null) {
            return false;
         }

         ResourceLocation var6 = this.lunar$getLocationCape(var3);
         IRRCCOICORICIHCHRHIHIHROIRHOCR var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getTextureManager()
            .OOCCRCRCOHIIORCCORCRCIRRROIOOR((RCIROOOOICRHCCRRCIORHHIRCOIIIC)var6);
         List var8 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HCCICHCRRIICICCHCIRCRRIIRROHHC()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var3.getUniqueID(),
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.BACKPACK
            );
         if (!var8.isEmpty()) {
            return false;
         }

         this.lunar$doRenderCloak(var3, var7, var6);
         if (var5 != null && var5.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().IHRCCICOCCIIRCRCIIHCHIHHHHORCC()) {
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCHIHCHICORHHHIHRHCRCICCROHORR()
               .CCOOIHRHHRROHCIORHIRRHHHORHOOH()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
                  var5.OOICHRIOOOOIOHOIHOIRIRROCHRIOO(),
                  () -> this.lunar$doRenderCloak(var3, var7, var6)
               );
         }

         return false;
      } else {
         return true;
      }
   }

   @Unique
   private void lunar$doRenderCloak(AbstractClientPlayer var1, IRRCCOICORICIHCHRHIHIHROIRHOCR var2, ResourceLocation var3) {
      if (var1 != null
         && ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1)
            .bridge$isDummySelf()
         && com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.IOOOOCCCORIHCIOIHOIHIRCOHHCHRR
         )
       {
         var3 = (ResourceLocation & RCIROOOOICRHCCRRCIORHHIRCOIIIC)CORCOCICIRIOHROHROIIOOHICCHCRR.OIOHHCCRROIHHRROICHRCORIIICCCC;
      }

      com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
         null,
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
         var2,
         (RCIROOOOICRHCCRRCIORHHIRCOIIIC)var3,
         () -> this.playerRenderer.getMainModel().renderCape(0.0625F)
      );
   }

   @Redirect(method = "doRenderLayer", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;isSneaking()Z"))
   private boolean lunar$isSneaking(AbstractClientPlayer var1) {
      return var1.isSneaking()
         && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
            .RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1
            );
   }

   @Redirect(
      method = "doRenderLayer",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;getLocationCape()Lnet/minecraft/util/ResourceLocation;")
   )
   @Nullable
   private ResourceLocation lunar$getLocationCape(AbstractClientPlayer var1) {
      Optional var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HCCICHCRRIICICCHCIRCRRIIRROHHC()
         .RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(var1.getUniqueID())
         .map(RRCRRCORICCHOHHIRCHIROOHIIOHCO::OOICHRIOOOOIOHOIHOIRIRROCHRIOO);
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .IIHRRHORCRCROCHHOHORCHCROCIHRO((HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var1)) {
         return var1.getLocationCape();
      } else if (var2.isPresent()
         && com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK.canShowCosmetic()) {
         CORCOCICIRIOHROHROIIOOHICCHCRR var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HCCICHCRRIICICCHCIRCRRIIRROHHC();
         return var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get(),
                  var1.getUniqueID()
               )
               .isEmpty()
            ? null
            : (ResourceLocation)((com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get())
               .IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1
               );
      } else {
         return var1.getLocationCape();
      }
   }

   @Redirect(
      method = "doRenderLayer",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/entity/AbstractClientPlayer;isWearing$v1_8(Lnet/minecraft/entity/player/EnumPlayerModelParts;)Z"
      )
   )
   private boolean lunar$isWearing(AbstractClientPlayer var1, EnumPlayerModelParts var2) {
      if (var2 == EnumPlayerModelParts.CAPE) {
         Optional var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HCCICHCRRIICICCHCIRCRRIIRROHHC()
            .RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(var1.getUniqueID())
            .map(RRCRRCORICCHOHHIRCHIROOHIIOHCO::OOICHRIOOOOIOHOIHOIRIRROCHRIOO);
         return var3.isPresent()
               && com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK
                  .canShowCosmetic()
            ? true
            : var1.isWearing$v1_8(var2);
      } else {
         return var1.isWearing$v1_8(var2);
      }
   }

   public void bridge$render(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      this.doRenderLayer((AbstractClientPlayer)var1, var2, var3, var4, var5, var6, var7, var8);
   }
}
