package com.lunarclient.adventure.matcher;

import com.moonsworth.lunar.lib.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

public interface ComponentMatchPerformer<C> {
   boolean matches(@NotNull Component var1, @NotNull C var2);
}
