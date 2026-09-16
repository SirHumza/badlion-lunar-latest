package com.moonsworth.lunar.lib.adventure.translation;

import com.moonsworth.lunar.lib.adventure.internal.properties.AdventureProperties;
import java.util.Locale;
import java.util.function.Supplier;

final class TranslationLocales {
   private static final Supplier<Locale> GLOBAL;

   private TranslationLocales() {
   }

   static Locale global() {
      return GLOBAL.get();
   }

   static {
      String var0 = AdventureProperties.DEFAULT_TRANSLATION_LOCALE.value();
      if (var0 == null || var0.isEmpty()) {
         GLOBAL = () -> Locale.US;
      } else if (var0.equals("system")) {
         GLOBAL = Locale::getDefault;
      } else {
         Locale var1 = Translator.parseLocale(var0);
         GLOBAL = () -> var1;
      }
   }
}
