package com.moonsworth.lunar.lib.adventure.text.object;

import com.moonsworth.lunar.lib.adventure.key.Key;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface SpriteObjectContents extends ObjectContents {
   Key DEFAULT_ATLAS = Key.key("minecraft:blocks");

   @NotNull
   Key atlas();

   @NotNull
   Key sprite();

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("atlas", this.atlas()), ExaminableProperty.of("sprite", this.sprite()));
   }
}
