package com.moonsworth.lunar.lib.adventure.text.serializer.json;

import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.serializer.ComponentSerializer;
import com.moonsworth.lunar.lib.adventure.util.PlatformAPI;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface JSONComponentSerializer extends ComponentSerializer<Component, Component, String> {
   @NotNull
   static JSONComponentSerializer json() {
      return JSONComponentSerializerAccessor.Instances.INSTANCE;
   }

   static JSONComponentSerializer.@NotNull Builder builder() {
      return JSONComponentSerializerAccessor.Instances.BUILDER_SUPPLIER.get();
   }

   interface Builder {
      @NotNull
      JSONComponentSerializer.Builder options(@NotNull RRCRRCORICCHOHHIRCHIROOHIIOHCO var1);

      @NotNull
      JSONComponentSerializer.Builder editOptions(@NotNull Consumer<RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1);

      @Deprecated
      @NotNull
      JSONComponentSerializer.Builder downsampleColors();

      @NotNull
      JSONComponentSerializer.Builder legacyHoverEventSerializer(@Nullable LegacyHoverEventSerializer var1);

      @Deprecated
      @NotNull
      JSONComponentSerializer.Builder emitLegacyHoverEvent();

      @NotNull
      JSONComponentSerializer build();
   }

   @PlatformAPI
   @ApiStatus.Internal
   interface Provider {
      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      JSONComponentSerializer instance();

      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      Supplier<JSONComponentSerializer.Builder> builder();
   }
}
