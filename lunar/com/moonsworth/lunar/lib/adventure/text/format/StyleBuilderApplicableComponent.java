package com.moonsworth.lunar.lib.adventure.text.format;

import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface TextDecorationAndState extends StyleBuilderApplicable, Examinable {
   @NotNull
   TextDecoration decoration();

   TextDecoration.@NotNull State state();

   @Override
   default void styleApply(Style.@NotNull Builder var1) {
      var1.decoration(this.decoration(), this.state());
   }

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("decoration", this.decoration()), ExaminableProperty.of("state", this.state()));
   }
}
