package net.kyori.ansi;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public interface StyleOps<S> {
   int COLOR_UNSET = -1;

   StyleOps.State bold(@NotNull S var1);

   StyleOps.State italics(@NotNull S var1);

   StyleOps.State underlined(@NotNull S var1);

   StyleOps.State strikethrough(@NotNull S var1);

   StyleOps.State obfuscated(@NotNull S var1);

   @Range(from = -1L, to = 16777215L) int color(@NotNull S var1);

   @Nullable
   String font(@NotNull S var1);

   enum State {
      TRUE,
      FALSE,
      UNSET;
   }
}
