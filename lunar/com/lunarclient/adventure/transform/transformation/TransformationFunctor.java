package com.lunarclient.adventure.transform.transformation;

import com.lunarclient.adventure.transform.TransformFunctor;
import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import java.util.regex.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TransformationFunctor<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> extends TransformationImpl<C, B> {
   @NotNull
   private final TransformFunctor<C, B> transformFunctor;

   public TransformationFunctor(TransformationAction var1, @NotNull TransformFunctor<C, B> var2) {
      super(var1);
      this.transformFunctor = var2;
   }

   @NotNull
   @Override
   public B transform(@Nullable MatchResult var1, @NotNull B var2) {
      return this.transformFunctor.apply(var1, (B)var2);
   }
}
