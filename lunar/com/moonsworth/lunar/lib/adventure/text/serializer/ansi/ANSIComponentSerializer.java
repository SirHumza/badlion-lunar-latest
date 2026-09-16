package com.moonsworth.lunar.lib.adventure.text.serializer.ansi;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.flattener.ComponentFlattener;
import com.moonsworth.lunar.lib.adventure.text.serializer.ComponentEncoder;
import com.moonsworth.lunar.lib.adventure.util.PlatformAPI;
import java.util.function.Consumer;
import net.kyori.ansi.ColorLevel;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public interface ANSIComponentSerializer extends ComponentEncoder<Component, String> {
   @NotNull
   static ANSIComponentSerializer ansi() {
      return ANSIComponentSerializerImpl.Instances.INSTANCE;
   }

   static ANSIComponentSerializer.@NotNull Builder builder() {
      return new ANSIComponentSerializerImpl.BuilderImpl();
   }

   interface Builder extends AbstractBuilder<ANSIComponentSerializer> {
      @NotNull
      ANSIComponentSerializer.Builder colorLevel(@NotNull ColorLevel var1);

      @NotNull
      ANSIComponentSerializer.Builder flattener(@NotNull ComponentFlattener var1);

      @NotNull
      ANSIComponentSerializer build();
   }

   @PlatformAPI
   @ApiStatus.Internal
   interface Provider {
      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      ANSIComponentSerializer ansi();

      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      Consumer<ANSIComponentSerializer.Builder> builder();
   }
}
