package com.lunarclient.apollo.module.cosmetic.options;

import lombok.Generated;

public final class CloakOptions extends CosmeticOptions {
   boolean useClothPhysics;

   @Generated
   private static boolean $default$useClothPhysics() {
      return false;
   }

   @Generated
   CloakOptions(boolean var1) {
      this.useClothPhysics = var1;
   }

   @Generated
   public static CloakOptions.CloakOptionsBuilder builder() {
      return new CloakOptions.CloakOptionsBuilder();
   }

   @Generated
   public boolean isUseClothPhysics() {
      return this.useClothPhysics;
   }

   @Generated
   public static class CloakOptionsBuilder {
      @Generated
      private boolean useClothPhysics$set;
      @Generated
      private boolean useClothPhysics$value;

      @Generated
      CloakOptionsBuilder() {
      }

      @Generated
      public CloakOptions.CloakOptionsBuilder useClothPhysics(boolean var1) {
         this.useClothPhysics$value = var1;
         this.useClothPhysics$set = true;
         return this;
      }

      @Generated
      public CloakOptions build() {
         boolean var1 = this.useClothPhysics$value;
         if (!this.useClothPhysics$set) {
            var1 = CloakOptions.$default$useClothPhysics();
         }

         return new CloakOptions(var1);
      }

      @Generated
      @Override
      public String toString() {
         return "CloakOptions.CloakOptionsBuilder(useClothPhysics$value=" + this.useClothPhysics$value + ")";
      }
   }
}
