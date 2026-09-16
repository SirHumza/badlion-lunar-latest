package com.moonsworth.lunar.lib.adventure.key;

import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import net.kyori.examination.string.StringExaminer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class KeyedValueImpl<T> implements KeyedValue<T>, Examinable {
   private final Key key;
   private final T value;

   KeyedValueImpl(Key var1, T var2) {
      this.key = var1;
      this.value = (T)var2;
   }

   @NotNull
   @Override
   public Key key() {
      return this.key;
   }

   @NotNull
   @Override
   public T value() {
      return this.value;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         KeyedValueImpl var2 = (KeyedValueImpl)var1;
         return this.key.equals(var2.key) && this.value.equals(var2.value);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.key.hashCode();
      return 31 * var1 + this.value.hashCode();
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("key", this.key), ExaminableProperty.of("value", this.value));
   }

   @Override
   public String toString() {
      return this.examine(StringExaminer.simpleEscaping());
   }
}
