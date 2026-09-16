package com.lunarclient.adventure.transform.transformation;

import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import java.util.regex.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TransformationMove<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> implements Transformation<C, B> {
   private final int amount;

   public TransformationMove(int var1) {
      this.amount = var1;
   }

   @Override
   public TransformationAction getTransformationAction() {
      return TransformationAction.MOVE;
   }

   @NotNull
   @Override
   public B transform(@Nullable MatchResult var1, @NotNull B var2) {
      return (B)var2;
   }

   @Override
   public Object getData() {
      return this.amount;
   }
}
