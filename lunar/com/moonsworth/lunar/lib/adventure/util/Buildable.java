package com.moonsworth.lunar.lib.adventure.util;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import java.util.function.Consumer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Buildable<R, B extends Buildable.Builder<R>> {
   @Deprecated
   @Contract(mutates = "param1")
   @NotNull
   static <R extends Buildable<R, B>, B extends Buildable.Builder<R>> R configureAndBuild(@NotNull B var0, @Nullable Consumer<? super B> var1) {
      return AbstractBuilder.configureAndBuild(var0, var1);
   }

   @Contract(value = "-> new", pure = true)
   @NotNull
   B toBuilder();

   @Deprecated
   interface Builder<R> extends AbstractBuilder<R> {
      @Contract(value = "-> new", pure = true)
      @NotNull
      @Override
      R build();
   }
}
