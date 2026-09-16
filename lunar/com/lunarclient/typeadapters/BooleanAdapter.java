package com.lunarclient.typeadapters;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class BooleanAdapter extends TypeAdapter<Boolean> {
   public void write(JsonWriter var1, Boolean var2) {
      var1.value(var2);
   }

   public Boolean read(JsonReader var1) {
      return switch (var1.peek()) {
         case BOOLEAN -> var1.nextBoolean();
         case STRING -> Boolean.parseBoolean(var1.nextString());
         default -> {
            var1.skipValue();
            yield false;
         }
      };
   }
}
