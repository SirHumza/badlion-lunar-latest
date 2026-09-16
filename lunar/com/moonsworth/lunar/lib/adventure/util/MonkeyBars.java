package com.moonsworth.lunar.lib.adventure.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;

public final class MonkeyBars {
   private MonkeyBars() {
   }

   @SafeVarargs
   @NotNull
   public static <E extends Enum<E>> Set<E> enumSet(Class<E> var0, E @NotNull ... var1) {
      EnumSet var2 = EnumSet.noneOf(var0);
      Collections.addAll(var2, (E[])var1);
      return Collections.unmodifiableSet(var2);
   }

   @NotNull
   public static <T> List<T> addOne(@NotNull List<T> var0, T var1) {
      if (var0.isEmpty()) {
         return Collections.singletonList((T)var1);
      }

      ArrayList var2 = new ArrayList(var0.size() + 1);
      var2.addAll(var0);
      var2.add(var1);
      return Collections.unmodifiableList(var2);
   }

   @SafeVarargs
   @NotNull
   public static <I, O> List<O> nonEmptyArrayToList(@NotNull Function<I, O> var0, @NotNull I var1, @NotNull I... var2) {
      ArrayList var3 = new ArrayList(var2.length + 1);
      var3.add(var0.apply(var1));

      for (Object var7 : var2) {
         var3.add(Objects.requireNonNull(var0.apply(Objects.requireNonNull(var7, "source[?]")), "mapper(source[?])"));
      }

      return Collections.unmodifiableList(var3);
   }

   @NotNull
   public static <I, O> List<O> toUnmodifiableList(@NotNull Function<I, O> var0, @NotNull Iterable<? extends I> var1) {
      ArrayList var2 = var1 instanceof Collection ? new ArrayList(((Collection)var1).size()) : new ArrayList();

      for (Object var4 : var1) {
         var2.add(Objects.requireNonNull(var0.apply(Objects.requireNonNull(var4, "source[?]")), "mapper(source[?])"));
      }

      return Collections.unmodifiableList(var2);
   }
}
