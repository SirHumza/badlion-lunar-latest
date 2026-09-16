package com.moonsworth.lunar.lib.adventure.text.serializer.plain;

import com.moonsworth.lunar.lib.adventure.text.KeybindComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.flattener.ComponentFlattener;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
final class PlainComponentSerializerImpl {
   @Deprecated
   static final PlainComponentSerializer INSTANCE = new PlainComponentSerializer();

   private PlainComponentSerializerImpl() {
   }

   @Deprecated
   static PlainTextComponentSerializer createRealSerializerFromLegacyFunctions(
      @Nullable Function<KeybindComponent, String> var0, @Nullable Function<TranslatableComponent, String> var1
   ) {
      if (var0 == null && var1 == null) {
         return PlainTextComponentSerializer.plainText();
      }

      ComponentFlattener.Builder var2 = ComponentFlattener.basic().toBuilder();
      if (var0 != null) {
         var2.mapper(KeybindComponent.class, var0);
      }

      if (var1 != null) {
         var2.mapper(TranslatableComponent.class, var1);
      }

      return PlainTextComponentSerializer.builder().flattener(var2.build()).build();
   }

   @Deprecated
   static final class BuilderImpl implements PlainComponentSerializer.Builder {
      private final PlainTextComponentSerializer.Builder builder = PlainTextComponentSerializer.builder();

      @Deprecated
      BuilderImpl() {
      }

      @Deprecated
      BuilderImpl(PlainComponentSerializer var1) {
         this.builder.flattener(((PlainTextComponentSerializerImpl)var1.serializer).flattener);
      }

      @Override
      public PlainComponentSerializer.@NotNull Builder flattener(@NotNull ComponentFlattener var1) {
         this.builder.flattener(var1);
         return this;
      }

      @NotNull
      public PlainComponentSerializer build() {
         return new PlainComponentSerializer(this.builder.build());
      }
   }
}
