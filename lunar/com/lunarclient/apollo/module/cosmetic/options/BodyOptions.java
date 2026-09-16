package com.lunarclient.apollo.module.cosmetic.options;

import lombok.Generated;

public final class BodyOptions extends CosmeticOptions {
   boolean showOverChestplate;
   boolean showOverLeggings;
   boolean showOverBoots;

   @Generated
   private static boolean $default$showOverChestplate() {
      return true;
   }

   @Generated
   private static boolean $default$showOverLeggings() {
      return true;
   }

   @Generated
   private static boolean $default$showOverBoots() {
      return true;
   }

   @Generated
   BodyOptions(boolean var1, boolean var2, boolean var3) {
      this.showOverChestplate = var1;
      this.showOverLeggings = var2;
      this.showOverBoots = var3;
   }

   @Generated
   public static BodyOptions.BodyOptionsBuilder builder() {
      return new BodyOptions.BodyOptionsBuilder();
   }

   @Generated
   public boolean isShowOverChestplate() {
      return this.showOverChestplate;
   }

   @Generated
   public boolean isShowOverLeggings() {
      return this.showOverLeggings;
   }

   @Generated
   public boolean isShowOverBoots() {
      return this.showOverBoots;
   }

   @Generated
   public static class BodyOptionsBuilder {
      @Generated
      private boolean showOverChestplate$set;
      @Generated
      private boolean showOverChestplate$value;
      @Generated
      private boolean showOverLeggings$set;
      @Generated
      private boolean showOverLeggings$value;
      @Generated
      private boolean showOverBoots$set;
      @Generated
      private boolean showOverBoots$value;

      @Generated
      BodyOptionsBuilder() {
      }

      @Generated
      public BodyOptions.BodyOptionsBuilder showOverChestplate(boolean var1) {
         this.showOverChestplate$value = var1;
         this.showOverChestplate$set = true;
         return this;
      }

      @Generated
      public BodyOptions.BodyOptionsBuilder showOverLeggings(boolean var1) {
         this.showOverLeggings$value = var1;
         this.showOverLeggings$set = true;
         return this;
      }

      @Generated
      public BodyOptions.BodyOptionsBuilder showOverBoots(boolean var1) {
         this.showOverBoots$value = var1;
         this.showOverBoots$set = true;
         return this;
      }

      @Generated
      public BodyOptions build() {
         boolean var1 = this.showOverChestplate$value;
         if (!this.showOverChestplate$set) {
            var1 = BodyOptions.$default$showOverChestplate();
         }

         boolean var2 = this.showOverLeggings$value;
         if (!this.showOverLeggings$set) {
            var2 = BodyOptions.$default$showOverLeggings();
         }

         boolean var3 = this.showOverBoots$value;
         if (!this.showOverBoots$set) {
            var3 = BodyOptions.$default$showOverBoots();
         }

         return new BodyOptions(var1, var2, var3);
      }

      @Generated
      @Override
      public String toString() {
         return "BodyOptions.BodyOptionsBuilder(showOverChestplate$value="
            + this.showOverChestplate$value
            + ", showOverLeggings$value="
            + this.showOverLeggings$value
            + ", showOverBoots$value="
            + this.showOverBoots$value
            + ")";
      }
   }
}
