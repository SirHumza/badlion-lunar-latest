package com.lunarclient.apollo.module.marker.target;

import com.lunarclient.apollo.common.icon.ItemStackIcon;
import lombok.Generated;

public class ItemMarkerTarget extends MarkerTarget {
   ItemStackIcon itemStack;

   @Generated
   ItemMarkerTarget(ItemStackIcon var1) {
      this.itemStack = var1;
   }

   @Generated
   public static ItemMarkerTarget.ItemMarkerTargetBuilder builder() {
      return new ItemMarkerTarget.ItemMarkerTargetBuilder();
   }

   @Generated
   public ItemStackIcon getItemStack() {
      return this.itemStack;
   }

   @Generated
   public static class ItemMarkerTargetBuilder {
      @Generated
      private ItemStackIcon itemStack;

      @Generated
      ItemMarkerTargetBuilder() {
      }

      @Generated
      public ItemMarkerTarget.ItemMarkerTargetBuilder itemStack(ItemStackIcon var1) {
         this.itemStack = var1;
         return this;
      }

      @Generated
      public ItemMarkerTarget build() {
         return new ItemMarkerTarget(this.itemStack);
      }

      @Generated
      @Override
      public String toString() {
         return "ItemMarkerTarget.ItemMarkerTargetBuilder(itemStack=" + this.itemStack + ")";
      }
   }
}
