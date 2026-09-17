package com.lunarclient.apollo.option;

import lombok.Generated;

public final class NumberOption<T extends Number & Comparable<T>> extends Option<T, NumberOption.NumberOptionBuilder<T>, NumberOption<T>> {
   private final T min;
   private final T max;

   private NumberOption(NumberOption.NumberOptionBuilder<T> var1) {
      super(var1);
      this.min = var1.min;
      this.max = var1.max;
   }

   @Generated
   public T getMin() {
      return this.min;
   }

   @Generated
   public T getMax() {
      return this.max;
   }

   public static class NumberOptionBuilder<T extends Number & Comparable<T>> extends OptionBuilder<T, NumberOption.NumberOptionBuilder<T>, NumberOption<T>> {
      private T min;
      private T max;

      public NumberOption.NumberOptionBuilder<T> min(T var1) {
         this.min = (T)var1;
         return this;
      }

      public NumberOption.NumberOptionBuilder<T> max(T var1) {
         this.max = (T)var1;
         return this;
      }

      public NumberOption<T> build() {
         return new NumberOption<>(this);
      }

      @Generated
      NumberOptionBuilder() {
      }
   }
}
