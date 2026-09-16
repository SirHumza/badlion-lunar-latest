package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.lunarclient.apollo.module.limb.BodyPart;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ModelBiped.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends ModelBase
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public ModelRenderer bipedHead;
   @Shadow
   public ModelRenderer bipedBody;
   @Shadow
   public ModelRenderer bipedRightArm;
   @Shadow
   public ModelRenderer bipedLeftArm;
   @Shadow
   public ModelRenderer bipedRightLeg;
   @Shadow
   public ModelRenderer bipedLeftLeg;
   @Shadow
   public ModelRenderer bipedHeadwear;
   @Shadow
   public boolean isSneak;

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$bipedHead() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)this.bipedHead;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$bipedHeadwear() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)this.bipedHeadwear;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$bipedBody() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)this.bipedBody;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$bipedRightArm() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)this.bipedRightArm;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$bipedLeftArm() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)this.bipedLeftArm;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$bipedRightLeg() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)this.bipedRightLeg;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$bipedLeftLeg() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)this.bipedLeftLeg;
   }

   public void bridge$setSneak(boolean var1) {
      this.isSneak = var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "render",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/model/ModelBiped;setRotationAngles(FFFFFFLnet/minecraft/entity/Entity;)V",
         shift = Shift.AFTER,
         ordinal = 0
      )
   )
   private void lunar$onModelBipedRenderPre(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7, CallbackInfo var8) {
      this.lunar$renderModelPre(var1, var7);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "render",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", shift = Shift.AFTER, ordinal = 0)
   )
   private void lunar$onModelBipedRender(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7, CallbackInfo var8) {
      this.lunar$renderModelPre(var1, var7);
   }

   @Unique
   private void lunar$renderModelPre(Entity var1, float var2) {
      if (var1 instanceof AbstractClientPlayer
         && this instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3
         && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 0 || var3.bridge$isMainModel())) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
                  this,
                  var2
               )
            );
         if (var5 != null) {
            this.lunar$handleBodyPartVisibility(this, var5);
         }
      }
   }

   @Unique
   private void lunar$handleBodyPartVisibility(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      this.lunar$evalBone(var1.bridge$bipedHead(), BodyPart.HEAD, var2, false);
      this.lunar$evalBone(var1.bridge$bipedBody(), BodyPart.TORSO, var2, false);
      this.lunar$evalBone(var1.bridge$bipedRightArm(), BodyPart.RIGHT_ARM, var2, false);
      this.lunar$evalBone(var1.bridge$bipedLeftArm(), BodyPart.LEFT_ARM, var2, false);
      this.lunar$evalBone(var1.bridge$bipedRightLeg(), BodyPart.RIGHT_LEG, var2, false);
      this.lunar$evalBone(var1.bridge$bipedLeftLeg(), BodyPart.LEFT_LEG, var2, false);
      this.lunar$evalBone(var1.bridge$bipedHeadwear(), BodyPart.HEAD, var2, false);
      if (var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3
         )
       {
         this.lunar$evalBone(var3.bridge$jacket(), BodyPart.TORSO, var2, true);
         this.lunar$evalBone(var3.bridge$rightSleeve(), BodyPart.RIGHT_ARM, var2, true);
         this.lunar$evalBone(var3.bridge$leftSleeve(), BodyPart.LEFT_ARM, var2, true);
         this.lunar$evalBone(var3.bridge$rightPants(), BodyPart.RIGHT_LEG, var2, true);
         this.lunar$evalBone(var3.bridge$leftPants(), BodyPart.LEFT_LEG, var2, true);
      }
   }

   @Unique
   private void lunar$evalBone(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      BodyPart var2,
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3,
      boolean var4
   ) {
      boolean var5 = var3.CRIRROHICRHRROCIHOHRCICCRCORHO().contains(var2) || var4 && var3.ROCICROOOORCIRIIRRCICIHRHIORHH().contains(var2);
      if (var1 != null && var5) {
         var1.bridge$setVisible(false);
      }
   }
}
