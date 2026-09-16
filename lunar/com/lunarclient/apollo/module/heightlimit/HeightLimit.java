package com.lunarclient.apollo.module.heightlimit;

import com.moonsworth.lunar.lib.adventure.text.Component;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public final class HeightLimit {
   String world;
   @Range(from = 1L, to = 2147483647L) int limit;
   @Nullable
   Component displayName;

   @Generated
   HeightLimit(String var1, int var2, @Nullable Component var3) {
      this.world = var1;
      this.limit = var2;
      this.displayName = var3;
   }

   @Generated
   public static HeightLimit.HeightLimitBuilder builder() {
      return new HeightLimit.HeightLimitBuilder();
   }

   @Generated
   public String getWorld() {
      return this.world;
   }

   @Generated
   public int getLimit() {
      return this.limit;
   }

   @Nullable
   @Generated
   public Component getDisplayName() {
      return this.displayName;
   }

   @Generated
   public static class HeightLimitBuilder {
      @Generated
      private String world;
      @Generated
      private int limit;
      @Generated
      private Component displayName;

      @Generated
      HeightLimitBuilder() {
      }

      @Generated
      public HeightLimit.HeightLimitBuilder world(String var1) {
         this.world = var1;
         return this;
      }

      @Generated
      public HeightLimit.HeightLimitBuilder limit(int var1) {
         this.limit = var1;
         return this;
      }

      @Generated
      public HeightLimit.HeightLimitBuilder displayName(@Nullable Component var1) {
         this.displayName = var1;
         return this;
      }

      @Generated
      public HeightLimit build() {
         return new HeightLimit(this.world, this.limit, this.displayName);
      }

      @Generated
      @Override
      public String toString() {
         return "HeightLimit.HeightLimitBuilder(world=" + this.world + ", limit=" + this.limit + ", displayName=" + this.displayName + ")";
      }
   }
}
