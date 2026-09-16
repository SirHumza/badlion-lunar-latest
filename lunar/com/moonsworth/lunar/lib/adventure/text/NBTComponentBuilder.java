package com.moonsworth.lunar.lib.adventure.text;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface NBTComponentBuilder<C extends NBTComponent<C, B>, B extends NBTComponentBuilder<C, B>> extends ComponentBuilder<C, B> {
   @Contract("_ -> this")
   @NotNull
   B nbtPath(@NotNull String var1);

   @Contract("_ -> this")
   @NotNull
   B interpret(boolean var1);

   @Contract("_ -> this")
   @NotNull
   B separator(@Nullable ComponentLike var1);
}
