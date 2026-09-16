package com.lunarclient.apollo.common.location;

import lombok.Generated;

public final class ApolloLocation {
   String world;
   double x;
   double y;
   double z;

   @Generated
   ApolloLocation(String var1, double var2, double var4, double var6) {
      this.world = var1;
      this.x = var2;
      this.y = var4;
      this.z = var6;
   }

   @Generated
   public static ApolloLocation.ApolloLocationBuilder builder() {
      return new ApolloLocation.ApolloLocationBuilder();
   }

   @Generated
   public String getWorld() {
      return this.world;
   }

   @Generated
   public double getX() {
      return this.x;
   }

   @Generated
   public double getY() {
      return this.y;
   }

   @Generated
   public double getZ() {
      return this.z;
   }

   @Generated
   public static class ApolloLocationBuilder {
      @Generated
      private String world;
      @Generated
      private double x;
      @Generated
      private double y;
      @Generated
      private double z;

      @Generated
      ApolloLocationBuilder() {
      }

      @Generated
      public ApolloLocation.ApolloLocationBuilder world(String var1) {
         this.world = var1;
         return this;
      }

      @Generated
      public ApolloLocation.ApolloLocationBuilder x(double var1) {
         this.x = var1;
         return this;
      }

      @Generated
      public ApolloLocation.ApolloLocationBuilder y(double var1) {
         this.y = var1;
         return this;
      }

      @Generated
      public ApolloLocation.ApolloLocationBuilder z(double var1) {
         this.z = var1;
         return this;
      }

      @Generated
      public ApolloLocation build() {
         return new ApolloLocation(this.world, this.x, this.y, this.z);
      }

      @Generated
      @Override
      public String toString() {
         return "ApolloLocation.ApolloLocationBuilder(world=" + this.world + ", x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
      }
   }
}
