package com.moonsworth.lunar.lib.adventure.translation;

import com.moonsworth.lunar.lib.adventure.key.Key;
import java.text.MessageFormat;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class MessageFormatTranslationStore extends AbstractTranslationStore.StringBased<MessageFormat> implements TranslationRegistry {
   MessageFormatTranslationStore(Key var1) {
      super(var1);
   }

   @NotNull
   protected MessageFormat parse(@NotNull String var1, @NotNull Locale var2) {
      return new MessageFormat(var1, var2);
   }

   @Nullable
   @Override
   public MessageFormat translate(@NotNull String var1, @NotNull Locale var2) {
      return this.translationValue(var1, var2);
   }
}
