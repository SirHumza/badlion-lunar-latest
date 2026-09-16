package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.nio.ByteOrder;
import java.util.Random;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(RenderItem.class)
public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Shadow
   public static boolean renderInFrame$v1_7;
   @Shadow
   public float zLevel;
   @Unique
   private boolean lunar$isRenderPotion = false;
   @Unique
   private float lunar$clumpSpread = 0.2F;
   @Unique
   private boolean lunar$renderItemGui;
   @Unique
   private EntityLivingBase lunar$currentEntityRenderingItem = null;
   @Unique
   private ItemStack item;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "renderQuad$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/BufferBuilder;putColor4$v1_8(I)V"))
   public void lunar$addAlphaToRenderQuad(BufferBuilder var1, int var2) {
      for (int var3 = 0; var3 < 4; var3++) {
         int var4 = var1.getColorIndex$v1_8(var3 + 1);
         int var5 = var2 >> 24 & 0xFF;
         int var6 = var2 >> 16 & 0xFF;
         int var7 = var2 >> 8 & 0xFF;
         int var8 = var2 & 0xFF;
         if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            var1.rawIntBuffer$v1_8.put(var4, var5 << 24 | var8 << 16 | var7 << 8 | var6);
         } else {
            var1.rawIntBuffer$v1_8.put(var4, var6 << 24 | var7 << 16 | var8 << 8 | var5);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "renderQuad$v1_7", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;setColorOpaque_I$v1_7(I)V"))
   public void lunar$addAlphaToRenderQuad(Tessellator var1, int var2) {
      int var3 = var2 >> 24 & 0xFF;
      int var4 = var2 >> 16 & 0xFF;
      int var5 = var2 >> 8 & 0xFF;
      int var6 = var2 & 0xFF;
      var1.setColorRGBA$v1_7(var4, var5, var6, var3);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "renderDroppedItem$v1_7(Lnet/minecraft/entity/item/EntityItem;Lnet/minecraft/util/IIcon;IFFFF)V",
      at = @At(value = "FIELD", target = "net/minecraft/client/settings/GameSettings.fancyGraphics : Z")
   )
   public boolean lunar$renderDroppedItem$fancyGraphics(GameSettings var1) {
      if (var1.fancyGraphics) {
         return true;
      }

      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR();
      return var2 == null ? false : var2.HHCCIRORCRCHOIOHRRIRRRIORRCRRR().OHIHCOIOCRCORICOHOHCIIICIIORCH().isEnabled();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "renderDroppedItem$v1_7(Lnet/minecraft/entity/item/EntityItem;Lnet/minecraft/util/IIcon;IFFFF)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;hasEffect()Z")
   )
   public boolean lunar$renderDroppedItem$hasEffect(ItemStack var1) {
      if (!var1.hasEffect()) {
         return false;
      }

      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ITEM;
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var3 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            ORHIOICIOCRRHOOCOHRORIHICHRCRR.class,
            () -> new ORHIOICIOCRRHOOCOHRORIHICHRCRR(
               var2,
               null,
               null,
               null,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1,
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
            )
         );
      return var3 == null || !var3.isCancelled();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "renderItemAndEffectIntoGUI$v1_7", at = @At("HEAD"))
   private void lunar$cacheRenderedItem(FontRenderer var1, TextureManager var2, ItemStack var3, int var4, int var5, CallbackInfo var6) {
      this.item = var3;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "renderItemAndEffectIntoGUI$v1_7", at = @At("TAIL"))
   private void lunar$uncacheRenderedItem(FontRenderer var1, TextureManager var2, ItemStack var3, int var4, int var5, CallbackInfo var6) {
      this.item = null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "renderGlint$v1_7", at = @At("HEAD"), cancellable = true)
   public void lunar$renderGlint(int var1, int var2, int var3, int var4, int var5, CallbackInfo var6) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = this.lunar$renderItemGui
         ? com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.GUI
         : com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ITEM;
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var8 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            ORHIOICIOCRRHOOCOHRORIHICHRCRR.class,
            () -> new ORHIOICIOCRRHOOCOHRORIHICHRCRR(
               var7,
               var5xx -> {
                  float var6x = (var5xx >> 24 & 0xFF) / 255.0F;
                  float var7x = (var5xx >> 16 & 0xFF) / 255.0F;
                  float var8x = (var5xx >> 8 & 0xFF) / 255.0F;
                  float var9 = (var5xx & 0xFF) / 255.0F;
                  GL11.glColor4f(var7x, var8x, var9, var6x);
                  Tessellator var10 = Tessellator.INSTANCE;
                  var10.startDrawingQuads$v1_7();
                  var10.addVertexWithUV$v1_7(var2 + 0, var3 + var5, this.zLevel, 0.0, 1.0);
                  var10.addVertexWithUV$v1_7(var2 + var4, var3 + var5, this.zLevel, 1.0, 1.0);
                  var10.addVertexWithUV$v1_7(var2 + var4, var3 + 0, this.zLevel, 1.0, 0.0);
                  var10.addVertexWithUV$v1_7(var2 + 0, var3 + 0, this.zLevel, 0.0, 0.0);
                  var10.draw$v1_7();
               },
               null,
               null,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.item,
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
            )
         );
      if (var8 != null && var8.isCancelled()) {
         var6.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "doRender$v1_7(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", at = @At("HEAD"), cancellable = true)
   private void lunar$onRender(EntityItem var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var11 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this,
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var1,
               var2,
               var4,
               var6,
               renderInFrame$v1_7,
               var9
            )
         );
      if (var11 != null && var11.isCancelled()) {
         var10.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "doRender$v1_7(Lnet/minecraft/entity/item/EntityItem;DDDFF)V",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glEnable(I)V")
   )
   private void lunar$customTransform(int var1, EntityItem var2, double var3, double var5, double var7, float var9, float var10) {
      GL11.glEnable(var1);
      if (!renderInFrame$v1_7) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IIHRRHORCRCROCHHOHORCHCROCIHRO(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
                  ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var2)
                     .bridge$getItemState(),
                  false,
                  renderInFrame$v1_7
               )
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "renderItemAndEffectIntoGUI$v1_7", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glColor4f(FFFF)V"))
   private void lunar$renderItemAndEffectIntoGUI(
      float var1, float var2, float var3, float var4, FontRenderer var5, TextureManager var6, ItemStack var7, int var8, int var9
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().CCIOORIIRCRRCRRIOOOOCORHOHRROR().isEnabled()
         && var7.getItem() != null
         && var7.getItem() instanceof ItemPotion) {
         this.lunar$isRenderPotion = true;
         int var10 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CCIOORIIRCRRCRRIOOOOCORHOHRROR()
            .HCHRIROHHHCORIOCROOCHRCIOROOCI(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var7
            );
         var4 = (var10 >> 24 & 0xFF) / 255.0F;
         var1 = (var10 >> 16 & 0xFF) / 255.0F;
         var2 = (var10 >> 8 & 0xFF) / 255.0F;
         var3 = (var10 & 0xFF) / 255.0F;
      } else {
         this.lunar$isRenderPotion = false;
      }

      GL11.glColor4f(var1, var2, var3, var4);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyConstant(method = "renderGlint$v1_7", constant = @Constant(intValue = 772))
   private int lunar$modifyGlint(int var1) {
      return this.lunar$isRenderPotion ? 773 : var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "renderItemAndEffectIntoGUI$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderItem;renderGlint$v1_7(IIIII)V")
   )
   private void lunar$renderGlint(RenderItem var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.lunar$isRenderPotion
         && !(Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CCIOORIIRCRRCRRIOOOOCORHOHRROR()
            .IHIOICOHCIHICROOOORHIHROICCRIR()
            .get()) {
         var3 += 2;
         var4 += 2;
         var5 -= 4;
         var6 -= 4;
      }

      var1.renderGlint$v1_7(var2, var3, var4, var5, var6);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "doRender$v1_7(Lnet/minecraft/entity/item/EntityItem;DDDFF)V",
      slice = @Slice(
         from = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;sin(F)F"),
         to = @At(value = "INVOKE", target = "net/minecraft/client/renderer/RenderBlocks.renderItemIn3d (I)Z")
      ),
      at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glTranslatef (FFF)V", remap = false)
   )
   private void lunar$onInitialTranslate(float var1, float var2, float var3, EntityItem var4, double var5, double var7, double var9, float var11, float var12) {
      if (renderInFrame$v1_7) {
         GL11.glTranslatef(var1, var2, var3);
      } else {
         float var13 = (float)(var2 - var7);
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var14 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var4,
                  var13
               )
            );
         if (var14 != null && var14.ROIRICOHOICIIHRCROHICOOHIOIHCI() != var13) {
            GL11.glTranslatef(var1, (float)(var7 + var14.ROIRICOHOICIIHRCROHICOOHIOIHCI()), var3);
         } else {
            GL11.glTranslatef(var1, var2, var3);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyConstant(
      method = "renderDroppedItem$v1_7(Lnet/minecraft/entity/item/EntityItem;Lnet/minecraft/util/IIcon;IFFFF)V",
      constant = @Constant(floatValue = 0.25F, ordinal = 0)
   )
   private float lunar$get2DItemYOffset(float var1) {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OHIHCOIOCRCORICOHOHCIIICIIORCH()
            .isEnabled()
         ? 0.5F
         : var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "renderDroppedItem$v1_7(Lnet/minecraft/entity/item/EntityItem;Lnet/minecraft/util/IIcon;IFFFF)V",
      slice = @Slice(
         from = @At(value = "FIELD", target = "net/minecraft/entity/item/EntityItem.hoverStart : F"),
         to = @At(value = "FIELD", target = "net/minecraft/item/ItemStack.stackSize : I")
      ),
      at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glRotatef (FFFF)V", remap = false)
   )
   private void lunar$onRotateFor2D(
      float var1, float var2, float var3, float var4, EntityItem var5, IIcon var6, int var7, float var8, float var9, float var10, float var11
   ) {
      if (renderInFrame$v1_7) {
         GL11.glRotatef(var1, var2, var3, var4);
      } else {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var12 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var5,
                  var8
               )
            );
         if (var12 == null || !var12.isCancelled()) {
            GL11.glRotatef(var1, var2, var3, var4);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "doRender$v1_7(Lnet/minecraft/entity/item/EntityItem;DDDFF)V",
      at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glRotatef (FFFF)V", remap = false)
   )
   private void lunar$onRotateFor3D(
      float var1, float var2, float var3, float var4, EntityItem var5, double var6, double var8, double var10, float var12, float var13
   ) {
      if (renderInFrame$v1_7) {
         GL11.glRotatef(var1, var2, var3, var4);
      } else {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI var14 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var5,
                  var13
               )
            );
         if (var14 == null || !var14.isCancelled()) {
            GL11.glRotatef(var1, var2, var3, var4);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "doRender$v1_7(Lnet/minecraft/entity/item/EntityItem;DDDFF)V",
      at = @At(value = "INVOKE", target = "java/util/Random.setSeed (J)V", remap = false)
   )
   private void lunar$onSetSeed(Random var1, long var2, EntityItem var4, double var5, double var7, double var9, float var11, float var12) {
      if (renderInFrame$v1_7) {
         var1.setSeed(var2);
      } else {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CORCOCICIRIOHROHROIIOOHICCHCRR var13 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CORCOCICIRIOHROHROIIOOHICCHCRR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CORCOCICIRIOHROHROIIOOHICCHCRR.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CORCOCICIRIOHROHROIIOOHICCHCRR(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)var4,
                  var2,
                  0.2F
               )
            );
         if (var13 == null) {
            var1.setSeed(var2);
            this.lunar$clumpSpread = 0.2F;
         } else {
            var1.setSeed(var13.HIRHCROHHCRRIHIORRRRRHCCIHOCIH());
            this.lunar$clumpSpread = var13.IHORCHOHHHHRHCRICHIIHIORRHRCRO();
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyConstant(method = "doRender$v1_7(Lnet/minecraft/entity/item/EntityItem;DDDFF)V", constant = @Constant(floatValue = 0.2F))
   private float lunar$tweakClumping(float var1) {
      return renderInFrame$v1_7 ? 0.2F : this.lunar$clumpSpread;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyVariable(
      method = "renderItemOverlayIntoGUI$v1_7(Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V",
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   private String lunar$renderGuiItemOverlay$v1_7(String var1, FontRenderer var2, TextureManager var3, ItemStack var4, int var5, int var6, String var7) {
      return this.lunar$renderGuiIemOverlay(var1, var4, var5, var6);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyVariable(
      method = "renderItemOverlayIntoGUI$v1_8(Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V",
      at = @At("HEAD"),
      ordinal = 0,
      argsOnly = true
   )
   private String lunar$renderGuiItemOverlay$v1_8(String var1, FontRenderer var2, ItemStack var3, int var4, int var5, String var6) {
      return this.lunar$renderGuiIemOverlay(var1, var3, var4, var5);
   }

   @Unique
   private String lunar$renderGuiIemOverlay(String var1, ItemStack var2, int var3, int var4) {
      if (var2 != null && var2.getItem() != null) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
                  ),
                  var1,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var2,
                  var3,
                  var4
               )
            );
         return var5 == null ? var1 : var5.getText();
      } else {
         return var1;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapOperation(
      method = "renderItemModelForEntity$v1_8",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/RenderItem;renderItemModelTransform$v1_8(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V"
      )
   )
   private void lunar$captureEntity$v1_8(
      RenderItem var1, ItemStack var2, IBakedModel var3, TransformType var4, Operation<Void> var5, @Local(argsOnly = true) EntityLivingBase var6
   ) {
      this.lunar$currentEntityRenderingItem = var6;

      try {
         var5.call(new Object[]{var1, var2, var3, var4});
      } finally {
         this.lunar$currentEntityRenderingItem = null;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @WrapOperation(
      method = "renderItem$v1_12",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/RenderItem;renderItemModel$v1_12(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Z)V"
      )
   )
   private void lunar$captureEntity$v1_12(
      RenderItem var1, ItemStack var2, IBakedModel var3, TransformType var4, boolean var5, Operation<Void> var6, @Local(argsOnly = true) EntityLivingBase var7
   ) {
      this.lunar$currentEntityRenderingItem = var7;

      try {
         var6.call(new Object[]{var1, var2, var3, var4, var5});
      } finally {
         this.lunar$currentEntityRenderingItem = null;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(
      method = "renderItemModelTransform$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;pushMatrix()V", shift = Shift.AFTER, ordinal = 0)
   )
   private void lunar$onRenderItemTransform$v1_8(ItemStack var1, IBakedModel var2, TransformType var3, CallbackInfo var4) {
      if (var3 != TransformType.THIRD_PERSON$v1_8
         && var3 != TransformType.GUI
         && var3 != TransformType.GROUND
         && this.lunar$currentEntityRenderingItem instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5
         )
       {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
               () -> {
                  if (var3 == TransformType.NONE
                     && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .ICORHOCRRIRHRIOHCCHIIOHHICCCCC()
                        .HROCHCHIRRCORHRIIOIIIIORICHIIR()
                        .HHICCHIOHHOCCIIROCHIOCCIRRCHIC()) {
                     return null;
                  }

                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3x = switch (var3) {
                     case NONE -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.NONE;
                     case FIRST_PERSON$v1_8 -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FIRST_PERSON_RIGHT_HAND;
                     case HEAD -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HEAD;
                     case FIXED -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.FIXED;
                     default -> throw new IllegalStateException("Unexpected value: " + var3);
                  };
                  return new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI(
                     var5,
                     com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.AFTER_TRANSFORMS,
                     (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1,
                     var3x,
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
                  );
               }
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(5)
   @Inject(
      method = "renderItemModel$v1_12",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms;applyTransformSide$v1_12(Lnet/minecraft/client/renderer/block/model/ItemTransformVec3f;Z)V",
         shift = Shift.AFTER
      )
   )
   private void lunar$onRenderItemTransform$v1_12(ItemStack var1, IBakedModel var2, TransformType var3, boolean var4, CallbackInfo var5) {
      if (var3 != TransformType.THIRD_PERSON_LEFT_HAND$v1_12
         && var3 != TransformType.THIRD_PERSON_RIGHT_HAND$v1_12
         && var3 != TransformType.GUI
         && var3 != TransformType.GROUND
         && this.lunar$currentEntityRenderingItem instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6
         )
       {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI(
                  var6,
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.AFTER_TRANSFORMS,
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var1,
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.VALUES[var3.ordinal()],
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
               )
            );
      }
   }
}
