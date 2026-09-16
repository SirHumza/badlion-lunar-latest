package com.lunarclient.adventure.pattern;

import com.lunarclient.adventure.matcher.ComponentMatcher;
import com.lunarclient.adventure.matcher.Matchable;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecorationAndState;
import com.moonsworth.lunar.lib.adventure.util.ARGBLike;
import java.util.Objects;
import java.util.function.Predicate;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface StylePattern extends Matchable {
   StylePattern IS_EMPTY = Style::isEmpty;
   StylePattern NOT_EMPTY = var0 -> !var0.isEmpty();
   StylePattern HAS_COLOR = var0 -> var0.color() != null;
   StylePattern HAS_SHADOW_COLOR = var0 -> var0.shadowColor() != null;
   StylePattern HAS_CLICK_EVENT = var0 -> var0.clickEvent() != null;
   StylePattern HAS_HOVER_EVENT = var0 -> var0.hoverEvent() != null;
   StylePattern HAS_INSERTION = var0 -> var0.insertion() != null && !var0.insertion().isEmpty();

   boolean matches(@NotNull Style var1);

   @Override
   default ComponentMatcher toMatcher() {
      return ComponentMatcher.pattern(ComponentPattern.builder().style(this).build());
   }

   @NotNull
   static StylePattern createEquals(Style var0) {
      return var1 -> var1.equals(var0);
   }

   @NotNull
   static StylePattern createNotEquals(Style var0) {
      return var1 -> !var1.equals(var0);
   }

   @NotNull
   static StylePattern color(@Nullable TextColor var0) {
      return builder().color(var0).build();
   }

   @NotNull
   static StylePattern shadowColor(@Nullable ARGBLike var0) {
      return builder().shadowColor(var0).build();
   }

   @NotNull
   static StylePattern decoration(TextDecoration var0) {
      return builder().decoration(var0).build();
   }

   @NotNull
   static StylePattern clickEvent(@Nullable ClickEvent var0) {
      return builder().clickEvent(var0).build();
   }

   @NotNull
   static StylePattern hoverEvent(@Nullable HoverEvent<?> var0) {
      return builder().hoverEvent(var0).build();
   }

   @NotNull
   static StylePattern insertion(@Nullable String var0) {
      return builder().insertion(var0).build();
   }

   @NotNull
   static StylePattern.Builder builder() {
      return new StylePattern.Builder();
   }

   class Builder {
      @Nullable
      private Predicate<TextColor> colorPredicate = null;
      @Nullable
      private Predicate<ARGBLike> shadowColorPredicate = null;
      @Nullable
      private Predicate<TextDecorationAndState> decorationPredicate = null;
      @Nullable
      private Predicate<ClickEvent> clickEventPredicate = null;
      @Nullable
      private Predicate<HoverEvent<?>> hoverEventPredicate = null;
      @Nullable
      private Predicate<String> insertionPredicate = null;

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder colorPredicate(@NotNull Predicate<@Nullable TextColor> var1) {
         this.checkState(this.colorPredicate);
         this.colorPredicate = var1;
         return this;
      }

      @Contract("-> this")
      @NotNull
      public StylePattern.Builder noColor() {
         this.checkState(this.colorPredicate);
         this.colorPredicate = Objects::isNull;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder color(@Nullable TextColor var1) {
         this.checkState(this.colorPredicate);
         this.colorPredicate = var1x -> Objects.equals(var1x, var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder oneOfColor(@Nullable TextColor... var1) {
         this.checkState(this.colorPredicate);
         this.colorPredicate = var1x -> {
            for (TextColor var5 : var1) {
               if (Objects.equals(var1x, var5)) {
                  return true;
               }
            }

            return false;
         };
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder notColor(@Nullable TextColor var1) {
         this.checkState(this.colorPredicate);
         this.colorPredicate = var1x -> !Objects.equals(var1x, var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder noneOfColor(@Nullable TextColor... var1) {
         this.checkState(this.colorPredicate);
         this.colorPredicate = var1x -> {
            for (TextColor var5 : var1) {
               if (Objects.equals(var1x, var5)) {
                  return false;
               }
            }

            return true;
         };
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder shadowColorPredicate(@NotNull Predicate<@Nullable ARGBLike> var1) {
         this.checkState(this.shadowColorPredicate);
         this.shadowColorPredicate = var1;
         return this;
      }

      @Contract("-> this")
      @NotNull
      public StylePattern.Builder noShadowColor() {
         this.checkState(this.shadowColorPredicate);
         this.shadowColorPredicate = Objects::isNull;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder shadowColor(@Nullable ARGBLike var1) {
         this.checkState(this.shadowColorPredicate);
         this.shadowColorPredicate = var1x -> Objects.equals(var1x, var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder oneOfShadowColor(@Nullable ARGBLike... var1) {
         this.checkState(this.shadowColorPredicate);
         this.shadowColorPredicate = var1x -> {
            for (ARGBLike var5 : var1) {
               if (Objects.equals(var1x, var5)) {
                  return true;
               }
            }

            return false;
         };
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder notShadowColor(@Nullable ARGBLike var1) {
         this.checkState(this.shadowColorPredicate);
         this.shadowColorPredicate = var1x -> !Objects.equals(var1x, var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder noneOfShadowColor(@Nullable ARGBLike... var1) {
         this.checkState(this.shadowColorPredicate);
         this.shadowColorPredicate = var1x -> {
            for (ARGBLike var5 : var1) {
               if (Objects.equals(var1x, var5)) {
                  return false;
               }
            }

            return true;
         };
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder decorationPredicate(@NotNull Predicate<TextDecorationAndState> var1) {
         this.checkState(this.decorationPredicate);
         this.decorationPredicate = var1;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder decoration(@NotNull TextDecoration var1) {
         return this.decoration(var1, TextDecoration.State.TRUE);
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder decoration(@NotNull TextDecorationAndState var1) {
         this.checkState(this.decorationPredicate);
         this.decorationPredicate = var1::equals;
         return this;
      }

      @Contract("_,_ -> this")
      @NotNull
      public StylePattern.Builder decoration(@NotNull TextDecoration var1, @NotNull TextDecoration.State var2) {
         this.checkState(this.decorationPredicate);
         this.decorationPredicate = var2x -> var2x.decoration().equals(var1) ? var2x.state() == var2 : true;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder oneOfDecoration(@NotNull TextDecoration... var1) {
         this.checkState(this.decorationPredicate);
         this.decorationPredicate = var1x -> {
            for (TextDecoration var5 : var1) {
               if (var1x.decoration().equals(var5)) {
                  return var1x.state() == TextDecoration.State.TRUE;
               }
            }

            return false;
         };
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder notDecoration(@NotNull TextDecoration var1) {
         this.checkState(this.decorationPredicate);
         this.decorationPredicate = var1x -> var1x.decoration().equals(var1) ? var1x.state() != TextDecoration.State.TRUE : true;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder noneOfDecoration(@NotNull TextDecoration... var1) {
         this.checkState(this.decorationPredicate);
         this.decorationPredicate = var1x -> {
            for (TextDecoration var5 : var1) {
               if (var1x.decoration().equals(var5)) {
                  return var1x.state() != TextDecoration.State.TRUE;
               }
            }

            return true;
         };
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder anyDecorations(@NotNull TextDecorationAndState... var1) {
         this.checkState(this.decorationPredicate);
         this.decorationPredicate = var1x -> {
            for (TextDecorationAndState var5 : var1) {
               if (var1x.decoration().equals(var5.decoration())) {
                  return var1x.state() == var5.state();
               }
            }

            return true;
         };
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder noneOfDecoration(@NotNull TextDecorationAndState... var1) {
         this.checkState(this.decorationPredicate);
         this.decorationPredicate = var1x -> {
            for (TextDecorationAndState var5 : var1) {
               if (var1x.decoration().equals(var5.decoration())) {
                  return var1x.state() != var5.state();
               }
            }

            return true;
         };
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder clickEventPredicate(@NotNull Predicate<@Nullable ClickEvent> var1) {
         this.checkState(this.clickEventPredicate);
         this.clickEventPredicate = var1;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder clickEvent(@Nullable ClickEvent var1) {
         this.checkState(this.clickEventPredicate);
         this.clickEventPredicate = var1x -> Objects.equals(var1x, var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder notClickEvent(@Nullable ClickEvent var1) {
         this.checkState(this.clickEventPredicate);
         this.clickEventPredicate = var1x -> !Objects.equals(var1x, var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder hoverEventPredicate(@NotNull Predicate<@Nullable HoverEvent<?>> var1) {
         this.checkState(this.hoverEventPredicate);
         this.hoverEventPredicate = var1;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder hoverEvent(@Nullable HoverEvent<?> var1) {
         this.checkState(this.hoverEventPredicate);
         this.hoverEventPredicate = var1x -> Objects.equals(var1x, var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder notHoverEvent(@Nullable HoverEvent<?> var1) {
         this.checkState(this.hoverEventPredicate);
         this.hoverEventPredicate = var1x -> !Objects.equals(var1x, var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder insertionPredicate(@NotNull Predicate<@Nullable String> var1) {
         this.checkState(this.insertionPredicate);
         this.insertionPredicate = var1;
         return this;
      }

      @Contract("-> this")
      @NotNull
      public StylePattern.Builder emptyInsertion() {
         this.checkState(this.insertionPredicate);
         this.insertionPredicate = var0 -> var0 == null || var0.isEmpty();
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder insertion(@Nullable String var1) {
         this.checkState(this.insertionPredicate);
         this.insertionPredicate = var1x -> Objects.equals(var1x, var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public StylePattern.Builder notInsertion(@Nullable String var1) {
         this.checkState(this.insertionPredicate);
         this.insertionPredicate = var1x -> !Objects.equals(var1x, var1);
         return this;
      }

      @NotNull
      public StylePattern build() {
         if (this.clickEventPredicate != null || this.hoverEventPredicate != null || this.insertionPredicate != null || this.shadowColorPredicate != null) {
            return new StylePatternFull(
               this.shadowColorPredicate,
               this.colorPredicate,
               this.decorationPredicate,
               this.clickEventPredicate,
               this.hoverEventPredicate,
               this.insertionPredicate
            );
         } else if (this.colorPredicate == null && this.decorationPredicate == null) {
            throw new IllegalStateException("StylePattern with no conditions was made!");
         } else {
            return new StylePatternSimple(this.colorPredicate, this.decorationPredicate);
         }
      }

      private void checkState(@Nullable Object var1) {
         if (var1 != null) {
            throw new IllegalStateException("This state has already been set, you can only have a single condition per style type!");
         }
      }
   }
}
