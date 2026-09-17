package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONComponentSerializer;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONOptions;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import com.moonsworth.lunar.lib.adventure.util.PlatformAPI;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface GsonComponentSerializer extends JSONComponentSerializer, Buildable<GsonComponentSerializer, GsonComponentSerializer.Builder> {
   @NotNull
   static GsonComponentSerializer gson() {
      return GsonComponentSerializerImpl.Instances.INSTANCE;
   }

   @NotNull
   static GsonComponentSerializer colorDownsamplingGson() {
      return GsonComponentSerializerImpl.Instances.LEGACY_INSTANCE;
   }

   static GsonComponentSerializer.Builder builder() {
      return new GsonComponentSerializerImpl.BuilderImpl();
   }

   @NotNull
   Gson serializer();

   @NotNull
   UnaryOperator<GsonBuilder> populator();

   @NotNull
   Component deserializeFromTree(@NotNull JsonElement var1);

   @NotNull
   JsonElement serializeToTree(@NotNull Component var1);

   interface Builder extends AbstractBuilder<GsonComponentSerializer>, JSONComponentSerializer.Builder, Buildable.Builder<GsonComponentSerializer> {
      @NotNull
      GsonComponentSerializer.Builder options(@NotNull RRCRRCORICCHOHHIRCHIROOHIIOHCO var1);

      @NotNull
      GsonComponentSerializer.Builder editOptions(@NotNull Consumer<RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1);

      @NotNull
      default GsonComponentSerializer.Builder downsampleColors() {
         return this.editOptions(var0 -> var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JSONOptions.EMIT_RGB, false));
      }

      @Deprecated
      @NotNull
      default GsonComponentSerializer.Builder legacyHoverEventSerializer(@Nullable LegacyHoverEventSerializer var1) {
         return this.legacyHoverEventSerializer((com.moonsworth.lunar.lib.adventure.text.serializer.json.LegacyHoverEventSerializer)var1);
      }

      @NotNull
      GsonComponentSerializer.Builder legacyHoverEventSerializer(@Nullable LegacyHoverEventSerializer var1);

      @Deprecated
      @NotNull
      default GsonComponentSerializer.Builder emitLegacyHoverEvent() {
         return this.editOptions(var0 -> var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JSONOptions.EMIT_HOVER_EVENT_TYPE, JSONOptions.HoverEventValueMode.ALL));
      }

      @NotNull
      GsonComponentSerializer build();
   }

   @PlatformAPI
   @ApiStatus.Internal
   interface Provider {
      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      GsonComponentSerializer gson();

      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      GsonComponentSerializer gsonLegacy();

      @PlatformAPI
      @ApiStatus.Internal
      @NotNull
      Consumer<GsonComponentSerializer.Builder> builder();
   }
}
