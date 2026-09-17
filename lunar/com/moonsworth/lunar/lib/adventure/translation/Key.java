package com.moonsworth.lunar.lib.adventure.translation;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.util.TriState;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface Translator {
   @Nullable
   static Locale parseLocale(@NotNull String var0) {
      String[] var1 = var0.split("_", 3);
      int var2 = var1.length;
      if (var2 == 1) {
         return new Locale(var0);
      } else if (var2 == 2) {
         return new Locale(var1[0], var1[1]);
      } else {
         return var2 == 3 ? new Locale(var1[0], var1[1], var1[2]) : null;
      }
   }

   @NotNull
   Key name();

   @NotNull
   default TriState hasAnyTranslations() {
      return TriState.NOT_SET;
   }

   default boolean canTranslate(@NotNull String var1, @NotNull Locale var2) {
      Component var3 = this.translate(Component.translatable(Objects.requireNonNull(var1, "key")), Objects.requireNonNull(var2, "locale"));
      return var3 != null ? true : this.translate(var1, var2) != null;
   }

   @Nullable
   MessageFormat translate(@NotNull String var1, @NotNull Locale var2);

   @Nullable
   default Component translate(@NotNull TranslatableComponent var1, @NotNull Locale var2) {
      return null;
   }
}
