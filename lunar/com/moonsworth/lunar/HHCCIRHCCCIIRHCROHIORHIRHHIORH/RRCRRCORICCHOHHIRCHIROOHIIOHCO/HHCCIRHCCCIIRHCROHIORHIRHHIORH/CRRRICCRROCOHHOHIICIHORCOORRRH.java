package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import org.joml.Matrix4f;

public interface CRRRICCRROCOHHOHIICIHORCOORRRH {
   void bridge$setTextureOffsetX(int var1);

   void bridge$setTextureOffsetY(int var1);

   void bridge$setRotateAngleX(float var1);

   void bridge$setRotateAngleY(float var1);

   void bridge$setRotateAngleZ(float var1);

   float bridge$getRotateAngleX();

   float bridge$getRotateAngleY();

   float bridge$getRotateAngleZ();

   void bridge$setRotatePointX(float var1);

   void bridge$setRotatePointY(float var1);

   void bridge$setRotatePointZ(float var1);

   float bridge$getRotatePointX();

   float bridge$getRotatePointY();

   float bridge$getRotatePointZ();

   boolean bridge$isVisible();

   void bridge$setVisible(boolean var1);

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      float var2 = 0.0625F;
      float var3 = this.bridge$getRotateAngleX();
      float var4 = this.bridge$getRotateAngleY();
      float var5 = this.bridge$getRotateAngleZ();
      float var6 = this.bridge$getRotatePointX();
      float var7 = this.bridge$getRotatePointY();
      float var8 = this.bridge$getRotatePointZ();
      if (var3 != 0.0F || var4 != 0.0F || var5 != 0.0F) {
         var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var6 * 0.0625F, var7 * 0.0625F, var8 * 0.0625F);
         if (var5 != 0.0F) {
            var1.RRCRRCORICCHOHHIRCHIROOHIIOHCO((float)Math.toDegrees(var5), 0.0F, 0.0F, 1.0F);
         }

         if (var4 != 0.0F) {
            var1.RRCRRCORICCHOHHIRCHIROOHIIOHCO((float)Math.toDegrees(var4), 0.0F, 1.0F, 0.0F);
         }

         if (var3 != 0.0F) {
            var1.RRCRRCORICCHOHHIRCHIROOHIIOHCO((float)Math.toDegrees(var3), 1.0F, 0.0F, 0.0F);
         }
      } else if (var6 != 0.0F || var7 != 0.0F || var8 != 0.0F) {
         var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var6 * 0.0625F, var7 * 0.0625F, var8 * 0.0625F);
      }
   }

   default void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Matrix4f var1) {
      float var2 = 0.0625F;
      float var3 = this.bridge$getRotateAngleX();
      float var4 = this.bridge$getRotateAngleY();
      float var5 = this.bridge$getRotateAngleZ();
      float var6 = this.bridge$getRotatePointX();
      float var7 = this.bridge$getRotatePointY();
      float var8 = this.bridge$getRotatePointZ();
      if (var3 != 0.0F || var4 != 0.0F || var5 != 0.0F) {
         var1.translate(var6 * 0.0625F, var7 * 0.0625F, var8 * 0.0625F);
         if (var5 != 0.0F) {
            var1.rotate(var5, 0.0F, 0.0F, 1.0F);
         }

         if (var4 != 0.0F) {
            var1.rotate(var4, 0.0F, 1.0F, 0.0F);
         }

         if (var3 != 0.0F) {
            var1.rotate(var3, 1.0F, 0.0F, 0.0F);
         }
      } else if (var6 != 0.0F || var7 != 0.0F || var8 != 0.0F) {
         var1.translate(var6 * 0.0625F, var7 * 0.0625F, var8 * 0.0625F);
      }
   }

   default void bridge$postRender(float var1) {
   }

   default void bridge$translateAndRotate(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1
   ) {
   }

   void bridge$render(float var1, RCIROOOOICRHCCRRCIORHHIRCOIIIC var2);

   default void bridge$render(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      float var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   ) {
   }
}
