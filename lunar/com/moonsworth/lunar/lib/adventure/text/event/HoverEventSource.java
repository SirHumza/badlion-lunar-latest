package com.moonsworth.lunar.lib.adventure.text.event;

import java.util.function.UnaryOperator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface HoverEventSource<V> {
   @Nullable
   static <V> HoverEvent<V> unbox(@Nullable HoverEventSource<V> var0) {
      return var0 != null ? var0.asHoverEvent() : null;
   }

   @NotNull
   default HoverEvent<V> asHoverEvent() {
      return this.asHoverEvent(UnaryOperator.identity());
   }

   @NotNull
   HoverEvent<V> asHoverEvent(@NotNull UnaryOperator<V> var1);
}
