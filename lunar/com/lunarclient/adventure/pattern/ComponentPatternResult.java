package com.lunarclient.adventure.pattern;

import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

public enum ComponentPatternResult {
   RUN,
   CONTINUE,
   NEXT_COMPONENT,
   BREAK,
   BREAK_NO_CHILDREN,
   SOFT_STOP,
   STOP;

   @NotNull
   public ComponentPatternResult and(@NotNull Supplier<ComponentPatternResult> var1) {
      if (this == STOP) {
         return this;
      }

      ComponentPatternResult var2 = (ComponentPatternResult)var1.get();
      return this.ordinal() > var2.ordinal() ? this : var2;
   }
}
