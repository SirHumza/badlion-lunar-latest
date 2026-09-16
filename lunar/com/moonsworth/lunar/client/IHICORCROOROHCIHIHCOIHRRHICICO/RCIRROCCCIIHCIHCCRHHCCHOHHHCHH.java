package com.moonsworth.lunar.client.IHICORCROOROHCIHIHCOIHRRHICICO;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.time.LocalDate;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends TypeAdapter<LocalDate> {
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonWriter var1, LocalDate var2) {
      var1.value(var2.toString());
   }

   public LocalDate IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonReader var1) {
      return LocalDate.parse(var1.nextString());
   }
}
