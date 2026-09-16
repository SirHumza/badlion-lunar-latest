package org.spongepowered.include.com.google.gson.internal.bind;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.spongepowered.include.com.google.gson.Gson;
import org.spongepowered.include.com.google.gson.JsonSyntaxException;
import org.spongepowered.include.com.google.gson.TypeAdapter;
import org.spongepowered.include.com.google.gson.TypeAdapterFactory;
import org.spongepowered.include.com.google.gson.reflect.TypeToken;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonToken;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;

public final class SqlDateTypeAdapter extends TypeAdapter<Date> {
   public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         return var2.getRawType() == Date.class ? new SqlDateTypeAdapter() : null;
      }
   };
   private final DateFormat format = new SimpleDateFormat("MMM d, yyyy");

   public synchronized Date read(JsonReader var1) {
      if (var1.peek() == JsonToken.NULL) {
         var1.nextNull();
         return null;
      }

      try {
         long var2 = this.format.parse(var1.nextString()).getTime();
         return new Date(var2);
      } catch (ParseException var4) {
         throw new JsonSyntaxException(var4);
      }
   }

   public synchronized void write(JsonWriter var1, Date var2) {
      var1.value(var2 == null ? null : this.format.format(var2));
   }
}
