package com.moonsworth.lunar.lib.adventure.text.serializer.legacy;

import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.format.TextFormat;
import java.util.List;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

@ApiStatus.NonExtendable
public interface CharacterAndFormat extends Examinable {
   CharacterAndFormat BLACK = characterAndFormat('0', NamedTextColor.BLACK, true);
   CharacterAndFormat DARK_BLUE = characterAndFormat('1', NamedTextColor.DARK_BLUE, true);
   CharacterAndFormat DARK_GREEN = characterAndFormat('2', NamedTextColor.DARK_GREEN, true);
   CharacterAndFormat DARK_AQUA = characterAndFormat('3', NamedTextColor.DARK_AQUA, true);
   CharacterAndFormat DARK_RED = characterAndFormat('4', NamedTextColor.DARK_RED, true);
   CharacterAndFormat DARK_PURPLE = characterAndFormat('5', NamedTextColor.DARK_PURPLE, true);
   CharacterAndFormat GOLD = characterAndFormat('6', NamedTextColor.GOLD, true);
   CharacterAndFormat GRAY = characterAndFormat('7', NamedTextColor.GRAY, true);
   CharacterAndFormat DARK_GRAY = characterAndFormat('8', NamedTextColor.DARK_GRAY, true);
   CharacterAndFormat BLUE = characterAndFormat('9', NamedTextColor.BLUE, true);
   CharacterAndFormat GREEN = characterAndFormat('a', NamedTextColor.GREEN, true);
   CharacterAndFormat AQUA = characterAndFormat('b', NamedTextColor.AQUA, true);
   CharacterAndFormat RED = characterAndFormat('c', NamedTextColor.RED, true);
   CharacterAndFormat LIGHT_PURPLE = characterAndFormat('d', NamedTextColor.LIGHT_PURPLE, true);
   CharacterAndFormat YELLOW = characterAndFormat('e', NamedTextColor.YELLOW, true);
   CharacterAndFormat WHITE = characterAndFormat('f', NamedTextColor.WHITE, true);
   CharacterAndFormat OBFUSCATED = characterAndFormat('k', TextDecoration.OBFUSCATED, true);
   CharacterAndFormat BOLD = characterAndFormat('l', TextDecoration.BOLD, true);
   CharacterAndFormat STRIKETHROUGH = characterAndFormat('m', TextDecoration.STRIKETHROUGH, true);
   CharacterAndFormat UNDERLINED = characterAndFormat('n', TextDecoration.UNDERLINED, true);
   CharacterAndFormat ITALIC = characterAndFormat('o', TextDecoration.ITALIC, true);
   CharacterAndFormat RESET = characterAndFormat('r', Reset.INSTANCE, true);

   @NotNull
   static CharacterAndFormat characterAndFormat(char var0, @NotNull TextFormat var1) {
      return characterAndFormat(var0, var1, false);
   }

   @NotNull
   static CharacterAndFormat characterAndFormat(char var0, @NotNull TextFormat var1, boolean var2) {
      return new CharacterAndFormatImpl(var0, var1, var2);
   }

   @NotNull
   static @Unmodifiable List<CharacterAndFormat> defaults() {
      return CharacterAndFormatImpl.Defaults.DEFAULTS;
   }

   char character();

   @NotNull
   TextFormat format();

   boolean caseInsensitive();

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(
         ExaminableProperty.of("character", this.character()),
         ExaminableProperty.of("format", this.format()),
         ExaminableProperty.of("caseInsensitive", this.caseInsensitive())
      );
   }
}
