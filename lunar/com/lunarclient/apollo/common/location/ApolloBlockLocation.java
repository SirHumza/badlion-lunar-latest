package com.lunarclient.apollo.common.location;

import lombok.Generated;

public final class ApolloBlockLocation {
   String world;
   int x;
   int y;
   int z;

   @Generated
   ApolloBlockLocation(String var1, int var2, int var3, int var4) {
      this.world = var1;
      this.x = var2;
      this.y = var3;
      this.z = var4;
   }

   @Generated
   public static ApolloBlockLocation.ApolloBlockLocationBuilder builder() {
      return new ApolloBlockLocation.ApolloBlockLocationBuilder();
   }

   @Generated
   public String getWorld() {
      return this.world;
   }

   @Generated
   public int getX() {
      return this.x;
   }

   @Generated
   public int getY() {
      return this.y;
   }

   @Generated
   public int getZ() {
      return this.z;
   }

   @Generated
   public static class ApolloBlockLocationBuilder {
      @Generated
      private String world;
      @Generated
      private int x;
      @Generated
      private int y;
      @Generated
      private int z;

      @Generated
      ApolloBlockLocationBuilder() {
      }

      @Generated
      public ApolloBlockLocation.ApolloBlockLocationBuilder world(String var1) {
         this.world = var1;
         return this;
      }

      @Generated
      public ApolloBlockLocation.ApolloBlockLocationBuilder x(int var1) {
         this.x = var1;
         return this;
      }

      @Generated
      public ApolloBlockLocation.ApolloBlockLocationBuilder y(int var1) {
         this.y = var1;
         return this;
      }

      @Generated
      public ApolloBlockLocation.ApolloBlockLocationBuilder z(int var1) {
         this.z = var1;
         return this;
      }

      @Generated
      public ApolloBlockLocation build() {
         return new ApolloBlockLocation(this.world, this.x, this.y, this.z);
      }

      @Generated
      @Override
      public String toString() {
         return "ApolloBlockLocation.ApolloBlockLocationBuilder(world=" + this.world + ", x=" + this.x + ", y=" + this.y + ", z=" + this.z + ")";
      }
   }
}
