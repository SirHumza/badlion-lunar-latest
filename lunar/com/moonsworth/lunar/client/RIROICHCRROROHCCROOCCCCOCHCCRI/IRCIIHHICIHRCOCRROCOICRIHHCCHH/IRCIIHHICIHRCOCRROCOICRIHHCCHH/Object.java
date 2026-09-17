package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import lombok.Generated;
import org.joml.Vector3f;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCHHRHCCIICHIRHIHRCIHRHIOOOORH;
   private final int OOORHRCRROHIORROOCRCHHCICCORIR;
   private final int IRRIHORCCOIRHOCCHIRCCHICICHORC;
   private final Vector3f ROOOICOIOOOHHHCCIIHIRHHCOHRRII;
   private final Vector3f CIOCHRCRORCIRHRROIIIIHCRHHOHHI;
   private final Vector3f ICCIIOOIIOORHCIHORRHHHCROHRIIH = new Vector3f(0.0F, 0.0F, 1.0F);
   private boolean locked = false;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Vector3f var2, int var3, int var4) {
      this.OCHHRHCCIICHIRHIHRCIHRHIOOOORH = var1;
      this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII = new Vector3f(var2);
      this.CIOCHRCRORCIRHRROIIIIHCRHHOHHI = new Vector3f(var2);
      this.OOORHRCRROHIORROOCRCHHCICCORIR = var3;
      this.IRRIHORCCOIRHOCCHIRCCHICICHORC = var4;
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Vector3f var1) {
      if (!this.locked) {
         this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.add(var1);
      }
   }

   public void CICOIHIRIIHHCIOICHRHICRIRCIOHC(float var1) {
      if (!this.locked) {
         Vector3f var2 = new Vector3f(this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII).sub(this.CIOCHRCRORCIRHRROIIIIHCRHHOHHI).mul(var1);
         Vector3f var3 = new Vector3f(this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII);
         this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.add(var2);
         this.CIOCHRCRORCIRHRROIIIIHCRHHOHHI.set(var3);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, boolean var3) {
      Vector3f var4 = new Vector3f(var1.HRIRRHCHRHCIHIRROCIIRHHCIOCOOR()).sub(this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII);
      Vector3f var5 = new Vector3f(var2.HRIRRHCHRHCIHIRROCIIRHHCIOCOOR()).sub(this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII);
      Vector3f var6 = var5.cross(var4);
      if (var3) {
         var6.negate();
      }

      if (var6.lengthSquared() < 1.0E-6F) {
         var6.set(0.0F, 0.0F, 1.0F);
      }

      this.ICCIIOOIIOORHCIHORRHHHCROHRIIH.set(var6.normalize());
   }

   public void HIRHCRIHHRCCIICCRHRHRCRRRCRIOC(boolean var1) {
      if (!this.locked) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(-0.29F, 0.29F, -1.8F, var1 ? 0.11F : 1.8F, -0.3F, -0.016F);
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(-0.35F, 0.35F, -1.5F, -0.5F, -0.15F, 0.15F);
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var1, float var2, float var3, float var4, float var5, float var6) {
      if (this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.x >= var1
         && this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.x <= var2
         && this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.y >= var3
         && this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.y <= var4
         && this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.z >= var5
         && this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.z <= var6) {
         float var7 = this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.x - var1;
         float var8 = var2 - this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.x;
         float var9 = this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.y - var3;
         float var10 = var4 - this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.y;
         float var11 = this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.z - var5;
         float var12 = var6 - this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.z;
         float var13 = var7;
         byte var14 = 0;
         if (var8 < var13) {
            var13 = var8;
            var14 = 1;
         }

         if (var9 < var13) {
            var13 = var9;
            var14 = 2;
         }

         if (var10 < var13) {
            var13 = var10;
            var14 = 3;
         }

         if (var11 < var13) {
            var13 = var11;
            var14 = 4;
         }

         if (var12 < var13) {
            var14 = 5;
         }

         switch (var14) {
            case 0:
               this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.x = var1;
               break;
            case 1:
               this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.x = var2;
               break;
            case 2:
               this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.y = var3;
               break;
            case 3:
               this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.y = var4;
               break;
            case 4:
               this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.z = var5;
               break;
            case 5:
               this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII.z = var6;
         }
      }
   }

   public void lock() {
      this.locked = true;
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIORIRHRCHCOIHHIOOHIIIHICCCOOH() {
      return this.OCHHRHCCIICHIRHIHRCIHRHIOOOORH;
   }

   @Generated
   public int getX() {
      return this.OOORHRCRROHIORROOCRCHHCICCORIR;
   }

   @Generated
   public int getY() {
      return this.IRRIHORCCOIRHOCCHIRCCHICICHORC;
   }

   @Generated
   public Vector3f HRIRRHCHRHCIHIRROCIIRHHCIOCOOR() {
      return this.ROOOICOIOOOHHHCCIIHIRHHCOHRRII;
   }

   @Generated
   public Vector3f IOHIRIIIICCROCHHOOHIRHCCRHCHIR() {
      return this.CIOCHRCRORCIRHRROIIIIHCRHHOHHI;
   }

   @Generated
   public Vector3f IOICIHRHHHIIORCRHCOCRHCRCIOCHH() {
      return this.ICCIIOOIIOORHCIHORRHHHCROHRIIH;
   }

   @Generated
   public boolean RROCHOCCHIHORIIIHOOOCCCCIOHCOR() {
      return this.locked;
   }
}
