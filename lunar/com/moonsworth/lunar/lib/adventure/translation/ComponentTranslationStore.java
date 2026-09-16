package com.moonsworth.lunar.lib.adventure.translation;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import java.text.MessageFormat;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ComponentTranslationStore extends AbstractTranslationStore<Component> {
   ComponentTranslationStore(@NotNull Key var1) {
      super(var1);
   }

   @Nullable
   @Override
   public MessageFormat translate(@NotNull String var1, @NotNull Locale var2) {
      return null;
   }

   @Nullable
   @Override
   public Component translate(@NotNull TranslatableComponent var1, @NotNull Locale var2) {
      Component var3 = this.translationValue(var1.key(), var2);
      return var3 == null ? null : var3.append(var1.children());
   }
}
