package com.lunarclient.adventure.transform.transformation;

import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import java.util.regex.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TransformationImpl<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> implements Transformation<C, B> {
   private final TransformationAction transformationAction;

   public TransformationImpl(TransformationAction var1) {
      this.transformationAction = var1;
   }

   @Override
   public TransformationAction getTransformationAction() {
      return this.transformationAction;
   }

   @NotNull
   @Override
   public B transform(@Nullable MatchResult var1, @NotNull B var2) {
      return (B)var2;
   }
}
