package com.moonsworth.lunar.lib.adventure.text;

import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public interface KeybindComponent extends BuildableComponent<KeybindComponent, KeybindComponent.Builder>, ScopedComponent<KeybindComponent> {
   @NotNull
   String keybind();

   @Contract(pure = true)
   @NotNull
   KeybindComponent keybind(@NotNull String var1);

   @Contract(pure = true)
   @NotNull
   default KeybindComponent keybind(@NotNull KeybindComponent.KeybindLike var1) {
      return this.keybind(Objects.requireNonNull(var1, "keybind").asKeybind());
   }

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.concat(Stream.of(ExaminableProperty.of("keybind", this.keybind())), BuildableComponent.super.examinableProperties());
   }

   interface Builder extends ComponentBuilder<KeybindComponent, KeybindComponent.Builder> {
      @Contract("_ -> this")
      @NotNull
      KeybindComponent.Builder keybind(@NotNull String var1);

      @Contract(pure = true)
      @NotNull
      default KeybindComponent.Builder keybind(@NotNull KeybindComponent.KeybindLike var1) {
         return this.keybind(Objects.requireNonNull(var1, "keybind").asKeybind());
      }
   }

   interface KeybindLike {
      @NotNull
      String asKeybind();
   }
}
