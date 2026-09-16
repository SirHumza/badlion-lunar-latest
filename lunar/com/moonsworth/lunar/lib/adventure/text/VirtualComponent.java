package com.moonsworth.lunar.lib.adventure.text;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface VirtualComponent extends TextComponent {
   @NotNull
   Class<?> contextType();

   @NotNull
   VirtualComponentRenderer<?> renderer();
}
