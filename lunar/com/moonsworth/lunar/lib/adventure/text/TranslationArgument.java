package com.moonsworth.lunar.lib.adventure.text;

import java.util.Objects;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.NonExtendable
public interface TranslationArgument extends TranslationArgumentLike, Examinable {
   @NotNull
   static TranslationArgument bool(boolean var0) {
      return new TranslationArgumentImpl(var0);
   }

   @NotNull
   static TranslationArgument numeric(@NotNull Number var0) {
      return new TranslationArgumentImpl(Objects.requireNonNull(var0, "value"));
   }

   @NotNull
   static TranslationArgument component(@NotNull ComponentLike var0) {
      return var0 instanceof TranslationArgumentLike
         ? ((TranslationArgumentLike)var0).asTranslationArgument()
         : new TranslationArgumentImpl(Objects.requireNonNull(Objects.requireNonNull(var0, "value").asComponent(), "value.asComponent()"));
   }

   @NotNull
   Object value();

   @NotNull
   @Override
   default TranslationArgument asTranslationArgument() {
      return this;
   }
}
