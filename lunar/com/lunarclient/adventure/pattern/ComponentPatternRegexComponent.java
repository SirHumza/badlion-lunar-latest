package com.lunarclient.adventure.pattern;

import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import lombok.Generated;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ComponentPatternRegexIgnore extends ComponentPatternRegex {
   @NotNull
   private final Pattern ignorePattern;

   public ComponentPatternRegexIgnore(
      @Nullable StylePattern var1,
      @Nullable Predicate<Component> var2,
      @Nullable ComponentPattern.PatternCondition var3,
      @Nullable ComponentPattern.TraversalCondition var4,
      @NotNull Pattern var5,
      @NotNull Pattern var6
   ) {
      super(var1, var2, var3, var4, var5);
      this.ignorePattern = var6;
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("ignore", this.ignorePattern));
   }

   @NotNull
   @Generated
   @Override
   public Pattern getIgnorePattern() {
      return this.ignorePattern;
   }
}
