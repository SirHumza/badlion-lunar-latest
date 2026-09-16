package com.lunarclient.adventure.pattern;

import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.function.Predicate;
import java.util.regex.MatchResult;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ComponentPatternImpl implements ComponentPattern {
   @Nullable
   private final StylePattern stylePattern;
   @Nullable
   private final Predicate<Component> componentPredicate;
   @Nullable
   private final ComponentPattern.PatternCondition patternCondition;
   @Nullable
   private final ComponentPattern.TraversalCondition traversalCondition;

   @Override
   public ComponentPatternResult shouldMatch(@Nullable MatchResult var1, int var2, int var3, int var4) {
      return this.patternCondition == null ? ComponentPatternResult.RUN : this.patternCondition.shouldMatch(var1, var2, var3, var4);
   }

   @Override
   public ComponentPatternResult shouldTraverse(int var1, int var2, int var3) {
      return this.traversalCondition == null ? ComponentPatternResult.RUN : this.traversalCondition.shouldMatch(var1, var2, var3);
   }

   @Override
   public boolean matches(@NotNull Component var1) {
      if (this.stylePattern != null && !this.stylePattern.matches(var1.style())) {
         return false;
      } else {
         return this.componentPredicate == null ? true : this.componentPredicate.test(var1);
      }
   }

   @Generated
   public ComponentPatternImpl(
      @Nullable StylePattern var1,
      @Nullable Predicate<Component> var2,
      @Nullable ComponentPattern.PatternCondition var3,
      @Nullable ComponentPattern.TraversalCondition var4
   ) {
      this.stylePattern = var1;
      this.componentPredicate = var2;
      this.patternCondition = var3;
      this.traversalCondition = var4;
   }
}
