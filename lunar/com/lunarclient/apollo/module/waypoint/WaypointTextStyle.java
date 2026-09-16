package com.lunarclient.apollo.module.waypoint;

import lombok.Generated;

public final class WaypointTextStyle {
   boolean showText;
   boolean onlyShowTextWhenLookingNear;
   boolean showIcons;
   float textIconScale;
   float labelScale;
   float boxPadding;
   boolean boxBorders;
   boolean textShadow;
   boolean showDistance;

   @Generated
   private static boolean $default$showText() {
      return true;
   }

   @Generated
   private static boolean $default$onlyShowTextWhenLookingNear() {
      return false;
   }

   @Generated
   private static boolean $default$showIcons() {
      return false;
   }

   @Generated
   private static float $default$textIconScale() {
      return 1.5F;
   }

   @Generated
   private static float $default$labelScale() {
      return 1.0F;
   }

   @Generated
   private static float $default$boxPadding() {
      return 4.0F;
   }

   @Generated
   private static boolean $default$boxBorders() {
      return true;
   }

   @Generated
   private static boolean $default$textShadow() {
      return false;
   }

   @Generated
   private static boolean $default$showDistance() {
      return true;
   }

   @Generated
   WaypointTextStyle(boolean var1, boolean var2, boolean var3, float var4, float var5, float var6, boolean var7, boolean var8, boolean var9) {
      this.showText = var1;
      this.onlyShowTextWhenLookingNear = var2;
      this.showIcons = var3;
      this.textIconScale = var4;
      this.labelScale = var5;
      this.boxPadding = var6;
      this.boxBorders = var7;
      this.textShadow = var8;
      this.showDistance = var9;
   }

   @Generated
   public static WaypointTextStyle.WaypointTextStyleBuilder builder() {
      return new WaypointTextStyle.WaypointTextStyleBuilder();
   }

   @Generated
   public boolean isShowText() {
      return this.showText;
   }

   @Generated
   public boolean isOnlyShowTextWhenLookingNear() {
      return this.onlyShowTextWhenLookingNear;
   }

   @Generated
   public boolean isShowIcons() {
      return this.showIcons;
   }

   @Generated
   public float getTextIconScale() {
      return this.textIconScale;
   }

   @Generated
   public float getLabelScale() {
      return this.labelScale;
   }

   @Generated
   public float getBoxPadding() {
      return this.boxPadding;
   }

   @Generated
   public boolean isBoxBorders() {
      return this.boxBorders;
   }

   @Generated
   public boolean isTextShadow() {
      return this.textShadow;
   }

   @Generated
   public boolean isShowDistance() {
      return this.showDistance;
   }

   @Generated
   public static class WaypointTextStyleBuilder {
      @Generated
      private boolean showText$set;
      @Generated
      private boolean showText$value;
      @Generated
      private boolean onlyShowTextWhenLookingNear$set;
      @Generated
      private boolean onlyShowTextWhenLookingNear$value;
      @Generated
      private boolean showIcons$set;
      @Generated
      private boolean showIcons$value;
      @Generated
      private boolean textIconScale$set;
      @Generated
      private float textIconScale$value;
      @Generated
      private boolean labelScale$set;
      @Generated
      private float labelScale$value;
      @Generated
      private boolean boxPadding$set;
      @Generated
      private float boxPadding$value;
      @Generated
      private boolean boxBorders$set;
      @Generated
      private boolean boxBorders$value;
      @Generated
      private boolean textShadow$set;
      @Generated
      private boolean textShadow$value;
      @Generated
      private boolean showDistance$set;
      @Generated
      private boolean showDistance$value;

      @Generated
      WaypointTextStyleBuilder() {
      }

      @Generated
      public WaypointTextStyle.WaypointTextStyleBuilder showText(boolean var1) {
         this.showText$value = var1;
         this.showText$set = true;
         return this;
      }

      @Generated
      public WaypointTextStyle.WaypointTextStyleBuilder onlyShowTextWhenLookingNear(boolean var1) {
         this.onlyShowTextWhenLookingNear$value = var1;
         this.onlyShowTextWhenLookingNear$set = true;
         return this;
      }

      @Generated
      public WaypointTextStyle.WaypointTextStyleBuilder showIcons(boolean var1) {
         this.showIcons$value = var1;
         this.showIcons$set = true;
         return this;
      }

      @Generated
      public WaypointTextStyle.WaypointTextStyleBuilder textIconScale(float var1) {
         this.textIconScale$value = var1;
         this.textIconScale$set = true;
         return this;
      }

      @Generated
      public WaypointTextStyle.WaypointTextStyleBuilder labelScale(float var1) {
         this.labelScale$value = var1;
         this.labelScale$set = true;
         return this;
      }

      @Generated
      public WaypointTextStyle.WaypointTextStyleBuilder boxPadding(float var1) {
         this.boxPadding$value = var1;
         this.boxPadding$set = true;
         return this;
      }

      @Generated
      public WaypointTextStyle.WaypointTextStyleBuilder boxBorders(boolean var1) {
         this.boxBorders$value = var1;
         this.boxBorders$set = true;
         return this;
      }

      @Generated
      public WaypointTextStyle.WaypointTextStyleBuilder textShadow(boolean var1) {
         this.textShadow$value = var1;
         this.textShadow$set = true;
         return this;
      }

      @Generated
      public WaypointTextStyle.WaypointTextStyleBuilder showDistance(boolean var1) {
         this.showDistance$value = var1;
         this.showDistance$set = true;
         return this;
      }

      @Generated
      public WaypointTextStyle build() {
         boolean var1 = this.showText$value;
         if (!this.showText$set) {
            var1 = WaypointTextStyle.$default$showText();
         }

         boolean var2 = this.onlyShowTextWhenLookingNear$value;
         if (!this.onlyShowTextWhenLookingNear$set) {
            var2 = WaypointTextStyle.$default$onlyShowTextWhenLookingNear();
         }

         boolean var3 = this.showIcons$value;
         if (!this.showIcons$set) {
            var3 = WaypointTextStyle.$default$showIcons();
         }

         float var4 = this.textIconScale$value;
         if (!this.textIconScale$set) {
            var4 = WaypointTextStyle.$default$textIconScale();
         }

         float var5 = this.labelScale$value;
         if (!this.labelScale$set) {
            var5 = WaypointTextStyle.$default$labelScale();
         }

         float var6 = this.boxPadding$value;
         if (!this.boxPadding$set) {
            var6 = WaypointTextStyle.$default$boxPadding();
         }

         boolean var7 = this.boxBorders$value;
         if (!this.boxBorders$set) {
            var7 = WaypointTextStyle.$default$boxBorders();
         }

         boolean var8 = this.textShadow$value;
         if (!this.textShadow$set) {
            var8 = WaypointTextStyle.$default$textShadow();
         }

         boolean var9 = this.showDistance$value;
         if (!this.showDistance$set) {
            var9 = WaypointTextStyle.$default$showDistance();
         }

         return new WaypointTextStyle(var1, var2, var3, var4, var5, var6, var7, var8, var9);
      }

      @Generated
      @Override
      public String toString() {
         return "WaypointTextStyle.WaypointTextStyleBuilder(showText$value="
            + this.showText$value
            + ", onlyShowTextWhenLookingNear$value="
            + this.onlyShowTextWhenLookingNear$value
            + ", showIcons$value="
            + this.showIcons$value
            + ", textIconScale$value="
            + this.textIconScale$value
            + ", labelScale$value="
            + this.labelScale$value
            + ", boxPadding$value="
            + this.boxPadding$value
            + ", boxBorders$value="
            + this.boxBorders$value
            + ", textShadow$value="
            + this.textShadow$value
            + ", showDistance$value="
            + this.showDistance$value
            + ")";
      }
   }
}
