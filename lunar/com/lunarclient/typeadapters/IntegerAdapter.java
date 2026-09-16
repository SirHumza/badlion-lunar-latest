package com.lunarclient.typeadapters;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class IntegerAdapter extends TypeAdapter<Integer> {
   public void write(JsonWriter var1, Integer var2) {
      var1.value(var2);
   }

   public Integer read(JsonReader var1) {
      return switch (var1.peek()) {
         case NUMBER -> var1.nextInt();
         case STRING -> Integer.parseInt(var1.nextString());
         default -> {
            var1.skipValue();
            yield 0;
         }
      };
   }
}
