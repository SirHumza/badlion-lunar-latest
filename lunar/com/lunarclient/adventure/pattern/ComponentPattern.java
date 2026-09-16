package com.lunarclient.adventure.pattern;

import com.lunarclient.adventure.matcher.ComponentMatcher;
import com.lunarclient.adventure.matcher.Matchable;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import java.util.function.Predicate;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import lombok.Generated;
import net.kyori.examination.Examinable;
import org.intellij.lang.annotations.RegExp;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface ComponentPattern extends Matchable, Examinable {
   ComponentPattern WILDCARD = var0 -> true;
   ComponentPattern HAS_STYLING = Component::hasStyling;
   ComponentPattern HAS_COLOR = var0 -> var0.color() != null;
   ComponentPattern HAS_SHADOW_COLOR = var0 -> var0.shadowColor() != null;
   ComponentPattern HAS_CLICK_EVENT = var0 -> var0.clickEvent() != null;
   ComponentPattern HAS_HOVER_EVENT = var0 -> var0.hoverEvent() != null;
   ComponentPattern HAS_INSERTION = var0 -> var0.insertion() != null && !var0.insertion().isEmpty();
   ComponentPattern IS_TEXT_COMPONENT = var0 -> var0 instanceof TextComponent;
   ComponentPattern IS_EMPTY = var0 -> var0.equals(Component.empty());

   default ComponentPatternResult shouldMatch(@Nullable MatchResult var1, int var2, int var3, int var4) {
      return ComponentPatternResult.RUN;
   }

   default ComponentPatternResult shouldTraverse(int var1, int var2, int var3) {
      return ComponentPatternResult.RUN;
   }

   boolean matches(@NotNull Component var1);

   @Nullable
   default Pattern getPattern() {
      return null;
   }

   @Nullable
   default Pattern getIgnorePattern() {
      return null;
   }

   @Override
   default ComponentMatcher toMatcher() {
      return ComponentMatcher.pattern(this);
   }

   @NotNull
   static ComponentPattern literal(@NotNull String var0) {
      return builder().literal(var0).build();
   }

   @NotNull
   static ComponentPattern regex(@NotNull @RegExp String var0) {
      return builder().regex(var0).build();
   }

   @NotNull
   static ComponentPattern pattern(@NotNull Pattern var0) {
      return builder().pattern(var0).build();
   }

   @NotNull
   static ComponentPattern literal(@NotNull String var0, @NotNull StylePattern var1) {
      return builder().literal(var0).style(var1).build();
   }

   @NotNull
   static ComponentPattern regex(@NotNull @RegExp String var0, @NotNull StylePattern var1) {
      return builder().regex(var0).style(var1).build();
   }

   @NotNull
   static ComponentPattern pattern(@NotNull Pattern var0, @NotNull StylePattern var1) {
      return builder().pattern(var0).style(var1).build();
   }

   @NotNull
   static ComponentPattern literal(@NotNull String var0, @NotNull StylePattern.Builder var1) {
      return builder().literal(var0).style(var1).build();
   }

   @NotNull
   static ComponentPattern regex(@NotNull @RegExp String var0, @NotNull StylePattern.Builder var1) {
      return builder().regex(var0).style(var1).build();
   }

   @NotNull
   static ComponentPattern pattern(@NotNull Pattern var0, @NotNull StylePattern.Builder var1) {
      return builder().pattern(var0).style(var1).build();
   }

   @NotNull
   static ComponentPattern literal(@NotNull String var0, @NotNull TextColor var1) {
      return builder().literal(var0).style(StylePattern.color(var1)).build();
   }

   @NotNull
   static ComponentPattern regex(@NotNull @RegExp String var0, @NotNull TextColor var1) {
      return builder().regex(var0).style(StylePattern.color(var1)).build();
   }

   @NotNull
   static ComponentPattern pattern(@NotNull Pattern var0, @NotNull TextColor var1) {
      return builder().pattern(var0).style(StylePattern.color(var1)).build();
   }

   @NotNull
   static ComponentPattern.Builder builder() {
      return new ComponentPattern.Builder();
   }

   class Builder {
      @Nullable
      private Pattern pattern = null;
      @Nullable
      private Pattern ignorePattern = null;
      @Nullable
      private StylePattern stylePattern = null;
      @Nullable
      private Predicate<Component> componentPredicate = null;
      @Nullable
      private ComponentPattern.PatternCondition patternCondition = null;
      @Nullable
      private ComponentPattern.TraversalCondition traversalCondition = null;

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder componentPredicate(@NotNull Predicate<Component> var1) {
         this.checkState(this.componentPredicate);
         this.componentPredicate = var1;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder style(@NotNull StylePattern var1) {
         this.stylePattern = var1;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder style(@NotNull StylePattern.Builder var1) {
         this.stylePattern = var1.build();
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder literal(@NotNull String var1) {
         this.checkState(this.pattern);
         this.pattern = Pattern.compile(var1, 16);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder regex(@NotNull @RegExp String var1) {
         this.checkState(this.pattern);
         this.pattern = Pattern.compile(var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder pattern(@NotNull Pattern var1) {
         this.checkState(this.pattern);
         this.pattern = var1;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder ignoreLiteral(@NotNull String var1) {
         this.checkState(this.ignorePattern);
         this.ignorePattern = Pattern.compile(var1, 16);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder ignoreRegex(@NotNull @RegExp String var1) {
         this.checkState(this.ignorePattern);
         this.ignorePattern = Pattern.compile(var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder ignorePattern(@NotNull Pattern var1) {
         this.checkState(this.ignorePattern);
         this.ignorePattern = var1;
         return this;
      }

      @Contract("-> this")
      @NotNull
      public ComponentPattern.Builder once() {
         return this.times(1);
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder times(int var1) {
         this.addPatternCondition((var1x, var2, var3, var4) -> var3 < var1 ? ComponentPatternResult.NEXT_COMPONENT : ComponentPatternResult.SOFT_STOP);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder startDepth(int var1) {
         this.addTraversalCondition((var1x, var2, var3) -> var3 >= var1 ? ComponentPatternResult.RUN : ComponentPatternResult.BREAK);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder maxDepth(int var1) {
         this.addTraversalCondition((var1x, var2, var3) -> var3 <= var1 ? ComponentPatternResult.RUN : ComponentPatternResult.BREAK_NO_CHILDREN);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder depth(int var1) {
         this.addTraversalCondition((var1x, var2, var3) -> var3 == var1 ? ComponentPatternResult.RUN : ComponentPatternResult.BREAK);
         return this;
      }

      @Contract("-> this")
      @NotNull
      public ComponentPattern.Builder everyOther() {
         return this.everyN(2);
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder everyN(int var1) {
         this.addPatternCondition((var1x, var2, var3, var4) -> var2 % var1 == 1 ? ComponentPatternResult.RUN : ComponentPatternResult.CONTINUE);
         return this;
      }

      @Contract("_,_ -> this")
      @NotNull
      public ComponentPattern.Builder everyN(int var1, int var2) {
         this.addPatternCondition((var2x, var3, var4, var5) -> (var3 + var2) % var1 == 0 ? ComponentPatternResult.RUN : ComponentPatternResult.CONTINUE);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder traversalCondition(@NotNull ComponentPattern.TraversalCondition var1) {
         this.addTraversalCondition(var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentPattern.Builder patternCondition(@NotNull ComponentPattern.PatternCondition var1) {
         this.addPatternCondition(var1);
         return this;
      }

      @NotNull
      public ComponentPattern build() {
         return this.pattern != null
            ? new ComponentPatternRegex(this.stylePattern, this.componentPredicate, this.patternCondition, this.traversalCondition, this.pattern)
            : new ComponentPatternImpl(this.stylePattern, this.componentPredicate, this.patternCondition, this.traversalCondition);
      }

      private void addPatternCondition(@NotNull ComponentPattern.PatternCondition var1) {
         if (this.patternCondition == null) {
            this.patternCondition = var1;
         } else {
            this.patternCondition = this.patternCondition.and(var1);
         }
      }

      private void addTraversalCondition(@NotNull ComponentPattern.TraversalCondition var1) {
         if (this.traversalCondition == null) {
            this.traversalCondition = var1;
         } else {
            this.traversalCondition = this.traversalCondition.and(var1);
         }
      }

      private void checkState(@Nullable Object var1) {
         if (var1 != null) {
            throw new IllegalStateException("This state has already been set, you can only have a single condition per style type!");
         }
      }
   }

   @FunctionalInterface
   interface PatternCondition {
      @NotNull
      ComponentPatternResult shouldMatch(@Nullable MatchResult var1, int var2, int var3, int var4);

      @Contract("_ -> new")
      @NotNull
      default ComponentPattern.PatternCondition and(@NotNull ComponentPattern.PatternCondition var1) {
         return (var2, var3, var4, var5) -> this.shouldMatch(var2, var3, var4, var5).and(() -> var1.shouldMatch(var2, var3, var4, var5));
      }
   }

   @FunctionalInterface
   interface TraversalCondition {
      @NotNull
      ComponentPatternResult shouldMatch(int var1, int var2, int var3);

      @Contract("_ -> new")
      @NotNull
      default ComponentPattern.TraversalCondition and(@NotNull ComponentPattern.TraversalCondition var1) {
         return (var2, var3, var4) -> this.shouldMatch(var2, var3, var4).and(() -> var1.shouldMatch(var2, var3, var4));
      }
   }
}
