package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHCRORHRORIICHRHRCHRRIRRHHOCOO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemRenderer.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Final
   @Shadow
   public Minecraft mc;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Shadow
   public ItemStack itemToRender$v1_7;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Shadow
   public float equippedProgress$v1_7;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Shadow
   public float prevEquippedProgressMainHand;
   @Shadow
   public int equippedItemSlot$v1_7;
   @Shadow
   public ItemStack itemStackMainHand$v1_12;
   @Shadow
   public ItemStack itemStackOffHand$v1_12;
   @Unique
   private int lunar$previousSlot;
   @Unique
   private Item lunar$previousItem;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Shadow
   public abstract void renderItem$v1_8(EntityLivingBase var1, ItemStack var2, TransformType var3);

   @Shadow
   public abstract void transformFirstPerson$v1_12(EnumHandSide var1, float var2);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "renderItemInFirstPerson",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glRotatef(FFFF)V", shift = Shift.BEFORE, ordinal = 2),
      cancellable = true
   )
   public void lunar$renderItemInFirstPerson$rotateYaw(float var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CHICCHHHRCRROORCRCCCRHOICIOROC();
      EntityClientPlayerMP var4 = Minecraft.getMinecraft().thePlayer$v1_7;
      if (var3.isActive()
         && var3.IOIRRCCIHCRHHIRIICHHIHHHROROOC().get()
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FIRST
         )
       {
         float var5 = var3.isActive() ? var4.rotationYaw - var3.HRHOIRCHICHROHIHORRCRIRHOCRRRH() : 0.0F;
         float var6 = var4.prevRenderArmYaw + (var4.renderArmYaw - var4.prevRenderArmYaw) * var1 + var5 * 10.0F;
         GL11.glRotatef((var4.rotationYaw - var6) * 0.1F, 0.0F, 1.0F, 0.0F);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "rotateWithPlayerRotations$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;rotate(FFFF)V", shift = Shift.BEFORE, ordinal = 1),
      cancellable = true
   )
   public void lunar$rotateWithPlayerRotations$rotateYaw(EntityPlayerSP var1, float var2, CallbackInfo var3) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CHICCHHHRCRROORCRCCCRHOICIOROC();
      if (var4.isActive()
         && var4.IOIRRCCIHCRHHIRIICHHIHHHROROOC().get()
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FIRST
         )
       {
         float var5 = var4.isActive() ? var1.rotationYaw - var4.HRHOIRCHICHROHIHORRCRIRHOCRRRH() : 0.0F;
         float var6 = var1.prevRenderArmYaw + (var1.renderArmYaw - var1.prevRenderArmYaw) * var2 + var5 * 10.0F;
         GlStateManager.rotate((var1.rotationYaw - var6) * 0.1F, 0.0F, 1.0F, 0.0F);
         var3.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "rotateArm$v1_12(F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;rotate(FFFF)V", shift = Shift.BEFORE, ordinal = 1),
      cancellable = true
   )
   public void lunar$rotateWithPlayerRotations$rotateYaw(float var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CHICCHHHRCRROORCRCCCRHOICIOROC();
      EntityPlayerSP var4 = this.mc.player$v1_8;
      if (var3.isActive()
         && var3.IOIRRCCIHCRHHIRIICHHIHHHROROOC().get()
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.FIRST
         )
       {
         float var5 = var3.isActive() ? var4.rotationYaw - var3.HRHOIRCHICHROHIHORRCRIRHOCRRRH() : 0.0F;
         float var6 = var4.prevRenderArmYaw + (var4.renderArmYaw - var4.prevRenderArmYaw) * var1 + var5 * 10.0F;
         GlStateManager.rotate((var4.rotationYaw - var6) * 0.1F, 0.0F, 1.0F, 0.0F);
         var2.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "renderFireInFirstPerson$v1_7", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glTranslatef(FFF)V"))
   public void lunar$renderFire_v1_7(float var1, float var2, float var3) {
      GL11.glTranslatef(
         var1,
         var2
            * (
               2.0F
                  - IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                     .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
                     .RIROHROOOIRICCCIORCORRHHRCOHII()
            ),
         var3
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(
      method = {"renderFireInFirstPerson$v1_7", "renderFireInFirstPerson$v1_12"},
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V")
   )
   public void lunar$renderFire_v1_8(float var1, float var2, float var3) {
      GlStateManager.translate(
         var1,
         var2
            * (
               2.0F
                  - IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                     .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
                     .RIROHROOOIRICCCIORCORRHHRCOHII()
            ),
         var3
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "renderItemInFirstPerson(F)V",
      cancellable = true,
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", shift = Shift.AFTER)
   )
   private void lunar$onRenderItemInFirstPerson(float var1, CallbackInfo var2) {
      if (this.itemToRender$v1_7 != null) {
         IOIICIRIICICIIOORHCIIIIRRIHRHI var3 = (IOIICIRIICICIIOORHCIIIIRRIHRHI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               IOIICIRIICICIIOORHCIIIIRRIHRHI.class,
               () -> new IOIICIRIICICIIOORHCIIIIRRIHRHI(
                  var1,
                  this.prevEquippedProgressMainHand + (this.equippedProgress$v1_7 - this.prevEquippedProgressMainHand) * var1,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.itemToRender$v1_7,
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
                  () -> this.renderItem$v1_8(this.mc.player$v1_8, this.itemToRender$v1_7, TransformType.NONE),
                  () -> this.renderItem$v1_8(this.mc.player$v1_8, this.itemToRender$v1_7, TransformType.FIRST_PERSON$v1_8)
               )
            );
         if (var3 != null && var3.isCancelled()) {
            var2.cancel();
            GlStateManager.popMatrix();
            GlStateManager.disableRescaleNormal();
            RenderHelper.disableStandardItemLighting();
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @Inject(
      method = "renderItemInFirstPerson(F)V",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glPopMatrix()V", shift = Shift.AFTER, ordinal = 0)
   )
   private void lunar$onRenderFirstPerson$v1_7(CallbackInfo var1) {
      if (this.itemToRender$v1_7 != null) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH(),
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BEFORE_TRANSFORMS,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.itemToRender$v1_7,
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FIRST_PERSON_RIGHT_HAND,
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
               )
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @WrapOperation(
      method = "renderItemInFirstPerson(F)V",
      at = {
            @At(
               value = "INVOKE",
               target = "Lnet/minecraft/client/renderer/ItemRenderer;renderItem(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;I)V"
            ),
            @At(
               value = "INVOKE",
               target = "Lnet/optifine/v1_7/ItemRendererOF;renderItem(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;I)V"
            )
      }
   )
   private void lunar$onRenderFirstPersonPost$v1_7(ItemRenderer var1, EntityLivingBase var2, ItemStack var3, int var4, Operation<Void> var5) {
      if (var4 == 0 && this.itemToRender$v1_7 != null) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH(),
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.AFTER_TRANSFORMS,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.itemToRender$v1_7,
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FIRST_PERSON_RIGHT_HAND,
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
               )
            );
      }

      var5.call(new Object[]{var1, var2, var3, var4});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "renderItemInFirstPerson(F)V", at = @At("HEAD"))
   private void lunar$onRenderFirstPerson$v1_8(CallbackInfo var1) {
      if (this.itemToRender$v1_7 != null) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH(),
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BEFORE_TRANSFORMS,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.itemToRender$v1_7,
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FIRST_PERSON_RIGHT_HAND,
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
               )
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(
      method = "renderItemInFirstPerson$v1_12",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ItemRenderer;transformSideFirstPerson$v1_12(Lnet/minecraft/util/EnumHandSide;F)V",
         shift = Shift.AFTER
      ),
      slice = @Slice(
         from = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getItemUseAction()Lnet/minecraft/item/EnumAction;"),
         to = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getMaxItemUseDuration()I")
      )
   )
   private void lunar$blockAnimationHook(
      AbstractClientPlayer var1, float var2, float var3, EnumHand var4, float var5, ItemStack var6, float var7, CallbackInfo var8
   ) {
      if (var4 == EnumHand.MAIN_HAND
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .ICORHOCRRIRHRIOHCCHIIOHHICCCCC()
            .HCOOOIHICRORRRHOHHROHIHCORRIOH()
            .CRRRICCRROCOHHOHIICIHORCOORRRH(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var6, false
            )) {
         this.transformFirstPerson$v1_12(this.mc.gameSettings.mainHand$v1_12, var5);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @WrapOperation(
      method = "renderItemInFirstPerson(F)V",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ItemRenderer;renderItemInFirstPerson$v1_12(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V"
      )
   )
   private void lunar$onRenderFirstPerson$v1_12(
      ItemRenderer var1, AbstractClientPlayer var2, float var3, float var4, EnumHand var5, float var6, ItemStack var7, float var8, Operation<Void> var9
   ) {
      boolean var10 = var7 != null && !var7.isEmpty$v1_12();
      if (var10) {
         GlStateManager.pushMatrix();
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
               () -> {
                  EnumHandSide var4x = this.mc.player$v1_8.getPrimaryHand$v1_12();
                  if (var5 != EnumHand.MAIN_HAND) {
                     var4x = var4x.opposite();
                  }

                  boolean var3x = var4x == EnumHandSide.LEFT;
                  return new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI(
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH(),
                     com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BEFORE_TRANSFORMS,
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var7,
                     var3x
                        ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FIRST_PERSON_LEFT_HAND
                        : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FIRST_PERSON_RIGHT_HAND,
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
                  );
               }
            );
      }

      try {
         var9.call(new Object[]{var1, var2, var3, var4, var5, var6, var7, var8});
      } finally {
         if (var10) {
            GlStateManager.popMatrix();
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @WrapOperation(
      method = "updateEquippedItem",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;getCooledAttackStrength$v1_12(F)F")
   )
   private float lunar$legacySwingHook(EntityPlayerSP var1, float var2, Operation<Float> var3) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var4 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.mc
         .player$v1_8
         .getHeldItem$v1_12(EnumHand.MAIN_HAND);
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .ICORHOCRRIRHRIOHCCHIIOHHICCCCC()
            .HCOOOIHICRORRRHOHHROHIHCORRIOH()
            .IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var4)
         ? 1.0F
         : (Float)var3.call(new Object[]{var1, var2});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(method = "transformEatFirstPerson$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$doOldEatAnimation(float var1, EnumHandSide var2, ItemStack var3, CallbackInfo var4) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var5 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var3;
      if (var2 == EnumHandSide.RIGHT
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .ICORHOCRRIRHRIOHCCHIIOHHICCCCC()
            .HCOOOIHICRORRRHOHHROHIHCORRIOH()
            .IHCRORHRORIICHRHRCHRRIRRHHOCOO(var5)) {
         var4.cancel();
         float var6 = this.mc.player$v1_8.getItemInUseCount$v1_12() - var1 + 1.0F;
         float var7 = 1.0F - var6 / var3.getMaxItemUseDuration();
         float var8 = 1.0F - var7;
         var8 = var8 * var8 * var8;
         var8 = var8 * var8 * var8;
         var8 = var8 * var8 * var8;
         float var9 = 1.0F - var8;
         GlStateManager.translate(0.0F, MathHelper.abs(MathHelper.cos(var6 / 4.0F * (float) Math.PI) * 0.1F) * (var7 > 0.2 ? 1 : 0), 0.0F);
         if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CRHOORIRIRROICOHCICIRIOIHCICRR()
            .RCCOROICHORHIIROCHIROORHCCRHHI()
            .IHIRCIHCIOCOORHIOROCIRIIIIIOHC()) {
            GlStateManager.translate(var9 * 0.6F, -var9 * 0.5F, 0.0F);
            GlStateManager.rotate(var9 * 90.0F, 0.0F, 1.0F, 0.0F);
            GlStateManager.rotate(var9 * 10.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(var9 * 30.0F, 0.0F, 0.0F, 1.0F);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @WrapOperation(
      method = "renderItemInFirstPerson$v1_12",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V", ordinal = 2),
      slice = @Slice(from = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getMaxItemUseDuration()I"))
   )
   private void lunar$cancelAttackTransform(float var1, float var2, float var3, Operation<Void> var4) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .ICORHOCRRIRHRIOHCCHIIOHHICCCCC()
         .HCOOOIHICRORRRHOHHROHIHCORRIOH()
         .OCIOROHIHRROROOIRRHRRCCHHRRRHI(false)) {
         var4.call(new Object[]{var1, var2, var3});
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @WrapOperation(
      method = "renderItemInFirstPerson(F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;sin(F)F"),
      slice = @Slice(
         from = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getMaxItemUseDuration()I", ordinal = 0),
         to = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;getSwingProgress(F)F", ordinal = 3)
      ),
      require = 3,
      expect = 3
   )
   private float lunar$scaledSwingHook$v1_7(float var1, Operation<Float> var2) {
      return (Float)var2.call(new Object[]{var1}) * this.lunar$getSwingScale(true);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapOperation(method = "doItemUsedTransformations$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;sin(F)F"))
   private float lunar$scaledSwingHook$v1_8(float var1, Operation<Float> var2) {
      return (Float)var2.call(new Object[]{var1}) * this.lunar$getSwingScale(true);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @WrapOperation(
      method = "renderItemInFirstPerson$v1_12",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;sin(F)F"),
      slice = @Slice(from = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;scale(FFF)V"))
   )
   private float lunar$scaledSwingHook$v1_12(float var1, Operation<Float> var2, @Local(argsOnly = true) EnumHand var3) {
      return (Float)var2.call(new Object[]{var1}) * this.lunar$getSwingScale(var3 == EnumHand.MAIN_HAND);
   }

   @Unique
   private float lunar$getSwingScale(boolean var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CRHOORIRIRROICOHCICIRIOIHCICRR()
         .RCCOROICHORHIIROCHIROORHCCRHHI();
      if (var2.CICRIIHHHCOHHORCHIRRCRICCRICRC()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOCCRCRCOHIIORCCORCRCIRRROIOOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CRHOORIRIRROICOHCICIRIOIHCICRR()
            .RRIHCHROIOOIIOCROICCOHOHCCIIRR();
         if (var3.isEnabled()) {
            boolean var5 = true;
            ItemStack var4;
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
               EnumHandSide var6 = this.mc.gameSettings.mainHand$v1_12;
               var5 = (var1 ? var6 : var6.opposite()) == EnumHandSide.RIGHT;
               var4 = this.mc.player$v1_8.getHeldItem$v1_12(var1 ? EnumHand.MAIN_HAND : EnumHand.OFF_HAND);
            } else {
               var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0 ? this.mc.thePlayer$v1_7.getHeldItem$v1_7() : this.mc.player$v1_8.getHeldItem$v1_7();
            }

            if (var4 != null && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION != 5 || !var4.isEmpty$v1_12())) {
               return var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var4, var5
               );
            }
         }
      }

      return 1.0F;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = {"resetEquippedProgress$v1_7", "resetEquippedProgress2$v1_7"}, at = @At("HEAD"), cancellable = true)
   private void lunar$cancelReEquip(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CRHOORIRIRROICOHCICIRIOIHCICRR()
         .RCCOROICHORHIIROCHIROORHCCRHHI()
         .IOCCIIICRRCRIRIIOCCRICHICCHOOH()) {
         var1.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "updateEquippedItem", at = @At("HEAD"))
   private void lunar$cancelReEquipUpdate(CallbackInfo var1) {
      ItemStack var2 = this.mc.player$v1_8.inventory.getCurrentItem();
      int var3 = this.mc.player$v1_8.inventory.currentItem;
      if (var2 != null
         && var3 == this.equippedItemSlot$v1_7
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CRHOORIRIRROICOHCICIRIOIHCICRR()
            .RCCOROICHORHIIROCHIROORHCCRHHI()
            .IOCCIIICRRCRIRIIOCCRICHICCHOOH()) {
         this.itemToRender$v1_7 = var2;
         this.equippedItemSlot$v1_7 = var3;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(
      method = "updateEquippedItem",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;getCooledAttackStrength$v1_12(F)F", shift = Shift.AFTER)
   )
   private void lunar$cancelReEquipUpdate(CallbackInfo var1, @Local(ordinal = 0) ItemStack var2, @Local(ordinal = 1) ItemStack var3) {
      boolean var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CRHOORIRIRROICOHCICIRIOIHCICRR()
         .RCCOROICHORHIIROCHIROORHCCRHHI()
         .IOCCIIICRRCRIRIIOCCRICHICCHOOH();
      int var5 = this.mc.player$v1_8.inventory.currentItem;
      if (var4 && var5 == this.lunar$previousSlot) {
         this.itemStackMainHand$v1_12 = var2;
      }

      this.lunar$previousSlot = var5;
      if (var4 && var3 != null && var3.getItem() == this.lunar$previousItem) {
         this.itemStackOffHand$v1_12 = var3;
      }

      this.lunar$previousItem = var3 == null ? null : var3.getItem();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(method = "resetEquippedProgress$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$cancelReEquip(EnumHand var1, CallbackInfo var2) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.mc
         .player$v1_8
         .getHeldItem$v1_12(var1);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CRHOORIRIRROICOHCICIRIOIHCICRR()
            .RCCOROICHORHIIROCHIROORHCCRHHI()
            .IOCCIIICRRCRIRIIOCCRICHICCHOOH()
         || IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .ICORHOCRRIRHRIOHCCHIIOHHICCCCC()
            .HCOOOIHICRORRRHOHHROHIHCORRIOH()
            .ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var3)) {
         var2.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @WrapOperation(
      method = "renderItemInFirstPerson(F)V",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glRotatef(FFFF)V"),
      slice = @Slice(
         from = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getMaxItemUseDuration()I"),
         to = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;getSwingProgress(F)F", ordinal = 2)
      )
   )
   private void lunar$rotationlessDrinkHook$v1_7$1(float var1, float var2, float var3, float var4, Operation<Void> var5) {
      ItemStack var6 = this.mc.thePlayer$v1_7.getHeldItem$v1_7();
      if (var6 == null
         || var6.getItemUseAction().ordinal() != 1 && var6.getItemUseAction().ordinal() != 2
         || !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CRHOORIRIRROICOHCICIRIOIHCICRR()
            .RCCOROICHORHIIROCHIROORHCCRHHI()
            .IHIRCIHCIOCOORHIOROCIRIIIIIOHC()) {
         var5.call(new Object[]{var1, var2, var3, var4});
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @WrapOperation(
      method = "renderItemInFirstPerson(F)V",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glTranslatef(FFF)V", ordinal = 1),
      slice = @Slice(
         from = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;getMaxItemUseDuration()I"),
         to = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;getSwingProgress(F)F", ordinal = 2)
      )
   )
   private void lunar$rotationlessDrinkHook$v1_7$2(float var1, float var2, float var3, Operation<Void> var4) {
      ItemStack var5 = this.mc.thePlayer$v1_7.getHeldItem$v1_7();
      if (var5 == null
         || var5.getItemUseAction().ordinal() != 1 && var5.getItemUseAction().ordinal() != 2
         || !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CRHOORIRIRROICOHCICIRIOIHCICRR()
            .RCCOROICHORHIIROCHIROORHCCRHHI()
            .IHIRCIHCIOCOORHIOROCIRIIIIIOHC()) {
         var4.call(new Object[]{var1, var2, var3});
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "performDrinking$v1_8", at = @At(value = "INVOKE", target = "Ljava/lang/Math;pow(DD)D"), cancellable = true)
   private void lunar$rotationlessDrinkHook$v1_8(CallbackInfo var1) {
      ItemStack var2 = this.mc.player$v1_8.getHeldItem$v1_7();
      if (var2 != null
         && (var2.getItemUseAction().ordinal() == 1 || var2.getItemUseAction().ordinal() == 2)
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CRHOORIRIRROICOHCICIRIOIHCICRR()
            .RCCOROICHORHIIROCHIROORHCCRHHI()
            .IHIRCIHCIOCOORHIOROCIRIIIIIOHC()) {
         var1.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(method = "transformEatFirstPerson$v1_12", at = @At(value = "INVOKE", target = "Ljava/lang/Math;pow(DD)D"), cancellable = true)
   private void lunar$rotationlessDrinkHook$v1_12(CallbackInfo var1, @Local(argsOnly = true) ItemStack var2) {
      if (var2 != null
         && (var2.getItemUseAction() == EnumAction.EAT$v1_8 || var2.getItemUseAction() == EnumAction.DRINK$v1_8)
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CRHOORIRIRROICOHCICIRIOIHCICRR()
            .RCCOROICHORHIIROCHIROORHCCRHHI()
            .IHIRCIHCIOCOORHIOROCIRIIIIIOHC()) {
         var1.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @Inject(
      method = "renderItemInFirstPerson(F)V",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glPushMatrix()V", shift = Shift.AFTER),
      slice = @Slice(
         from = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/AbstractClientPlayer;isInvisible()Z"),
         to = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/client/renderer/entity/RenderPlayer_v1_7;renderFirstPersonArm(Lnet/minecraft/entity/player/EntityPlayer;)V",
            ordinal = 1,
            shift = Shift.AFTER
         )
      )
   )
   private void lunar$preArmTransform$1_7(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               false
            )
         );
      if (var2 != null) {
         GL11.glTranslatef(var2.getXOffset(), var2.getYOffset(), var2.HCOIOCCRRORCCHHCCHHCCCCCICIIRH());
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "renderPlayerArm$v1_8", at = @At("HEAD"))
   private void lunar$preArmTransform$1_8(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               false
            )
         );
      if (var2 != null) {
         GlStateManager.translate(var2.getXOffset(), var2.getYOffset(), var2.HCOIOCCRRORCCHHCCHHCCCCCICIIRH());
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "renderPlayerArm$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;disableCull()V", shift = Shift.AFTER)
   )
   private void lunar$postArmTransform$1_8(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               false
            )
         );
      if (var2 != null) {
         GlStateManager.rotate(var2.HIHICIOOCHCIIHOIHIHCCOCHICIRRI(), 1.0F, 0.0F, 0.0F);
         GlStateManager.rotate(var2.ROHOIIRCHCRRRCOROORORROIIRCHIH(), 0.0F, 1.0F, 0.0F);
         GlStateManager.rotate(var2.RHICIOIORRRRHCHIICRCCIHIOCIRCC(), 0.0F, 0.0F, 1.0F);
         float var3 = var2.getScale();
         GlStateManager.scale(var3, var3, var3);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(method = "renderArmFirstPerson$v1_12", at = @At("HEAD"))
   private void lunar$preArmTransform$1_12(CallbackInfo var1, @Local(argsOnly = true) EnumHandSide var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               false
            )
         );
      if (var3 != null) {
         GlStateManager.translate(var3.getXOffset(), var3.getYOffset(), var3.HCOIOCCRRORCCHHCCHHCCCCCICIIRH());
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(
      method = "renderArmFirstPerson$v1_12",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;disableCull()V", shift = Shift.AFTER)
   )
   private void lunar$postArmTransform$1_12(CallbackInfo var1, @Local(argsOnly = true) EnumHandSide var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var3 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               var2 == EnumHandSide.LEFT
            )
         );
      if (var3 != null) {
         GlStateManager.rotate(var3.HIHICIOOCHCIIHOIHIHCCOCHICIRRI(), 1.0F, 0.0F, 0.0F);
         GlStateManager.rotate(var3.ROHOIIRCHCRRRCOROORORROIIRCHIH(), 0.0F, 1.0F, 0.0F);
         GlStateManager.rotate(var3.RHICIOIORRRRHCHIICRCCIHIOCIRCC(), 0.0F, 0.0F, 1.0F);
         float var4 = var3.getScale();
         GlStateManager.scale(var4, var4, var4);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "renderPlayerArm$v1_8",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderPlayer_v1_8;renderRightArm(Lnet/minecraft/client/entity/AbstractClientPlayer;)V",
         ordinal = 0
      ),
      cancellable = true
   )
   private void lunar$renderRightArm$1_8(AbstractClientPlayer var1, float var2, float var3, CallbackInfo var4) {
      IHCRORHRORIICHRHRCHRRIRRHHOCOO var5 = (IHCRORHRORIICHRHRCHRRIRRHHOCOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IHCRORHRORIICHRHRCHRRIRRHHOCOO.class,
            () -> new IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1,
               false
            )
         );
      if (var5 != null && var5.isCancelled()) {
         var4.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "renderArmFirstPerson$v1_12",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderPlayer_v1_8;renderRightArm(Lnet/minecraft/client/entity/AbstractClientPlayer;)V",
         ordinal = 0
      ),
      cancellable = true
   )
   private void lunar$renderRightArm$1_12(CallbackInfo var1) {
      IHCRORHRORIICHRHRCHRRIRRHHOCOO var2 = (IHCRORHRORIICHRHRCHRRIRRHHOCOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IHCRORHRORIICHRHRCHRRIRRHHOCOO.class,
            () -> new IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.mc
                  .player$v1_8,
               false
            )
         );
      if (var2 != null && var2.isCancelled()) {
         var1.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "renderArmFirstPerson$v1_12",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderPlayer_v1_8;renderLeftArm(Lnet/minecraft/client/entity/AbstractClientPlayer;)V",
         ordinal = 0
      ),
      cancellable = true
   )
   private void lunar$renderLeftArm$1_12(CallbackInfo var1) {
      IHCRORHRORIICHRHRCHRRIRRHHOCOO var2 = (IHCRORHRORIICHRHRCHRRIRRHHOCOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IHCRORHRORIICHRHRCHRRIRRHHOCOO.class,
            () -> new IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.mc
                  .player$v1_8,
               true
            )
         );
      if (var2 != null && var2.isCancelled()) {
         var1.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "renderItemInFirstPerson",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/entity/RenderPlayer_v1_7;renderFirstPersonArm(Lnet/minecraft/entity/player/EntityPlayer;)V",
         ordinal = 1
      ),
      cancellable = true
   )
   private void lunar$renderArm$1_7(CallbackInfo var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
               false
            )
         );
      if (var2 != null) {
         GL11.glRotatef(var2.HIHICIOOCHCIIHOIHIHCCOCHICIRRI(), 1.0F, 0.0F, 0.0F);
         GL11.glRotatef(var2.ROHOIIRCHCRRRCOROORORROIIRCHIH(), 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(var2.RHICIOIORRRRHCHIICRCCIHIOCIRCC(), 0.0F, 0.0F, 1.0F);
         float var3 = var2.getScale();
         GL11.glScalef(var3, var3, var3);
      }

      IHCRORHRORIICHRHRCHRRIRRHHOCOO var4 = (IHCRORHRORIICHRHRCHRRIRRHHOCOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IHCRORHRORIICHRHRCHRRIRRHHOCOO.class,
            () -> new IHCRORHRORIICHRHRCHRRIRRHHOCOO(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.mc
                  .thePlayer$v1_7,
               false
            )
         );
      if (var4 != null && var4.isCancelled()) {
         var1.cancel();
         GL11.glPopMatrix();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "renderItemSide$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$renderGeckolibItem$v1_12(EntityLivingBase var1, ItemStack var2, TransformType var3, boolean var4, CallbackInfo var5) {
      if (var3 == TransformType.FIRST_PERSON_LEFT_HAND$v1_12 || var3 == TransformType.FIRST_PERSON_RIGHT_HAND$v1_12) {
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.valueOf(
               var3.name()
            ),
            var5
         );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "renderItem$v1_8", at = @At("HEAD"), cancellable = true)
   private void lunar$renderGeckolibItem$v1_8(EntityLivingBase var1, ItemStack var2, TransformType var3, CallbackInfo var4) {
      if (var3 == TransformType.FIRST_PERSON$v1_8) {
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FIRST_PERSON_RIGHT_HAND,
            var4
         );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(0)
   @Inject(method = "renderItem$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$renderGeckolibItem$v1_7(EntityLivingBase var1, ItemStack var2, int var3, CallbackInfo var4) {
      if (var1 instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var5
         )
       {
         if (com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var5,
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2
         )) {
            var4.cancel();
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "renderItemInFirstPerson",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/ItemRenderer;renderItem(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;I)V",
         shift = Shift.BEFORE
      ),
      cancellable = true
   )
   private void lunar$renderGeckolibItem$v1_7(float var1, CallbackInfo var2) {
      if (this.itemToRender$v1_7 != null) {
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.itemToRender$v1_7,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FIRST_PERSON_RIGHT_HAND,
            var2
         );
         if (var2.isCancelled()) {
            GL11.glPopMatrix();
         }
      }
   }

   @Inject(method = {"renderFireInFirstPerson$v1_7", "renderFireInFirstPerson$v1_12", "renderWaterOverlayTexture"}, at = @At("HEAD"), cancellable = true)
   private void lunar$rewindDontRenderOverlaysInFreecam(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            var0 -> !var0.RICCCROHOIOCHORIRCHIIOORHIRHHR()
               || var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHHCCIOICIIRRIRCHROOCCHRIHOROC()
               || !var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer()
         )) {
         var1.cancel();
      }
   }
}
