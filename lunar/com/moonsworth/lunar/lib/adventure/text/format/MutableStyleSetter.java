package com.moonsworth.lunar.lib.adventure.text.format;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface MutableStyleSetter<T extends MutableStyleSetter<?>> extends StyleSetter<T> {
   @Contract("_ -> this")
   @NotNull
   default T decorate(@NotNull TextDecoration... var1) {
      int var2 = 0;

      for (int var3 = var1.length; var2 < var3; var2++) {
         this.decorate(var1[var2]);
      }

      return (T)this;
   }

   @Contract("_ -> this")
   @NotNull
   default T decorations(@NotNull Map<TextDecoration, TextDecoration.State> var1) {
      Objects.requireNonNull(var1, "decorations");

      for (Entry var3 : var1.entrySet()) {
         this.decoration((TextDecoration)var3.getKey(), (TextDecoration.State)var3.getValue());
      }

      return (T)this;
   }

   @Contract("_, _ -> this")
   @NotNull
   default T decorations(@NotNull Set<TextDecoration> var1, boolean var2) {
      TextDecoration.State var3 = TextDecoration.State.byBoolean(var2);
      var1.forEach(var2x -> this.decoration(var2x, var3));
      return (T)this;
   }
}
