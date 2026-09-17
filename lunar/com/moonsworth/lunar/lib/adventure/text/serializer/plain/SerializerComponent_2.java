package com.moonsworth.lunar.lib.adventure.text.serializer.plain;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.flattener.ComponentFlattener;
import com.moonsworth.lunar.lib.adventure.text.serializer.ComponentSerializer;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import com.moonsworth.lunar.lib.adventure.util.PlatformAPI;
import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public interface PlainTextComponentSerializer
   extends ComponentSerializer<Component, TextComponent, String>,
   Buildable<PlainTextComponentSerializer, PlainTextComponentSerializer.Builder> {
   @NotNull
   static PlainTextComponentSerializer plainText() {
      return PlainTextComponentSerializerImpl.Instances.INSTANCE;
   }

   static PlainTextComponentSerializer.@NotNull Builder builder() {
      return new PlainTextComponentSerializerImpl.BuilderImpl();
   }

   @NotNull
   default TextComponent deserialize(@NotNull String var1) {
      return Component.text(var1);
   }

   @NotNull
   default String serialize(@NotNull Component var1) {
      StringBuilder var2 = new StringBuilder();
      this.serialize(var2, var1);
      return var2.toString();
   }

   void serialize(@NotNull StringBuilder var1, @NotNull Component var2);

   interface Builder extends AbstractBuilder<PlainTextComponentSerializer>, Buildable.Builder<PlainTextComponentSerializer> {
      @NotNull
      PlainTextComponentSerializer.Builder flattener(@NotNull ComponentFlattener var1);
   }

   @PlatformAPI
   @ApiStatus.Internal
   interface Provider {
      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      PlainTextComponentSerializer plainTextSimple();

      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      Consumer<PlainTextComponentSerializer.Builder> plainText();
   }
}
