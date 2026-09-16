package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import org.jetbrains.annotations.Nullable;

final class GsonHacks {
   private GsonHacks() {
   }

   static boolean isNullOrEmpty(@Nullable JsonElement var0) {
      return var0 == null
         || var0.isJsonNull()
         || var0.isJsonArray() && var0.getAsJsonArray().size() == 0
         || var0.isJsonObject() && var0.getAsJsonObject().entrySet().isEmpty();
   }

   static boolean readBoolean(JsonReader var0) {
      JsonToken var1 = var0.peek();
      if (var1 == JsonToken.BOOLEAN) {
         return var0.nextBoolean();
      } else if (var1 == JsonToken.STRING) {
         return Boolean.parseBoolean(var0.nextString());
      } else if (var1 == JsonToken.NUMBER) {
         return var0.nextString().equals("1");
      } else {
         throw new JsonParseException("Token of type " + var1 + " cannot be interpreted as a boolean");
      }
   }

   static String readString(JsonReader var0) {
      JsonToken var1 = var0.peek();
      if (var1 == JsonToken.STRING || var1 == JsonToken.NUMBER) {
         return var0.nextString();
      } else if (var1 == JsonToken.BOOLEAN) {
         return String.valueOf(var0.nextBoolean());
      } else {
         throw new JsonParseException("Token of type " + var1 + " cannot be interpreted as a string");
      }
   }
}
