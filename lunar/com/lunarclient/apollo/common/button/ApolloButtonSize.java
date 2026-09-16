package com.lunarclient.apollo.common.button;

import lombok.Generated;

public final class ApolloButtonSize {
   private final float width;
   private final float height;

   public static ApolloButtonSize of(float var0, float var1) {
      if (var0 > 0.0F && var1 > 0.0F && Float.isFinite(var0) && Float.isFinite(var1)) {
         return new ApolloButtonSize(var0, var1);
      } else {
         throw new IllegalArgumentException("ApolloButtonSize dimensions must be finite and greater than 0");
      }
   }

   public static ApolloButtonSize of(float var0) {
      return of(var0, var0);
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
   private ApolloButtonSize(float var1, float var2) {
      this.width = var1;
      this.height = var2;
   }
}
