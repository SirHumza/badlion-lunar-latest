package com.lunarclient.adventure.transform.transformation;

import com.lunarclient.adventure.pattern.ComponentPattern;
import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import java.util.regex.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PatternTransformation<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> implements Transformation<C, B> {
   @NotNull
   private final Transformation<C, B> delegate;
   private final ComponentPattern componentPattern;

   public PatternTransformation(@NotNull Transformation<C, B> var1, ComponentPattern var2) {
      this.delegate = var1;
      this.componentPattern = var2;
   }

   @Override
   public TransformationAction getTransformationAction() {
      return this.delegate.getTransformationAction();
   }

   @Override
   public boolean shouldTransform(Component var1, B var2) {
      return this.componentPattern.matches(var1) && this.delegate.shouldTransform(var1, (B)var2);
   }

   @NotNull
   @Override
   public B transform(@Nullable MatchResult var1, @NotNull B var2) {
      return this.delegate.transform(var1, (B)var2);
   }

   @NotNull
   @Override
   public B applyTransformation(@Nullable MatchResult var1, Component var2, @NotNull B var3) {
      return this.delegate.applyTransformation(var1, var2, (B)var3);
   }
}
