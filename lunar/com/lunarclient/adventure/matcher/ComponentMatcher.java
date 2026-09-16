package com.lunarclient.adventure.matcher;

import com.lunarclient.adventure.pattern.ComponentPattern;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import lombok.Generated;
import net.kyori.examination.Examinable;
import org.intellij.lang.annotations.RegExp;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface ComponentMatcher extends Examinable {
   default boolean matches(Component var1) {
      return this.matches(var1, false);
   }

   boolean matches(Component var1, boolean var2);

   @NotNull
   static ComponentMatcher matchable(Matchable var0) {
      return var0.toMatcher();
   }

   @NotNull
   static ComponentMatcher literal(String var0) {
      return builder().pattern(ComponentPattern.literal(var0)).build();
   }

   @NotNull
   static ComponentMatcher regex(@RegExp String var0) {
      return builder().pattern(ComponentPattern.regex(var0)).build();
   }

   @NotNull
   static ComponentMatcher pattern(Pattern var0) {
      return builder().pattern(ComponentPattern.pattern(var0)).build();
   }

   @NotNull
   static ComponentMatcher pattern(ComponentPattern var0) {
      return builder().pattern(var0).build();
   }

   @NotNull
   static ComponentMatcher patterns(ComponentPattern... var0) {
      return builder().patterns(var0).build();
   }

   @NotNull
   static ComponentMatcher patterns(List<ComponentPattern> var0) {
      return builder().patterns(var0).build();
   }

   @NotNull
   static ComponentMatcher.Builder builder() {
      return new ComponentMatcher.Builder();
   }

   class Builder {
      private final List<ComponentPattern> patterns = new ArrayList<>();
      private boolean startsWith = false;
      private boolean endsWith = false;
      private boolean gapsBetween = false;
      private int requiredMatches = -1;

      @Contract("-> this")
      @NotNull
      public ComponentMatcher.Builder start() {
         this.startsWith = true;
         return this;
      }

      @Contract("-> this")
      @NotNull
      public ComponentMatcher.Builder end() {
         this.endsWith = true;
         return this;
      }

      @Contract("-> this")
      @NotNull
      public ComponentMatcher.Builder gapsBetween() {
         this.gapsBetween = true;
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentMatcher.Builder pattern(@NotNull ComponentPattern var1) {
         this.patterns.add(var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentMatcher.Builder patterns(@NotNull ComponentPattern... var1) {
         this.patterns.addAll(List.of(var1));
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentMatcher.Builder patterns(@NotNull List<ComponentPattern> var1) {
         this.patterns.addAll(var1);
         return this;
      }

      @Contract("_ -> this")
      @NotNull
      public ComponentMatcher.Builder requiredMatches(int var1) {
         this.requiredMatches = var1;
         return this;
      }

      public ComponentMatcher build() {
         return new ComponentMatcherImpl(
            List.copyOf(this.patterns),
            this.startsWith,
            this.endsWith,
            this.gapsBetween,
            this.requiredMatches == -1 ? this.patterns.size() : this.requiredMatches
         );
      }
   }
}
