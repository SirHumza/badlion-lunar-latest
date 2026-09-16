package com.moonsworth.lunar.lib.adventure.text.flattener;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public interface ComponentFlattener extends Buildable<ComponentFlattener, ComponentFlattener.Builder> {
   int NO_NESTING_LIMIT = -1;

   @NotNull
   static ComponentFlattener.Builder builder() {
      return new ComponentFlattenerImpl.BuilderImpl();
   }

   @NotNull
   static ComponentFlattener basic() {
      return ComponentFlattenerImpl.BASIC;
   }

   @NotNull
   static ComponentFlattener textOnly() {
      return ComponentFlattenerImpl.TEXT_ONLY;
   }

   void flatten(@NotNull Component var1, @NotNull FlattenerListener var2);

   interface Builder extends AbstractBuilder<ComponentFlattener>, Buildable.Builder<ComponentFlattener> {
      @NotNull
      <T extends Component> ComponentFlattener.Builder mapper(@NotNull Class<T> var1, @NotNull Function<T, String> var2);

      @NotNull
      <T extends Component> ComponentFlattener.Builder complexMapper(@NotNull Class<T> var1, @NotNull BiConsumer<T, Consumer<Component>> var2);

      @NotNull
      ComponentFlattener.Builder unknownMapper(@Nullable Function<Component, String> var1);

      @NotNull
      ComponentFlattener.Builder nestingLimit(@Range(from = 1L, to = 2147483647L) int var1);
   }
}
