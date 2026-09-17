package com.moonsworth.lunar.lib.adventure.text.serializer.plain;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.flattener.ComponentFlattener;
import com.moonsworth.lunar.lib.adventure.util.Services;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;

final class PlainTextComponentSerializerImpl implements PlainTextComponentSerializer {
   private static final ComponentFlattener DEFAULT_FLATTENER = ComponentFlattener.basic().toBuilder().unknownMapper(var0 -> {
      throw new UnsupportedOperationException("Don't know how to turn " + var0.getClass().getSimpleName() + " into a string");
   }).build();
   private static final Optional<PlainTextComponentSerializer.Provider> SERVICE = Services.service(PlainTextComponentSerializer.Provider.class);
   static final Consumer<PlainTextComponentSerializer.Builder> BUILDER = SERVICE.map(PlainTextComponentSerializer.Provider::plainText)
      .orElseGet(() -> var0 -> {});
   final ComponentFlattener flattener;

   PlainTextComponentSerializerImpl(ComponentFlattener var1) {
      this.flattener = var1;
   }

   @Override
   public void serialize(@NotNull StringBuilder var1, @NotNull Component var2) {
      this.flattener.flatten(Objects.requireNonNull(var2, "component"), var1::append);
   }

   @NotNull
   public PlainTextComponentSerializer.Builder toBuilder() {
      return new PlainTextComponentSerializerImpl.BuilderImpl(this);
   }

   static final class BuilderImpl implements PlainTextComponentSerializer.Builder {
      private ComponentFlattener flattener = PlainTextComponentSerializerImpl.DEFAULT_FLATTENER;

      BuilderImpl() {
         PlainTextComponentSerializerImpl.BUILDER.accept(this);
      }

      BuilderImpl(PlainTextComponentSerializerImpl var1) {
         this();
         this.flattener = var1.flattener;
      }

      @Override
      public PlainTextComponentSerializer.@NotNull Builder flattener(@NotNull ComponentFlattener var1) {
         this.flattener = Objects.requireNonNull(var1, "flattener");
         return this;
      }

      @NotNull
      public PlainTextComponentSerializer build() {
         return new PlainTextComponentSerializerImpl(this.flattener);
      }
   }

   static final class Instances {
      static final PlainTextComponentSerializer INSTANCE = PlainTextComponentSerializerImpl.SERVICE
         .map(PlainTextComponentSerializer.Provider::plainTextSimple)
         .orElseGet(() -> new PlainTextComponentSerializerImpl(PlainTextComponentSerializerImpl.DEFAULT_FLATTENER));
   }
}
