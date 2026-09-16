package org.spongepowered.include.com.google.gson.internal.bind;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.spongepowered.include.com.google.gson.Gson;
import org.spongepowered.include.com.google.gson.JsonSyntaxException;
import org.spongepowered.include.com.google.gson.TypeAdapter;
import org.spongepowered.include.com.google.gson.TypeAdapterFactory;
import org.spongepowered.include.com.google.gson.reflect.TypeToken;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonToken;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;

public final class DateTypeAdapter extends TypeAdapter<Date> {
   public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         return var2.getRawType() == Date.class ? new DateTypeAdapter() : null;
      }
   };
   private final DateFormat enUsFormat = DateFormat.getDateTimeInstance(2, 2, Locale.US);
   private final DateFormat localFormat = DateFormat.getDateTimeInstance(2, 2);
   private final DateFormat iso8601Format = buildIso8601Format();

   private static DateFormat buildIso8601Format() {
      SimpleDateFormat var0 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
      var0.setTimeZone(TimeZone.getTimeZone("UTC"));
      return var0;
   }

   public Date read(JsonReader var1) {
      if (var1.peek() == JsonToken.NULL) {
         var1.nextNull();
         return null;
      } else {
         return this.deserializeToDate(var1.nextString());
      }
   }

   private synchronized Date deserializeToDate(String var1) {
      try {
         return this.localFormat.parse(var1);
      } catch (ParseException var5) {
         try {
            return this.enUsFormat.parse(var1);
         } catch (ParseException var4) {
            try {
               return this.iso8601Format.parse(var1);
            } catch (ParseException var3) {
               throw new JsonSyntaxException(var1, var3);
            }
         }
      }
   }

   public synchronized void write(JsonWriter var1, Date var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         String var3 = this.enUsFormat.format(var2);
         var1.value(var3);
      }
   }
}
