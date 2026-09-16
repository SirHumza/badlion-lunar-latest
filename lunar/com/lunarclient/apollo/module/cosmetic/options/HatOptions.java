package com.lunarclient.apollo.module.cosmetic.options;

import lombok.Generated;

public final class HatOptions extends CosmeticOptions {
   boolean showOverHelmet;
   boolean showOverSkinLayer;
   float heightOffset;

   @Generated
   private static boolean $default$showOverHelmet() {
      return true;
   }

   @Generated
   private static boolean $default$showOverSkinLayer() {
      return true;
   }

   @Generated
   private static float $default$heightOffset() {
      return 0.0F;
   }

   @Generated
   HatOptions(boolean var1, boolean var2, float var3) {
      this.showOverHelmet = var1;
      this.showOverSkinLayer = var2;
      this.heightOffset = var3;
   }

   @Generated
   public static HatOptions.HatOptionsBuilder builder() {
      return new HatOptions.HatOptionsBuilder();
   }

   @Generated
   public boolean isShowOverHelmet() {
      return this.showOverHelmet;
   }

   @Generated
   public boolean isShowOverSkinLayer() {
      return this.showOverSkinLayer;
   }

   @Generated
   public float getHeightOffset() {
      return this.heightOffset;
   }

   @Generated
   public static class HatOptionsBuilder {
      @Generated
      private boolean showOverHelmet$set;
      @Generated
      private boolean showOverHelmet$value;
      @Generated
      private boolean showOverSkinLayer$set;
      @Generated
      private boolean showOverSkinLayer$value;
      @Generated
      private boolean heightOffset$set;
      @Generated
      private float heightOffset$value;

      @Generated
      HatOptionsBuilder() {
      }

      @Generated
      public HatOptions.HatOptionsBuilder showOverHelmet(boolean var1) {
         this.showOverHelmet$value = var1;
         this.showOverHelmet$set = true;
         return this;
      }

      @Generated
      public HatOptions.HatOptionsBuilder showOverSkinLayer(boolean var1) {
         this.showOverSkinLayer$value = var1;
         this.showOverSkinLayer$set = true;
         return this;
      }

      @Generated
      public HatOptions.HatOptionsBuilder heightOffset(float var1) {
         this.heightOffset$value = var1;
         this.heightOffset$set = true;
         return this;
      }

      @Generated
      public HatOptions build() {
         boolean var1 = this.showOverHelmet$value;
         if (!this.showOverHelmet$set) {
            var1 = HatOptions.$default$showOverHelmet();
         }

         boolean var2 = this.showOverSkinLayer$value;
         if (!this.showOverSkinLayer$set) {
            var2 = HatOptions.$default$showOverSkinLayer();
         }

         float var3 = this.heightOffset$value;
         if (!this.heightOffset$set) {
            var3 = HatOptions.$default$heightOffset();
         }

         return new HatOptions(var1, var2, var3);
      }

      @Generated
      @Override
      public String toString() {
         return "HatOptions.HatOptionsBuilder(showOverHelmet$value="
            + this.showOverHelmet$value
            + ", showOverSkinLayer$value="
            + this.showOverSkinLayer$value
            + ", heightOffset$value="
            + this.heightOffset$value
            + ")";
      }
   }
}
