package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.adventure.key.Key;

final class KeySerializer extends TypeAdapter<Key> {
   static final TypeAdapter<Key> INSTANCE = new KeySerializer().nullSafe();

   private KeySerializer() {
   }

   public void write(JsonWriter var1, Key var2) {
      var1.value(var2.asString());
   }

   public Key read(JsonReader var1) {
      return Key.key(var1.nextString());
   }
}
