package com.moonsworth.lunar.lib.adventure.text.format;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEventSource;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import com.moonsworth.lunar.lib.adventure.util.MonkeyBars;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.UnknownNullability;
import org.jetbrains.annotations.Unmodifiable;

@ApiStatus.NonExtendable
public interface Style extends StyleGetter, StyleSetter<Style>, Buildable<Style, Style.Builder>, Examinable {
   Key DEFAULT_FONT = Key.key("default");

   @NotNull
   static Style empty() {
      return StyleImpl.EMPTY;
   }

   @NotNull
   static Style.Builder style() {
      return new StyleImpl.BuilderImpl();
   }

   @NotNull
   static Style style(@NotNull Consumer<Style.Builder> var0) {
      return AbstractBuilder.configureAndBuild(style(), var0);
   }

   @NotNull
   static Style style(@Nullable TextColor var0) {
      return empty().color(var0);
   }

   @NotNull
   static Style style(@NotNull TextDecoration var0) {
      return style().decoration(var0, true).build();
   }

   @NotNull
   static Style style(@Nullable TextColor var0, TextDecoration @NotNull ... var1) {
      Style.Builder var2 = style();
      var2.color(var0);
      var2.decorate(var1);
      return var2.build();
   }

   @NotNull
   static Style style(@Nullable TextColor var0, Set<TextDecoration> var1) {
      Style.Builder var2 = style();
      var2.color(var0);
      if (!var1.isEmpty()) {
         for (TextDecoration var4 : var1) {
            var2.decoration(var4, true);
         }
      }

      return var2.build();
   }

   @NotNull
   static Style style(@UnknownNullability StyleBuilderApplicable @NotNull ... var0) {
      int var1 = var0.length;
      if (var1 == 0) {
         return empty();
      }

      Style.Builder var2 = style();

      for (int var3 = 0; var3 < var1; var3++) {
         StyleBuilderApplicable var4 = var0[var3];
         if (var4 != null) {
            var4.styleApply(var2);
         }
      }

      return var2.build();
   }

   @NotNull
   static Style style(@NotNull Iterable<? extends StyleBuilderApplicable> var0) {
      Style.Builder var1 = style();

      for (StyleBuilderApplicable var3 : var0) {
         var3.styleApply(var1);
      }

      return var1.build();
   }

   @NotNull
   default Style edit(@NotNull Consumer<Style.Builder> var1) {
      return this.edit(var1, Style.Merge.Strategy.ALWAYS);
   }

   @NotNull
   default Style edit(@NotNull Consumer<Style.Builder> var1, Style.Merge.@NotNull Strategy var2) {
      return style(var3 -> {
         if (var2 == Style.Merge.Strategy.ALWAYS) {
            var3.merge(this, var2);
         }

         var1.accept(var3);
         if (var2 == Style.Merge.Strategy.IF_ABSENT_ON_TARGET) {
            var3.merge(this, var2);
         }
      });
   }

   @Nullable
   @Override
   Key font();

   @NotNull
   Style font(@Nullable Key var1);

   @Nullable
   @Override
   TextColor color();

   @NotNull
   Style color(@Nullable TextColor var1);

   @NotNull
   Style colorIfAbsent(@Nullable TextColor var1);

   @Override
   default boolean hasDecoration(@NotNull TextDecoration var1) {
      return StyleGetter.super.hasDecoration(var1);
   }

   @Override
   TextDecoration.@NotNull State decoration(@NotNull TextDecoration var1);

   @NotNull
   default Style decorate(@NotNull TextDecoration var1) {
      return (Style)StyleSetter.super.decorate(var1);
   }

   @NotNull
   default Style decoration(@NotNull TextDecoration var1, boolean var2) {
      return (Style)StyleSetter.super.decoration(var1, var2);
   }

   @NotNull
   Style decoration(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2);

   @NotNull
   Style decorationIfAbsent(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2);

   @NotNull
   @Override
   default @Unmodifiable Map<TextDecoration, TextDecoration.State> decorations() {
      return StyleGetter.super.decorations();
   }

   @NotNull
   Style decorations(@NotNull Map<TextDecoration, TextDecoration.State> var1);

   @Nullable
   @Override
   ClickEvent clickEvent();

   @NotNull
   Style clickEvent(@Nullable ClickEvent var1);

   @Nullable
   @Override
   HoverEvent<?> hoverEvent();

   @NotNull
   Style hoverEvent(@Nullable HoverEventSource<?> var1);

   @Nullable
   @Override
   String insertion();

   @NotNull
   Style insertion(@Nullable String var1);

   @NotNull
   default Style merge(@NotNull Style var1) {
      return this.merge(var1, Style.Merge.all());
   }

   @NotNull
   default Style merge(@NotNull Style var1, Style.Merge.@NotNull Strategy var2) {
      return this.merge(var1, var2, Style.Merge.all());
   }

   @NotNull
   default Style merge(@NotNull Style var1, @NotNull Style.Merge var2) {
      return this.merge(var1, Collections.singleton(var2));
   }

   @NotNull
   default Style merge(@NotNull Style var1, Style.Merge.@NotNull Strategy var2, @NotNull Style.Merge var3) {
      return this.merge(var1, var2, Collections.singleton(var3));
   }

   @NotNull
   default Style merge(@NotNull Style var1, @NotNull Style.Merge... var2) {
      return this.merge(var1, Style.Merge.merges(var2));
   }

   @NotNull
   default Style merge(@NotNull Style var1, Style.Merge.@NotNull Strategy var2, @NotNull Style.Merge... var3) {
      return this.merge(var1, var2, Style.Merge.merges(var3));
   }

   @NotNull
   default Style merge(@NotNull Style var1, @NotNull Set<Style.Merge> var2) {
      return this.merge(var1, Style.Merge.Strategy.ALWAYS, var2);
   }

   @NotNull
   Style merge(@NotNull Style var1, Style.Merge.@NotNull Strategy var2, @NotNull Set<Style.Merge> var3);

   @NotNull
   Style unmerge(@NotNull Style var1);

   boolean isEmpty();

   @NotNull
   Style.Builder toBuilder();

   interface Builder extends AbstractBuilder<Style>, MutableStyleSetter<Style.Builder>, Buildable.Builder<Style> {
      @Contract("_ -> this")
      @NotNull
      Style.Builder font(@Nullable Key var1);

      @Contract("_ -> this")
      @NotNull
      Style.Builder color(@Nullable TextColor var1);

      @Contract("_ -> this")
      @NotNull
      Style.Builder colorIfAbsent(@Nullable TextColor var1);

      @Contract("_ -> this")
      @NotNull
      default Style.Builder decorate(@NotNull TextDecoration var1) {
         return (Style.Builder)MutableStyleSetter.super.decorate(var1);
      }

      @Contract("_ -> this")
      @NotNull
      default Style.Builder decorate(@NotNull TextDecoration... var1) {
         return (Style.Builder)MutableStyleSetter.super.decorate(var1);
      }

      @Contract("_, _ -> this")
      @NotNull
      default Style.Builder decoration(@NotNull TextDecoration var1, boolean var2) {
         return (Style.Builder)MutableStyleSetter.super.decoration(var1, var2);
      }

      @Contract("_ -> this")
      @NotNull
      default Style.Builder decorations(@NotNull Map<TextDecoration, TextDecoration.State> var1) {
         return (Style.Builder)MutableStyleSetter.super.decorations(var1);
      }

      @Contract("_, _ -> this")
      @NotNull
      Style.Builder decoration(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2);

      @Contract("_, _ -> this")
      @NotNull
      Style.Builder decorationIfAbsent(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2);

      @Contract("_ -> this")
      @NotNull
      Style.Builder clickEvent(@Nullable ClickEvent var1);

      @Contract("_ -> this")
      @NotNull
      Style.Builder hoverEvent(@Nullable HoverEventSource<?> var1);

      @Contract("_ -> this")
      @NotNull
      Style.Builder insertion(@Nullable String var1);

      @Contract("_ -> this")
      @NotNull
      default Style.Builder merge(@NotNull Style var1) {
         return this.merge(var1, Style.Merge.all());
      }

      @Contract("_, _ -> this")
      @NotNull
      default Style.Builder merge(@NotNull Style var1, Style.Merge.@NotNull Strategy var2) {
         return this.merge(var1, var2, Style.Merge.all());
      }

      @Contract("_, _ -> this")
      @NotNull
      default Style.Builder merge(@NotNull Style var1, @NotNull Style.Merge... var2) {
         return var2.length == 0 ? this : this.merge(var1, Style.Merge.merges(var2));
      }

      @Contract("_, _, _ -> this")
      @NotNull
      default Style.Builder merge(@NotNull Style var1, Style.Merge.@NotNull Strategy var2, @NotNull Style.Merge... var3) {
         return var3.length == 0 ? this : this.merge(var1, var2, Style.Merge.merges(var3));
      }

      @Contract("_, _ -> this")
      @NotNull
      default Style.Builder merge(@NotNull Style var1, @NotNull Set<Style.Merge> var2) {
         return this.merge(var1, Style.Merge.Strategy.ALWAYS, var2);
      }

      @Contract("_, _, _ -> this")
      @NotNull
      Style.Builder merge(@NotNull Style var1, Style.Merge.@NotNull Strategy var2, @NotNull Set<Style.Merge> var3);

      @Contract("_ -> this")
      @NotNull
      default Style.Builder apply(@NotNull StyleBuilderApplicable var1) {
         var1.styleApply(this);
         return this;
      }

      @NotNull
      Style build();
   }

   enum Merge {
      COLOR,
      SHADOW_COLOR,
      DECORATIONS,
      EVENTS,
      INSERTION,
      FONT;

      static final Set<Style.Merge> ALL = merges(values());
      static final Set<Style.Merge> COLOR_AND_DECORATIONS = merges(COLOR, DECORATIONS);

      @NotNull
      public static @Unmodifiable Set<Style.Merge> all() {
         return ALL;
      }

      @NotNull
      public static @Unmodifiable Set<Style.Merge> colorAndDecorations() {
         return COLOR_AND_DECORATIONS;
      }

      @NotNull
      public static @Unmodifiable Set<Style.Merge> merges(Style.Merge @NotNull ... var0) {
         return MonkeyBars.enumSet(Style.Merge.class, var0);
      }

      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      public static @Unmodifiable Set<Style.Merge> of(Style.Merge @NotNull ... var0) {
         return MonkeyBars.enumSet(Style.Merge.class, var0);
      }

      static boolean hasAll(@NotNull Set<Style.Merge> var0) {
         return var0.size() == ALL.size();
      }

      public enum Strategy {
         ALWAYS,
         NEVER,
         IF_ABSENT_ON_TARGET;
      }
   }
}
