package com.lunarclient.apollo.common.icon;

import java.util.Collections;
import java.util.List;
import lombok.Generated;

public final class CustomModelData {
   List<Float> floats;
   List<Boolean> flags;
   List<String> strings;
   List<Integer> colors;

   @Generated
   private static List<Float> $default$floats() {
      return Collections.emptyList();
   }

   @Generated
   private static List<Boolean> $default$flags() {
      return Collections.emptyList();
   }

   @Generated
   private static List<String> $default$strings() {
      return Collections.emptyList();
   }

   @Generated
   private static List<Integer> $default$colors() {
      return Collections.emptyList();
   }

   @Generated
   CustomModelData(List<Float> var1, List<Boolean> var2, List<String> var3, List<Integer> var4) {
      this.floats = var1;
      this.flags = var2;
      this.strings = var3;
      this.colors = var4;
   }

   @Generated
   public static CustomModelData.CustomModelDataBuilder builder() {
      return new CustomModelData.CustomModelDataBuilder();
   }

   @Generated
   public List<Float> getFloats() {
      return this.floats;
   }

   @Generated
   public List<Boolean> getFlags() {
      return this.flags;
   }

   @Generated
   public List<String> getStrings() {
      return this.strings;
   }

   @Generated
   public List<Integer> getColors() {
      return this.colors;
   }

   @Generated
   public static class CustomModelDataBuilder {
      @Generated
      private boolean floats$set;
      @Generated
      private List<Float> floats$value;
      @Generated
      private boolean flags$set;
      @Generated
      private List<Boolean> flags$value;
      @Generated
      private boolean strings$set;
      @Generated
      private List<String> strings$value;
      @Generated
      private boolean colors$set;
      @Generated
      private List<Integer> colors$value;

      @Generated
      CustomModelDataBuilder() {
      }

      @Generated
      public CustomModelData.CustomModelDataBuilder floats(List<Float> var1) {
         this.floats$value = var1;
         this.floats$set = true;
         return this;
      }

      @Generated
      public CustomModelData.CustomModelDataBuilder flags(List<Boolean> var1) {
         this.flags$value = var1;
         this.flags$set = true;
         return this;
      }

      @Generated
      public CustomModelData.CustomModelDataBuilder strings(List<String> var1) {
         this.strings$value = var1;
         this.strings$set = true;
         return this;
      }

      @Generated
      public CustomModelData.CustomModelDataBuilder colors(List<Integer> var1) {
         this.colors$value = var1;
         this.colors$set = true;
         return this;
      }

      @Generated
      public CustomModelData build() {
         List var1 = this.floats$value;
         if (!this.floats$set) {
            var1 = CustomModelData.$default$floats();
         }

         List var2 = this.flags$value;
         if (!this.flags$set) {
            var2 = CustomModelData.$default$flags();
         }

         List var3 = this.strings$value;
         if (!this.strings$set) {
            var3 = CustomModelData.$default$strings();
         }

         List var4 = this.colors$value;
         if (!this.colors$set) {
            var4 = CustomModelData.$default$colors();
         }

         return new CustomModelData(var1, var2, var3, var4);
      }

      @Generated
      @Override
      public String toString() {
         return "CustomModelData.CustomModelDataBuilder(floats$value="
            + this.floats$value
            + ", flags$value="
            + this.flags$value
            + ", strings$value="
            + this.strings$value
            + ", colors$value="
            + this.colors$value
            + ")";
      }
   }
}
