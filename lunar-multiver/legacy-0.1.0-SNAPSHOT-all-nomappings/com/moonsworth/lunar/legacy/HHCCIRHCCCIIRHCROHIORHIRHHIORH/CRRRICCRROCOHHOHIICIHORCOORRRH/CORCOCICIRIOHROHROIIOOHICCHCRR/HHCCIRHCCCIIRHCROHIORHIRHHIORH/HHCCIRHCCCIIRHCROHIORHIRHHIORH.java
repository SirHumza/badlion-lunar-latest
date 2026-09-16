package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.sugar.Local;
import com.lunarclient.apollo.module.limb.ArmorPiece;
import com.lunarclient.apollo.module.limb.LimbModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import lombok.Generated;
import mchorse.emoticons.capabilities.cosmetic.EmoteController;
import mchorse.emoticons.skin_n_bones.api.animation.AnimationMesh;
import mchorse.emoticons.skin_n_bones.api.bobj.BOBJArmature;
import mchorse.emoticons.skin_n_bones.api.bobj.BOBJBone;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderPlayer_v1_7;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(RenderPlayer_v1_7.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH> {
   @Shadow
   public ModelBiped modelBipedMain;
   @Shadow
   public ModelBiped modelArmorChestplate;
   @Shadow
   public ModelBiped modelArmor;
   private List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH>> layers = new ArrayList<>();
   @Unique
   private final ItemStack lunar$dummyItemStack = new ItemStack(Items.DIAMOND_SWORD);

   @Inject(method = "shouldRenderPass(Lnet/minecraft/client/entity/AbstractClientPlayer;IF)I", at = @At("HEAD"), cancellable = true)
   private void lunar$shouldRenderPass(AbstractClientPlayer var1, int var2, float var3, CallbackInfoReturnable<Integer> var4) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(LimbModule.class)
         .ifPresent(var3x -> {
            IHHCHHHCRIHOOCOIOOCRIIICIOROIR var4x = (IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var3x;
            Set var5x = (Set)var4x.ICOHIOIHHOIOHIOIICHICIRHOORCOI().get(var1.getUniqueID());
            if (var5x != null) {
               if (var2 == 0 && var5x.contains(ArmorPiece.HELMET)) {
                  var4.setReturnValue(-1);
               } else if (var2 == 1 && var5x.contains(ArmorPiece.CHESTPLATE)) {
                  var4.setReturnValue(-1);
               } else if (var2 == 2 && var5x.contains(ArmorPiece.LEGGINGS)) {
                  var4.setReturnValue(-1);
               } else if (var2 == 3 && var5x.contains(ArmorPiece.BOOTS)) {
                  var4.setReturnValue(-1);
               }
            }
         });
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
      if (var2 == 0 && var5.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6)) {
         var4.setReturnValue(-1);
      } else if (var2 == 1 && var5.CRRRICCRROCOHHOHIICIHORCOORRRH(var6)) {
         var4.setReturnValue(-1);
      } else if (var2 == 2 && var5.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var6)) {
         var4.setReturnValue(-1);
      } else if (var2 == 3 && var5.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var6)) {
         var4.setReturnValue(-1);
      }
   }

   @ModifyExpressionValue(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/InventoryPlayer;armorItemInSlot(I)Lnet/minecraft/item/ItemStack;")
   )
   private ItemStack lunar$getItemOnHead(ItemStack var1, @Local(argsOnly = true) AbstractClientPlayer var2) {
      Optional var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(LimbModule.class);
      if (var3.isPresent()) {
         Collection var4 = (Collection)((IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var3.get()).ICOHIOIHHOIOHIOIICHICIRHOORCOI().get(var2.getUniqueID());
         if (var4 != null && var4.contains(ArmorPiece.HELMET)) {
            return this.lunar$dummyItemStack;
         }
      }

      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
            .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2
            )
         ? this.lunar$dummyItemStack
         : var1;
   }

   @Redirect(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/entity/RenderPlayer_v1_7;bindTexture(Lnet/minecraft/util/ResourceLocation;)V")
   )
   private void lunar$bindTexture(RenderPlayer_v1_7 var1, ResourceLocation var2) {
      if (var2 != null) {
         var1.bindTexture(var2);
      }
   }

   @Redirect(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;getLocationCape()Lnet/minecraft/util/ResourceLocation;")
   )
   @Nullable
   private ResourceLocation lunar$getLocationCape(AbstractClientPlayer var1) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .IIHRRHORCRCROCHHOHORCHCROCIHRO(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var1
         )) {
         return var1.getLocationCape();
      } else {
         Optional var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HCCICHCRRIICICCHCIRCRRIIRROHHC()
            .RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(var1.getUniqueID())
            .map(
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO::OOICHRIOOOOIOHOIHOIRIRROCHRIOO
            );
         if (var2.isPresent()
            && com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK.canShowCosmetic()
            )
          {
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HCCICHCRRIICICCHCIRCRRIIRROHHC();
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
   }

   @Redirect(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;hasCape$v1_7()Z")
   )
   private boolean lunar$hasCape(AbstractClientPlayer var1) {
      boolean var2 = false;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .IIHRRHORCRCROCHHOHORCHCROCIHRO(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var1
         )) {
         Optional var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HCCICHCRRIICICCHCIRCRRIIRROHHC()
            .RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(var1.getUniqueID())
            .map(
               com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO::OOICHRIOOOOIOHOIHOIRIRROCHRIOO
            );
         var2 = var3.isPresent()
            && com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK.canShowCosmetic();
      }

      List var4 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HCCICHCRRIICICCHCIRCRRIIRROHHC()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1.getUniqueID(),
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.BACKPACK
         );
      return var4.isEmpty() && (var1.hasCape$v1_7() || var2);
   }

   @Redirect(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;getHideCape()Z")
   )
   public boolean lunar$getHideCape(AbstractClientPlayer var1) {
      Optional var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HCCICHCRRIICICCHCIRCRRIIRROHHC()
         .RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(var1.getUniqueID())
         .map(
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO::OOICHRIOOOOIOHOIHOIRIRROCHRIOO
         );
      return var2.isPresent()
            && com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK.canShowCosmetic()
         ? false
         : var1.getHideCape$v1_7();
   }

   @WrapWithCondition(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/model/ModelBiped;renderCloak$v1_7(F)V")
   )
   private boolean lunar$renderCloak(ModelBiped var1, float var2, AbstractClientPlayer var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .IIHRRHORCRCROCHHOHORCHCROCIHRO(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var3
            )
         && com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK.canShowCosmetic()) {
         com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HCCICHCRRIICICCHCIRCRRIIRROHHC();
         com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3)
               .bridge$getUniqueID(),
            com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CLOAK
         );
         if (var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5)) {
            return false;
         }

         if (((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3)
               .bridge$isDummyMannequin()
            && var5 == null) {
            return false;
         }

         this.lunar$renderCloak(var3, var2);
         if (var5 != null && var5.OOICHRIOOOOIOHOIHOIRIRROCHRIOO().IHRCCICOCCIIRCRCIIHCHIHHHHORCC()) {
            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCHIHCHICORHHHIHRHCRCICCROHORR()
               .CCOOIHRHHRROHCIORHIRRHHHORHOOH()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
                  var5.OOICHRIOOOOIOHOIHOIRIRROCHRIOO(),
                  () -> this.lunar$renderCloak(var3, var2)
               );
         }

         return false;
      } else {
         return true;
      }
   }

   @Unique
   private void lunar$renderCloak(AbstractClientPlayer var1, float var2) {
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3 = (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.lunar$getLocationCape(var1);
      if (var3 != null) {
         if (var1 != null
            && ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1)
               .bridge$isDummySelf()
            && com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.IOOOOCCCORIHCIOIHOIHIRCOHHCHRR
            )
          {
            var3 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.OIOHHCCRROIHHRROICHRCORIIICCCC;
         }

         com.moonsworth.lunar.client.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
            null,
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().OOCCRCRCOHIIORCCORCRCIRRROIOOR(var3),
            var3,
            () -> this.modelBipedMain.renderCloak$v1_7(var2)
         );
      }
   }

   @Redirect(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;isSneaking()Z")
   )
   private boolean lunar$isSneaking(AbstractClientPlayer var1) {
      return var1.isSneaking()
         && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
            .RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1
            );
   }

   @Inject(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glPushMatrix()V", ordinal = 2, shift = Shift.AFTER),
      cancellable = true
   )
   private void lunar$setupEmoteTransform(AbstractClientPlayer var1, float var2, CallbackInfo var3) {
      EmoteController var4 = (EmoteController)EmoteController.get(
         (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH)var1
      );
      if (var4 != null && var4.isEmoting()) {
         if (!var4.shouldRenderCape()) {
            var3.cancel();
            GL11.glPopMatrix();
         } else {
            BOBJArmature var5 = ((AnimationMesh)var4.animator.animation.meshes.get(0)).armature;
            var4.animator.setupMatrix((BOBJBone)var5.bones.get("low_body"));
            GL11.glTranslatef(0.0F, 0.375F, 0.0F);
            GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         }
      }
   }

   @Inject(method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V", at = @At("RETURN"))
   private void lunar$renderHat(AbstractClientPlayer var1, float var2, CallbackInfo var3) {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var4 = OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
      float var5 = var1.prevRotationYawHead + (var1.rotationYawHead - var1.prevRotationYawHead) * var2;
      float var6 = var1.prevRotationPitch + (var1.rotationPitch - var1.prevRotationPitch) * var2;
      float var7 = 0.0625F;

      for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 : this.getLayers()) {
         if (var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)var1
         )) {
            GL11.glPushMatrix();
            boolean var10 = var4.IRIOOHCHIHIHRCOOHOCHOOOCIIICIO();
            boolean var11 = var4.RRROIHOIHOORCCOHOOCHRRRCIIRHHH();
            var4.OIIHIOIORRHHRCRRCCORRHHCHRHORH();
            var4.OIOIICCHICHHHCRROHIHIOICHROOCR();
            var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var4,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.modelBipedMain,
               0.0F,
               0.0F,
               var2,
               var1.getAge$v1_7(),
               var5,
               var6,
               var7
            );
            GL11.glPopMatrix();
            if (!var10) {
               var4.HORHCHIRIOIOOCOHOIRIRICICHIORH();
            }

            if (!var11) {
               var4.ROORHICROORIRHCCOOHORCCICRIORO();
            }
         }
      }
   }

   @Inject(method = "doRender(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDFF)V", at = @At("TAIL"))
   private void lunar$onSetModelVisibilities(CallbackInfo var1) {
      this.modelArmorChestplate.isRiding = this.modelArmor.isRiding = this.modelBipedMain.isRiding = false;
   }

   @Inject(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;hasCape$v1_7()Z")
   )
   private void lunar$onModelBipedRenderPost(AbstractClientPlayer var1, float var2, CallbackInfo var3) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.modelBipedMain,
               var2
            )
         );
   }

   @Redirect(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/InventoryPlayer;armorItemInSlot(I)Lnet/minecraft/item/ItemStack;")
   )
   private ItemStack lunar$helmet(InventoryPlayer var1, int var2) {
      ItemStack var3 = var1.armorItemInSlot(var2);
      if (var3 == null) {
         return null;
      } else {
         return var3.getItem() == Items.SKULL
               && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                  .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
                  .RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1.player
                  )
            ? null
            : var3;
      }
   }

   @Redirect(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/InventoryPlayer;getCurrentItem()Lnet/minecraft/item/ItemStack;")
   )
   private ItemStack lunar$getCurrentItem(InventoryPlayer var1) {
      return var1.player != null
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .COOCRCHRIOOCHCIHCIOCHHIOOIRHIC()
               .RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1.player
               )
         ? null
         : var1.getCurrentItem();
   }

   public void bridge$addLayer(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (!this.layers.contains(var1)) {
         this.layers.add(var1);
      }
   }

   public void bridge$addLayer(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH> var1,
      boolean var2
   ) {
      if (!this.layers.contains(var1)) {
         this.layers.add(var1);
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getLayerCape() {
      throw new UnsupportedOperationException();
   }

   @Inject(method = "<init>", at = @At("TAIL"))
   public void copyLayers(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.IRHCOOHHRHIRCRHHROCRHCHIOIROHH()
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getEntityRenderDispatcher() != null) {
         this.layers = ((HHCCIRHCCCIIRHCROHIORHIRHHIORH)IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getEntityRenderDispatcher()
               .bridge$defaultPlayerRenderer())
            .layers;
      }
   }

   @Inject(
      method = "renderEquippedItems(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ItemRenderer;renderItem$v1_7(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;I)V",
         shift = Shift.AFTER
      )
   )
   private void lunar$resetColorTintAfterItemRendering(AbstractClientPlayer var1, float var2, CallbackInfo var3) {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
   }

   @Generated
   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH>> getLayers() {
      return this.layers;
   }
}
