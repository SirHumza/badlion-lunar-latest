package com.moonsworth.lunar.lib.adventure.builder;

import java.util.function.Consumer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface AbstractBuilder<R> {
   @Contract(mutates = "param1")
   @NotNull
   static <R, B extends AbstractBuilder<R>> R configureAndBuild(@NotNull B var0, @Nullable Consumer<? super B> var1) {
      if (var1 != null) {
         var1.accept(var0);
      }

      return (R)var0.build();
   }

   @Contract(value = "-> new", pure = true)
   @NotNull
   R build();
}
