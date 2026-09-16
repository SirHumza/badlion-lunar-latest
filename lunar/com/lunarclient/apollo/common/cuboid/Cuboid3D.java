package com.lunarclient.apollo.common.cuboid;

import lombok.Generated;

public final class Cuboid3D {
   double minX;
   double minY;
   double minZ;
   double maxX;
   double maxY;
   double maxZ;

   @Generated
   Cuboid3D(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.minX = var1;
      this.minY = var3;
      this.minZ = var5;
      this.maxX = var7;
      this.maxY = var9;
      this.maxZ = var11;
   }

   @Generated
   public static Cuboid3D.Cuboid3DBuilder builder() {
      return new Cuboid3D.Cuboid3DBuilder();
   }

   @Generated
   public double getMinX() {
      return this.minX;
   }

   @Generated
   public double getMinY() {
      return this.minY;
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
   public double getMaxY() {
      return this.maxY;
   }

   @Generated
   public double getMaxZ() {
      return this.maxZ;
   }

   @Generated
   public static class Cuboid3DBuilder {
      @Generated
      private double minX;
      @Generated
      private double minY;
      @Generated
      private double minZ;
      @Generated
      private double maxX;
      @Generated
      private double maxY;
      @Generated
      private double maxZ;

      @Generated
      Cuboid3DBuilder() {
      }

      @Generated
      public Cuboid3D.Cuboid3DBuilder minX(double var1) {
         this.minX = var1;
         return this;
      }

      @Generated
      public Cuboid3D.Cuboid3DBuilder minY(double var1) {
         this.minY = var1;
         return this;
      }

      @Generated
      public Cuboid3D.Cuboid3DBuilder minZ(double var1) {
         this.minZ = var1;
         return this;
      }

      @Generated
      public Cuboid3D.Cuboid3DBuilder maxX(double var1) {
         this.maxX = var1;
         return this;
      }

      @Generated
      public Cuboid3D.Cuboid3DBuilder maxY(double var1) {
         this.maxY = var1;
         return this;
      }

      @Generated
      public Cuboid3D.Cuboid3DBuilder maxZ(double var1) {
         this.maxZ = var1;
         return this;
      }

      @Generated
      public Cuboid3D build() {
         return new Cuboid3D(this.minX, this.minY, this.minZ, this.maxX, this.maxY, this.maxZ);
      }

      @Generated
      @Override
      public String toString() {
         return "Cuboid3D.Cuboid3DBuilder(minX="
            + this.minX
            + ", minY="
            + this.minY
            + ", minZ="
            + this.minZ
            + ", maxX="
            + this.maxX
            + ", maxY="
            + this.maxY
            + ", maxZ="
            + this.maxZ
            + ")";
      }
   }
}
