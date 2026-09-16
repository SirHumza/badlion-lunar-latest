package com.eliotlash.molang.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import java.io.StringWriter;

public class JsonUtils {
   public static String jsonToPretty(JsonElement var0) {
      StringWriter var1 = new StringWriter();
      JsonWriter var2 = new JsonWriter(var1);
      Gson var3 = new GsonBuilder().setPrettyPrinting().create();
      var2.setIndent("    ");
      var3.toJson(var0, var2);
      return var1.toString();
   }
}
