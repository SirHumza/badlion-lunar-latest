package com.lunarclient.apollo.common.icon;

import com.lunarclient.apollo.common.profile.Profile;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public final class ItemStackIcon extends Icon {
   String itemName;
   int itemId;
   @Deprecated
   int customModelData;
   @Nullable
   CustomModelData customModelDataObject;
   @Nullable
   Profile profile;
   @Nullable
   String potion;

   @Generated
   ItemStackIcon(String var1, int var2, int var3, @Nullable CustomModelData var4, @Nullable Profile var5, @Nullable String var6) {
      this.itemName = var1;
      this.itemId = var2;
      this.customModelData = var3;
      this.customModelDataObject = var4;
      this.profile = var5;
      this.potion = var6;
   }

   @Generated
   public static ItemStackIcon.ItemStackIconBuilder builder() {
      return new ItemStackIcon.ItemStackIconBuilder();
   }

   @Generated
   public String getItemName() {
      return this.itemName;
   }

   @Generated
   public int getItemId() {
      return this.itemId;
   }

   @Deprecated
   @Generated
   public int getCustomModelData() {
      return this.customModelData;
   }

   @Nullable
   @Generated
   public CustomModelData getCustomModelDataObject() {
      return this.customModelDataObject;
   }

   @Nullable
   @Generated
   public Profile getProfile() {
      return this.profile;
   }

   @Nullable
   @Generated
   public String getPotion() {
      return this.potion;
   }

   @Generated
   public static class ItemStackIconBuilder {
      @Generated
      private String itemName;
      @Generated
      private int itemId;
      @Generated
      private int customModelData;
      @Generated
      private CustomModelData customModelDataObject;
      @Generated
      private Profile profile;
      @Generated
      private String potion;

      @Generated
      ItemStackIconBuilder() {
      }

      @Generated
      public ItemStackIcon.ItemStackIconBuilder itemName(String var1) {
         this.itemName = var1;
         return this;
      }

      @Generated
      public ItemStackIcon.ItemStackIconBuilder itemId(int var1) {
         this.itemId = var1;
         return this;
      }

      @Deprecated
      @Generated
      public ItemStackIcon.ItemStackIconBuilder customModelData(int var1) {
         this.customModelData = var1;
         return this;
      }

      @Generated
      public ItemStackIcon.ItemStackIconBuilder customModelDataObject(@Nullable CustomModelData var1) {
         this.customModelDataObject = var1;
         return this;
      }

      @Generated
      public ItemStackIcon.ItemStackIconBuilder profile(@Nullable Profile var1) {
         this.profile = var1;
         return this;
      }

      @Generated
      public ItemStackIcon.ItemStackIconBuilder potion(@Nullable String var1) {
         this.potion = var1;
         return this;
      }

      @Generated
      public ItemStackIcon build() {
         return new ItemStackIcon(this.itemName, this.itemId, this.customModelData, this.customModelDataObject, this.profile, this.potion);
      }

      @Generated
      @Override
      public String toString() {
         return "ItemStackIcon.ItemStackIconBuilder(itemName="
            + this.itemName
            + ", itemId="
            + this.itemId
            + ", customModelData="
            + this.customModelData
            + ", customModelDataObject="
            + this.customModelDataObject
            + ", profile="
            + this.profile
            + ", potion="
            + this.potion
            + ")";
      }
   }
}
