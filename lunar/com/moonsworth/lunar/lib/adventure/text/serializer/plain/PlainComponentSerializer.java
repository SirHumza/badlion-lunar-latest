package com.moonsworth.lunar.lib.adventure.text.serializer.plain;

import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.KeybindComponent;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.flattener.ComponentFlattener;
import com.moonsworth.lunar.lib.adventure.text.serializer.ComponentSerializer;
import com.moonsworth.lunar.lib.adventure.util.Buildable;
import java.util.function.Function;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
@ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
public class PlainComponentSerializer
   implements ComponentSerializer<Component, TextComponent, String>,
   Buildable<PlainComponentSerializer, PlainComponentSerializer.Builder> {
   @Deprecated
   final PlainTextComponentSerializer serializer;

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   @NotNull
   public static PlainComponentSerializer plain() {
      return PlainComponentSerializerImpl.INSTANCE;
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   public static PlainComponentSerializer.@NotNull Builder builder() {
      return new PlainComponentSerializerImpl.BuilderImpl();
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   public PlainComponentSerializer() {
      this(PlainTextComponentSerializer.plainText());
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   public PlainComponentSerializer(@Nullable Function<KeybindComponent, String> var1, @Nullable Function<TranslatableComponent, String> var2) {
      this(PlainComponentSerializerImpl.createRealSerializerFromLegacyFunctions(var1, var2));
   }

   @Deprecated
   PlainComponentSerializer(@NotNull PlainTextComponentSerializer var1) {
      this.serializer = var1;
   }

   @NotNull
   public TextComponent deserialize(@NotNull String var1) {
      return this.serializer.deserialize(var1);
   }

   @NotNull
   public String serialize(@NotNull Component var1) {
      return this.serializer.serialize(var1);
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   public void serialize(@NotNull StringBuilder var1, @NotNull Component var2) {
      this.serializer.serialize(var1, var2);
   }

   public PlainComponentSerializer.@NotNull Builder toBuilder() {
      return new PlainComponentSerializerImpl.BuilderImpl(this);
   }

   @Deprecated
   @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
   public interface Builder extends AbstractBuilder<PlainComponentSerializer>, Buildable.Builder<PlainComponentSerializer> {
      @Deprecated
      @ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
      @NotNull
      PlainComponentSerializer.Builder flattener(@NotNull ComponentFlattener var1);
   }
}
