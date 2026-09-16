package com.lunarclient.apollo.common.location;

import lombok.Generated;

public final class HudPosition {
   float x;
   float y;

   public static HudPosition of(float var0, float var1) {
      return new HudPosition(var0, var1);
   }

   @Generated
   HudPosition(float var1, float var2) {
      this.x = var1;
      this.y = var2;
   }

   @Generated
   public static HudPosition.HudPositionBuilder builder() {
      return new HudPosition.HudPositionBuilder();
   }

   @Generated
   public float getX() {
      return this.x;
   }

   @Generated
   public float getY() {
      return this.y;
   }

   @Generated
   public static class HudPositionBuilder {
      @Generated
      private float x;
      @Generated
      private float y;

      @Generated
      HudPositionBuilder() {
      }

      @Generated
      public HudPosition.HudPositionBuilder x(float var1) {
         this.x = var1;
         return this;
      }

      @Generated
      public HudPosition.HudPositionBuilder y(float var1) {
         this.y = var1;
         return this;
      }

      @Generated
      public HudPosition build() {
         return new HudPosition(this.x, this.y);
      }

      @Generated
      @Override
      public String toString() {
         return "HudPosition.HudPositionBuilder(x=" + this.x + ", y=" + this.y + ")";
      }
   }
}
