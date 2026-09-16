package com.lunarclient.apollo.common.location;

import lombok.Generated;

public final class ApolloPlayerLocation {
   ApolloLocation location;
   float yaw;
   float pitch;

   @Generated
   ApolloPlayerLocation(ApolloLocation var1, float var2, float var3) {
      this.location = var1;
      this.yaw = var2;
      this.pitch = var3;
   }

   @Generated
   public static ApolloPlayerLocation.ApolloPlayerLocationBuilder builder() {
      return new ApolloPlayerLocation.ApolloPlayerLocationBuilder();
   }

   @Generated
   public ApolloLocation getLocation() {
      return this.location;
   }

   @Generated
   public float getYaw() {
      return this.yaw;
   }

   @Generated
   public float getPitch() {
      return this.pitch;
   }

   @Generated
   public static class ApolloPlayerLocationBuilder {
      @Generated
      private ApolloLocation location;
      @Generated
      private float yaw;
      @Generated
      private float pitch;

      @Generated
      ApolloPlayerLocationBuilder() {
      }

      @Generated
      public ApolloPlayerLocation.ApolloPlayerLocationBuilder location(ApolloLocation var1) {
         this.location = var1;
         return this;
      }

      @Generated
      public ApolloPlayerLocation.ApolloPlayerLocationBuilder yaw(float var1) {
         this.yaw = var1;
         return this;
      }

      @Generated
      public ApolloPlayerLocation.ApolloPlayerLocationBuilder pitch(float var1) {
         this.pitch = var1;
         return this;
      }

      @Generated
      public ApolloPlayerLocation build() {
         return new ApolloPlayerLocation(this.location, this.yaw, this.pitch);
      }

      @Generated
      @Override
      public String toString() {
         return "ApolloPlayerLocation.ApolloPlayerLocationBuilder(location=" + this.location + ", yaw=" + this.yaw + ", pitch=" + this.pitch + ")";
      }
   }
}
