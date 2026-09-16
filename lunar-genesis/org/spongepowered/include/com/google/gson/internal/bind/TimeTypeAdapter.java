package org.spongepowered.include.com.google.gson.internal.bind;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.spongepowered.include.com.google.gson.Gson;
import org.spongepowered.include.com.google.gson.JsonSyntaxException;
import org.spongepowered.include.com.google.gson.TypeAdapter;
import org.spongepowered.include.com.google.gson.TypeAdapterFactory;
import org.spongepowered.include.com.google.gson.reflect.TypeToken;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonToken;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;

public final class TimeTypeAdapter extends TypeAdapter<Time> {
   public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         return var2.getRawType() == Time.class ? new TimeTypeAdapter() : null;
      }
   };
   private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");

   public synchronized Time read(JsonReader var1) {
      if (var1.peek() == JsonToken.NULL) {
         var1.nextNull();
         return null;
      }

      try {
         Date var2 = this.format.parse(var1.nextString());
         return new Time(var2.getTime());
      } catch (ParseException var3) {
         throw new JsonSyntaxException(var3);
      }
   }

   public synchronized void write(JsonWriter var1, Time var2) {
      var1.value(var2 == null ? null : this.format.format(var2));
   }
}
