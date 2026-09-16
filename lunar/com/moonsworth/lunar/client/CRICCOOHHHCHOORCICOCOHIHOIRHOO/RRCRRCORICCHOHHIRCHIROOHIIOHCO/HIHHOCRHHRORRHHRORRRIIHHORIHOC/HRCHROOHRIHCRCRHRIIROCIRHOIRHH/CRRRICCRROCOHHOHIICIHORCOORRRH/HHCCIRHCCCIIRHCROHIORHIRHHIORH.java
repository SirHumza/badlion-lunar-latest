package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private double prevX;
   private double x;
   private double CRRICROCIRHOHCCOIORCCRCHIRRRHO;
   private double y;
   private double prevZ;
   private double z;
   private float HRIROIRRIRIICOHCHORRCICROHIOCI;
   private float yaw;
   private float CHORCRHOORCIOHHIOCORCCCCCIRCCR;
   private float pitch;
   private int RCCCRIIRHCHHHOIORIRICHROIIRROO;

   public void setPos(double var1, double var3, double var5) {
      this.prevX = this.x;
      this.CRRICROCIRHOHCCOIORCCRCHIRRRHO = this.y;
      this.prevZ = this.z;
      this.x = var1;
      this.y = var3;
      this.z = var5;
   }

   public void RIROICHCRROROHCCROOCCCCOCHCCRI(float var1, float var2) {
      this.HRIROIRRIRIICOHCHORRCICROHIOCI = this.yaw;
      this.CHORCRHOORCIOHHIOCORCCCCCIRCCR = this.pitch;
      this.yaw = var1;
      this.pitch = var2;
   }

   public float ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(float var1) {
      return this.HRIROIRRIRIICOHCHORRCICROHIOCI + (this.yaw - this.HRIROIRRIRIICOHCHORRCICROHIOCI) * var1;
   }

   public float HRHIHIRHRCHHRORRRCORHOCIRHRIOR(float var1) {
      return this.CHORCRHOORCIOHHIOCORCCCCCIRCCR + (this.pitch - this.CHORCRHOORCIOHHIOCORCCCCCIRCCR) * var1;
   }

   @Generated
   public double HIRHIICCCRIIOORHOIROICRCHHCHRC() {
      return this.prevX;
   }

   @Generated
   public double getX() {
      return this.x;
   }

   @Generated
   public double RIHCICHIICIHROCOIIHRCCCRHHROIR() {
      return this.CRRICROCIRHOHCCOIORCCRCHIRRRHO;
   }

   @Generated
   public double getY() {
      return this.y;
   }

   @Generated
   public double OIHOHROICIIICRCHCROOOHIRIOHORI() {
      return this.prevZ;
   }

   @Generated
   public double getZ() {
      return this.z;
   }

   @Generated
   public float COIIOIIICCRIROCOIRRIOIROOOOIRR() {
      return this.HRIROIRRIRIICOHCHORRCICROHIOCI;
   }

   @Generated
   public float getYaw() {
      return this.yaw;
   }

   @Generated
   public float HCRRCCHRICHRHOHRCICCCIORCRRRII() {
      return this.CHORCRHOORCIOHHIOCORCCCCCIRCCR;
   }

   @Generated
   public float getPitch() {
      return this.pitch;
   }

   @Generated
   public int RIOOIIORCHRCIIRIIROCCHRHOORIIR() {
      return this.RCCCRIIRHCHHHOIORIRICHROIIRROO;
   }

   @Generated
   public void ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(double var1) {
      this.prevX = var1;
   }

   @Generated
   public void setX(double var1) {
      this.x = var1;
   }

   @Generated
   public void IOHIHIIHCCCCCIHRORIOIOORCIOHII(double var1) {
      this.CRRICROCIRHOHCCOIORCCRCHIRRRHO = var1;
   }

   @Generated
   public void setY(double var1) {
      this.y = var1;
   }

   @Generated
   public void RCIROOOOICRHCCRRCIORHHIRCOIIIC(double var1) {
      this.prevZ = var1;
   }

   @Generated
   public void IRRCCOICORICIHCHRHIHIHROIRHOCR(double var1) {
      this.z = var1;
   }

   @Generated
   public void OCOROCROIRCHIHIHHOOIRIIIRRCRHI(float var1) {
      this.HRIROIRRIRIICOHCHORRCICROHIOCI = var1;
   }

   @Generated
   public void IHICORCROOROHCIHIHCOIHRRHICICO(float var1) {
      this.yaw = var1;
   }

   @Generated
   public void IOCIIROIRCOHIRHHHROHCOOHIICIHI(float var1) {
      this.CHORCRHOORCIOHHIOCORCCCCCIRCCR = var1;
   }

   @Generated
   public void HCHRIROHHHCORIOCROOCHRCIOROOCI(float var1) {
      this.pitch = var1;
   }

   @Generated
   public void IRIRICIHHCOICHHCHCOCCHHOROOCHH(int var1) {
      this.RCCCRIIRHCHHHOIORIRICHROIIRROO = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else if (Double.compare(this.HIRHIICCCRIIOORHOIROICRCHHCHRC(), var2.HIRHIICCCRIIOORHOIROICRCHHCHRC()) != 0) {
         return false;
      } else if (Double.compare(this.getX(), var2.getX()) != 0) {
         return false;
      } else if (Double.compare(this.RIHCICHIICIHROCOIIHRCCCRHHROIR(), var2.RIHCICHIICIHROCOIIHRCCCRHHROIR()) != 0) {
         return false;
      } else if (Double.compare(this.getY(), var2.getY()) != 0) {
         return false;
      } else if (Double.compare(this.OIHOHROICIIICRCHCROOOHIRIOHORI(), var2.OIHOHROICIIICRCHCROOOHIRIOHORI()) != 0) {
         return false;
      } else if (Double.compare(this.getZ(), var2.getZ()) != 0) {
         return false;
      } else if (Float.compare(this.COIIOIIICCRIROCOIRRIOIROOOOIRR(), var2.COIIOIIICCRIROCOIRRIOIROOOOIRR()) != 0) {
         return false;
      } else if (Float.compare(this.getYaw(), var2.getYaw()) != 0) {
         return false;
      } else if (Float.compare(this.HCRRCCHRICHRHOHRCICCCIORCRRRII(), var2.HCRRCCHRICHRHOHRCICCCIORCRRRII()) != 0) {
         return false;
      } else {
         return Float.compare(this.getPitch(), var2.getPitch()) != 0 ? false : this.RIOOIIORCHRCIIRIIROCCHRHOORIIR() == var2.RIOOIIORCHRCIIRIIROCCHRHOORIIR();
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      long var3 = Double.doubleToLongBits(this.HIRHIICCCRIIOORHOIROICRCHHCHRC());
      var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
      long var5 = Double.doubleToLongBits(this.getX());
      var2 = var2 * 59 + (int)(var5 >>> 32 ^ var5);
      long var7 = Double.doubleToLongBits(this.RIHCICHIICIHROCOIIHRCCCRHHROIR());
      var2 = var2 * 59 + (int)(var7 >>> 32 ^ var7);
      long var9 = Double.doubleToLongBits(this.getY());
      var2 = var2 * 59 + (int)(var9 >>> 32 ^ var9);
      long var11 = Double.doubleToLongBits(this.OIHOHROICIIICRCHCROOOHIRIOHORI());
      var2 = var2 * 59 + (int)(var11 >>> 32 ^ var11);
      long var13 = Double.doubleToLongBits(this.getZ());
      var2 = var2 * 59 + (int)(var13 >>> 32 ^ var13);
      var2 = var2 * 59 + Float.floatToIntBits(this.COIIOIIICCRIROCOIRRIOIROOOOIRR());
      var2 = var2 * 59 + Float.floatToIntBits(this.getYaw());
      var2 = var2 * 59 + Float.floatToIntBits(this.HCRRCCHRICHRHOHRCICCCIORCRRRII());
      var2 = var2 * 59 + Float.floatToIntBits(this.getPitch());
      return var2 * 59 + this.RIOOIIORCHRCIIRIIROCCHRHOORIIR();
   }

   @Generated
   @Override
   public String toString() {
      return "LocalPlayerContext(prevX="
         + this.HIRHIICCCRIIOORHOIROICRCHHCHRC()
         + ", x="
         + this.getX()
         + ", prevY="
         + this.RIHCICHIICIHROCOIIHRCCCRHHROIR()
         + ", y="
         + this.getY()
         + ", prevZ="
         + this.OIHOHROICIIICRCHCROOOHIRIOHORI()
         + ", z="
         + this.getZ()
         + ", prevYaw="
         + this.COIIOIIICCRIROCOIRRIOIROOOOIRR()
         + ", yaw="
         + this.getYaw()
         + ", prevPitch="
         + this.HCRRCCHRICHRHOHRCICCCIORCRRRII()
         + ", pitch="
         + this.getPitch()
         + ", view="
         + this.RIOOIIORCHRCIIRIIROCCHRHOORIIR()
         + ")";
   }
}
