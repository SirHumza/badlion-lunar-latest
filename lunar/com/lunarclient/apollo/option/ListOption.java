package com.lunarclient.apollo.option;

import java.util.List;
import lombok.Generated;

public final class ListOption<T> extends Option<List<T>, ListOption.ListOptionBuilder<T>, ListOption<T>> {
   private ListOption(ListOption.ListOptionBuilder<T> var1) {
      super(var1);
   }

   public static class ListOptionBuilder<T> extends OptionBuilder<List<T>, ListOption.ListOptionBuilder<T>, ListOption<T>> {
      public ListOption<T> build() {
         return new ListOption<>(this);
      }

      @Generated
      ListOptionBuilder() {
      }
   }
}
