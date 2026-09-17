package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import org.jetbrains.annotations.Nullable;

final class TextColorWrapper {
   @Nullable
   final TextColor color;
   @Nullable
   final TextDecoration decoration;
   final boolean reset;

   TextColorWrapper(@Nullable TextColor var1, @Nullable TextDecoration var2, boolean var3) {
      this.color = var1;
      this.decoration = var2;
      this.reset = var3;
   }

   static final class Serializer extends TypeAdapter<TextColorWrapper> {
      static final TextColorWrapper.Serializer INSTANCE = new TextColorWrapper.Serializer();

      private Serializer() {
      }

      public void write(JsonWriter var1, TextColorWrapper var2) {
         throw new JsonSyntaxException("Cannot write TextColorWrapper instances");
      }

      public TextColorWrapper read(JsonReader var1) {
         String var2 = var1.nextString();
         TextColor var3 = TextColorSerializer.fromString(var2);
         TextDecoration var4 = TextDecoration.NAMES.value(var2);
         boolean var5 = var4 == null && var2.equals("reset");
         if (var3 == null && var4 == null && !var5) {
            throw new JsonParseException("Don't know how to parse " + var2 + " at " + var1.getPath());
         } else {
            return new TextColorWrapper(var3, var4, var5);
         }
      }
   }
}
