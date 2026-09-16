package com.lunarclient.adventure.pattern;

import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecorationAndState;
import java.util.Map.Entry;
import java.util.function.Predicate;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StylePatternSimple implements StylePattern {
   @Nullable
   private final Predicate<TextColor> colorPredicate;
   @Nullable
   private final Predicate<TextDecorationAndState> decorationPredicate;

   @Override
   public boolean matches(@NotNull Style var1) {
      if (this.colorPredicate != null && !this.colorPredicate.test(var1.color())) {
         return false;
      }

      if (this.decorationPredicate != null) {
         for (Entry var3 : var1.decorations().entrySet()) {
            TextDecorationAndState var4 = ((TextDecoration)var3.getKey()).withState((TextDecoration.State)var3.getValue());
            if (!this.decorationPredicate.test(var4)) {
               return false;
            }
         }
      }

      return true;
   }

   @Generated
   public StylePatternSimple(@Nullable Predicate<TextColor> var1, @Nullable Predicate<TextDecorationAndState> var2) {
      this.colorPredicate = var1;
      this.decorationPredicate = var2;
   }
}
