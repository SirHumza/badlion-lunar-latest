package com.moonsworth.lunar.lib.adventure.translation;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.util.TriState;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractTranslationStore<T> implements TranslationStore<T>, Examinable {
   @NotNull
   private final Key name;
   private final Map<String, AbstractTranslationStore<T>.Translation> translations = new ConcurrentHashMap<>();
   @NotNull
   private volatile Locale defaultLocale = Locale.US;

   protected AbstractTranslationStore(@NotNull Key var1) {
      this.name = Objects.requireNonNull(var1, "name");
   }

   @Nullable
   protected T translationValue(@NotNull String var1, @NotNull Locale var2) {
      AbstractTranslationStore.Translation var3 = this.translations.get(Objects.requireNonNull(var1, "key"));
      return (T)(var3 == null ? null : var3.translate(Objects.requireNonNull(var2, "locale")));
   }

   @Override
   public final boolean contains(@NotNull String var1) {
      return this.translations.containsKey(var1);
   }

   @Override
   public final boolean contains(@NotNull String var1, @NotNull Locale var2) {
      AbstractTranslationStore.Translation var3 = this.translations.get(Objects.requireNonNull(var1, "key"));
      return var3 == null ? false : var3.translations.get(Objects.requireNonNull(var2, "locale")) != null;
   }

   @Override
   public final boolean canTranslate(@NotNull String var1, @NotNull Locale var2) {
      AbstractTranslationStore.Translation var3 = this.translations.get(Objects.requireNonNull(var1, "key"));
      return var3 == null ? false : var3.translate(Objects.requireNonNull(var2, "locale")) != null;
   }

   @Override
   public final void defaultLocale(@NotNull Locale var1) {
      this.defaultLocale = Objects.requireNonNull(var1, "locale");
   }

   @Override
   public final void register(@NotNull String var1, @NotNull Locale var2, @NotNull T var3) {
      this.translations.computeIfAbsent(var1, var1x -> new AbstractTranslationStore.Translation(var1x)).register(var2, (T)var3);
   }

   @Override
   public final void registerAll(@NotNull Locale var1, @NotNull Map<String, T> var2) {
      this.registerAll(var1, var2.keySet(), var2::get);
   }

   @Override
   public final void registerAll(@NotNull Locale var1, @NotNull Set<String> var2, Function<String, T> var3) {
      IllegalArgumentException var4 = null;
      int var5 = 0;

      for (String var7 : var2) {
         try {
            this.register(var7, var1, (T)var3.apply(var7));
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

   @Override
   public final void unregister(@NotNull String var1) {
      this.translations.remove(var1);
   }

   @NotNull
   @Override
   public final Key name() {
      return this.name;
   }

   @NotNull
   @Override
   public final TriState hasAnyTranslations() {
      return TriState.byBoolean(!this.translations.isEmpty());
   }

   @NotNull
   @Override
   public final Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("translations", this.translations));
   }

   @Override
   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof AbstractTranslationStore)) {
         return false;
      }

      AbstractTranslationStore var2 = (AbstractTranslationStore)var1;
      return this.name.equals(var2.name);
   }

   @Override
   public final int hashCode() {
      return this.name.hashCode();
   }

   @NotNull
   @Override
   public final String toString() {
      return Internals.toString(this);
   }

   public abstract static class StringBased<T> extends AbstractTranslationStore<T> implements TranslationStore.StringBased<T> {
      private static final Pattern SINGLE_QUOTE_PATTERN = Pattern.compile("'");

      protected StringBased(@NotNull Key var1) {
         super(var1);
      }

      @NotNull
      protected abstract T parse(@NotNull String var1, @NotNull Locale var2);

      @Override
      public final void registerAll(@NotNull Locale var1, @NotNull Path var2, boolean var3) {
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

      @Override
      public final void registerAll(@NotNull Locale var1, @NotNull ResourceBundle var2, boolean var3) {
         this.registerAll(var1, var2.keySet(), var4 -> {
            String var5 = var2.getString(var4);
            return this.parse(var3 ? SINGLE_QUOTE_PATTERN.matcher(var5).replaceAll("''") : var5, var1);
         });
      }
   }

   private final class Translation implements Examinable {
      private final String key;
      private final Map<Locale, T> translations;

      private Translation(@NotNull String var2) {
         this.key = Objects.requireNonNull(var2, "key");
         this.translations = new ConcurrentHashMap<>();
      }

      @Nullable
      private T translate(@NotNull Locale var1) {
         Object var2 = this.translations.get(Objects.requireNonNull(var1, "locale"));
         if (var2 == null) {
            var2 = this.translations.get(new Locale(var1.getLanguage()));
            if (var2 == null) {
               var2 = this.translations.get(AbstractTranslationStore.this.defaultLocale);
               if (var2 == null) {
                  var2 = this.translations.get(TranslationLocales.global());
               }
            }
         }

         return (T)var2;
      }

      private void register(@NotNull Locale var1, @NotNull T var2) {
         if (this.translations.putIfAbsent(Objects.requireNonNull(var1, "locale"), Objects.requireNonNull((T)var2, "translation")) != null) {
            throw new IllegalArgumentException(String.format("Translation already exists: %s for %s", this.key, var1));
         }
      }

      @NotNull
      @Override
      public Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(ExaminableProperty.of("key", this.key), ExaminableProperty.of("translations", this.translations));
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         }

         if (!(var1 instanceof AbstractTranslationStore.Translation)) {
            return false;
         }

         AbstractTranslationStore.Translation var2 = (AbstractTranslationStore.Translation)var1;
         return this.key.equals(var2.key) && this.translations.equals(var2.translations);
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.key, this.translations);
      }

      @Override
      public String toString() {
         return Internals.toString(this);
      }
   }
}
