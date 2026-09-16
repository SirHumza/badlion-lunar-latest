package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

final class SqlDateTypeAdapter extends TypeAdapter<Date> {
   static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         return var2.getRawType() == Date.class ? new SqlDateTypeAdapter() : null;
      }
   };
   private final DateFormat format = new SimpleDateFormat("MMM d, yyyy");

   private SqlDateTypeAdapter() {
   }

   public Date read(JsonReader var1) {
      if (var1.peek() == JsonToken.NULL) {
         var1.nextNull();
         return null;
      }

      String var2 = var1.nextString();
      synchronized (this) {
         TimeZone var4 = this.format.getTimeZone();

         Date var6;
         try {
            java.util.Date var5 = this.format.parse(var2);
            var6 = new Date(var5.getTime());
         } catch (ParseException var12) {
            throw new JsonSyntaxException("Failed parsing '" + var2 + "' as SQL Date; at path " + var1.getPreviousPath(), var12);
         } finally {
            this.format.setTimeZone(var4);
         }

         return var6;
      }
   }

   public void write(JsonWriter var1, Date var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         String var3;
         synchronized (this) {
            var3 = this.format.format(var2);
         }

         var1.value(var3);
      }
   }
}
