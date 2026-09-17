package com.lunarclient.apollo.module.marker;

import com.lunarclient.apollo.module.marker.display.MarkerDescriptionDisplay;
import com.lunarclient.apollo.module.marker.display.MarkerDisplayCondition;
import com.lunarclient.apollo.module.marker.display.MarkerOwnerDisplay;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public final class MarkerStyle {
   float scale;
   boolean animateMarkerOnHover;
   boolean compactMode;
   boolean textShadow;
   @NotNull
   String ownerSuffix;
   @NotNull
   MarkerOwnerDisplay ownerDisplay;
   @NotNull
   MarkerDisplayCondition showOwner;
   @NotNull
   MarkerDisplayCondition showCoordinates;
   @NotNull
   MarkerDisplayCondition showDistance;
   @NotNull
   MarkerDisplayCondition showDescription;
   @NotNull
   MarkerDescriptionDisplay descriptionDisplay;

   @Generated
   private static float $default$scale() {
      return 1.0F;
   }

   @Generated
   private static boolean $default$animateMarkerOnHover() {
      return true;
   }

   @Generated
   private static boolean $default$compactMode() {
      return false;
   }

   @Generated
   private static boolean $default$textShadow() {
      return true;
   }

   @Generated
   private static String $default$ownerSuffix() {
      return "'s Marker";
   }

   @Generated
   private static MarkerOwnerDisplay $default$ownerDisplay() {
      return MarkerOwnerDisplay.HEAD;
   }

   @Generated
   private static MarkerDisplayCondition $default$showOwner() {
      return MarkerDisplayCondition.ALWAYS;
   }

   @Generated
   private static MarkerDisplayCondition $default$showCoordinates() {
      return MarkerDisplayCondition.NEVER;
   }

   @Generated
   private static MarkerDisplayCondition $default$showDistance() {
      return MarkerDisplayCondition.HOVER;
   }

   @Generated
   private static MarkerDisplayCondition $default$showDescription() {
      return MarkerDisplayCondition.HOVER;
   }

   @Generated
   private static MarkerDescriptionDisplay $default$descriptionDisplay() {
      return MarkerDescriptionDisplay.ICON;
   }

   @Generated
   MarkerStyle(
      float var1,
      boolean var2,
      boolean var3,
      boolean var4,
      @NotNull String var5,
      @NotNull MarkerOwnerDisplay var6,
      @NotNull MarkerDisplayCondition var7,
      @NotNull MarkerDisplayCondition var8,
      @NotNull MarkerDisplayCondition var9,
      @NotNull MarkerDisplayCondition var10,
      @NotNull MarkerDescriptionDisplay var11
   ) {
      if (var5 == null) {
         throw new NullPointerException("ownerSuffix is marked non-null but is null");
      }

      if (var6 == null) {
         throw new NullPointerException("ownerDisplay is marked non-null but is null");
      }

      if (var7 == null) {
         throw new NullPointerException("showOwner is marked non-null but is null");
      }

      if (var8 == null) {
         throw new NullPointerException("showCoordinates is marked non-null but is null");
      }

      if (var9 == null) {
         throw new NullPointerException("showDistance is marked non-null but is null");
      }

      if (var10 == null) {
         throw new NullPointerException("showDescription is marked non-null but is null");
      }

      if (var11 == null) {
         throw new NullPointerException("descriptionDisplay is marked non-null but is null");
      }

      this.scale = var1;
      this.animateMarkerOnHover = var2;
      this.compactMode = var3;
      this.textShadow = var4;
      this.ownerSuffix = var5;
      this.ownerDisplay = var6;
      this.showOwner = var7;
      this.showCoordinates = var8;
      this.showDistance = var9;
      this.showDescription = var10;
      this.descriptionDisplay = var11;
   }

   @Generated
   public static MarkerStyle.MarkerStyleBuilder builder() {
      return new MarkerStyle.MarkerStyleBuilder();
   }

   @Generated
   public float getScale() {
      return this.scale;
   }

   @Generated
   public boolean isAnimateMarkerOnHover() {
      return this.animateMarkerOnHover;
   }

   @Generated
   public boolean isCompactMode() {
      return this.compactMode;
   }

   @Generated
   public boolean isTextShadow() {
      return this.textShadow;
   }

   @NotNull
   @Generated
   public String getOwnerSuffix() {
      return this.ownerSuffix;
   }

   @NotNull
   @Generated
   public MarkerOwnerDisplay getOwnerDisplay() {
      return this.ownerDisplay;
   }

   @NotNull
   @Generated
   public MarkerDisplayCondition getShowOwner() {
      return this.showOwner;
   }

   @NotNull
   @Generated
   public MarkerDisplayCondition getShowCoordinates() {
      return this.showCoordinates;
   }

   @NotNull
   @Generated
   public MarkerDisplayCondition getShowDistance() {
      return this.showDistance;
   }

   @NotNull
   @Generated
   public MarkerDisplayCondition getShowDescription() {
      return this.showDescription;
   }

   @NotNull
   @Generated
   public MarkerDescriptionDisplay getDescriptionDisplay() {
      return this.descriptionDisplay;
   }

   @Generated
   public static class MarkerStyleBuilder {
      @Generated
      private boolean scale$set;
      @Generated
      private float scale$value;
      @Generated
      private boolean animateMarkerOnHover$set;
      @Generated
      private boolean animateMarkerOnHover$value;
      @Generated
      private boolean compactMode$set;
      @Generated
      private boolean compactMode$value;
      @Generated
      private boolean textShadow$set;
      @Generated
      private boolean textShadow$value;
      @Generated
      private boolean ownerSuffix$set;
      @Generated
      private String ownerSuffix$value;
      @Generated
      private boolean ownerDisplay$set;
      @Generated
      private MarkerOwnerDisplay ownerDisplay$value;
      @Generated
      private boolean showOwner$set;
      @Generated
      private MarkerDisplayCondition showOwner$value;
      @Generated
      private boolean showCoordinates$set;
      @Generated
      private MarkerDisplayCondition showCoordinates$value;
      @Generated
      private boolean showDistance$set;
      @Generated
      private MarkerDisplayCondition showDistance$value;
      @Generated
      private boolean showDescription$set;
      @Generated
      private MarkerDisplayCondition showDescription$value;
      @Generated
      private boolean descriptionDisplay$set;
      @Generated
      private MarkerDescriptionDisplay descriptionDisplay$value;

      @Generated
      MarkerStyleBuilder() {
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder scale(float var1) {
         this.scale$value = var1;
         this.scale$set = true;
         return this;
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder animateMarkerOnHover(boolean var1) {
         this.animateMarkerOnHover$value = var1;
         this.animateMarkerOnHover$set = true;
         return this;
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder compactMode(boolean var1) {
         this.compactMode$value = var1;
         this.compactMode$set = true;
         return this;
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder textShadow(boolean var1) {
         this.textShadow$value = var1;
         this.textShadow$set = true;
         return this;
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder ownerSuffix(@NotNull String var1) {
         if (var1 == null) {
            throw new NullPointerException("ownerSuffix is marked non-null but is null");
         }

         this.ownerSuffix$value = var1;
         this.ownerSuffix$set = true;
         return this;
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder ownerDisplay(@NotNull MarkerOwnerDisplay var1) {
         if (var1 == null) {
            throw new NullPointerException("ownerDisplay is marked non-null but is null");
         }

         this.ownerDisplay$value = var1;
         this.ownerDisplay$set = true;
         return this;
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder showOwner(@NotNull MarkerDisplayCondition var1) {
         if (var1 == null) {
            throw new NullPointerException("showOwner is marked non-null but is null");
         }

         this.showOwner$value = var1;
         this.showOwner$set = true;
         return this;
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder showCoordinates(@NotNull MarkerDisplayCondition var1) {
         if (var1 == null) {
            throw new NullPointerException("showCoordinates is marked non-null but is null");
         }

         this.showCoordinates$value = var1;
         this.showCoordinates$set = true;
         return this;
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder showDistance(@NotNull MarkerDisplayCondition var1) {
         if (var1 == null) {
            throw new NullPointerException("showDistance is marked non-null but is null");
         }

         this.showDistance$value = var1;
         this.showDistance$set = true;
         return this;
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder showDescription(@NotNull MarkerDisplayCondition var1) {
         if (var1 == null) {
            throw new NullPointerException("showDescription is marked non-null but is null");
         }

         this.showDescription$value = var1;
         this.showDescription$set = true;
         return this;
      }

      @Generated
      public MarkerStyle.MarkerStyleBuilder descriptionDisplay(@NotNull MarkerDescriptionDisplay var1) {
         if (var1 == null) {
            throw new NullPointerException("descriptionDisplay is marked non-null but is null");
         }

         this.descriptionDisplay$value = var1;
         this.descriptionDisplay$set = true;
         return this;
      }

      @Generated
      public MarkerStyle build() {
         float var1 = this.scale$value;
         if (!this.scale$set) {
            var1 = MarkerStyle.$default$scale();
         }

         boolean var2 = this.animateMarkerOnHover$value;
         if (!this.animateMarkerOnHover$set) {
            var2 = MarkerStyle.$default$animateMarkerOnHover();
         }

         boolean var3 = this.compactMode$value;
         if (!this.compactMode$set) {
            var3 = MarkerStyle.$default$compactMode();
         }

         boolean var4 = this.textShadow$value;
         if (!this.textShadow$set) {
            var4 = MarkerStyle.$default$textShadow();
         }

         String var5 = this.ownerSuffix$value;
         if (!this.ownerSuffix$set) {
            var5 = MarkerStyle.$default$ownerSuffix();
         }

         MarkerOwnerDisplay var6 = this.ownerDisplay$value;
         if (!this.ownerDisplay$set) {
            var6 = MarkerStyle.$default$ownerDisplay();
         }

         MarkerDisplayCondition var7 = this.showOwner$value;
         if (!this.showOwner$set) {
            var7 = MarkerStyle.$default$showOwner();
         }

         MarkerDisplayCondition var8 = this.showCoordinates$value;
         if (!this.showCoordinates$set) {
            var8 = MarkerStyle.$default$showCoordinates();
         }

         MarkerDisplayCondition var9 = this.showDistance$value;
         if (!this.showDistance$set) {
            var9 = MarkerStyle.$default$showDistance();
         }

         MarkerDisplayCondition var10 = this.showDescription$value;
         if (!this.showDescription$set) {
            var10 = MarkerStyle.$default$showDescription();
         }

         MarkerDescriptionDisplay var11 = this.descriptionDisplay$value;
         if (!this.descriptionDisplay$set) {
            var11 = MarkerStyle.$default$descriptionDisplay();
         }

         return new MarkerStyle(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }

      @Generated
      @Override
      public String toString() {
         return "MarkerStyle.MarkerStyleBuilder(scale$value="
            + this.scale$value
            + ", animateMarkerOnHover$value="
            + this.animateMarkerOnHover$value
            + ", compactMode$value="
            + this.compactMode$value
            + ", textShadow$value="
            + this.textShadow$value
            + ", ownerSuffix$value="
            + this.ownerSuffix$value
            + ", ownerDisplay$value="
            + this.ownerDisplay$value
            + ", showOwner$value="
            + this.showOwner$value
            + ", showCoordinates$value="
            + this.showCoordinates$value
            + ", showDistance$value="
            + this.showDistance$value
            + ", showDescription$value="
            + this.showDescription$value
            + ", descriptionDisplay$value="
            + this.descriptionDisplay$value
            + ")";
      }
   }
}
