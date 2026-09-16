package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ModelRenderer.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Shadow
   public float rotateAngleX;
   @Shadow
   public float rotateAngleY;
   @Shadow
   public float rotateAngleZ;
   @Shadow
   public float rotationPointX;
   @Shadow
   public float rotationPointY;
   @Shadow
   public float rotationPointZ;
   @Shadow
   public int textureOffsetX;
   @Shadow
   public int textureOffsetY;
   @Shadow
   public boolean showModel;

   @Shadow
   public abstract void render(float var1);

   public void bridge$setTextureOffsetX(int var1) {
      this.textureOffsetX = var1;
   }

   public void bridge$setTextureOffsetY(int var1) {
      this.textureOffsetY = var1;
   }

   public void bridge$setRotateAngleX(float var1) {
      this.rotateAngleX = var1;
   }

   public void bridge$setRotateAngleY(float var1) {
      this.rotateAngleY = var1;
   }

   public void bridge$setRotateAngleZ(float var1) {
      this.rotateAngleZ = var1;
   }

   public float bridge$getRotateAngleX() {
      return this.rotateAngleX;
   }

   public float bridge$getRotateAngleY() {
      return this.rotateAngleY;
   }

   public float bridge$getRotateAngleZ() {
      return this.rotateAngleZ;
   }

   public void bridge$setRotatePointX(float var1) {
      this.rotationPointX = var1;
   }

   public void bridge$setRotatePointY(float var1) {
      this.rotationPointY = var1;
   }

   public void bridge$setRotatePointZ(float var1) {
      this.rotationPointZ = var1;
   }

   public float bridge$getRotatePointX() {
      return this.rotationPointX;
   }

   public float bridge$getRotatePointY() {
      return this.rotationPointY;
   }

   public float bridge$getRotatePointZ() {
      return this.rotationPointZ;
   }

   public boolean bridge$isVisible() {
      return this.showModel;
   }

   public void bridge$setVisible(boolean var1) {
      this.showModel = var1;
   }

   public void bridge$render(float var1, RCIROOOOICRHCCRRCIORHHIRCOIIIC var2) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager().bridge$bindTexture(var2);
      this.render(var1);
   }

   public void bridge$postRender(float var1) {
      if (this.rotateAngleX == 0.0F && this.rotateAngleY == 0.0F && this.rotateAngleZ == 0.0F) {
         if (this.rotationPointX != 0.0F || this.rotationPointY != 0.0F || this.rotationPointZ != 0.0F) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               GlStateManager.translate(this.rotationPointX * var1, this.rotationPointY * var1, this.rotationPointZ * var1);
            } else {
               GL11.glTranslatef(this.rotationPointX * var1, this.rotationPointY * var1, this.rotationPointZ * var1);
            }
         }
      } else {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            GlStateManager.translate(this.rotationPointX * var1, this.rotationPointY * var1, this.rotationPointZ * var1);
         } else {
            GL11.glTranslatef(this.rotationPointX * var1, this.rotationPointY * var1, this.rotationPointZ * var1);
         }

         if (this.rotateAngleZ != 0.0F) {
            lunar$rotatef(this.rotateAngleZ * (180.0F / (float)Math.PI), 0.0F, 0.0F, 1.0F);
         }

         if (this.rotateAngleY != 0.0F) {
            lunar$rotatef(this.rotateAngleY * (180.0F / (float)Math.PI), 0.0F, 1.0F, 0.0F);
         }

         if (this.rotateAngleX != 0.0F) {
            lunar$rotatef(this.rotateAngleX * (180.0F / (float)Math.PI), 1.0F, 0.0F, 0.0F);
         }
      }
   }

   @Unique
   private static void lunar$rotatef(float var0, float var1, float var2, float var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.rotate(var0, var1, var2, var3);
      } else {
         GL11.glRotatef(var0, var1, var2, var3);
      }
   }
}
