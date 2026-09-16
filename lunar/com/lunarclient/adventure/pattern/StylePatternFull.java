package com.lunarclient.adventure.pattern;

import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecorationAndState;
import com.moonsworth.lunar.lib.adventure.util.ARGBLike;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class StylePatternFull extends StylePatternSimple {
   @Nullable
   private final Predicate<ARGBLike> shadowColorPredicate;
   @Nullable
   private final Predicate<ClickEvent> clickEventPredicate;
   @Nullable
   private final Predicate<HoverEvent<?>> hoverEventPredicate;
   @Nullable
   private final Predicate<String> insertionPredicate;

   public StylePatternFull(
      @Nullable Predicate<ARGBLike> var1,
      @Nullable Predicate<TextColor> var2,
      @Nullable Predicate<TextDecorationAndState> var3,
      @Nullable Predicate<ClickEvent> var4,
      @Nullable Predicate<HoverEvent<?>> var5,
      @Nullable Predicate<String> var6
   ) {
      super(var2, var3);
      this.shadowColorPredicate = var1;
      this.clickEventPredicate = var4;
      this.hoverEventPredicate = var5;
      this.insertionPredicate = var6;
   }

   @Override
   public boolean matches(@NotNull Style var1) {
      if (super.matches(var1)) {
         if (this.shadowColorPredicate != null && !this.shadowColorPredicate.test(var1.shadowColor())) {
            return false;
         } else if (this.clickEventPredicate != null && !this.clickEventPredicate.test(var1.clickEvent())) {
            return false;
         } else if (this.hoverEventPredicate != null && !this.hoverEventPredicate.test(var1.hoverEvent())) {
            return false;
         } else {
            return this.insertionPredicate != null ? this.insertionPredicate.test(var1.insertion()) : true;
         }
      } else {
         return false;
      }
   }
}
