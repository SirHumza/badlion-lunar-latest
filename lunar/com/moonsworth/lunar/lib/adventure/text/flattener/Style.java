package com.moonsworth.lunar.lib.adventure.text.flattener;

import com.moonsworth.lunar.lib.adventure.text.format.Style;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface FlattenerListener {
   default void pushStyle(@NotNull Style var1) {
   }

   void component(@NotNull String var1);

   default boolean shouldContinue() {
      return true;
   }

   default void popStyle(@NotNull Style var1) {
   }
}
