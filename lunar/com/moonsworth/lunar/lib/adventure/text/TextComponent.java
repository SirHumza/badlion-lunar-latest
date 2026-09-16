package com.moonsworth.lunar.lib.adventure.text;

import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface TextComponent extends BuildableComponent<TextComponent, TextComponent.Builder>, ScopedComponent<TextComponent> {
   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   @NotNull
   static TextComponent ofChildren(@NotNull ComponentLike... var0) {
      return Component.textOfChildren(var0);
   }

   @NotNull
   String content();

   @Contract(pure = true)
   @NotNull
   TextComponent content(@NotNull String var1);

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.concat(Stream.of(ExaminableProperty.of("content", this.content())), BuildableComponent.super.examinableProperties());
   }

   interface Builder extends ComponentBuilder<TextComponent, TextComponent.Builder> {
      @NotNull
      String content();

      @Contract("_ -> this")
      @NotNull
      TextComponent.Builder content(@NotNull String var1);
   }
}
