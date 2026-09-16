package com.moonsworth.lunar.lib.adventure.text.serializer.legacy;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.format.TextFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class CharacterAndFormatImpl implements CharacterAndFormat {
   private final char character;
   private final TextFormat format;
   private final boolean caseInsensitive;

   CharacterAndFormatImpl(char var1, @NotNull TextFormat var2, boolean var3) {
      this.character = var1;
      this.format = Objects.requireNonNull(var2, "format");
      this.caseInsensitive = var3;
   }

   @Override
   public char character() {
      return this.character;
   }

   @NotNull
   @Override
   public TextFormat format() {
      return this.format;
   }

   @Override
   public boolean caseInsensitive() {
      return this.caseInsensitive;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof CharacterAndFormatImpl)) {
         return false;
      }

      CharacterAndFormatImpl var2 = (CharacterAndFormatImpl)var1;
      return this.character == var2.character && this.format.equals(var2.format) && this.caseInsensitive == var2.caseInsensitive;
   }

   @Override
   public int hashCode() {
      int var1 = this.character;
      var1 = 31 * var1 + this.format.hashCode();
      return 31 * var1 + Boolean.hashCode(this.caseInsensitive);
   }

   @NotNull
   @Override
   public String toString() {
      return Internals.toString(this);
   }

   static final class Defaults {
      static final List<CharacterAndFormat> DEFAULTS = createDefaults();

      private Defaults() {
      }

      static List<CharacterAndFormat> createDefaults() {
         ArrayList var0 = new ArrayList(22);
         var0.add(CharacterAndFormat.BLACK);
         var0.add(CharacterAndFormat.DARK_BLUE);
         var0.add(CharacterAndFormat.DARK_GREEN);
         var0.add(CharacterAndFormat.DARK_AQUA);
         var0.add(CharacterAndFormat.DARK_RED);
         var0.add(CharacterAndFormat.DARK_PURPLE);
         var0.add(CharacterAndFormat.GOLD);
         var0.add(CharacterAndFormat.GRAY);
         var0.add(CharacterAndFormat.DARK_GRAY);
         var0.add(CharacterAndFormat.BLUE);
         var0.add(CharacterAndFormat.GREEN);
         var0.add(CharacterAndFormat.AQUA);
         var0.add(CharacterAndFormat.RED);
         var0.add(CharacterAndFormat.LIGHT_PURPLE);
         var0.add(CharacterAndFormat.YELLOW);
         var0.add(CharacterAndFormat.WHITE);
         var0.add(CharacterAndFormat.OBFUSCATED);
         var0.add(CharacterAndFormat.BOLD);
         var0.add(CharacterAndFormat.STRIKETHROUGH);
         var0.add(CharacterAndFormat.UNDERLINED);
         var0.add(CharacterAndFormat.ITALIC);
         var0.add(CharacterAndFormat.RESET);
         return Collections.unmodifiableList(var0);
      }
   }
}
