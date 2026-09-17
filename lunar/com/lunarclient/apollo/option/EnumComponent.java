package com.lunarclient.apollo.option;

import lombok.Generated;

public final class EnumOption<T extends Enum<T>> extends Option<T, EnumOption.EnumOptionBuilder<T>, EnumOption<T>> {
   private EnumOption(EnumOption.EnumOptionBuilder<T> var1) {
      super(var1);
   }

   public static class EnumOptionBuilder<T extends Enum<T>> extends OptionBuilder<T, EnumOption.EnumOptionBuilder<T>, EnumOption<T>> {
      public EnumOption<T> build() {
         return new EnumOption<>(this);
      }

      @Generated
      EnumOptionBuilder() {
      }
   }
}
