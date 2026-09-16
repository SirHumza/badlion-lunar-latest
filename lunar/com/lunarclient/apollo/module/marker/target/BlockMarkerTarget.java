package com.lunarclient.apollo.module.marker.target;

import com.lunarclient.apollo.common.icon.ItemStackIcon;
import lombok.Generated;

public class BlockMarkerTarget extends MarkerTarget {
   ItemStackIcon itemStack;

   @Generated
   BlockMarkerTarget(ItemStackIcon var1) {
      this.itemStack = var1;
   }

   @Generated
   public static BlockMarkerTarget.BlockMarkerTargetBuilder builder() {
      return new BlockMarkerTarget.BlockMarkerTargetBuilder();
   }

   @Generated
   public ItemStackIcon getItemStack() {
      return this.itemStack;
   }

   @Generated
   public static class BlockMarkerTargetBuilder {
      @Generated
      private ItemStackIcon itemStack;

      @Generated
      BlockMarkerTargetBuilder() {
      }

      @Generated
      public BlockMarkerTarget.BlockMarkerTargetBuilder itemStack(ItemStackIcon var1) {
         this.itemStack = var1;
         return this;
      }

      @Generated
      public BlockMarkerTarget build() {
         return new BlockMarkerTarget(this.itemStack);
      }

      @Generated
      @Override
      public String toString() {
         return "BlockMarkerTarget.BlockMarkerTargetBuilder(itemStack=" + this.itemStack + ")";
      }
   }
}
