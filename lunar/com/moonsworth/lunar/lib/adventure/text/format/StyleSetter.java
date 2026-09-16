package com.moonsworth.lunar.lib.adventure.text.format;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEventSource;
import com.moonsworth.lunar.lib.adventure.util.ARGBLike;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.NonExtendable
public interface StyleSetter<T extends StyleSetter<?>> {
   @NotNull
   T font(@Nullable Key var1);

   @NotNull
   T color(@Nullable TextColor var1);

   @NotNull
   T colorIfAbsent(@Nullable TextColor var1);

   @NotNull
   T shadowColor(@Nullable ARGBLike var1);

   @NotNull
   T shadowColorIfAbsent(@Nullable ARGBLike var1);

   @NotNull
   default T decorate(@NotNull TextDecoration var1) {
      return this.decoration(var1, TextDecoration.State.TRUE);
   }

   @NotNull
   default T decorate(@NotNull TextDecoration... var1) {
      EnumMap var2 = new EnumMap<>(TextDecoration.class);
      int var3 = 0;

      for (int var4 = var1.length; var3 < var4; var3++) {
         var2.put(var1[var3], TextDecoration.State.TRUE);
      }

      return this.decorations(var2);
   }

   @NotNull
   default T decoration(@NotNull TextDecoration var1, boolean var2) {
      return this.decoration(var1, TextDecoration.State.byBoolean(var2));
   }

   @NotNull
   T decoration(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2);

   @NotNull
   T decorationIfAbsent(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2);

   @NotNull
   T decorations(@NotNull Map<TextDecoration, TextDecoration.State> var1);

   @NotNull
   default T decorations(@NotNull Set<TextDecoration> var1, boolean var2) {
      return this.decorations(var1.stream().collect(Collectors.toMap(Function.identity(), var1x -> TextDecoration.State.byBoolean(var2))));
   }

   @NotNull
   T clickEvent(@Nullable ClickEvent var1);

   @NotNull
   T hoverEvent(@Nullable HoverEventSource<?> var1);

   @NotNull
   T insertion(@Nullable String var1);
}
