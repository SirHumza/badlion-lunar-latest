package com.moonsworth.lunar.client.util;

import lombok.Generated;

public class OCIIROIOORRIOIIIRHIRRCCIIRRROH {
   private double x;
   private double y;
   private double width;
   private double height;

   public void HIHOHCCOOHRICHROOORHCCIOORHIHO() {
      this.x = 0.0;
      this.y = 0.0;
      this.width = 0.0;
      this.height = 0.0;
   }

   public double left() {
      return this.getX();
   }

   public double CCIHRCRIHOIOCHIROHCCROHCCOIIRR() {
      return this.getY();
   }

   public double ROOOHORRHCRCIHICRHRRIRHHROHIIO() {
      return this.getX() + this.getWidth();
   }

   public double HHRIIHHIOHHRIORHIRRROHRICOIROO() {
      return this.getY() + this.getHeight();
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCIIROIOORRIOIIIRHIRRCCIIRRROH var1) {
      return this.getX() < var1.ROOOHORRHCRCIHICRHRRIRHHROHIIO()
         && this.ROOOHORRHCRCIHICRHRRIRHHROHIIO() > var1.left()
         && this.CCIHRCRIHOIOCHIROHCCROHCCOIIRR() < var1.HHRIIHHIOHHRIORHIRRROHRICOIROO()
         && this.HHRIIHHIOHHRIORHIRRROHRICOIROO() > var1.CCIHRCRIHOIOCHIROHCCROHCCOIIRR();
   }

   public boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(OCIIROIOORRIOIIIRHIRRCCIIRRROH var1) {
      return var1.left() >= this.left()
         && var1.CCIHRCRIHOIOCHIROHCCROHCCOIIRR() >= this.CCIHRCRIHOIOCHIROHCCROHCCOIIRR()
         && var1.ROOOHORRHCRCIHICRHRRIRHHROHIIO() <= this.ROOOHORRHCRCIHICRHRRIRHHROHIIO()
         && var1.HHRIIHHIOHHRIORHIRRROHRICOIROO() <= this.HHRIIHHIOHHRIORHIRRROHRICOIROO();
   }

   @Generated
   public double getX() {
      return this.x;
   }

   @Generated
   public double getY() {
      return this.y;
   }

   @Generated
   public double getWidth() {
      return this.width;
   }

   @Generated
   public double getHeight() {
      return this.height;
   }

   @Generated
   public void setX(double var1) {
      this.x = var1;
   }

   @Generated
   public void setY(double var1) {
      this.y = var1;
   }

   @Generated
   public void setWidth(double var1) {
      this.width = var1;
   }

   @Generated
   public void setHeight(double var1) {
      this.height = var1;
   }

   @Generated
   public OCIIROIOORRIOIIIRHIRRCCIIRRROH(double var1, double var3, double var5, double var7) {
      this.x = var1;
      this.y = var3;
      this.width = var5;
      this.height = var7;
   }

   @Generated
   public OCIIROIOORRIOIIIRHIRRCCIIRRROH() {
   }
}
