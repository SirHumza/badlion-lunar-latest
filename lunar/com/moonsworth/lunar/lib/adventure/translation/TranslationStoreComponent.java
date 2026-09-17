package com.moonsworth.lunar.lib.adventure.translation;

import com.moonsworth.lunar.lib.adventure.key.Key;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
public interface TranslationRegistry extends TranslationStore.StringBased<MessageFormat>, Translator {
   @Deprecated
   Pattern SINGLE_QUOTE_PATTERN = Pattern.compile("'");

   @Deprecated
   @NotNull
   static TranslationRegistry create(Key var0) {
      return new MessageFormatTranslationStore(Objects.requireNonNull(var0, "name"));
   }

   @Deprecated
   @Override
   boolean contains(@NotNull String var1);

   @Deprecated
   @Nullable
   @Override
   MessageFormat translate(@NotNull String var1, @NotNull Locale var2);

   @Deprecated
   @Override
   void defaultLocale(@NotNull Locale var1);

   @Deprecated
   void register(@NotNull String var1, @NotNull Locale var2, @NotNull MessageFormat var3);

   @Deprecated
   @Override
   default void registerAll(@NotNull Locale var1, @NotNull Map<String, MessageFormat> var2) {
      this.registerAll(var1, var2.keySet(), var2::get);
   }

   @Deprecated
   @Override
   default void registerAll(@NotNull Locale var1, @NotNull Path var2, boolean var3) {
      try {
         BufferedReader var4 = Files.newBufferedReader(var2, StandardCharsets.UTF_8);

         try {
            this.registerAll(var1, new PropertyResourceBundle(var4), var3);
         } catch (Throwable var8) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var8.addSuppressed(var7);
               }
            }

            throw var8;
         }

         if (var4 != null) {
            var4.close();
         }
      } catch (IOException var9) {
      }
   }

   @Deprecated
   @Override
   default void registerAll(@NotNull Locale var1, @NotNull ResourceBundle var2, boolean var3) {
      this.registerAll(var1, var2.keySet(), var3x -> {
         String var4 = var2.getString(var3x);
         return new MessageFormat(var3 ? SINGLE_QUOTE_PATTERN.matcher(var4).replaceAll("''") : var4, var1);
      });
   }

   @Deprecated
   @Override
   default void registerAll(@NotNull Locale var1, @NotNull Set<String> var2, Function<String, MessageFormat> var3) {
      IllegalArgumentException var4 = null;
      int var5 = 0;

      for (String var7 : var2) {
         try {
            this.register(var7, var1, (MessageFormat)var3.apply(var7));
         } catch (IllegalArgumentException var9) {
            if (var4 == null) {
               var4 = var9;
            }

            var5++;
         }
      }

      if (var4 != null) {
         if (var5 == 1) {
            throw var4;
         }

         if (var5 > 1) {
            throw new IllegalArgumentException(String.format("Invalid key (and %d more)", var5 - 1), var4);
         }
      }
   }

   @Deprecated
   @Override
   void unregister(@NotNull String var1);
}
