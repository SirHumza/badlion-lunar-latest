package com.lunarclient.apollo.common.icon;

import lombok.Generated;

public final class ResourceLocationIcon extends Icon {
   String resourceLocation;

   @Generated
   ResourceLocationIcon(String var1) {
      this.resourceLocation = var1;
   }

   @Generated
   public static ResourceLocationIcon.ResourceLocationIconBuilder builder() {
      return new ResourceLocationIcon.ResourceLocationIconBuilder();
   }

   @Generated
   public String getResourceLocation() {
      return this.resourceLocation;
   }

   @Generated
   public static class ResourceLocationIconBuilder {
      @Generated
      private String resourceLocation;

      @Generated
      ResourceLocationIconBuilder() {
      }

      @Generated
      public ResourceLocationIcon.ResourceLocationIconBuilder resourceLocation(String var1) {
         this.resourceLocation = var1;
         return this;
      }

      @Generated
      public ResourceLocationIcon build() {
         return new ResourceLocationIcon(this.resourceLocation);
      }

      @Generated
      @Override
      public String toString() {
         return "ResourceLocationIcon.ResourceLocationIconBuilder(resourceLocation=" + this.resourceLocation + ")";
      }
   }
}
