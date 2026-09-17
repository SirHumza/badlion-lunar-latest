package com.lunarclient.apollo.common.icon;

import lombok.Generated;
import org.jetbrains.annotations.Range;

public final class AdvancedResourceLocationIcon extends Icon {
   String resourceLocation;
   @Range(from = 0L, to = 2147483647L) float width;
   @Range(from = 0L, to = 2147483647L) float height;
   @Range(from = 0L, to = 1L) float minU;
   @Range(from = 0L, to = 1L) float maxU;
   @Range(from = 0L, to = 1L) float minV;
   @Range(from = 0L, to = 1L) float maxV;

   @Generated
   AdvancedResourceLocationIcon(String var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.resourceLocation = var1;
      this.width = var2;
      this.height = var3;
      this.minU = var4;
      this.maxU = var5;
      this.minV = var6;
      this.maxV = var7;
   }

   @Generated
   public static AdvancedResourceLocationIcon.AdvancedResourceLocationIconBuilder builder() {
      return new AdvancedResourceLocationIcon.AdvancedResourceLocationIconBuilder();
   }

   @Generated
   public String getResourceLocation() {
      return this.resourceLocation;
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
   public float getMinU() {
      return this.minU;
   }

   @Generated
   public float getMaxU() {
      return this.maxU;
   }

   @Generated
   public float getMinV() {
      return this.minV;
   }

   @Generated
   public float getMaxV() {
      return this.maxV;
   }

   @Generated
   public static class AdvancedResourceLocationIconBuilder {
      @Generated
      private String resourceLocation;
      @Generated
      private float width;
      @Generated
      private float height;
      @Generated
      private float minU;
      @Generated
      private float maxU;
      @Generated
      private float minV;
      @Generated
      private float maxV;

      @Generated
      AdvancedResourceLocationIconBuilder() {
      }

      @Generated
      public AdvancedResourceLocationIcon.AdvancedResourceLocationIconBuilder resourceLocation(String var1) {
         this.resourceLocation = var1;
         return this;
      }

      @Generated
      public AdvancedResourceLocationIcon.AdvancedResourceLocationIconBuilder width(float var1) {
         this.width = var1;
         return this;
      }

      @Generated
      public AdvancedResourceLocationIcon.AdvancedResourceLocationIconBuilder height(float var1) {
         this.height = var1;
         return this;
      }

      @Generated
      public AdvancedResourceLocationIcon.AdvancedResourceLocationIconBuilder minU(float var1) {
         this.minU = var1;
         return this;
      }

      @Generated
      public AdvancedResourceLocationIcon.AdvancedResourceLocationIconBuilder maxU(float var1) {
         this.maxU = var1;
         return this;
      }

      @Generated
      public AdvancedResourceLocationIcon.AdvancedResourceLocationIconBuilder minV(float var1) {
         this.minV = var1;
         return this;
      }

      @Generated
      public AdvancedResourceLocationIcon.AdvancedResourceLocationIconBuilder maxV(float var1) {
         this.maxV = var1;
         return this;
      }

      @Generated
      public AdvancedResourceLocationIcon build() {
         return new AdvancedResourceLocationIcon(this.resourceLocation, this.width, this.height, this.minU, this.maxU, this.minV, this.maxV);
      }

      @Generated
      @Override
      public String toString() {
         return "AdvancedResourceLocationIcon.AdvancedResourceLocationIconBuilder(resourceLocation="
            + this.resourceLocation
            + ", width="
            + this.width
            + ", height="
            + this.height
            + ", minU="
            + this.minU
            + ", maxU="
            + this.maxU
            + ", minV="
            + this.minV
            + ", maxV="
            + this.maxV
            + ")";
      }
   }
}
