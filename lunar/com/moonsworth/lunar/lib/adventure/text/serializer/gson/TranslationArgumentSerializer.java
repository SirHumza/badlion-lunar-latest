package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TranslationArgument;

final class TranslationArgumentSerializer extends TypeAdapter<TranslationArgument> {
   private final Gson gson;

   static TypeAdapter<TranslationArgument> create(Gson var0) {
      return new TranslationArgumentSerializer(var0).nullSafe();
   }

   private TranslationArgumentSerializer(Gson var1) {
      this.gson = var1;
   }

   public void write(JsonWriter var1, TranslationArgument var2) {
      Object var3 = var2.value();
      if (var3 instanceof Boolean) {
         var1.value((Boolean)var3);
      } else if (var3 instanceof Number) {
         var1.value((Number)var3);
      } else {
         if (!(var3 instanceof Component)) {
            throw new IllegalStateException("Unable to serialize translatable argument of type " + var3.getClass() + ": " + var3);
         }

         this.gson.toJson(var3, SerializerFactory.COMPONENT_TYPE, var1);
      }
   }

   public TranslationArgument read(JsonReader var1) {
      switch (var1.peek()) {
         case BOOLEAN:
            return TranslationArgument.bool(var1.nextBoolean());
         case NUMBER:
            return TranslationArgument.numeric(this.gson.fromJson(var1, Number.class));
         default:
            return TranslationArgument.component(this.gson.fromJson(var1, SerializerFactory.COMPONENT_TYPE));
      }
   }
}
