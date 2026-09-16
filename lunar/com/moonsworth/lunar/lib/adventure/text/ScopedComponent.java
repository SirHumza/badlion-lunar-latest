package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEventSource;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.StyleBuilderApplicable;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.util.ARGBLike;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ScopedComponent<C extends Component> extends Component {
   @NotNull
   @Override
   default C asComponent() {
      return (C)Component.super.asComponent();
   }

   @NotNull
   @Override
   C children(@NotNull List<? extends ComponentLike> var1);

   @NotNull
   @Override
   C style(@NotNull Style var1);

   @NotNull
   @Override
   default C style(@NotNull Consumer<Style.Builder> var1) {
      return (C)Component.super.style(var1);
   }

   @NotNull
   @Override
   default C style(Style.@NotNull Builder var1) {
      return (C)Component.super.style(var1);
   }

   @NotNull
   @Override
   default C style(@NotNull Consumer<Style.Builder> var1, Style.Merge.@NotNull Strategy var2) {
      return (C)Component.super.style(var1, var2);
   }

   @NotNull
   @Override
   default C mergeStyle(@NotNull Component var1) {
      return (C)Component.super.mergeStyle(var1);
   }

   @NotNull
   @Override
   default C mergeStyle(@NotNull Component var1, Style.@NotNull Merge @NotNull ... var2) {
      return (C)Component.super.mergeStyle(var1, var2);
   }

   @NotNull
   @Override
   default C append(@NotNull Component var1) {
      return (C)Component.super.append(var1);
   }

   @NotNull
   @Override
   default C append(@NotNull ComponentLike var1) {
      return (C)Component.super.append(var1);
   }

   @NotNull
   @Override
   default C append(@NotNull ComponentBuilder<?, ?> var1) {
      return (C)Component.super.append(var1);
   }

   @NotNull
   @Override
   default C append(@NotNull List<? extends ComponentLike> var1) {
      return (C)Component.super.append(var1);
   }

   @NotNull
   @Override
   default C append(@NotNull ComponentLike... var1) {
      return (C)Component.super.append(var1);
   }

   @NotNull
   @Override
   default C appendNewline() {
      return (C)Component.super.appendNewline();
   }

   @NotNull
   @Override
   default C appendSpace() {
      return (C)Component.super.appendSpace();
   }

   @NotNull
   @Override
   default C applyFallbackStyle(@NotNull StyleBuilderApplicable... var1) {
      return (C)Component.super.applyFallbackStyle(var1);
   }

   @NotNull
   @Override
   default C applyFallbackStyle(@NotNull Style var1) {
      return (C)Component.super.applyFallbackStyle(var1);
   }

   @NotNull
   @Override
   default C mergeStyle(@NotNull Component var1, @NotNull Set<Style.Merge> var2) {
      return (C)Component.super.mergeStyle(var1, var2);
   }

   @NotNull
   @Override
   default C color(@Nullable TextColor var1) {
      return (C)Component.super.color(var1);
   }

   @NotNull
   @Override
   default C colorIfAbsent(@Nullable TextColor var1) {
      return (C)Component.super.colorIfAbsent(var1);
   }

   @NotNull
   @Override
   default C shadowColor(@Nullable ARGBLike var1) {
      return (C)Component.super.shadowColor(var1);
   }

   @NotNull
   @Override
   default C shadowColorIfAbsent(@Nullable ARGBLike var1) {
      return (C)Component.super.shadowColorIfAbsent(var1);
   }

   @NotNull
   @Override
   default C decorate(@NotNull TextDecoration var1) {
      return (C)Component.super.decorate(var1);
   }

   @NotNull
   @Override
   default C decoration(@NotNull TextDecoration var1, boolean var2) {
      return (C)Component.super.decoration(var1, var2);
   }

   @NotNull
   @Override
   default C decoration(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2) {
      return (C)Component.super.decoration(var1, var2);
   }

   @NotNull
   @Override
   default C decorationIfAbsent(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2) {
      return (C)Component.super.decorationIfAbsent(var1, var2);
   }

   @NotNull
   @Override
   default C decorations(@NotNull Map<TextDecoration, TextDecoration.State> var1) {
      return (C)Component.super.decorations(var1);
   }

   @NotNull
   @Override
   default C clickEvent(@Nullable ClickEvent var1) {
      return (C)Component.super.clickEvent(var1);
   }

   @NotNull
   @Override
   default C hoverEvent(@Nullable HoverEventSource<?> var1) {
      return (C)Component.super.hoverEvent(var1);
   }

   @NotNull
   @Override
   default C insertion(@Nullable String var1) {
      return (C)Component.super.insertion(var1);
   }

   @NotNull
   @Override
   default C font(@Nullable Key var1) {
      return (C)Component.super.font(var1);
   }
}
