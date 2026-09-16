package com.lunarclient.apollo.option;

import lombok.Generated;

public final class SimpleOption<T> extends Option<T, SimpleOption.SimpleOptionBuilder<T>, SimpleOption<T>> {
   private SimpleOption(SimpleOption.SimpleOptionBuilder<T> var1) {
      super(var1);
   }

   public static class SimpleOptionBuilder<T> extends OptionBuilder<T, SimpleOption.SimpleOptionBuilder<T>, SimpleOption<T>> {
      public SimpleOption<T> build() {
         return new SimpleOption<>(this);
      }

      @Generated
      SimpleOptionBuilder() {
      }
   }
}
