package com.moonsworth.lunar.lib.adventure.text.renderer;

import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;

public interface ComponentRenderer<C> {
   @NotNull
   Component render(@NotNull Component var1, @NotNull C var2);

   default <T> ComponentRenderer<T> mapContext(Function<T, C> var1) {
      return (var2, var3) -> this.render(var2, (C)var1.apply(var3));
   }
}
