package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.text.object.ObjectContents;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;

public interface ObjectComponent extends BuildableComponent<ObjectComponent, ObjectComponent.Builder>, ScopedComponent<ObjectComponent> {
   @NotNull
   ObjectContents contents();

   @NotNull
   ObjectComponent contents(@NotNull ObjectContents var1);

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.concat(Stream.of(ExaminableProperty.of("contents", this.contents())), BuildableComponent.super.examinableProperties());
   }

   interface Builder extends ComponentBuilder<ObjectComponent, ObjectComponent.Builder> {
      @NotNull
      ObjectComponent.Builder contents(@NotNull ObjectContents var1);
   }
}
