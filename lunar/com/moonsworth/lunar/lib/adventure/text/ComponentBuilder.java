package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEventSource;
import com.moonsworth.lunar.lib.adventure.text.format.MutableStyleSetter;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.NonExtendable
public interface ComponentBuilder<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>>
   extends AbstractBuilder<C>,
   ComponentBuilderApplicable,
   ComponentLike,
   MutableStyleSetter<B>,
   Buildable.Builder<C> {
   @Contract("_ -> this")
   @NotNull
   B append(@NotNull Component var1);

   @Contract("_ -> this")
   @NotNull
   default B append(@NotNull ComponentLike var1) {
      return this.append(var1.asComponent());
   }

   @Contract("_ -> this")
   @NotNull
   default B append(@NotNull ComponentBuilder<?, ?> var1) {
      return this.append(var1.build());
   }

   @Contract("_ -> this")
   @NotNull
   B append(@NotNull Component... var1);

   @Contract("_ -> this")
   @NotNull
   B append(@NotNull ComponentLike... var1);

   @Contract("_ -> this")
   @NotNull
   B append(@NotNull Iterable<? extends ComponentLike> var1);

   @NotNull
   default B appendNewline() {
      return this.append(Component.newline());
   }

   @NotNull
   default B appendSpace() {
      return this.append(Component.space());
   }

   @Contract("_ -> this")
   @NotNull
   default B apply(@NotNull Consumer<? super ComponentBuilder<?, ?>> var1) {
      var1.accept(this);
      return (B)this;
   }

   @Contract("_ -> this")
   @NotNull
   B applyDeep(@NotNull Consumer<? super ComponentBuilder<?, ?>> var1);

   @Contract("_ -> this")
   @NotNull
   B mapChildren(@NotNull Function<BuildableComponent<?, ?>, ? extends BuildableComponent<?, ?>> var1);

   @Contract("_ -> this")
   @NotNull
   B mapChildrenDeep(@NotNull Function<BuildableComponent<?, ?>, ? extends BuildableComponent<?, ?>> var1);

   @NotNull
   List<Component> children();

   @Contract("_ -> this")
   @NotNull
   B style(@NotNull Style var1);

   @Contract("_ -> this")
   @NotNull
   B style(@NotNull Consumer<Style.Builder> var1);

   @Contract("_ -> this")
   @NotNull
   B font(@Nullable Key var1);

   @Contract("_ -> this")
   @NotNull
   B color(@Nullable TextColor var1);

   @Contract("_ -> this")
   @NotNull
   B colorIfAbsent(@Nullable TextColor var1);

   @Contract("_, _ -> this")
   @NotNull
   default B decorations(@NotNull Set<TextDecoration> var1, boolean var2) {
      return (B)MutableStyleSetter.super.decorations(var1, var2);
   }

   @Contract("_ -> this")
   @NotNull
   default B decorate(@NotNull TextDecoration var1) {
      return this.decoration(var1, TextDecoration.State.TRUE);
   }

   @Contract("_ -> this")
   @NotNull
   default B decorate(@NotNull TextDecoration... var1) {
      return (B)MutableStyleSetter.super.decorate(var1);
   }

   @Contract("_, _ -> this")
   @NotNull
   default B decoration(@NotNull TextDecoration var1, boolean var2) {
      return this.decoration(var1, TextDecoration.State.byBoolean(var2));
   }

   @Contract("_ -> this")
   @NotNull
   default B decorations(@NotNull Map<TextDecoration, TextDecoration.State> var1) {
      return (B)MutableStyleSetter.super.decorations(var1);
   }

   @Contract("_, _ -> this")
   @NotNull
   B decoration(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2);

   @Contract("_, _ -> this")
   @NotNull
   B decorationIfAbsent(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2);

   @Contract("_ -> this")
   @NotNull
   B clickEvent(@Nullable ClickEvent var1);

   @Contract("_ -> this")
   @NotNull
   B hoverEvent(@Nullable HoverEventSource<?> var1);

   @Contract("_ -> this")
   @NotNull
   B insertion(@Nullable String var1);

   @Contract("_ -> this")
   @NotNull
   default B mergeStyle(@NotNull Component var1) {
      return this.mergeStyle(var1, Style.Merge.all());
   }

   @Contract("_, _ -> this")
   @NotNull
   default B mergeStyle(@NotNull Component var1, Style.@NotNull Merge @NotNull ... var2) {
      return this.mergeStyle(var1, Style.Merge.merges(var2));
   }

   @Contract("_, _ -> this")
   @NotNull
   B mergeStyle(@NotNull Component var1, @NotNull Set<Style.Merge> var2);

   @NotNull
   B resetStyle();

   @NotNull
   C build();

   @Contract("_ -> this")
   @NotNull
   default B applicableApply(@NotNull ComponentBuilderApplicable var1) {
      var1.componentBuilderApply(this);
      return (B)this;
   }

   @Override
   default void componentBuilderApply(@NotNull ComponentBuilder<?, ?> var1) {
      var1.append(this);
   }

   @NotNull
   @Override
   default Component asComponent() {
      return this.build();
   }
}
