package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import com.moonsworth.lunar.lib.adventure.util.IntFunction2;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import net.kyori.examination.Examinable;
import org.intellij.lang.annotations.RegExp;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TextReplacementConfig extends Buildable<TextReplacementConfig, TextReplacementConfig.Builder>, Examinable {
   @NotNull
   static TextReplacementConfig.Builder builder() {
      return new TextReplacementConfigImpl.Builder();
   }

   @NotNull
   Pattern matchPattern();

   interface Builder extends AbstractBuilder<TextReplacementConfig>, Buildable.Builder<TextReplacementConfig> {
      @Contract("_ -> this")
      default TextReplacementConfig.Builder matchLiteral(String var1) {
         return this.match(Pattern.compile(var1, 16));
      }

      @Contract("_ -> this")
      @NotNull
      default TextReplacementConfig.Builder match(@NotNull @RegExp String var1) {
         return this.match(Pattern.compile(var1));
      }

      @Contract("_ -> this")
      @NotNull
      TextReplacementConfig.Builder match(@NotNull Pattern var1);

      @NotNull
      default TextReplacementConfig.Builder once() {
         return this.times(1);
      }

      @Contract("_ -> this")
      @NotNull
      default TextReplacementConfig.Builder times(int var1) {
         return this.condition((var1x, var2) -> var2 < var1 ? PatternReplacementResult.REPLACE : PatternReplacementResult.STOP);
      }

      @Contract("_ -> this")
      @NotNull
      default TextReplacementConfig.Builder condition(@NotNull IntFunction2<PatternReplacementResult> var1) {
         return this.condition((var1x, var2, var3) -> (PatternReplacementResult)var1.apply(var2, var3));
      }

      @Contract("_ -> this")
      @NotNull
      TextReplacementConfig.Builder condition(@NotNull TextReplacementConfig.Condition var1);

      @Contract("_ -> this")
      @NotNull
      default TextReplacementConfig.Builder replacement(@NotNull String var1) {
         Objects.requireNonNull(var1, "replacement");
         return this.replacement(var1x -> var1x.content(var1));
      }

      @Contract("_ -> this")
      @NotNull
      default TextReplacementConfig.Builder replacement(@Nullable ComponentLike var1) {
         Component var2 = ComponentLike.unbox(var1);
         return this.replacement((var1x, var2x) -> var2);
      }

      @Contract("_ -> this")
      @NotNull
      default TextReplacementConfig.Builder replacement(@NotNull Function<TextComponent.Builder, @Nullable ComponentLike> var1) {
         Objects.requireNonNull(var1, "replacement");
         return this.replacement((var1x, var2) -> (ComponentLike)var1.apply(var2));
      }

      @Contract("_ -> this")
      @NotNull
      TextReplacementConfig.Builder replacement(@NotNull BiFunction<MatchResult, TextComponent.Builder, @Nullable ComponentLike> var1);

      @Contract("_ -> this")
      @NotNull
      TextReplacementConfig.Builder replaceInsideHoverEvents(boolean var1);
   }

   @FunctionalInterface
   interface Condition {
      @NotNull
      PatternReplacementResult shouldReplace(@NotNull MatchResult var1, int var2, int var3);
   }
}
