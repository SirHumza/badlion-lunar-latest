package com.moonsworth.lunar.lib.adventure.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface ComponentLike {
   @NotNull
   static List<Component> asComponents(@NotNull List<? extends ComponentLike> var0) {
      return asComponents(var0, null);
   }

   @NotNull
   static List<Component> asComponents(@NotNull List<? extends ComponentLike> var0, @Nullable Predicate<? super Component> var1) {
      Objects.requireNonNull(var0, "likes");
      int var2 = var0.size();
      if (var2 == 0) {
         return Collections.emptyList();
      }

      ArrayList var3 = null;

      for (int var4 = 0; var4 < var2; var4++) {
         ComponentLike var5 = (ComponentLike)var0.get(var4);
         if (var5 == null) {
            throw new NullPointerException("likes[" + var4 + "]");
         }

         Component var6 = var5.asComponent();
         if (var1 == null || var1.test(var6)) {
            if (var3 == null) {
               var3 = new ArrayList(var2);
            }

            var3.add(var6);
         }
      }

      if (var3 == null) {
         return Collections.emptyList();
      }

      var3.trimToSize();
      return Collections.unmodifiableList(var3);
   }

   @Nullable
   static Component unbox(@Nullable ComponentLike var0) {
      return var0 != null ? var0.asComponent() : null;
   }

   @Contract(pure = true)
   @NotNull
   Component asComponent();
}
