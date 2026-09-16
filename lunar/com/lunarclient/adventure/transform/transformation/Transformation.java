package com.lunarclient.adventure.transform.transformation;

import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import java.util.regex.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface Transformation<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> {
   default TransformationAction getTransformationAction() {
      return TransformationAction.MODIFY;
   }

   default boolean shouldTransform(Component var1, B var2) {
      return true;
   }

   @NotNull
   B transform(@Nullable MatchResult var1, @NotNull B var2);

   @NotNull
   default B applyTransformation(@Nullable MatchResult var1, Component var2, @NotNull B var3) {
      return (B)(!this.shouldTransform(var2, (B)var3) ? var3 : this.transform(var1, (B)var3));
   }

   @Nullable
   default Object getData() {
      return null;
   }
}
