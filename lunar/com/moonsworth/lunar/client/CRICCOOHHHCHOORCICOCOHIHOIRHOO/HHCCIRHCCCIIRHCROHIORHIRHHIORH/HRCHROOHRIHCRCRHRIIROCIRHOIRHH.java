package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import lombok.Generated;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private int OOHOHIRIOCCOHOIRRIHHCRCOHCHOCC;
   private int height;
   private int ROCRHROHHOIIROROHHRCHCCROOIIHR;
   private int minWidth;
   private int width;
   private int maxWidth;

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var0, int var1, int var2, int var3, int var4, int var5) {
      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0, var1, var2, var3, var4, var5);
   }

   @Generated
   public int OCCIHRHCORHORRCIIHOCRIIOHRHCRI() {
      return this.OOHOHIRIOCCOHOIRRIHHCRCOHCHOCC;
   }

   @Generated
   public int getHeight() {
      return this.height;
   }

   @Generated
   public int COCHCHROIICOROIRHOCROCCHHHROHC() {
      return this.ROCRHROHHOIIROROHHRCHCCROOIIHR;
   }

   @Generated
   public int ORCOCCOCOOHHORHRCOIHHHOOHOIHCI() {
      return this.minWidth;
   }

   @Generated
   public int getWidth() {
      return this.width;
   }

   @Generated
   public int getMaxWidth() {
      return this.maxWidth;
   }

   @Generated
   public void RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(int var1) {
      this.OOHOHIRIOCCOHOIRRIHHCRCOHCHOCC = var1;
   }

   @Generated
   public void setHeight(int var1) {
      this.height = var1;
   }

   @Generated
   public void RRHOOOORORHHOOIHRCCHIIHHIIIIOH(int var1) {
      this.ROCRHROHHOIIROROHHRCHCCROOIIHR = var1;
   }

   @Generated
   public void setMinWidth(int var1) {
      this.minWidth = var1;
   }

   @Generated
   public void setWidth(int var1) {
      this.width = var1;
   }

   @Generated
   public void setMaxWidth(int var1) {
      this.maxWidth = var1;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2)) {
         return false;
      } else if (!var2.canEqual(this)) {
         return false;
      } else if (this.OCCIHRHCORHORRCIIHOCRIIOHRHCRI() != var2.OCCIHRHCORHORRCIIHOCRIIOHRHCRI()) {
         return false;
      } else if (this.getHeight() != var2.getHeight()) {
         return false;
      } else if (this.COCHCHROIICOROIRHOCROCCHHHROHC() != var2.COCHCHROIICOROIRHOCROCCHHHROHC()) {
         return false;
      } else if (this.ORCOCCOCOOHHORHRCOIHHHOOHOIHCI() != var2.ORCOCCOCOOHHORHRCOIHHHOOHOIHCI()) {
         return false;
      } else {
         return this.getWidth() != var2.getWidth() ? false : this.getMaxWidth() == var2.getMaxWidth();
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + this.OCCIHRHCORHORRCIIHOCRIIOHRHCRI();
      var2 = var2 * 59 + this.getHeight();
      var2 = var2 * 59 + this.COCHCHROIICOROIRHOCROCCHHHROHC();
      var2 = var2 * 59 + this.ORCOCCOCOOHHORHRCOIHHHOOHOIHCI();
      var2 = var2 * 59 + this.getWidth();
      return var2 * 59 + this.getMaxWidth();
   }

   @Generated
   @Override
   public String toString() {
      return "HudSize(minHeight="
         + this.OCCIHRHCORHORRCIIHOCRIIOHRHCRI()
         + ", height="
         + this.getHeight()
         + ", maxHeight="
         + this.COCHCHROIICOROIRHOCROCCHHHROHC()
         + ", minWidth="
         + this.ORCOCCOCOOHHORHRCOIHHHOOHOIHCI()
         + ", width="
         + this.getWidth()
         + ", maxWidth="
         + this.getMaxWidth()
         + ")";
   }

   @Generated
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.OOHOHIRIOCCOHOIRRIHHCRCOHCHOCC = var1;
      this.height = var2;
      this.ROCRHROHHOIIROROHHRCHCCROOIIHR = var3;
      this.minWidth = var4;
      this.width = var5;
      this.maxWidth = var6;
   }
}
