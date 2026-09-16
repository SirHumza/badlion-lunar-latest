package com.moonsworth.lunar.lib.adventure.text.event;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;

final class DataComponentValueConversionImpl<I, O> implements DataComponentValueConverterRegistry.Conversion<I, O> {
   private final Class<I> source;
   private final Class<O> destination;
   private final BiFunction<Key, I, O> conversion;

   DataComponentValueConversionImpl(@NotNull Class<I> var1, @NotNull Class<O> var2, @NotNull BiFunction<Key, I, O> var3) {
      this.source = var1;
      this.destination = var2;
      this.conversion = var3;
   }

   @NotNull
   @Override
   public Class<I> source() {
      return this.source;
   }

   @NotNull
   @Override
   public Class<O> destination() {
      return this.destination;
   }

   @NotNull
   @Override
   public O convert(@NotNull Key var1, @NotNull I var2) {
      return this.conversion.apply(Objects.requireNonNull(var1, "key"), Objects.requireNonNull((I)var2, "input"));
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(
         ExaminableProperty.of("source", this.source),
         ExaminableProperty.of("destination", this.destination),
         ExaminableProperty.of("conversion", this.conversion)
      );
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         DataComponentValueConversionImpl var2 = (DataComponentValueConversionImpl)var1;
         return Objects.equals(this.source, var2.source)
            && Objects.equals(this.destination, var2.destination)
            && Objects.equals(this.conversion, var2.conversion);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.source, this.destination, this.conversion);
   }
}
