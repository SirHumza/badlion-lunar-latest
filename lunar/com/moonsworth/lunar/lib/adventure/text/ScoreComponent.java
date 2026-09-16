package com.moonsworth.lunar.lib.adventure.text;

import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ScoreComponent extends BuildableComponent<ScoreComponent, ScoreComponent.Builder>, ScopedComponent<ScoreComponent> {
   @NotNull
   String name();

   @Contract(pure = true)
   @NotNull
   ScoreComponent name(@NotNull String var1);

   @NotNull
   String objective();

   @Contract(pure = true)
   @NotNull
   ScoreComponent objective(@NotNull String var1);

   @Deprecated
   @Nullable
   String value();

   @Deprecated
   @Contract(pure = true)
   @NotNull
   ScoreComponent value(@Nullable String var1);

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.concat(
         Stream.of(
            ExaminableProperty.of("name", this.name()), ExaminableProperty.of("objective", this.objective()), ExaminableProperty.of("value", this.value())
         ),
         BuildableComponent.super.examinableProperties()
      );
   }

   interface Builder extends ComponentBuilder<ScoreComponent, ScoreComponent.Builder> {
      @Contract("_ -> this")
      @NotNull
      ScoreComponent.Builder name(@NotNull String var1);

      @Contract("_ -> this")
      @NotNull
      ScoreComponent.Builder objective(@NotNull String var1);

      @Deprecated
      @Contract("_ -> this")
      @NotNull
      ScoreComponent.Builder value(@Nullable String var1);
   }
}
