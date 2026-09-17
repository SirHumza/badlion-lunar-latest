package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.translation.Translatable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TranslatableComponent extends BuildableComponent<TranslatableComponent, TranslatableComponent.Builder>, ScopedComponent<TranslatableComponent> {
   @NotNull
   String key();

   @Contract(pure = true)
   @NotNull
   default TranslatableComponent key(@NotNull Translatable var1) {
      return this.key(Objects.requireNonNull(var1, "translatable").translationKey());
   }

   @Contract(pure = true)
   @NotNull
   TranslatableComponent key(@NotNull String var1);

   @Deprecated
   @NotNull
   List<Component> args();

   @Deprecated
   @Contract(pure = true)
   @NotNull
   default TranslatableComponent args(@NotNull ComponentLike... var1) {
      return this.arguments(var1);
   }

   @Deprecated
   @Contract(pure = true)
   @NotNull
   default TranslatableComponent args(@NotNull List<? extends ComponentLike> var1) {
      return this.arguments(var1);
   }

   @NotNull
   List<TranslationArgument> arguments();

   @Contract(pure = true)
   @NotNull
   TranslatableComponent arguments(@NotNull ComponentLike... var1);

   @Contract(pure = true)
   @NotNull
   TranslatableComponent arguments(@NotNull List<? extends ComponentLike> var1);

   @Nullable
   String fallback();

   @Contract(pure = true)
   @NotNull
   TranslatableComponent fallback(@Nullable String var1);

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.concat(
         Stream.of(
            ExaminableProperty.of("key", this.key()), ExaminableProperty.of("arguments", this.arguments()), ExaminableProperty.of("fallback", this.fallback())
         ),
         BuildableComponent.super.examinableProperties()
      );
   }

   interface Builder extends ComponentBuilder<TranslatableComponent, TranslatableComponent.Builder> {
      @Contract(pure = true)
      @NotNull
      default TranslatableComponent.Builder key(@NotNull Translatable var1) {
         return this.key(Objects.requireNonNull(var1, "translatable").translationKey());
      }

      @Contract("_ -> this")
      @NotNull
      TranslatableComponent.Builder key(@NotNull String var1);

      @Deprecated
      @Contract("_ -> this")
      @NotNull
      default TranslatableComponent.Builder args(@NotNull ComponentBuilder<?, ?> var1) {
         return this.arguments(var1);
      }

      @Deprecated
      @Contract("_ -> this")
      @NotNull
      default TranslatableComponent.Builder args(@NotNull ComponentBuilder<?, ?>... var1) {
         return this.arguments(var1);
      }

      @Deprecated
      @Contract("_ -> this")
      @NotNull
      default TranslatableComponent.Builder args(@NotNull Component var1) {
         return this.arguments(var1);
      }

      @Deprecated
      @Contract("_ -> this")
      @NotNull
      default TranslatableComponent.Builder args(@NotNull ComponentLike... var1) {
         return this.arguments(var1);
      }

      @Deprecated
      @Contract("_ -> this")
      @NotNull
      default TranslatableComponent.Builder args(@NotNull List<? extends ComponentLike> var1) {
         return this.arguments(var1);
      }

      @Contract("_ -> this")
      @NotNull
      TranslatableComponent.Builder arguments(@NotNull ComponentLike... var1);

      @Contract("_ -> this")
      @NotNull
      TranslatableComponent.Builder arguments(@NotNull List<? extends ComponentLike> var1);

      @Contract("_ -> this")
      @NotNull
      TranslatableComponent.Builder fallback(@Nullable String var1);
   }
}
