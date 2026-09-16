package com.moonsworth.lunar.lib.adventure.key;

import java.util.Comparator;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Key extends Keyed, Namespaced, Comparable<Key>, Examinable {
   String MINECRAFT_NAMESPACE = "minecraft";
   char DEFAULT_SEPARATOR = ':';

   @NotNull
   static Key key(@KeyPattern @NotNull String var0) {
      return key(var0, ':');
   }

   @NotNull
   static Key key(@NotNull String var0, char var1) {
      Objects.requireNonNull(var0, "string");
      int var2 = var0.indexOf(var1);
      String var3 = var2 >= 1 ? var0.substring(0, var2) : "minecraft";
      String var4 = var2 >= 0 ? var0.substring(var2 + 1) : var0;
      return key(var3, var4);
   }

   @NotNull
   static Key key(@NotNull Namespaced var0, @KeyPattern.Value @NotNull String var1) {
      return key(Objects.requireNonNull(var0, "namespaced").namespace(), var1);
   }

   @NotNull
   static Key key(@KeyPattern.Namespace @NotNull String var0, @KeyPattern.Value @NotNull String var1) {
      return new KeyImpl(var0, var1);
   }

   @NotNull
   static Comparator<? super Key> comparator() {
      return KeyImpl.COMPARATOR;
   }

   static boolean parseable(@Nullable String var0) {
      if (var0 == null) {
         return false;
      }

      int var1 = var0.indexOf(58);
      String var2 = var1 >= 1 ? var0.substring(0, var1) : "minecraft";
      String var3 = var1 >= 0 ? var0.substring(var1 + 1) : var0;
      return parseableNamespace(var2) && parseableValue(var3);
   }

   static boolean parseableNamespace(@NotNull String var0) {
      return !checkNamespace(var0).isPresent();
   }

   @NotNull
   static OptionalInt checkNamespace(@NotNull String var0) {
      Objects.requireNonNull(var0, "namespace");
      int var1 = 0;

      for (int var2 = var0.length(); var1 < var2; var1++) {
         if (!allowedInNamespace(var0.charAt(var1))) {
            return OptionalInt.of(var1);
         }
      }

      return OptionalInt.empty();
   }

   static boolean parseableValue(@NotNull String var0) {
      return !checkValue(var0).isPresent();
   }

   @NotNull
   static OptionalInt checkValue(@NotNull String var0) {
      Objects.requireNonNull(var0, "value");
      int var1 = 0;

      for (int var2 = var0.length(); var1 < var2; var1++) {
         if (!allowedInValue(var0.charAt(var1))) {
            return OptionalInt.of(var1);
         }
      }

      return OptionalInt.empty();
   }

   static boolean allowedInNamespace(char var0) {
      return KeyImpl.allowedInNamespace(var0);
   }

   static boolean allowedInValue(char var0) {
      return KeyImpl.allowedInValue(var0);
   }

   @KeyPattern.Namespace
   @NotNull
   @Override
   String namespace();

   @KeyPattern.Value
   @NotNull
   String value();

   @NotNull
   String asString();

   @NotNull
   default String asMinimalString() {
      return this.namespace().equals("minecraft") ? this.value() : this.asString();
   }

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("namespace", this.namespace()), ExaminableProperty.of("value", this.value()));
   }

   default int compareTo(@NotNull Key var1) {
      return comparator().compare(this, var1);
   }

   @NotNull
   @Override
   default Key key() {
      return this;
   }
}
