package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.serializer.json.JSONOptions;
import com.moonsworth.lunar.lib.adventure.util.Services;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class GsonComponentSerializerImpl implements GsonComponentSerializer {
   private static final Optional<GsonComponentSerializer.Provider> SERVICE = Services.service(GsonComponentSerializer.Provider.class);
   static final Consumer<GsonComponentSerializer.Builder> BUILDER = SERVICE.map(GsonComponentSerializer.Provider::builder).orElseGet(() -> var0 -> {});
   private final Gson serializer;
   private final UnaryOperator<GsonBuilder> populator;
   private final @Nullable LegacyHoverEventSerializer legacyHoverSerializer;
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO flags;

   GsonComponentSerializerImpl(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1, @Nullable LegacyHoverEventSerializer var2) {
      this.flags = var1;
      this.legacyHoverSerializer = var2;
      this.populator = var2x -> {
         var2x.registerTypeAdapterFactory(new SerializerFactory(var1, var2));
         return var2x;
      };
      this.serializer = this.populator.apply(new GsonBuilder().disableHtmlEscaping()).create();
   }

   @NotNull
   @Override
   public Gson serializer() {
      return this.serializer;
   }

   @NotNull
   @Override
   public UnaryOperator<GsonBuilder> populator() {
      return this.populator;
   }

   @NotNull
   public Component deserialize(@NotNull String var1) {
      Component var2 = this.serializer().fromJson(var1, Component.class);
      if (var2 == null) {
         throw ComponentSerializerImpl.notSureHowToDeserialize(var1);
      } else {
         return var2;
      }
   }

   @Nullable
   public Component deserializeOr(@Nullable String var1, @Nullable Component var2) {
      if (var1 == null) {
         return var2;
      }

      Component var3 = this.serializer().fromJson(var1, Component.class);
      return var3 == null ? var2 : var3;
   }

   @NotNull
   public String serialize(@NotNull Component var1) {
      return this.serializer().toJson(var1);
   }

   @NotNull
   @Override
   public Component deserializeFromTree(@NotNull JsonElement var1) {
      Component var2 = this.serializer().fromJson(var1, Component.class);
      if (var2 == null) {
         throw ComponentSerializerImpl.notSureHowToDeserialize(var1);
      } else {
         return var2;
      }
   }

   @NotNull
   @Override
   public JsonElement serializeToTree(@NotNull Component var1) {
      return this.serializer().toJsonTree(var1);
   }

   @NotNull
   public GsonComponentSerializer.Builder toBuilder() {
      return new GsonComponentSerializerImpl.BuilderImpl(this);
   }

   static final class BuilderImpl implements GsonComponentSerializer.Builder {
      private RRCRRCORICCHOHHIRCHIROOHIIOHCO flags = JSONOptions.byDataVersion();
      private @Nullable LegacyHoverEventSerializer legacyHoverSerializer;

      BuilderImpl() {
         GsonComponentSerializerImpl.BUILDER.accept(this);
      }

      BuilderImpl(GsonComponentSerializerImpl var1) {
         this();
         this.flags = var1.flags;
         this.legacyHoverSerializer = var1.legacyHoverSerializer;
      }

      @NotNull
      @Override
      public GsonComponentSerializer.Builder options(@NotNull RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
         this.flags = Objects.requireNonNull(var1, "flags");
         return this;
      }

      @NotNull
      @Override
      public GsonComponentSerializer.Builder editOptions(@NotNull Consumer<RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = JSONOptions.schema()
            .RIROROHROHIHIICHOHOHICHIOHIHHR()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.flags);
         Objects.requireNonNull(var1, "flagEditor").accept(var2);
         this.flags = var2.CICRRIRCOICCOIOCCCIIOCCRRIIICI();
         return this;
      }

      @NotNull
      @Override
      public GsonComponentSerializer.Builder legacyHoverEventSerializer(@Nullable LegacyHoverEventSerializer var1) {
         this.legacyHoverSerializer = var1;
         return this;
      }

      @NotNull
      @Override
      public GsonComponentSerializer build() {
         return new GsonComponentSerializerImpl(this.flags, this.legacyHoverSerializer);
      }
   }

   static final class Instances {
      static final GsonComponentSerializer INSTANCE = GsonComponentSerializerImpl.SERVICE
         .map(GsonComponentSerializer.Provider::gson)
         .orElseGet(() -> new GsonComponentSerializerImpl(JSONOptions.byDataVersion(), null));
      static final GsonComponentSerializer LEGACY_INSTANCE = GsonComponentSerializerImpl.SERVICE
         .map(GsonComponentSerializer.Provider::gsonLegacy)
         .orElseGet(() -> new GsonComponentSerializerImpl(JSONOptions.byDataVersion().OCICOIOIIROOCCCHCCCIIROIHCHCHC(2525), null));
   }
}
