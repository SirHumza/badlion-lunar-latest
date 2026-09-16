package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class TextReplacementConfigImpl implements TextReplacementConfig {
   private final Pattern matchPattern;
   private final BiFunction<MatchResult, TextComponent.Builder, @Nullable ComponentLike> replacement;
   private final TextReplacementConfig.Condition continuer;
   private final boolean replaceInsideHoverEvents;

   TextReplacementConfigImpl(TextReplacementConfigImpl.Builder var1) {
      this.matchPattern = var1.matchPattern;
      this.replacement = var1.replacement;
      this.continuer = var1.continuer;
      this.replaceInsideHoverEvents = var1.replaceInsideHoverEvents;
   }

   @NotNull
   @Override
   public Pattern matchPattern() {
      return this.matchPattern;
   }

   TextReplacementRenderer.State createState() {
      return new TextReplacementRenderer.State(this.matchPattern, this.replacement, this.continuer, this.replaceInsideHoverEvents);
   }

   public TextReplacementConfig.@NotNull Builder toBuilder() {
      return new TextReplacementConfigImpl.Builder(this);
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(
         ExaminableProperty.of("matchPattern", this.matchPattern),
         ExaminableProperty.of("replacement", this.replacement),
         ExaminableProperty.of("continuer", this.continuer)
      );
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   static final class Builder implements TextReplacementConfig.Builder {
      @Nullable
      Pattern matchPattern;
      @Nullable
      BiFunction<MatchResult, TextComponent.Builder, ComponentLike> replacement;
      TextReplacementConfig.Condition continuer = (var0, var1, var2) -> PatternReplacementResult.REPLACE;
      boolean replaceInsideHoverEvents = true;

      Builder() {
      }

      Builder(TextReplacementConfigImpl var1) {
         this.matchPattern = var1.matchPattern;
         this.replacement = var1.replacement;
         this.continuer = var1.continuer;
      }

      @NotNull
      public TextReplacementConfigImpl.Builder match(@NotNull Pattern var1) {
         this.matchPattern = Objects.requireNonNull(var1, "pattern");
         return this;
      }

      @NotNull
      public TextReplacementConfigImpl.Builder condition(TextReplacementConfig.@NotNull Condition var1) {
         this.continuer = Objects.requireNonNull(var1, "continuation");
         return this;
      }

      @NotNull
      public TextReplacementConfigImpl.Builder replacement(@NotNull BiFunction<MatchResult, TextComponent.Builder, @Nullable ComponentLike> var1) {
         this.replacement = Objects.requireNonNull(var1, "replacement");
         return this;
      }

      @Override
      public TextReplacementConfig.@NotNull Builder replaceInsideHoverEvents(boolean var1) {
         this.replaceInsideHoverEvents = var1;
         return this;
      }

      @NotNull
      public TextReplacementConfig build() {
         if (this.matchPattern == null) {
            throw new IllegalStateException("A pattern must be provided to match against");
         } else if (this.replacement == null) {
            throw new IllegalStateException("A replacement action must be provided");
         } else {
            return new TextReplacementConfigImpl(this);
         }
      }
   }
}
