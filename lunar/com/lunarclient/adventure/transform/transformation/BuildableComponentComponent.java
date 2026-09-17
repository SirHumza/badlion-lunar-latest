package com.lunarclient.adventure.transform.transformation;

import com.lunarclient.adventure.transform.AddPosition;
import com.lunarclient.adventure.utils.Duo;
import com.moonsworth.lunar.lib.adventure.text.BuildableComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.ComponentBuilder;
import java.util.regex.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TransformationAdd<C extends BuildableComponent<C, B>, B extends ComponentBuilder<C, B>> implements Transformation<C, B> {
   private final Duo<AddPosition, Component> data;

   public TransformationAdd(AddPosition var1, Component var2) {
      this.data = Duo.of(var1, var2);
   }

   @Override
   public TransformationAction getTransformationAction() {
      return TransformationAction.ADD;
   }

   @NotNull
   @Override
   public B transform(@Nullable MatchResult var1, @NotNull B var2) {
      return (B)var2;
   }

   @Override
   public Object getData() {
      return this.data;
   }
}
