package com.lunarclient.apollo.module.vignette;

import lombok.Generated;
import org.jetbrains.annotations.Range;

public final class Vignette {
   String resourceLocation;
   @Range(from = 0L, to = 1L) float opacity;

   @Generated
   Vignette(String var1, float var2) {
      this.resourceLocation = var1;
      this.opacity = var2;
   }

   @Generated
   public static Vignette.VignetteBuilder builder() {
      return new Vignette.VignetteBuilder();
   }

   @Generated
   public String getResourceLocation() {
      return this.resourceLocation;
   }

   @Generated
   public float getOpacity() {
      return this.opacity;
   }

   @Generated
   public static class VignetteBuilder {
      @Generated
      private String resourceLocation;
      @Generated
      private float opacity;

      @Generated
      VignetteBuilder() {
      }

      @Generated
      public Vignette.VignetteBuilder resourceLocation(String var1) {
         this.resourceLocation = var1;
         return this;
      }

      @Generated
      public Vignette.VignetteBuilder opacity(float var1) {
         this.opacity = var1;
         return this;
      }

      @Generated
      public Vignette build() {
         return new Vignette(this.resourceLocation, this.opacity);
      }

      @Generated
      @Override
      public String toString() {
         return "Vignette.VignetteBuilder(resourceLocation=" + this.resourceLocation + ", opacity=" + this.opacity + ")";
      }
   }
}
