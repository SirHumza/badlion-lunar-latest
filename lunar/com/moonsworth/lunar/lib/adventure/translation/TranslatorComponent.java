package com.moonsworth.lunar.lib.adventure.translation;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.renderer.TranslatableComponentRenderer;
import com.moonsworth.lunar.lib.adventure.util.TriState;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class GlobalTranslatorImpl implements GlobalTranslator {
   private static final Key NAME = Key.key("adventure", "global");
   static final GlobalTranslatorImpl INSTANCE = new GlobalTranslatorImpl();
   final TranslatableComponentRenderer<Locale> renderer = TranslatableComponentRenderer.usingTranslationSource(this);
   private final Set<Translator> sources = Collections.newSetFromMap(new ConcurrentHashMap<>());

   private GlobalTranslatorImpl() {
   }

   @NotNull
   @Override
   public Key name() {
      return NAME;
   }

   @NotNull
   @Override
   public Iterable<? extends Translator> sources() {
      return Collections.unmodifiableSet(this.sources);
   }

   @Override
   public boolean addSource(@NotNull Translator var1) {
      Objects.requireNonNull(var1, "source");
      if (var1 == this) {
         throw new IllegalArgumentException("GlobalTranslationSource");
      } else {
         return this.sources.add(var1);
      }
   }

   @Override
   public boolean removeSource(@NotNull Translator var1) {
      Objects.requireNonNull(var1, "source");
      return this.sources.remove(var1);
   }

   @NotNull
   @Override
   public TriState hasAnyTranslations() {
      return !this.sources.isEmpty() ? TriState.TRUE : TriState.FALSE;
   }

   @Override
   public boolean canTranslate(@NotNull String var1, @NotNull Locale var2) {
      Objects.requireNonNull(var1, "key");
      Objects.requireNonNull(var2, "locale");

      for (Translator var4 : this.sources) {
         if (var4.canTranslate(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public MessageFormat translate(@NotNull String var1, @NotNull Locale var2) {
      Objects.requireNonNull(var1, "key");
      Objects.requireNonNull(var2, "locale");

      for (Translator var4 : this.sources) {
         MessageFormat var5 = var4.translate(var1, var2);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   @Nullable
   @Override
   public Component translate(@NotNull TranslatableComponent var1, @NotNull Locale var2) {
      Objects.requireNonNull(var1, "component");
      Objects.requireNonNull(var2, "locale");

      for (Translator var4 : this.sources) {
         Component var5 = var4.translate(var1, var2);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("sources", this.sources));
   }
}
