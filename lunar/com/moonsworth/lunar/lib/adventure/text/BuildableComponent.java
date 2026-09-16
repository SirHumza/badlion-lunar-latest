package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.util.Buildable;
import org.jetbrains.annotations.NotNull;

public interface BuildableComponent<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> extends Component, Buildable<C, B> {
   @NotNull
   B toBuilder();
}
