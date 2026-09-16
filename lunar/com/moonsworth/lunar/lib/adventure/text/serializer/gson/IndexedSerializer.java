package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.adventure.util.Index;

final class IndexedSerializer<E> extends TypeAdapter<E> {
   private final String name;
   private final Index<String, E> map;
   private final boolean throwOnUnknownKey;

   public static <E> TypeAdapter<E> strict(String var0, Index<String, E> var1) {
      return new IndexedSerializer(var0, var1, true).nullSafe();
   }

   public static <E> TypeAdapter<E> lenient(String var0, Index<String, E> var1) {
      return new IndexedSerializer(var0, var1, false).nullSafe();
   }

   private IndexedSerializer(String var1, Index<String, E> var2, boolean var3) {
      this.name = var1;
      this.map = var2;
      this.throwOnUnknownKey = var3;
   }

   @Override
   public void write(JsonWriter var1, E var2) {
      var1.value(this.map.key((E)var2));
   }

   @Override
   public E read(JsonReader var1) {
      String var2 = var1.nextString();
      Object var3 = this.map.value(var2);
      if (var3 != null) {
         return (E)var3;
      } else if (this.throwOnUnknownKey) {
         throw new JsonParseException("invalid " + this.name + ":  " + var2);
      } else {
         return null;
      }
   }
}
