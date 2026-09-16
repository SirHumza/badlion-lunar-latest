package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.gson.annotations.SerializedName;
import lombok.Generated;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @SerializedName("x")
   private float x;
   @SerializedName("y")
   private float y;
   @SerializedName("width")
   private float width;
   @SerializedName("height")
   private float height;
   private transient float CHOOROOOOCHOHRICORCOCICIOOCOCI;

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      return var1.ICORIROICCORCRROCRCIRRRHHHOOIR() >= this.x
         && var1.ICORIROICCORCRROCRCIRRRHHHOOIR() <= this.x + this.width
         && var1.OICOHRRRRCOICCHOIOROHOCOORCHII() >= this.y
         && var1.OICOHRRRRCOICCHOIOROHOCOORCHII() <= this.y + this.height;
   }

   @Generated
   public float getX() {
      return this.x;
   }

   @Generated
   public float getY() {
      return this.y;
   }

   @Generated
   public float getWidth() {
      return this.width;
   }

   @Generated
   public float getHeight() {
      return this.height;
   }

   @Generated
   public float ROIRICOHOICIIHRCROHICOOHIOIHCI() {
      return this.CHOOROOOOCHOHRICORCOCICIOOCOCI;
   }

   @Generated
   public void setX(float var1) {
      this.x = var1;
   }

   @Generated
   public void setY(float var1) {
      this.y = var1;
   }

   @Generated
   public void IHRHHHORORIROOCORCIORRCOCHHHRI(float var1) {
      this.width = var1;
   }

   @Generated
   public void OIOORROOHCRRCOCOHICICRCIOCIIOH(float var1) {
      this.height = var1;
   }

   @Generated
   public void RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(float var1) {
      this.CHOOROOOOCHOHRICORCOCICIOOCOCI = var1;
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(float var1, float var2, float var3, float var4, float var5) {
      this.x = var1;
      this.y = var2;
      this.width = var3;
      this.height = var4;
      this.CHOOROOOOCHOHRICORCOCICIOOCOCI = var5;
   }
}
