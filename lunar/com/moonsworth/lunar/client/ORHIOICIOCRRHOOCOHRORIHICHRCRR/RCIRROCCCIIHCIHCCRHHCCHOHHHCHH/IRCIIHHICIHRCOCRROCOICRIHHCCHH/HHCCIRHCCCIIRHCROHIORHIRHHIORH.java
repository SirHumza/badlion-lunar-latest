package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import java.io.StringWriter;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   public static String jsonToPretty(JsonElement var0) {
      StringWriter var1 = new StringWriter();
      JsonWriter var2 = new JsonWriter(var1);
      Gson var3 = new GsonBuilder().setPrettyPrinting().create();
      var2.setIndent("    ");
      var3.toJson(var0, var2);
      return var1.toString();
   }
}
