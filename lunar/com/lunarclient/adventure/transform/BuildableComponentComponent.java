package com.lunarclient.adventure.transform;

import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import java.util.regex.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface TransformFunctor<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> {
   @NotNull
   B apply(@Nullable MatchResult var1, @NotNull B var2);
}
