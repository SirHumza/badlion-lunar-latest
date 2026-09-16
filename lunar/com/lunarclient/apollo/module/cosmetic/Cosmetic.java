package com.lunarclient.apollo.module.cosmetic;

import com.lunarclient.apollo.module.cosmetic.options.CosmeticOptions;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public final class Cosmetic {
   @Range(from = 1L, to = 2147483647L) int id;
   @Nullable
   CosmeticOptions options;

   @Generated
   Cosmetic(int var1, @Nullable CosmeticOptions var2) {
      this.id = var1;
      this.options = var2;
   }

   @Generated
   public static Cosmetic.CosmeticBuilder builder() {
      return new Cosmetic.CosmeticBuilder();
   }

   @Generated
   public int getId() {
      return this.id;
   }

   @Nullable
   @Generated
   public CosmeticOptions getOptions() {
      return this.options;
   }

   @Generated
   public static class CosmeticBuilder {
      @Generated
      private int id;
      @Generated
      private CosmeticOptions options;

      @Generated
      CosmeticBuilder() {
      }

      @Generated
      public Cosmetic.CosmeticBuilder id(int var1) {
         this.id = var1;
         return this;
      }

      @Generated
      public Cosmetic.CosmeticBuilder options(@Nullable CosmeticOptions var1) {
         this.options = var1;
         return this;
      }

      @Generated
      public Cosmetic build() {
         return new Cosmetic(this.id, this.options);
      }

      @Generated
      @Override
      public String toString() {
         return "Cosmetic.CosmeticBuilder(id=" + this.id + ", options=" + this.options + ")";
      }
   }
}
