package com.lunarclient.apollo.common.icon;

import lombok.Generated;
import org.jetbrains.annotations.Range;

public final class SimpleResourceLocationIcon extends Icon {
   String resourceLocation;
   @Range(from = 0L, to = 2147483647L) int size;

   @Generated
   SimpleResourceLocationIcon(String var1, int var2) {
      this.resourceLocation = var1;
      this.size = var2;
   }

   @Generated
   public static SimpleResourceLocationIcon.SimpleResourceLocationIconBuilder builder() {
      return new SimpleResourceLocationIcon.SimpleResourceLocationIconBuilder();
   }

   @Generated
   public String getResourceLocation() {
      return this.resourceLocation;
   }

   @Generated
   public int getSize() {
      return this.size;
   }

   @Generated
   public static class SimpleResourceLocationIconBuilder {
      @Generated
      private String resourceLocation;
      @Generated
      private int size;

      @Generated
      SimpleResourceLocationIconBuilder() {
      }

      @Generated
      public SimpleResourceLocationIcon.SimpleResourceLocationIconBuilder resourceLocation(String var1) {
         this.resourceLocation = var1;
         return this;
      }

      @Generated
      public SimpleResourceLocationIcon.SimpleResourceLocationIconBuilder size(int var1) {
         this.size = var1;
         return this;
      }

      @Generated
      public SimpleResourceLocationIcon build() {
         return new SimpleResourceLocationIcon(this.resourceLocation, this.size);
      }

      @Generated
      @Override
      public String toString() {
         return "SimpleResourceLocationIcon.SimpleResourceLocationIconBuilder(resourceLocation=" + this.resourceLocation + ", size=" + this.size + ")";
      }
   }
}
