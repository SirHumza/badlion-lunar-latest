package com.lunarclient.apollo.common.cuboid;

import lombok.Generated;

public final class Cuboid2D {
   double minX;
   double minZ;
   double maxX;
   double maxZ;

   @Generated
   Cuboid2D(double var1, double var3, double var5, double var7) {
      this.minX = var1;
      this.minZ = var3;
      this.maxX = var5;
      this.maxZ = var7;
   }

   @Generated
   public static Cuboid2D.Cuboid2DBuilder builder() {
      return new Cuboid2D.Cuboid2DBuilder();
   }

   @Generated
   public double getMinX() {
      return this.minX;
   }

   @Generated
   public double getMinZ() {
      return this.minZ;
   }

   @Generated
   public double getMaxX() {
      return this.maxX;
   }

   @Generated
   public double getMaxZ() {
      return this.maxZ;
   }

   @Generated
   public static class Cuboid2DBuilder {
      @Generated
      private double minX;
      @Generated
      private double minZ;
      @Generated
      private double maxX;
      @Generated
      private double maxZ;

      @Generated
      Cuboid2DBuilder() {
      }

      @Generated
      public Cuboid2D.Cuboid2DBuilder minX(double var1) {
         this.minX = var1;
         return this;
      }

      @Generated
      public Cuboid2D.Cuboid2DBuilder minZ(double var1) {
         this.minZ = var1;
         return this;
      }

      @Generated
      public Cuboid2D.Cuboid2DBuilder maxX(double var1) {
         this.maxX = var1;
         return this;
      }

      @Generated
      public Cuboid2D.Cuboid2DBuilder maxZ(double var1) {
         this.maxZ = var1;
         return this;
      }

      @Generated
      public Cuboid2D build() {
         return new Cuboid2D(this.minX, this.minZ, this.maxX, this.maxZ);
      }

      @Generated
      @Override
      public String toString() {
         return "Cuboid2D.Cuboid2DBuilder(minX=" + this.minX + ", minZ=" + this.minZ + ", maxX=" + this.maxX + ", maxZ=" + this.maxZ + ")";
      }
   }
}
