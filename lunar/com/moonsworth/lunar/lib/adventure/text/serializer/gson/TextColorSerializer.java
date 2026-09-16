package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class TextColorSerializer extends TypeAdapter<TextColor> {
   static final TypeAdapter<TextColor> INSTANCE = new TextColorSerializer(false).nullSafe();
   static final TypeAdapter<TextColor> DOWNSAMPLE_COLOR = new TextColorSerializer(true).nullSafe();
   private final boolean downsampleColor;

   private TextColorSerializer(boolean var1) {
      this.downsampleColor = var1;
   }

   public void write(JsonWriter var1, TextColor var2) {
      if (var2 instanceof NamedTextColor) {
         var1.value(NamedTextColor.NAMES.key((NamedTextColor)var2));
      } else if (this.downsampleColor) {
         var1.value(NamedTextColor.NAMES.key(NamedTextColor.nearestTo(var2)));
      } else {
         var1.value(asUpperCaseHexString(var2));
      }
   }

   private static String asUpperCaseHexString(TextColor var0) {
      return String.format(Locale.ROOT, "%c%06X", '#', var0.value());
   }

   @Nullable
   public TextColor read(JsonReader var1) {
      TextColor var2 = fromString(var1.nextString());
      if (var2 == null) {
         return null;
      } else {
         return this.downsampleColor ? NamedTextColor.nearestTo(var2) : var2;
      }
   }

   @Nullable
   static TextColor fromString(@NotNull String var0) {
      return var0.startsWith("#") ? TextColor.fromHexString(var0) : NamedTextColor.NAMES.value(var0);
   }
}
