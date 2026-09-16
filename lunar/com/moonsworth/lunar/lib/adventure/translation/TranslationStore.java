package com.moonsworth.lunar.lib.adventure.translation;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;

public interface TranslationStore<T> extends Translator {
   @NotNull
   static TranslationStore<Component> component(@NotNull Key var0) {
      return new ComponentTranslationStore(Objects.requireNonNull(var0, "name"));
   }

   static TranslationStore.@NotNull StringBased<MessageFormat> messageFormat(@NotNull Key var0) {
      return new MessageFormatTranslationStore(Objects.requireNonNull(var0, "name"));
   }

   boolean contains(@NotNull String var1);

   boolean contains(@NotNull String var1, @NotNull Locale var2);

   @Override
   default boolean canTranslate(@NotNull String var1, @NotNull Locale var2) {
      return Translator.super.canTranslate(var1, var2);
   }

   void defaultLocale(@NotNull Locale var1);

   void register(@NotNull String var1, @NotNull Locale var2, T var3);

   void registerAll(@NotNull Locale var1, @NotNull Map<String, T> var2);

   void registerAll(@NotNull Locale var1, @NotNull Set<String> var2, Function<String, T> var3);

   void unregister(@NotNull String var1);

   interface StringBased<T> extends TranslationStore<T> {
      void registerAll(@NotNull Locale var1, @NotNull Path var2, boolean var3);

      void registerAll(@NotNull Locale var1, @NotNull ResourceBundle var2, boolean var3);
   }
}
