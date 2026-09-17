package com.moonsworth.lunar.lib.adventure.text.format;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import java.util.EnumMap;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Unmodifiable;

@ApiStatus.NonExtendable
public interface StyleGetter {
   @Nullable
   Key font();

   @Nullable
   TextColor color();

   @Nullable
   ShadowColor shadowColor();

   default boolean hasDecoration(@NotNull TextDecoration var1) {
      return this.decoration(var1) == TextDecoration.State.TRUE;
   }

   TextDecoration.@NotNull State decoration(@NotNull TextDecoration var1);

   @NotNull
   default @Unmodifiable Map<TextDecoration, TextDecoration.State> decorations() {
      EnumMap var1 = new EnumMap<>(TextDecoration.class);
      int var2 = 0;

      for (int var3 = DecorationMap.DECORATIONS.length; var2 < var3; var2++) {
         TextDecoration var4 = DecorationMap.DECORATIONS[var2];
         TextDecoration.State var5 = this.decoration(var4);
         var1.put(var4, var5);
      }

      return var1;
   }

   @Nullable
   ClickEvent clickEvent();

   @Nullable
   HoverEvent<?> hoverEvent();

   @Nullable
   String insertion();
}
