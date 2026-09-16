package com.moonsworth.lunar.lib.adventure.pointer;

import com.moonsworth.lunar.lib.adventure.key.Key;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;

public interface Pointer<V> extends Examinable {
   @NotNull
   static <V> Pointer<V> pointer(@NotNull Class<V> var0, @NotNull Key var1) {
      return new PointerImpl<>(var0, var1);
   }

   @NotNull
   Class<V> type();

   @NotNull
   Key key();

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("type", this.type()), ExaminableProperty.of("key", this.key()));
   }
}
