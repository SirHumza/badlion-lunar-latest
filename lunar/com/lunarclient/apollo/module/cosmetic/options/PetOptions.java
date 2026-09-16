package com.lunarclient.apollo.module.cosmetic.options;

import lombok.Generated;

public final class PetOptions extends CosmeticOptions {
   boolean flipShoulder;

   @Generated
   private static boolean $default$flipShoulder() {
      return false;
   }

   @Generated
   PetOptions(boolean var1) {
      this.flipShoulder = var1;
   }

   @Generated
   public static PetOptions.PetOptionsBuilder builder() {
      return new PetOptions.PetOptionsBuilder();
   }

   @Generated
   public boolean isFlipShoulder() {
      return this.flipShoulder;
   }

   @Generated
   public static class PetOptionsBuilder {
      @Generated
      private boolean flipShoulder$set;
      @Generated
      private boolean flipShoulder$value;

      @Generated
      PetOptionsBuilder() {
      }

      @Generated
      public PetOptions.PetOptionsBuilder flipShoulder(boolean var1) {
         this.flipShoulder$value = var1;
         this.flipShoulder$set = true;
         return this;
      }

      @Generated
      public PetOptions build() {
         boolean var1 = this.flipShoulder$value;
         if (!this.flipShoulder$set) {
            var1 = PetOptions.$default$flipShoulder();
         }

         return new PetOptions(var1);
      }

      @Generated
      @Override
      public String toString() {
         return "PetOptions.PetOptionsBuilder(flipShoulder$value=" + this.flipShoulder$value + ")";
      }
   }
}
