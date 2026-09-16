package com.moonsworth.lunar.lib.adventure.text;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnknownNullability;

public interface VirtualComponentRenderer<C> {
   @UnknownNullability ComponentLike apply(@NotNull C var1);

   @NotNull
   default String fallbackString() {
      return "";
   }
}
