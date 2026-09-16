package com.moonsworth.lunar.lib.adventure.text.format;

import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilderApplicable;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface StyleBuilderApplicable extends ComponentBuilderApplicable {
   @Contract(mutates = "param")
   void styleApply(Style.@NotNull Builder var1);

   @Override
   default void componentBuilderApply(@NotNull ComponentBuilder<?, ?> var1) {
      var1.style(this::styleApply);
   }
}
